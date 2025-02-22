
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] arr){
        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sB.append(arr[i][j]);
            }
            sB.append("\n");
        }
        
        return sB.toString();
    }
}
