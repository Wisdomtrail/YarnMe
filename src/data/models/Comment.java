package data.models;

import java.time.LocalDateTime;

public class Comment {
    private int Id;
    private int articleId;
    private String comment;
    private LocalDateTime timeCreated = LocalDateTime.now();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

}
