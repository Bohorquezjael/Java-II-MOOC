
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(scanner.hasNextInt()){
            int n = scanner.nextInt();
            if(n < 0){
                break;
            }
            
            numbers.add(n);
        }
        numbers.stream()
                .filter(x -> x > 0 && x <= 5)
                .forEach(System.out::println);
    }
}
