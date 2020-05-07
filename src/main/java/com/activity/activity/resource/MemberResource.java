package com.activity.activity.resource;

import com.activity.activity.model.Members;
import com.activity.activity.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/members")
public class MemberResource {

    @Autowired
    MemberRepository memberRepository;
    @GetMapping(value="/all")
    public List<Members> getAll(){
        return memberRepository.findAll();
    }

    @PostMapping(value="/load")
    public List<Members> persist(@RequestBody final Members members){
        memberRepository.save(members);
        return memberRepository.findAll();
    }
}
