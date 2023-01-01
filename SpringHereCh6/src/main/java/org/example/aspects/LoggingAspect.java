package org.example.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around()
    public void log() {
        //TODO Implement something
    }
}
