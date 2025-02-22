
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value;
        while(scanner.hasNext()){
            value = scanner.nextLine();
            if(!"end".equals(value)){
                System.out.println((int)Math.pow(Integer.parseInt(value), 3));
            }else{
                break;
            }
        }
    }
}
