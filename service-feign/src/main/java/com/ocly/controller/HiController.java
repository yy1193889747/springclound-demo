package com.ocly.controller;

import com.ocly.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ocly
 * @date 2018/1/25 14:30
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping(value = "/")
    public String sayHi(String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
