package com.example.demo.comment.service;

import com.example.demo.board.form.BoardResForm;
import com.example.demo.board.form.CommentResForm;
import com.example.demo.comment.form.RequestRegisterCommentForm;
import org.springframework.http.HttpHeaders;

import java.util.List;

public interface CommentService {

    BoardResForm register(RequestRegisterCommentForm requestCommentForm, Long boardId);

    CommentResForm modify(RequestRegisterCommentForm requestCommentForm, Long commentId);

    Boolean delete(Long commentId, HttpHeaders headers);
    List<CommentResForm> commentlistWithMember(HttpHeaders headers, Integer page);
    Integer getMyCommentTotalPage(HttpHeaders headers);
}
