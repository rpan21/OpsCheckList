package com.checklist.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.checklist.services.ChecklistService;
import com.mongodb.util.JSON;

@Controller
public class ChecklistController {
    
    @RequestMapping(value="/hello",method=RequestMethod.POST)
    public ModelAndView getDetails(HttpServletRequest request) {
        ChecklistService check= new ChecklistService();
        String message = check.getdetails();
        String username=request.getParameter("userName");
        String password=request.getParameter("userPassword");
        if(username.equals("admin")&& password.equals("admin")){
            return new ModelAndView("welcome", "message", message);
        }
       return new ModelAndView("index");
    }
 
   

    
}
