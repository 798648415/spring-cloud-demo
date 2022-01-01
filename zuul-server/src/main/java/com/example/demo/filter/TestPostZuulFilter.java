package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-08-05 17:00
 */
@Component
@Slf4j
public class TestPostZuulFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        log.info("{} filterType = {} filterOrder = {}", this.toString(), this.filterType(), this.filterOrder());
        return null;
    }
}
