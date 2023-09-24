package ru.skypro.diploma.dto.Comment;

import lombok.Data;

@Data
public class Comments {
    int countComments;
    Comment[] comments;

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
