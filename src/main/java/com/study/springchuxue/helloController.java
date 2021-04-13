package com.study.springchuxue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Li jq
 * @Date 2021/4/11 21:25
 **/
@RestController
public class helloController {
    @RequestMapping(value = "/hello")
    public  String hello(){
        return "这是我的第一个测试启动";
    }
}
