package org.example.configuration;

import org.example.aspects.LoggingAspect;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.example.services"})
public class ConfigurationApplication {

    @Bean
    @Primary
    @Qualifier("loggingAspect")
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }

}
