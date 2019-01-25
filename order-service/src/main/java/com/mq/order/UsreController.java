package com.mq.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsreController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "111";
    }
}
