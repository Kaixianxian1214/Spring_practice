package SpringDemo2.collectionType;

import java.util.List;

public class Book {

    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public void print(){
        System.out.println(bookList);
    }
}
