package data.repository;

import data.models.Comment;

public interface CommentRepository {
    Comment saveComment(Comment comment);

    Long countComment();

    void findComment();

    void deleteComment();
}
