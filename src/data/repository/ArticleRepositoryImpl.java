package data.repository;

import data.models.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepository{

    private int count;

    public List<Article> articles = new ArrayList<>();


    @Override
    public Article saveArticle(Article article){
     boolean articleHasNotBeenSaved = article.getId() == 0;
     if (articleHasNotBeenSaved){
         article.setId(generateArticleId());
         articles.add(article);
         count++;
     }
     return articles.get(count-1);
    }

    private int generateArticleId(){
        return count+1;
    }

    @Override
    public long countArticle() {
        return count;
    }

    @Override
    public Article findById(int id) {
        return articles.get(id-1);
    }

    @Override
    public void deleteArticle() {
        count-=1;
    }

    @Override
    public void deleteId() {

    }

    @Override
    public List<Article> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
