package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service //indicates a spring component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {

        return "Hello Everyone from Base Service";
    }
}
