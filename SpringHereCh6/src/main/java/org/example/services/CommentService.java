package org.example.services;

import org.example.annotations.ToLog;
import org.example.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "PUBLISHED";
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
        return "DELETED";
    }

    public String editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
        return "EDITED";
    }

}
