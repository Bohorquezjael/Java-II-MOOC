
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double counter = 0; 
        int sum = 0;
        while(true){
            int number = scanner.nextInt();
            if(number > 0){
                sum += number;
                counter++;
            }else if(number == 0){
                break;
            }
        }
        System.out.println(sum > 0 ? (sum / counter) : "Cannot calculate the average");
    }
}
