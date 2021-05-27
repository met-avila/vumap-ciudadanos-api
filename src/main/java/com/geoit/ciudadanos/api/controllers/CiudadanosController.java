package com.geoit.ciudadanos.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ciudadanos")
public class CiudadanosController {
    @GetMapping
    public ResponseEntity<?> sayHelloWorld(){
        return ResponseEntity.ok().body("Hello world!");
    }
}
