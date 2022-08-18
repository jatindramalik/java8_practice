package lambdafundemo;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "corejava", 47));
        books.add(new Book(102, "spring", 49));
        books.add(new Book(103, "hibernate", 87));
        books.add(new Book(104, "microservices", 12));
        books.add(new Book(105, "webservices", 23));
        return books;
        
    }
    
}
