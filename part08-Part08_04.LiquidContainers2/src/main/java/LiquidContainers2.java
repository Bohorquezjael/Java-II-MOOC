 
import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amt = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                first.add(amt);
            }
            if (parts[0].equals("move")) {
                if (amt > first.contains()) {
                    second.add(first.contains());
                    first.remove(amt);
                } else {
                    first.remove(amt);
                    second.add(amt);
                }
            }
            if (parts[0].equals("remove")) {
                second.remove(amt);
            }
        }
    }
 
}