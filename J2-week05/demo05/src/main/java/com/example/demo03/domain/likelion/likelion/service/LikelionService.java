package com.example.demo03.domain.likelion.likelion.service;

import com.example.demo03.domain.likelion.likelion.entity.Likelion;
import com.example.demo03.domain.likelion.likelion.repository.LikelionRepository;
import com.example.demo03.domain.member.member.entity.Member;
import com.example.demo03.global.rsData.RsData;
import org.springframework.transaction.annotation.Transactional;import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)

public class LikelionService {
    private final LikelionRepository likelionRepository;

    public List<Likelion> findAll() {
        return likelionRepository.findAll();
    }

    @Transactional
    public RsData<Likelion> add(Member author, String body, String url) {
        Likelion likelion = Likelion.builder()
                .author(author)
                .body(body)
                .url(url)
                .build();

        likelionRepository.save(likelion);

        return RsData.of("%d번 URL이 생성되었습니다.".formatted(likelion.getId()), likelion);
    }

    public Optional<Likelion> findById(long id) {
        return likelionRepository.findById(id);
    }

    @Transactional
    public void increaseCount(Likelion likelion) {
        likelion.increaseCount();
    }
}
