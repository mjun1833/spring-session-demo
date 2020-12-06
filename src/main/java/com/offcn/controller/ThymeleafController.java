package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

/**
 * @author mj
 * @version 1.0
 * @date 2020/12/6 13:15
 */
@Controller
public class ThymeleafController {

    @GetMapping("/first")
    public String indexPage(Model model){
        String msg = "hello thymeleaf";
        model.addAttribute("msg",msg);
        return "index01";
    }

    @GetMapping("/second")
    public String second(Model model){
        String msg = "hello thymeleaf";
        User user = new User(1,"张三",18);
        Map<String,Object> map = new HashMap<>();
        map.put("src01","test01");
        map.put("src02","test02");
        model.addAttribute("msg",msg);
        model.addAttribute("map",map);
        model.addAttribute("user",user);
        return "index02";
    }

    @GetMapping("/three")
    public String three(Model model){
        User user1 = new User(1,"张三",18);
        User user2 = new User(2,"李四",19);
        User user3 = new User(3,"王五",20);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("list",list);
        return "index03";
    }

    @GetMapping("/four")
    public String four(Model model){
        model.addAttribute("userName", "中公");
        model.addAttribute("href", "http://www.baidu.com");
        return "index04";
    }

    @GetMapping("/five")
    public String five(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index05";
    }

    @GetMapping("/six")
    public String six(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("num",1.239443);
        model.addAttribute("msg","hello 网易云音乐是一款专注于发现与分享的音乐产品,依托专业音乐人、DJ、好友推荐及社交功能,为用户打造全新的音乐生活。\n");
        return "index06";
    }
}
