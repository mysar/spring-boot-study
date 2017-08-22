package com.boot.controller;

import com.boot.entity.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Im.Yan on 2017/8/21.
 * 描述:
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;


    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name","Jack");

        List<String> nameList = Arrays.asList("张三","李四");
        model.addAttribute("nameList",nameList);

        User user = userService.findById(18);
        model.addAttribute("user",user);

        return "main";
    }

}
