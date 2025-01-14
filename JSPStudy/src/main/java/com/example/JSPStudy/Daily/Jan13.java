package com.example.JSPStudy.Daily;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class Jan13 {

    @PostConstruct
    private void example01() {
        System.out.println("Hello! 01");
    }

    @PostConstruct
    private void example02() {
        for (int i=0; i<100; i++)
            System.out.println("Hello! 02");
    }

    @PostConstruct
    private void example03() {
        System.out.println("Hello! 03");
    }

}
