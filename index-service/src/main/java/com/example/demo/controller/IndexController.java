package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-07-26 17:13
 */
@RestController
@RequestMapping("/index")
@RefreshScope
@Slf4j
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductService productService;

    @Value("${name}")
    private String name;

    @RequestMapping("/show")
    public List<Product> index() {
        return productService.list();
    }

    @RequestMapping("/name")
    public String name() {
        log.info("name = {}", name);
        return name;
    }

    @RequestMapping("/show1")
    public String index1() {
        return restTemplate.getForObject("http://PRODUCT-SERVICE/product/list", String.class);
    }

    @RequestMapping("/show2")
    public String index2() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8081/product/list", String.class);
    }

}
