package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller//creates as spring bean
public class MyController
{
    public String sayHello(){

        System.out.println("Inside the controller");
        return "Hello World";
    }
}
