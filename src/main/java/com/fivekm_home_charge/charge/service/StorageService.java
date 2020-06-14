package com.fivekm_home_charge.charge.service;

import com.fivekm_home_charge.charge.config.StorageConfig;
import com.fivekm_home_charge.charge.exception.StorageException;
import com.fivekm_home_charge.charge.exception.StorageFileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.core.io.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

@Service
public class StorageService {
    private final Path rootLocation;

    @Autowired
    public StorageService(StorageConfig properties){
        this.rootLocation = Paths.get(properties.getLocation());
        System.out.println("위치 : " + rootLocation);
    }

    public void store(MultipartFile file){
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try{
            if(file.isEmpty()){
                throw new StorageException("빈 파일 : " + fileName);
            }
            if(fileName.contains("..")){
                throw new StorageException("파일 이름 오류 : " + fileName);
            }
            try(InputStream inputStream = file.getInputStream()){
                Files.copy(inputStream, this.rootLocation.resolve(fileName),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }catch (IOException e){
            throw new StorageException("저장 실패 : " + fileName, e);
        }
    }

    public Stream<Path> loadAll(){
        try{
            return Files.walk(this.rootLocation, 1)
                    .filter(path -> !path.equals(this.rootLocation))
                    .map(this.rootLocation::relativize);
        } catch (IOException e) {
           throw new StorageException("Failed to read stored files", e);
        }
    }

    public Path load(String fileName){
        return rootLocation.resolve(fileName);
    }

    public Resource loadAsResource(String fileName){
        try{
            Path file = load(fileName);
            Resource resource = (Resource) new UrlResource(file.toUri());
            if(resource.exists() || resource.isReadable()){
                return resource;
            }else {
                throw new StorageFileNotFoundException("Could not read file : " + fileName);
            }
        }catch (MalformedURLException e){
            throw new StorageFileNotFoundException("Could not read file : " + fileName);
        }
    }

    public void deleteAll() {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }

    public void init() {
        try {
            Files.createDirectories(rootLocation);
        }catch (IOException e) {
            throw new StorageException("Could not initialize storage", e);
        }
    }
}
