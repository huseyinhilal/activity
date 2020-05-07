package com.activity.activity.controller;

import com.activity.activity.model.Member;
import com.activity.activity.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/members")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;
    @GetMapping(value="/all")
    public List<Member> getAll(){
        return memberRepository.findAll();
    }

    @PostMapping(value="/load")
    public List<Member> persist(@RequestBody final Member member){
        memberRepository.save(member);
        return memberRepository.findAll();
    }
}
