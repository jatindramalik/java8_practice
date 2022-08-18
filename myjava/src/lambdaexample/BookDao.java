package lambdaexample;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBook(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(125, "corejava", 785));
        books.add(new Book(139, "spring", 452));
        books.add(new Book(452, "hibernate", 158));
        books.add(new Book(856, "webservice", 258));
        return books;
    }
    
}
