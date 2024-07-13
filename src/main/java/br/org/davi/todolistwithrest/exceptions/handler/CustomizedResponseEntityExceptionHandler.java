package br.org.davi.todolistwithrest.exceptions.handler;

import br.org.davi.todolistwithrest.exceptions.ExceptionResponse;
import br.org.davi.todolistwithrest.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception e,
                                                                       WebRequest webRequest){
        ExceptionResponse exceptionResponse = new ExceptionResponse(e.getMessage(),
                webRequest.getDescription(false),Instant.now());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestException(Exception e,
                                                                          WebRequest webRequest){
        ExceptionResponse exceptionResponse = new ExceptionResponse(e.getMessage(),
                webRequest.getDescription(false),Instant.now());
        return new ResponseEntity<>(exceptionResponse,HttpStatus.NOT_FOUND);
    }
}
