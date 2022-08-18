package lambdaexample;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getBookInSort(){

        List<Book> books = new BookDao().getBook();
        Collections.sort(books,( arg0,  arg1) ->arg0.getName().compareTo(arg1.getName()));
        return books;

        
    }
    public static void main(String[] args) {
        
        System.out.println(new BookService().getBookInSort());
    }
    
}

// class MyComparator implements Comparator<Book>{

//     @Override
//     public int compare(Book arg0, Book arg1) {

//         return arg0.getId()-arg1.getId();
//     }
    
// }
