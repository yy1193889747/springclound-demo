package com.ocly.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ocly
 * @date 2018/1/25 14:28
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

    @GetMapping(value = "/")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
