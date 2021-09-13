package cn.sunhomo.dubbo.service.impl;

import cn.sunhomo.dubbo.service.TestService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author: Nickel Fang
 * @date: 2021/9/13 17:31
 */
@Service(version = "1.0.0", interfaceClass = TestService.class)
@Component
public class TestServiceImpl implements TestService {
    public String say() {
        return "hello world";
    }
}
