package com.ocly.service;

import org.springframework.stereotype.Component;

/**
 * @author ocly
 * @date 2018/1/25 14:51
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
