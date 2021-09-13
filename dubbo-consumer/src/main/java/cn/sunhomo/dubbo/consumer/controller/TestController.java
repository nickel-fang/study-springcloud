package cn.sunhomo.dubbo.consumer.controller;

import cn.sunhomo.dubbo.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Nickel Fang
 * @date: 2021/9/13 17:27
 */
@Controller
public class TestController {
    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        String result = testService.say();
        return result;
    }

}
