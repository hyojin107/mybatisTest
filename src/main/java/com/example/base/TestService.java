package com.example.base;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestDao testDao;

    public List<City> findByAll() {
        return testDao.findByAll();
    }

    public List<City> findByAllToXml() {
        return testDao.findByAllToXml();
    }

}
