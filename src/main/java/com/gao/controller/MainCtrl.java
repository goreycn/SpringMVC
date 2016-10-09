package com.gao.controller;

import com.gao.model.UserEntity;
import com.gao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainCtrl {

    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/userlist", method = RequestMethod.GET)
    public String userList(ModelMap modelMap){

        List<UserEntity> list = userRepository.findAll();
        modelMap.addAttribute("userList", list);
        modelMap.addAttribute("name", "Grubby");
        return "admin/users";

    }

}
