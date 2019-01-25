package com.mq.controller.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mq.service.order.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference
    private OrderService orderService;

    @RequestMapping("/getOrder")
    public String getOrder(){
        String result = orderService.getOrder("gideon ");
        return result;
    }
}
