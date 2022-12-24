package org.example.ch4.model;

/**
 * The <code>Comment</code> class defines a POJO describing
 * the details of a comment by its two attributes: author and text.
 *
 * @author Exequiel
 */

public class Comment {

    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
