package SpringDemo1.test;

import SpringDemo1.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDemo {

    @Test
    public void testAdd(){

        // 1 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.print();
    }
}

