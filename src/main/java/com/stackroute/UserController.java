package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController
{
    @Autowired
    User user;
    @ResponseBody
    @RequestMapping("/index")
    public ModelAndView getName(HttpServletRequest request)
    {
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
