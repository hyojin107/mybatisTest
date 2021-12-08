package com.example.base;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from city")
    List<City> findByAll();

    List<City> findByAllToXml();

}
