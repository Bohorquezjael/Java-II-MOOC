
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try{
            Files.lines(Paths.get("literacy.csv"))
                            .map(line -> line.split(","))
                            .sorted((line1, line2) -> line1[5].compareTo(line2[5]))
                            .map(line -> {
                                return line[3] + " (" + line[4] + ")," + line[2].replace(" (%)", ", ") + line[5];
                            })
                            .forEach(System.out::println);
        }catch(Exception e){
               e.printStackTrace();
        }
    }
}
