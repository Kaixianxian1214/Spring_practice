package SpringDemo1;

/*
 * 演示使用set方法进行属性注入
 */

public class Book {

    private String name;
    private String author;
    private String price;

    // set方法构造注入
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void print(){
        System.out.println(author + name + "坚强！" + price);
    }
}
