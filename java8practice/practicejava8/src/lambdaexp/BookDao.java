package lambdaexp;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "corejava", 23));
        books.add(new Book(102, "hibernate", 55));
        books.add(new Book(103, "springboot", 47));
        books.add(new Book(104, "webservice", 21));
        return books;
    }
    
}
