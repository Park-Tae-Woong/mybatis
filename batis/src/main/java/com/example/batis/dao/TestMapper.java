package com.example.batis.dao;

import com.example.batis.dto.Mine;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<Mine> getMine();
}
