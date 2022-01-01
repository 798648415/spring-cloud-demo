package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 商品服务实现类
 *
 * @author WangCheng
 * create in 2020-08-01 13:00
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> list() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Java从入门到放弃", 99L));
        products.add(new Product(2L, "Mysql从删库到跑路", 100L));
        return products;
    }
}
