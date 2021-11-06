package SpringDemo6;

import SpringDemo6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {

    @Test // testBean1.xml
    public void testBean1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo6/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
