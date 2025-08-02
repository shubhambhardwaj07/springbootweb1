package com.shubh.springbootweb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("HomeController.home() called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session) {
        req.getParameter("num1");
        req.getParameter("num2");
        int n1 = Integer.parseInt(req.getParameter("num1"));
        int n2 = Integer.parseInt(req.getParameter("num2"));
        int result = n1 + n2;
        // Storing the result in the session
        session.setAttribute("result", result);
        // Logging the result to the console
        System.out.println("HomeController.add() called");
        return "result.jsp";
    }
}
