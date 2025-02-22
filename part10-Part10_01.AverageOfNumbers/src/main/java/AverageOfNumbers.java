
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if("end".equals(line)){
                break;
            }
            numbers.add(line);
        }
        
        System.out.println(numbers.stream()
                                .mapToInt(x -> Integer.valueOf(x))
                                .average()
                                .getAsDouble());
                

    }
}
