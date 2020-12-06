package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author mj
 * @version 1.0
 * @date 2020/12/6 12:49
 */
@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","hello springSession");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String) session.getAttribute("msg");
    }
}
