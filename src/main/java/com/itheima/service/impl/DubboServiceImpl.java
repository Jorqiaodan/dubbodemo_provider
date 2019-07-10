package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.DubboService;
@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
