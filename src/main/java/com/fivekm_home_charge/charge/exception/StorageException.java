package com.fivekm_home_charge.charge.exception;

// 파일 업로드 중 발생하는 exception
public class StorageException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public StorageException(String messages){
        super(messages);
    }

    public StorageException(String messages, Throwable cause){
        super(messages, cause);
    }
}
