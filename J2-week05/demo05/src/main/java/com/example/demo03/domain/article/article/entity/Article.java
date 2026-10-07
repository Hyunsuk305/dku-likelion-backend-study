package com.example.demo03.domain.article.article.entity;

import com.example.demo03.domain.member.member.entity.Member;
import com.example.demo03.global.jpa.entity.BaseTime;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article extends BaseTime {
    private String title;
    @Column(columnDefinition = "TEXT")
    private String body;
    @ManyToOne
    private Member author;
}
