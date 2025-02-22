import java.util.Scanner;
 
public class UserInterface {
 
    private TodoList list;
    private Scanner sc;
 
    public UserInterface(TodoList list, Scanner sc) {
        this.list = list;
        this.sc = sc;
    }
 
    public void start() {
        while (true) {
            String command = sc.nextLine();
            if (command.equals("stop")) {
                break;
            }
            switch (command) {
                case "add":
                    System.out.println("To add:");
                    String task = sc.nextLine();
                    this.list.add(task);
                    break;
 
                case "list":
                    this.list.print();
                    break;
 
                case "remove":
                    System.out.println("Which one is removed?");
                    int index = Integer.valueOf(sc.nextLine());
                    this.list.remove(index);
                    break;
            }
        }
    }
}