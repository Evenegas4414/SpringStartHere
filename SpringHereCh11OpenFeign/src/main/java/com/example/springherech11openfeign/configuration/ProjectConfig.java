package com.example.springherech11openfeign.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients( basePackages = "com.example.springherech11openfeign.proxies")
public class ProjectConfig {
}
