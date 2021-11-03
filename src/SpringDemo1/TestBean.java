package SpringDemo1;

import SpringDemo1.bean.Employee;
import SpringDemo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test // testBean1.xml
    public void testBean1(){

        // 1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringDemo1/bean1.xml");

        // 2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.print();
    }

    @Test // testBean2.xml
    public void testBean2(){
        // 加载Spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo1/bean2.xml");

        // 获取配置创建的对象
        UserService service = context.getBean("userService", UserService.class);
        System.out.println(service);
        service.add();
    }

    @Test // testBean3.xml
    public void testBean3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo1/bean3.xml");
        Employee employee = context.getBean("employee", Employee.class);
        employee.print();
    }
}

