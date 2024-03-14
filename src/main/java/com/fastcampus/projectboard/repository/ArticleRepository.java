package com.fastcampus.projectboard.repository;

import com.fastcampus.projectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArticleRepository extends
        JpaRepository<Article, Long> ,
        QuerydslPredicateExecutor<Article>
//        QuerydslBinderCustomizer<Article>
{

}