package data.repository;

import data.models.Article;

import java.util.List;

public interface ArticleRepository {
    Article saveArticle(Article article);

    long countArticle();

    Article findById(int id);

    void deleteArticle();

    void deleteId();

    List<Article> findAll();

    void deleteAll();
}
