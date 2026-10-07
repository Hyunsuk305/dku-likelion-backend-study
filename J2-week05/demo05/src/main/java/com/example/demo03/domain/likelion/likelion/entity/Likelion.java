package com.example.demo03.domain.likelion.likelion.entity;

import com.example.demo03.domain.member.member.entity.Member;
import com.example.demo03.global.jpa.entity.BaseTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;


@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
public class Likelion extends BaseTime {
    @ManyToOne
    @JsonIgnore
    private Member author;
    private String body;
    private String url;
    @Setter(AccessLevel.NONE)
    private long count;

    public void increaseCount() {
        count++;
    }
}
