package org.example.ch4.repositories;

import org.example.ch4.model.Comment;

/**
 * This interface declares the storeComment(Comment comment) method, which the
 * CommentService object needs to implement the use case.
 */

public interface CommentRepository {

    void storeComment(Comment comment);

}
