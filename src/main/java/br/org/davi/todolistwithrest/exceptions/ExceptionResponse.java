package br.org.davi.todolistwithrest.exceptions;

import java.time.Instant;

public class ExceptionResponse {
    private String message;
    private String details;
    private Instant timeStamp;

    public ExceptionResponse(String message, String details, Instant timeStamp) {
        this.message = message;
        this.details = details;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }
}
