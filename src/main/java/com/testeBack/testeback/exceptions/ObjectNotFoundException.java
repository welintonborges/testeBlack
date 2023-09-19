package com.testeBack.testeback.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public  ObjectNotFoundException(String msg, Throwable causa){
        super(msg, causa);
    }
}
