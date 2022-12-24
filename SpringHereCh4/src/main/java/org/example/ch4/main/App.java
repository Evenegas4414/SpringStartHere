package org.example.ch4.main;

import org.example.ch4.config.ProjectConfiguration;
import org.example.ch4.model.Comment;
import org.example.ch4.proxies.EmailCommentNotificationProxy;
import org.example.ch4.repositories.DBCommentRepository;
import org.example.ch4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * An app to register comments.
 */

public class App {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var commentService = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Exequiel Venegas");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}
