package com.example.base;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService service;

    @GetMapping("/getTest")
    public String getTest() {
        List<City> cityList = service.findByAll();
        System.out.println("\n\n결과: "+cityList + "\n\n");
        return "aa";
    }

    @GetMapping("/getXml")
    public String getXml() {
        List<City> cityList = service.findByAll();
        System.out.println("\n\n결과: "+cityList + "\n\n");
        return "aa";
    }

}
