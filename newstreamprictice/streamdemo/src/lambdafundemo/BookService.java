package lambdafundemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort(){
        
        List<Book> books = new DataBase().getBooks();
        Collections.sort(books,( arg0,  arg1) ->(arg1.getName().compareTo(arg0.getName())));
        return books;
    }
    public static void main(String[] args) {
        // System.out.println(new BookService().getBooksInSort());

        List<Book> list = new DataBase().getBooks();
        // list.stream().sorted((b1,b2)->b1.getName().compareTo(b2.getName())).forEach(System.out::println);
        list.stream().filter(b -> b.getId()%2 == 0).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);
    }
    
    
}

// class MyComparator implements Comparator<Book>{

//     @Override
//     public int compare(Book arg0, Book arg1) {
//         return arg0.getName().compareTo(arg1.getName());
//     }
    
// }
