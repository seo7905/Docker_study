package com.sist.docker_0319.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "도커연습입니다.");
        return map;
    }
}
