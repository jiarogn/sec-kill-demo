package com.rabbitmq.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("stock")
public class Stock implements Serializable {
    private static final long serialVersionUID = 6235666939721331057L;
    Integer id;
    String name;
    Integer stock;
}

