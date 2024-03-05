package com.fastcampus.projectboard.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class ArticleComment {
    private Long id;

    private Article article;

    private String content;

    private LocalDateTime createdAt;

    private  String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;
}
