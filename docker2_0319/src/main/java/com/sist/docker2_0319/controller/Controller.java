package com.sist.docker2_0319.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @RequestMapping("/test1")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msg", "테스트입니다1421");
        return map;
    }
}
