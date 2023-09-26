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
}
