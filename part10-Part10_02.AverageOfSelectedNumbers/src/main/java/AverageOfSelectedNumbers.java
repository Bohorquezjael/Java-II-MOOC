
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if("end".equals(line)){
                break;
            }
            lines.add(line);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        if("n".equals(scanner.nextLine())){
            System.out.println(lines.stream()
                                        .mapToInt(x -> Integer.valueOf(x))
                                        .filter(x -> x < 0)
                                        .average()
                                        .getAsDouble());
        }else{
            System.out.println(lines.stream()
                                        .mapToInt(x -> Integer.valueOf(x))
                                        .filter(x -> x > 0)
                                        .average()
                                        .getAsDouble());
        }
    }
}
