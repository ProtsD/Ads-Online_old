package ru.skypro.diploma.service.impl;

import org.springframework.security.core.Authentication;
import ru.skypro.diploma.dto.Comment.Comment;
import ru.skypro.diploma.dto.Comment.Comments;
import ru.skypro.diploma.dto.Comment.CreateOrUpdateComment;
import ru.skypro.diploma.service.CommentService;

public class CommentServiceImpl implements CommentService {
    @Override
    public Comments getAllComments(Authentication authentication,int id) {
        return null;
    }

    @Override
    public Comment createComment(Authentication authentication, int id, CreateOrUpdateComment comment) {
        return null;
    }

    @Override
    public void deleteComment(Authentication authentication,int adId, int commentId) {

    }

    @Override
    public Comment updateComment(Authentication authentication,int adId, int commentId, CreateOrUpdateComment createOrUpdateComment) {
        return null;
    }
}
