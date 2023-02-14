package data.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class CommentTest {

    private  Comment comment;
    @BeforeEach
    public void setUp(){
        comment = new Comment();
    }


    @Test
    public void setAndGetArticleIdTest(){
        comment.setId(1);
        assertEquals(1,comment.getId());
    }

    @Test
    public void setAndGetTitle(){
        comment.setComment("How to Learn coding");
        assertEquals("How to Learn coding",comment.getComment());
    }

    @Test
    public void setAndGetBody(){
        comment.setArticleId(1);
        assertEquals(1,comment.getArticleId());
    }

    @Test
    public void getTimeCreated(){
        comment.setTimeCreated(LocalDateTime.now());
        assertEquals(LocalDateTime.now(),comment.getTimeCreated());
    }
}