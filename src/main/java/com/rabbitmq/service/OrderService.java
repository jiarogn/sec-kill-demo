package com.rabbitmq.service;

import com.rabbitmq.bean.Order;
import com.rabbitmq.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService{

    @Autowired
    private OrderMapper orderMapper;

    public void createOrder(Order order) {
        //新增订单
        orderMapper.insert(order);
    }

}