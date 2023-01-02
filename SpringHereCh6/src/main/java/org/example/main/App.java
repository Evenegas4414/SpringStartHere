package org.example.main;

import org.example.aspects.LoggingAspect;
import org.example.configuration.ConfigurationApplication;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App
{
    public static Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationApplication.class);

        Comment comment = new Comment("Hello, Aspects.", "LoggingAspect");
        CommentService commentService = context.getBean(CommentService.class);
        String value = commentService.deleteComment(comment);
        logger.info(value);

        context.close();
    }
}
