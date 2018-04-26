package com.forever.study.controller;

import com.forever.study.model.ValidBean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Forever丶诺
 * @date: 2018/4/26 11:54
 */
@Controller
@RequestMapping("valid")
public class ValidController {

    @RequestMapping("/test1")
    public Map test1(@Valid ValidBean validBean, BindingResult result) {
        return new HashMap<>();
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "111";
    }

}
