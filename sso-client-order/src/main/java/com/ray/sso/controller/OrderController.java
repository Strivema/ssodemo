package com.ray.sso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ray.Ma
 * @date 2019/8/8 16:33
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/list")
    public String list() {
        return "order";
    }
}
