package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/user")
    public String sayHelloUser() {
        return "hello user";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String sayHelloAdmin() {
        return "hello admin";
    }

}
