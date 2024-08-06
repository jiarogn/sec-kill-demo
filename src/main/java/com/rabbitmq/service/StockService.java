package com.rabbitmq.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rabbitmq.bean.Stock;
import com.rabbitmq.mapper.StockMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@Slf4j
public class StockService {

    @Autowired
    private StockMapper stockMapper;

    public void decrByStock(String stockName) {
        synchronized(this) {
            //用stockName查询库存
            List<Stock> stocks = stockMapper.selectList(
                    new QueryWrapper<Stock>().eq("name", stockName));
            if (!CollectionUtils.isEmpty(stocks)) {
                Stock stock = stocks.get(0);
                stock.setStock(stock.getStock() - 1);
                stockMapper.updateById(stock);
            }
        }
    }

    public Integer selectByName(String stockName) {
        synchronized (this){
            List<Stock> stocks = stockMapper.selectList(
                    new QueryWrapper<Stock>().eq("name", stockName));
            if (!CollectionUtils.isEmpty(stocks)) {
                return stocks.get(0).getStock().intValue();
            }
            return 0;
        }
    }

}