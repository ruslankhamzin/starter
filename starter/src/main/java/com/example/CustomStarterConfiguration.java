package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@EnableScheduling
public class CustomStarterConfiguration {

    public CustomStarterConfiguration() {
        System.out.println("CustomStarterConfiguration initialized");
    }

    @Bean
    @ConditionalOS("windows")
    public CustomStarterWindows customStarterWindowsTest() {
        System.out.println("Windows bean was created");
        return new CustomStarterWindows();
    }

    @Bean
    @ConditionalOS("linux")
    public CustomStarterLinux customStarterLinuxTest() {
        System.out.println("Linux bean was created");
        return new CustomStarterLinux();
    }
}
