package com.example.core.impl;

import com.example.core.api.GreetingService;
import org.osgi.service.component.annotations.Component;

@Component(service = GreetingService.class)
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "";
    }
}
