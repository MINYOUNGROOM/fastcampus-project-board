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

    private String title; // 제목

    private String content; // 본문

    private String hashtag; // 해시태그

    private LocalDateTime createdAt; // 생성일시

    private String createdBy; // 생성자

    private LocalDateTime modifiedAt; // 수정일시

    private String modifiedBy; // 수정자
}
