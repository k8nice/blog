package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author nice
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String index(){
        return "login";
    }

    /**
     * 接收登陆验证信息
     * @param userName
     * @param password
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public Map login(@RequestParam("userName") String userName, @RequestParam("password") String password){
        System.out.println(userName + ":" + password);
        Map<String,String> map = new HashMap<String, String>();
        map.put("userName",userName);
        map.put("psssowrd",password);
        return map;
    }

}
