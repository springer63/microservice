package com.hbpu.cloud.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ${DESCRIPTION}
 *
 * @author chenjianhui
 * @create 2017/12/06
 **/
@FeignClient("COMPUTE-SERVICE")
public interface ComputeService {

    /**
     * 加操作
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/compute/plus")
    String plus(@RequestParam("a") int a, @RequestParam("b") int b);
}
