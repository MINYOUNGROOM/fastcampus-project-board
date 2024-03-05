package com.fastcampus.projectboard.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class Article {

    private Long id;

    private String title;

    private String content;

    private String hashtag;

    private LocalDateTime createdAt;

    private  String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;
}
