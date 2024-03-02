package com.github.zavier.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * 用来验证无需登录+授权就可以访问的接口
     *
     * @return
     */
    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }
}