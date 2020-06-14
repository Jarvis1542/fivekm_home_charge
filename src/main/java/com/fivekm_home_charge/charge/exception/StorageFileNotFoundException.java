package com.fivekm_home_charge.charge.exception;

// 파일 업로드 중 발생하는 exception
public class StorageFileNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public StorageFileNotFoundException(String messages){
        super(messages);
    }

    public StorageFileNotFoundException(String messages, Throwable cause){
        super(messages, cause);
    }
}
