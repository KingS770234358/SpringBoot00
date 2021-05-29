package com.wq.officeInitialSpringBot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 打上控制器的注解
@Controller
@RequestMapping("/SBTest")
public class offiInitSBTest {
    // url映射
    @RequestMapping("/test1")
    // 返回结果格式设置
    @ResponseBody
    public String test1(){
        return "hello";
    }
}
