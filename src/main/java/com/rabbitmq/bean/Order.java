package com.rabbitmq.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_order")
public class Order implements Serializable {
    private static final long serialVersionUID = -8271355836132430489L;
    Integer id;
    String orderName;
    String orderUser;
}