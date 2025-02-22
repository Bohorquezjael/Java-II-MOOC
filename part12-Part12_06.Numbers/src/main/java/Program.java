
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howManyNumbers = scanner.nextInt();
        Random luck = new Random();
        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println(luck.nextInt(11));
        }
    }

}
