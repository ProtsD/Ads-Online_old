package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class Comment {
    int idAuthor;
    String authorImage;
    String firstNameAuthor;
    int createdAt;
    int idComment;
    String text;

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

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
