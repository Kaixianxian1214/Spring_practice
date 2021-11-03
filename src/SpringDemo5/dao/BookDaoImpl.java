package SpringDemo5.dao;

import SpringDemo5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加的方法
    @Override
    public void addBook(Book book) {
        //1 创建SQL语句
        String sql = "insert into t_book value(?, ?, ?)";
        //2 调用update方法实现
        Object[] args = {book.getUserId(), book.getUserName(), book.getUstatus()};
        jdbcTemplate.update(sql, args);
    }

    // 修改的方法
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username=?, ustatus=? where user_id=?";
        Object[] args = {book.getUserName(), book.getUstatus(), book.getUserId()};
        jdbcTemplate.update(sql, args);
    }

    // 删除的方法
    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id=?";
        jdbcTemplate.update(sql, id);
    }

    // 查询某个值的方法
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    // 查询返回对象
    @Override
    public Book selectBook(String id) {
        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    // 查询返回对象集合
    @Override
    public List<Book> selectAllBooks() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Book.class));
        return bookList;
    }

    // 批量添加数据
    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    // 批量修改数据
    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set user_id=?, ustatus=? where username=?";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id=?";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

}
