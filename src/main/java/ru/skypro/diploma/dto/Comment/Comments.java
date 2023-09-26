package ru.skypro.diploma.dto.Comment;

import lombok.Data;

@Data
public class Comments {
    int countComments;
    Comment[] comments;
}
