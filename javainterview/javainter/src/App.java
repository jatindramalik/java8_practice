import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)  {

        List<Book>books = new ArrayList<>();
        books.add(new Book(101, "TnG", 100));
        books.add(new Book(102, "MnG", 150));
        books.add(new Book(103, "GnG", 200));
        books.add(new Book(104, "AnG", 250));

        books.stream().map(t->t.getBookPrice()).mapToInt(t->t+50).forEach(System.out::println);

        // String  str = "Today is is friday ";

        // while(word.size()<0){
        //     if(word.equals("is")){
        //         count++;
        //     }
        // }
        // String name;
        
    }
}
