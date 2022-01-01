package com.example.demo.fallback;

import com.example.demo.service.ProductService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * description: 商品服务熔断降级处理
 *
 * @author WangCheng
 * create in 2020-08-01 15:09
 */
@Component
@Slf4j
public class ProductServiceFallbackFactory implements FallbackFactory<ProductService> {

    @Override
    public ProductService create(Throwable throwable) {
        return () -> {
            //log.debug("商品服务list方法降级处理");
            System.out.println("商品服务 list 方法降级处理");
            return new ArrayList<>();
        };
    }
}
