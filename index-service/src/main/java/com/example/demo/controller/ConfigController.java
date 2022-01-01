package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-07-26 17:13
 */
@RestController
@RequestMapping("/config")
@Slf4j
public class ConfigController {

    @Value("${name}")
    private String name;

    @RequestMapping("/name")
    public String name() {
        log.debug("name = {}", name);
        return name;
    }


}
