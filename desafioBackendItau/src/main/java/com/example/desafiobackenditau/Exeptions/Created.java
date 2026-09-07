package com.example.desafiobackenditau.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CREATED)
public class Created extends RuntimeException {
    public Created() {

    }
}
