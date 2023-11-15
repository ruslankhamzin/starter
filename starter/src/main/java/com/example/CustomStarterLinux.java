package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@ConditionalOS("linux")
public class CustomStarterLinux {

    @Scheduled(fixedDelay = 60000L)
    public void scheduleJob() {
        System.out.println("Я работаю");
    }
}
