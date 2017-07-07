package com.controller;

import com.db.model.User;
import com.tcms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 01 on 七月 03 0003 .
 */
@Controller
@RequestMapping("/platform/*")
public class PlatformController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(String ref, HttpServletRequest req, HttpServletResponse resp) throws Exception{
        String userId = req.getParameter("userid");
        User test = userService.getUser(userId);
        return new ModelAndView("home");
    }
}
