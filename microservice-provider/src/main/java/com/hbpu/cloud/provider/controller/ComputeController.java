package com.hbpu.cloud.provider.controller;

import com.github.boot.framework.web.result.Result;
import com.hbpu.cloud.provider.form.NumberPlusForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 计算服务
 *
 * @author chenjianhui
 * @create 2017/12/06
 **/
@Controller
@RequestMapping("/compute")
public class ComputeController {

    @RequestMapping("/plus")
    public Result plus(NumberPlusForm form){
        Result result = Result.success();
        result.setData(form.getA() + form.getB());
        System.out.println(".........");
        return result;
    }


}
