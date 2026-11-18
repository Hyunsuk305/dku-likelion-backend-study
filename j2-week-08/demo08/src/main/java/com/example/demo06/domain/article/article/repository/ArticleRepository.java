package com.example.demo06.domain.article.article.repository;

import com.example.demo06.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
