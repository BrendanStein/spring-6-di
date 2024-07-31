package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController
{
    @Qualifier("propertyGreetingService")
    @Autowired //manually autowire when no constructor injection, error message says this method is not recommended
    GreetingService greetingService;

    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
