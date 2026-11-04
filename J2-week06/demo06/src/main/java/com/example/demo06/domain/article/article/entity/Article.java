package com.example.demo06.domain.article.article.entity;

import com.example.demo06.domain.member.member.entity.Member;
import com.example.demo06.global.jpa.entity.BaseTime;
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
