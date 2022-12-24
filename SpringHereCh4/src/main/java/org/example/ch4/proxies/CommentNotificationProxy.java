package org.example.ch4.proxies;

import org.example.ch4.model.Comment;

/**
 *
 */

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
