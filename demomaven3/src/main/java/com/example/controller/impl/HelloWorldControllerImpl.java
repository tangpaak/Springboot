package com.example.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.controller.HelloWorldController;
import com.example.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // 接request
@ResponseBody
@RequestMapping(value = "/api/v3")
public class HelloWorldControllerImpl implements HelloWorldController {

    @Autowired // check if any object implement HellowroldService
    HelloWorldService helloWorldService;

    @Override
    public String hello() {
        // HelloworldServiceImpl helloworldServiceIMpl = new helloworldServiceImpl()
        return helloWorldService.generate(102); //用番上面個object去generate出黎
    }




}
