package com.bbva.proxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy/bbva/v1")
public class ApplicationController {

    @GetMapping("/alumno")
    public String mensaje() {

        return "Hola Mundo";
    }
}