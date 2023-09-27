package ru.skypro.diploma.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.skypro.diploma.dto.Comment.Comment;
import ru.skypro.diploma.dto.Comment.Comments;
import ru.skypro.diploma.dto.Comment.CreateOrUpdateComment;

@Service
public interface CommentService {
    Comments getAllComments(Authentication authentication,int id);

    Comment createComment(Authentication authentication, int id, CreateOrUpdateComment comment);

    void deleteComment(Authentication authentication,int adId, int commentId);

    Comment updateComment(Authentication authentication,int adId, int commentId, CreateOrUpdateComment createOrUpdateComment);
}
