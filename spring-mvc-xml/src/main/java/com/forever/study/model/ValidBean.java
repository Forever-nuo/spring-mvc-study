package com.forever.study.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotNull;

/**
 * @author: Forever丶诺
 * @date: 2018/4/26 11:52
 */
@Data
public class ValidBean {

    @Email
    private String name;

}
