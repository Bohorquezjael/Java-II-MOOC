
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        while (true) {
            System.out.printf("First: %d/100\n", container1);
            System.out.printf("Second: %d/100\n", container2);
            String[] command = scan.nextLine().split(" ");

            if ("quit".equals(command[0])) {
                break;
            }
            int cant = Integer.parseInt(command[1]);

            switch (command[0]) {
                case "add":
                    if (cant > 0) {
                        container1 += cant;
                        if (container1 > 100) {
                            container1 = 100;
                        }
                    }
                    break;
                
                case "move":
                    if(cant <= container1 && cant > 0){
                       container1 -= cant;
                       container2 += cant;
                       if(container2 > 100)container2 = 100;
                    }else if(cant > 0){
                        container2 += container1;
                        container1 = 0;
                    }
                    break;
                    
                case "remove":
                    if(cant <= container2){
                        container2 -= cant;
                    }
            }
        }
    }

}
