package com.example.idiom.controller;

import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/idiom")
@RestController
public class IdiomController {

    @GetMapping
    public String newIdiom(){
        return doGet();
    }

    public static String doGet(){
        String result1= HttpUtil.get("https://cn.apihz.cn/api/zici/sjcy.php?id=88888888&key=88888888");
        return result1;
    }

}
