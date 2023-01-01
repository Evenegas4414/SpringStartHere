package org.example.main;

import org.example.configuration.ConfigurationApplication;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {

        var context = new AnnotationConfigApplicationContext(ConfigurationApplication.class);

    }
}
