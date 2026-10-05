package com.example.samplewebfluxappmaven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    // ルートに文字列がreturn
    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }

}
