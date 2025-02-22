import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int totalSum = Arrays.stream(array)
                            .skip(fromWhere > 1 ? fromWhere : 0)
                            .limit(toWhere - fromWhere + 1)
                            .filter(x -> x >= smallest && x <= largest)
                            .reduce(0, (sum, element) -> sum + element);
        return totalSum;
    }

}
