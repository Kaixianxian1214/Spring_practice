package SpringDemo5;

import SpringDemo5.entity.Book;
import SpringDemo5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class testJdbcTemplate {

    @Test //1 testBean11.xml、增加
    public void testJdbcTemplateAdd(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId("1678");
        book.setUserName("java");
        book.setUstatus("using");

        bookService.addBook(book);
    }

    @Test //2 数据库更新
    public void testJdbcTemplateUpdate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1678");
        book.setUserName("Spring");
        book.setUstatus("free");

        bookService.updateBook(book);
    }

    @Test //3 数据库删除
    public void testJdbcTemplateDel(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.deleteBook("1678");
    }

    @Test //4 查询数据库某个值的方法
    public void testJdbcTemplateSelect(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println("表中的数据总数是：" + bookService.selectCount());
    }

    @Test //5 查询数据库对象的方法
    public void testJdbcTemplateSelectObj(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println(bookService.selectBook("1678"));
    }

    @Test //6 查询返回数据库对象集合的方法
    public void testJdbcTemplateSelectAllObj(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println(bookService.selectAllBooks());
    }

    @Test //7 批量添加的方法
    public void testJdbcTemplateBatchAdd(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Object[] o1 = {"1111", "MySql", "aaa"};
        Object[] o2 = {"2222", "Mybatis", "bbb"};
        List<Object[]> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);

        bookService.batchAdd(list);
    }

    @Test //8 批量修改的方法
    public void testJdbcTemplateBatchUpdate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Object[] o1 = {"111", "aa1","MySql"};
        Object[] o2 = {"222", "bb2", "Mybatis"};
        List<Object[]> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);

        bookService.batchUpdate(list);
    }

    @Test //8 批量删除的方法
    public void testJdbcTemplateBatchDelete(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringDemo5/bean11.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Object[] o1 = {"111"};
        List<Object[]> list = new ArrayList<>();
        list.add(o1);

        bookService.batchDelete(list);
    }
}
