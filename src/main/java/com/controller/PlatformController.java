package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 01 on 七月 03 0003 .
 */
@Controller
@RequestMapping("/platform/*")
public class PlatformController {

    @RequestMapping("/login")
    public ModelAndView login(String ref, HttpServletRequest req, HttpServletResponse resp) throws Exception{
        return new ModelAndView("home");
    }
}
