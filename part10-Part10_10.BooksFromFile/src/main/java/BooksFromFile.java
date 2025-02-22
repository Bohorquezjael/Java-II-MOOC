
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file){
        try{
        return Files.lines(Paths.get(file))
                                    .map(line -> line.split(","))
                                    .filter(parts -> parts.length >= 4)
                                    .map(book -> new Book(book[0], Integer.valueOf(book[1]), Integer.valueOf(book[2]), book[3]))
                                    .collect(Collectors.toList());
        }catch(Exception e){
            return null;
        }
    }
}
