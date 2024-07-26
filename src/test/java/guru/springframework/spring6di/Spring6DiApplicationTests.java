package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired //tells spring context to inject a context
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test //using the application context to wired in the bean
    void testGetControllerFromCtx(){
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println(myController.sayHello());
    }

    @Test //using autowired to wired in the bean
    void testAutowiredOfController(){
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {

    }

}
