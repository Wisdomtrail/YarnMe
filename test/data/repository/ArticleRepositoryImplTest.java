package data.repository;

import data.models.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleRepositoryImplTest {
    ArticleRepository ArticleRepo;
    Article article;
    @BeforeEach
    public void setUp(){
       ArticleRepo = new ArticleRepositoryImpl();
       article = new Article();
       ArticleRepo .saveArticle(article);
    }

    @Test
    public void saveArticleTest(){
        assertEquals(1,ArticleRepo.countArticle());
    }

    @Test
    public void FindArticleByIdTest(){
        assertEquals(article,ArticleRepo.findById(1));
    }

    @Test
    public void deleteArticle(){
        ArticleRepo.deleteArticle();
        assertEquals(0,ArticleRepo.countArticle());
    }

}
