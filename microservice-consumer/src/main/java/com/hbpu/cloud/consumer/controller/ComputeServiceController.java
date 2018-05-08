package com.hbpu.cloud.consumer.controller;

import com.github.boot.framework.web.result.Result;
import com.hbpu.cloud.consumer.feign.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * ${DESCRIPTION}
 *
 * @author chenjianhui
 * @create 2017/12/06
 **/
@Controller
public class ComputeServiceController {

    @Autowired
    private ComputeService computeService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public Result consumer(){
        Result result = Result.success();
        String response = restTemplate.getForObject("http://COMPUTE-SERVICE/compute/plus?a=1&b=2", String.class);
        result.setData(response);
        return result;
    }

    @RequestMapping("/fegin")
    public Result fegin(){
        Result result = Result.success();
        String response = computeService.plus(1,2);
        result.setData(response);
        return result;
    }


}
