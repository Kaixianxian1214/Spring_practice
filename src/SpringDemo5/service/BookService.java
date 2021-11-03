package SpringDemo5.service;

import SpringDemo5.dao.BookDao;
import SpringDemo5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 对数据库增加
    public void addBook(Book book){
        bookDao.addBook(book);
    }

    // 修改的方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    // 删除的方法
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    // 查询某个值非方法
    public int selectCount(){
        return bookDao.selectCount();
    }

    // 查询某个对象的方法
    public Book selectBook(String id){
        return bookDao.selectBook(id);
    }

    // 查询返回对象集合
    public List<Book> selectAllBooks(){
        return bookDao.selectAllBooks();
    }

    // 批量添加操作
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAdd(batchArgs);
    }

    // 批量修改操作
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }

    // 批量删除操作
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
