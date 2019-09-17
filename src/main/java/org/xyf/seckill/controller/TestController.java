package org.xyf.seckill.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 初始化项目测试
 * @author: xyf
 * @date: 2019/9/17 22:08
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello () {
        return "Hello seckill";
    }
}
