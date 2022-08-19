package com.example.theore.controller;

import com.example.theore.dto.MemberDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class getController {
    @GetMapping(path = "/domain")
    public String getRequestParam3(MemberDto memberDto) {
        return memberDto.toString();
    }
}
