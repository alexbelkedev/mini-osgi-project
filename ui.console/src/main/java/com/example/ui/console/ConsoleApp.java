package com.example.ui.console;

import com.example.core.api.GreetingService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class ConsoleApp {

    private GreetingService greetingService;

    @Reference
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void unsetGreetingService(GreetingService greetingService) {
        if (this.greetingService == greetingService) {
            this.greetingService = null;
        }
    }

    public void start() {
        if (greetingService != null) {
            System.out.println(greetingService.greet("Alex"));
        } else {
            System.out.println("No GreetingService available 😢");
        }
    }
}