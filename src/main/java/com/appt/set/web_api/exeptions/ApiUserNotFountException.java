package com.appt.set.web_api.exeptions;

public class ApiUserNotFountException extends RuntimeException{

    public ApiUserNotFountException(String msg) {

        super(msg);

    }
    public ApiUserNotFountException(String msg, Throwable cause) {

        super(msg, cause);

    }
    public ApiUserNotFountException(Throwable cause) {

        super(cause);

    }

}
