package co.com.perficient.p2.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

/**
 * @author : Juank544
 * @date : 8/08/2022
 **/
@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> errorCreating(HttpMessageNotReadableException e){
        logger.error(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Required request body is missing");
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> notFound(NoSuchElementException e){
        logger.error(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No value present");
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> errorDeleting(EmptyResultDataAccessException e){
        logger.error(e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No entity exists with the id provided");
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> internalError(Throwable throwable){
        logger.error(throwable.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error on the application");
    }
}
