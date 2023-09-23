package ru.skypro.homework.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.dto.Comments;
import ru.skypro.homework.dto.CreateOrUpdateComment;

@RestController("/ads")
public class CommentController {
//    private final CommentService commentService;
//
//    public CommentController(CommentService commentService) {
//        this.commentService = commentService;
//    }

    @GetMapping("/{id}/comments")
    public Comments getAllComments(@PathVariable int id) {
//        commentService.getAllComments(id);
        return null;
    }

    @PostMapping("/{id}/comments")
    public Comment createComment(Authentication authentication, @PathVariable int id, @RequestBody CreateOrUpdateComment comment) {
//        return commentService.createComment(authentication,id,comment);
        return null;
    }

    @DeleteMapping("/{adId}/comments/{commentId}")
    public void deleteComment(@PathVariable int adId, @PathVariable int commentId) {
//        commentService.deleteComment(adId,commentId);
    }

    @PatchMapping("/{adId}/comments/{commentId}")
    public Comment updateComment(@PathVariable int adId, @PathVariable int commentId, @RequestBody CreateOrUpdateComment createOrUpdateComment) {
//        commentService.updateComment(adId,commentId,createOrUpdateComment);
        return null;
    }
}
