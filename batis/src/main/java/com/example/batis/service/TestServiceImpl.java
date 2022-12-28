package com.example.batis.service;

import com.example.batis.dao.TestMapper;
import com.example.batis.dto.Mine;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{
    private final TestMapper testMapper;

    public List<Mine> getMine() {
        return testMapper.getMine();
    }

}
