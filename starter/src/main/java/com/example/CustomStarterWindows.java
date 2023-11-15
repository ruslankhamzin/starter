package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class CustomStarterWindows {

    @Scheduled(fixedDelay = 30000L)
    public void scheduleJob() {
        System.out.println("Я работаю");
    }
}
