package io.ayttekao.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @Value("${tmpVar}")
    private int tmpVar;

    @GetMapping("/test")
    public String test() {
        return id + ":" + tmpVar;
    }
}
