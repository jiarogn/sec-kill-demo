package com.rabbitmq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rabbitmq.bean.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockMapper extends BaseMapper<Stock> {
}
