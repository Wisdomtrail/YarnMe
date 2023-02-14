package data.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ArticleTest {

    private  Article article;
    @BeforeEach
    public void setUp(){
        article = new Article();
    }


    @Test
    public void setAndGetArticleIdTest(){
        article.setId(1);
        assertEquals(1,article.getId());
    }

    @Test
    public void setAndGetTitle(){
        article.setTitle("How to Learn coding");
        assertEquals("How to Learn coding",article.getTitle());
    }

    @Test
    public void setAndGetBody(){
        article.setBody("You Can learn Through great Practice");
        assertEquals("You Can learn Through great Practice",article.getBody());
    }

    @Test
    public void getTimeCreated(){
        article.setTimeCreated(LocalDateTime.now());
        assertEquals(LocalDateTime.now(),article.getTimeCreated());
    }

    @Test
    public void setAndGetAuthorId(){
        article.setAuthor_Id(3);
        assertEquals(3,article.getAuthor_Id());
    }
}