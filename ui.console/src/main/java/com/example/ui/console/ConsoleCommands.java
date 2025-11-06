package com.example.ui.console;

import com.example.core.api.GreetingService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        service = ConsoleCommands.class,
        property = {
                "osgi.command.scope=greet",
                "osgi.command.function=hello"
        }
)
public class ConsoleCommands {

    private GreetingService greetingService;

    @Reference
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello(String name) {
        String message = greetingService.greet(name);
        System.out.println(message);
    }
}