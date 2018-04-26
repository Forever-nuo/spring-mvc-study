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
import java.util.List;

/**
 * @author: Forever丶诺
 * @date: 2018/4/26 11:54
 */
@Controller
@RequestMapping("valid")
public class ValidController {

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@Valid ValidBean validBean) {
        return "111";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "111";
    }

}
