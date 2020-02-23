package com.example.jgitverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JgitverDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JgitverDemoApplication.class, args);
    }

    @GetMapping("/")
    public String versioning() {
        return "jgit based library to calculate semver compatible version from git tree";
    }

}
