package lambdaexp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSorted(){
        List<Book> books = new BookDao().getBooks();
        Collections.sort(books, ( arg0,  arg1)->arg1.getPage() - arg0.getPage());
        return books;

       
    }
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSorted());
        
    }
    
}

// class MyComparator implements Comparator<Book> {

//     @Override
//     public int compare(Book arg0, Book arg1) {
       
//         return arg1.getName().compareTo(arg0.getName());
//     }
    
// }
