package SpringDemo5.dao;

import SpringDemo5.entity.Book;

import java.util.List;

public interface BookDao {

    // 添加的方法
    public void addBook(Book book);

    // 修改的方法
    public void updateBook(Book book);

    // 删除的方法
    public void deleteBook(String id);

    // 查询某个值的方法
    public int selectCount();

    // 查询某个对象的方法
    public Book selectBook(String id);

    // 查询返回对象集合
    public List<Book> selectAllBooks();

    // 批量添加操作
    public void batchAdd(List<Object[]> batchArgs);

    // 批量修改操作
    public void batchUpdate(List<Object[]> batchArgs);

    // 批量删除操作
    public void batchDelete(List<Object[]> batchArgs);
}
