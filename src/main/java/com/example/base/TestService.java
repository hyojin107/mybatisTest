package com.example.base;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestMapper testMapper;

    public List<City> findByAll() {
        return testMapper.findByAll();
    }

    public List<City> findByAllToXml() {
        return testMapper.findByAllToXml();
    }

}
