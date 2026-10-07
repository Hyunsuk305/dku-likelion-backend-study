package com.example.demo03.domain.member.member.entity;

import com.example.demo03.global.jpa.entity.BaseTime;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTime {
    private String username;
    private String password;
    private String nickname;
}