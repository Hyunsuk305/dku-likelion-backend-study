package com.example.demo03.domain.likelion.likelion.controller;

import com.example.demo03.domain.likelion.likelion.entity.Likelion;
import com.example.demo03.domain.likelion.likelion.service.LikelionService;
import com.example.demo03.domain.member.member.entity.Member;
import com.example.demo03.global.exceptions.GlobalException;
import com.example.demo03.global.rq.Rq;
import com.example.demo03.global.rsData.RsData;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class LikelionController {
    private final LikelionService likelionService;
    private final Rq rq;

    @GetMapping("/all")
    @ResponseBody
    public List<Likelion> getAll() {
        return likelionService.findAll();
    }

    @GetMapping("/add")
    @ResponseBody
    public RsData<Likelion> add(String body, String url) {
        Member member = rq.getMember(); // 현재 브라우저로 로그인한 회원

        System.out.println("before get id");
        member.getId();
        System.out.println("after get id");

        System.out.println("before get username");
        member.getUsername();
        System.out.println("after get username");

        return likelionService.add(member, body, url);
    }

    @GetMapping("/s/{body}/**")
    @ResponseBody
    public RsData<Likelion> add(
            @PathVariable String body,
            HttpServletRequest req
    ) {
        Member member = rq.getMember();

        String url = req.getRequestURI();

        if (req.getQueryString() != null) {
            url += "?" + req.getQueryString();
        }

        String[] urlBits = url.split("/", 4);

        url = urlBits[3];

        return likelionService.add(member, body, url);
    }

    @GetMapping("/g/{id}")
    public String go(
            @PathVariable long id
    ) {
        Likelion likelion = likelionService.findById(id).orElseThrow(GlobalException.E404::new);

        likelionService.increaseCount(likelion);

        return "redirect:" + likelion.getUrl();
    }
}
