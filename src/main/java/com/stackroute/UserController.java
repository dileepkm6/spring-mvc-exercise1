package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController
{
    @PostMapping("/display")
    public ModelAndView getName(HttpServletRequest request)
    {
        String name=request.getParameter("name");
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("userName",name);
        return modelAndView;
    }
}
