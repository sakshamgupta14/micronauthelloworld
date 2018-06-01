package com.saksham.micronaut.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * @author Saksham Gupta
 */

@Controller("/")
public class HelloController {

    @Get("/hello")
    public String hello() {
        return "hello world";
    }
}
