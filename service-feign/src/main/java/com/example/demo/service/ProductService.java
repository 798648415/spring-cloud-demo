package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.fallback.ProductServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-07-26 21:24
 */
@FeignClient(name = "PRODUCT-SERVICE", fallbackFactory = ProductServiceFallbackFactory.class)
public interface ProductService {

    @RequestMapping("/product/list")
    List<Product> list();

}
