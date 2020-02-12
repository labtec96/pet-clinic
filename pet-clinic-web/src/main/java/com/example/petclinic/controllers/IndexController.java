package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ch on 2020-02-12
 */
@Controller
public class IndexController {

    @RequestMapping({"","/", "index","index.html"})
    public String index(){
        return "index";
    }
}
