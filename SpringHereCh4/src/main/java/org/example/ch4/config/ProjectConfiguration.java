package org.example.ch4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "org.example.ch4.proxies",
        "org.example.ch4.repositories",
        "org.example.ch4.services"})

public class ProjectConfiguration {

}
