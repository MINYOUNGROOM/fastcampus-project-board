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

    private Article article; // 게시글 (ID)

    private String content; // 댓글 본문

    private LocalDateTime createdAt; // 생성일시

    private  String createdBy; // 생성자

    private LocalDateTime modifiedAt; // 수정일시

    private String modifiedBy; //수정자
}
