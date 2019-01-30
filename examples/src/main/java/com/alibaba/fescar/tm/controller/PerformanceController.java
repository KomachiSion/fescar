package com.alibaba.fescar.tm.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fescar.tm.dubbo.BusinessService;

/**
 * ${DESCRIPTION}
 *
 * @author yangyi
 */
@RestController
@RequestMapping(value = "/")
public class PerformanceController {
    
    @Resource
    private BusinessService businessService;
    
    @RequestMapping(value = "/order")
    public String order() {
        businessService.purchase("U100001", "C00321", 2);
        return "ok";
    }
}
