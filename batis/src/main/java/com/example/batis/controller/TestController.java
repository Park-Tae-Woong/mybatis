package com.example.batis.controller;

import com.example.batis.dto.Mine;
import com.example.batis.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/me")
    public List<Mine> test(){
        return testService.getMine();
    }
}
