package SpringDemo6;

import SpringDemo6.config.ConfigTx;
import SpringDemo6.dao.UserDao;
import SpringDemo6.dao.UserDaoImpl;
import SpringDemo6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestBean {

    @Test // testBean1.xml
    public void testBean1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo6/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test // testBean2.xml
    public void testBean2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo6/bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test // ConfigTx.class
    public void testConfigTx(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigTx.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test // 函数式风格创建对象，交给Spring进行管理
    public void testGenericApplicationContext(){
        // 创建GenericApplicationContext
        GenericApplicationContext context = new GenericApplicationContext();
        // 调用context的方法对象注册
        context.refresh();
        context.registerBean("userDaoImpl1", UserDaoImpl.class, () -> new UserDaoImpl());
        // 获取在Spring中注册的对象
        UserDao userDao = (UserDao) context.getBean("userDaoImpl1");
        System.out.println(userDao);
    }
}
