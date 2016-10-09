package com.gao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by goreyjp on 16/10/9.
 */
@Controller
public class MainCtrl {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
