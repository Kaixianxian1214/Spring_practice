package SpringDemo4;

import SpringDemo4.aopaspectj.User;
import SpringDemo4.aopaspectj.UserProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test // testBean9.xml
    public void testBean9(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean9.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
