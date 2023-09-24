package ru.skypro.diploma.dto.Comment;

import lombok.Data;

@Data
public class Comment {
    int idAuthor;
    String authorImage;
    String firstNameAuthor;
    int timeCreateComment;
    int idComment;
    String description;

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public int getTimeCreateComment() {
        return timeCreateComment;
    }

    public void setTimeCreateComment(int timeCreateComment) {
        this.timeCreateComment = timeCreateComment;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
