package org.example.ch4.repositories;

import org.example.ch4.model.Comment;
import org.springframework.stereotype.Repository;

/**
 * This class implements CommentRepository, and override
 * storeComment() to connect to DB.
 * We don’t know yet how to connect to a database,
 * so we’ll only write a text in the console to
 * simulate this action.
 */

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
