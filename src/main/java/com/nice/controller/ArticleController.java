package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/save")
public class ArticleController {

    @GetMapping
    public String index(){
        return "index";
    }

    @PostMapping("/saveArticle")
    @ResponseBody
    public String saveArticle(@RequestParam("article") String str){
        System.out.println(str);
        return str;
    }

}
