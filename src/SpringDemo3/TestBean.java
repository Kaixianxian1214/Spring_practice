package SpringDemo3;

import SpringDemo3.config.SpringConfig;
import SpringDemo3.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test // testBean7.xml
    public void testBean7(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo3/bean7.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test // testBean8.xml
    public void testBean8(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo3/bean8.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test // testConfigClass
    public void testSpringConfig(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test // testConfigClass
    public void testSpringConfig(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
