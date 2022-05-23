package com.example.courtyard.exception;

public class AnnouncementNotExistException extends RuntimeException{
    public AnnouncementNotExistException(String message){
        super(message);
    }
}
