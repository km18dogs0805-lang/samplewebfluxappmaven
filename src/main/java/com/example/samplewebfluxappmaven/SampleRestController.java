package com.example.samplewebfluxappmaven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    // ルートに文字列を返す
    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }

}
