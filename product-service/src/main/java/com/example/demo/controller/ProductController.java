package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description: 商品服务
 *
 * @author WangCheng
 * create in 2020-07-26 17:17
 */
@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public List<Product> list() {
        log.info("提供者端口: {}", serverPort);
        return productService.list();
    }

}
