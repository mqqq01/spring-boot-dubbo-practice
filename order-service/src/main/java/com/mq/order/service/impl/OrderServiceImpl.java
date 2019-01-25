package com.mq.order.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mq.service.order.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String getOrder(String orderName) {
        return orderName + "success.....";
    }
}
