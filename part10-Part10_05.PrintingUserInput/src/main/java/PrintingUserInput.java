
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        
        while(scanner.hasNextLine()){
            String word = scanner.nextLine();
            if("".equals(word)){
                break;
            }
            words.add(word);
        }
        words.stream()
                .forEach(System.out::println);
    }
}
