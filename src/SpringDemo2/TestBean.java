package SpringDemo2;

import SpringDemo2.autowire.Employee;
import SpringDemo2.bean.Orders;
import SpringDemo2.collectionType.Book;
import SpringDemo2.collectionType.Course;
import SpringDemo2.collectionType.Stu;
import SpringDemo2.factoryBean.MyBean;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test // testBeanCollections.xml
    public void testBeanCollections(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanCollections.xml");
        Stu stu = context.getBean("stu", Stu.class);
        Stu stu1 = context.getBean("stu", Stu.class);
        stu.print();
    }

    @Test // testBeanCollections1.xml
    public void testBeanCollections1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanCollections1.xml");
        Book book = context.getBean("book", Book.class);
        book.print();
    }

    @Test // testBeanFactory.xml
    public void testBeanFactory(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanFactory.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test // testBean4.xml
    public void testBean4(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("forth step");

        // 手动销毁bean实例
        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test // testBean5.xml
    public void testBean5(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        Employee employee = context.getBean("employee", Employee.class);
        employee.print();
    }
}

