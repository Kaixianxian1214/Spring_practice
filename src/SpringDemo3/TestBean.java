package SpringDemo3;

import SpringDemo3.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test // testBean7.xml
    public void testBean7(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean7.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
