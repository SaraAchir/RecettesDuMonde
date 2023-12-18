package com.inaya.recettesDuMonde.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RecettesUtils {
    public RecettesUtils() {
    }
    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus)
    {
        return  new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}", httpStatus);

    }
}
