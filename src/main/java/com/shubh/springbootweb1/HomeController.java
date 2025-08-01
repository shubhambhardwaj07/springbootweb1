package com.shubh.springbootweb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "Spring Boot";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("HomeController.home() called");
        return "index";
    }

    // servelt way of handling requests
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        req.getParameter("num1");
//        req.getParameter("num2");
//        int n1 = Integer.parseInt(req.getParameter("num1"));
//        int n2 = Integer.parseInt(req.getParameter("num2"));
//        int result = n1 + n2;
//        // Storing the result in the session
//        session.setAttribute("result", result);
//        // Logging the result to the console
//        System.out.println("HomeController.add() called");
//        return "result.jsp";
//    }
    // Spring MVC way of handling requests
//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
//        int result = num + num2;
//        // Storing the result in the session
//        session.setAttribute("result", result);
//        // Logging the result to the console
//        System.out.println("HomeController.add() called with num1: " + num + ", num2: " + num2 + ", result: " + result);
//        return "result.jsp";
//    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {
        int result = num + num2;
        // Adding the result to the model
        mv.addObject("result", result);
        mv.setViewName("result");
        System.out.println("HomeController.add() called with num1: " + num + ", num2: " + num2 + ", result: " + result);
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien) {

//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
        // Adding the result to the model


        return "result";
    }
}

