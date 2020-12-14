package com.jasdev.CrudService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String name) {
        super(ExceptionMessage.USER_NOT_FOUND.toString().replace("{name}", name));
    }
}

//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class UserNotFoundException extends RuntimeException {
//    public UserNotFoundException(String name) {
//        super(name);
//    }
//}
