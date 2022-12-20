package com.example.openfeign;

import com.example.openfeign.api.MyApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test/my")
    public String test() {
        return "test";
    }

    @Autowired
    private MyApi myApi;

    @GetMapping("/test/invoke")
    public String invoke() {
        String result = myApi.testForGet();
        return "remote result:" + result;
    }
}
