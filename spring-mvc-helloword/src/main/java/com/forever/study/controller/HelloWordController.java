package com.forever.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Forever丶诺
 * @date: 2018/4/26 8:48
 */

@Controller
public class HelloWordController {

    @RequestMapping("helloWord")
    @ResponseBody
    public String helloWord() {
        return "你好,世界";
    }


    @RequestMapping("helloWord2")
    @ResponseBody
    public Map helloWord2() {
        Map resultMap = new HashMap();
        resultMap.put("name","你好世界");
        return resultMap;
    }
}
