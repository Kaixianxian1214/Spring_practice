package SpringDemo4;

import SpringDemo4.aopaspectj.User;
import SpringDemo4.aopxml.Book;
import SpringDemo4.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test // testBean9.xml
    public void testBean9(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo4/bean9.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test // testBean10
    public void testBean10(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo4/bean10.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    @Test // test完全注解配置,ConfigAop
    public void testConfigAop(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
