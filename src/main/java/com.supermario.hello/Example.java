package com.supermario.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Victor on 21/02/2017.
 */

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    public String home() {
        return "Hello Spring boot.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
