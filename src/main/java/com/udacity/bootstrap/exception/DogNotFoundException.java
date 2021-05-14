package com.udacity.bootstrap.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by janaksoni on 5/14/21.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
