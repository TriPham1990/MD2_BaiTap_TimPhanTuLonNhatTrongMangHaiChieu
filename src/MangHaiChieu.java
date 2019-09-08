import java.util.Random;
import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of rows in the array :");
        int rowsArray = scanner.nextInt();

        System.out.println("Enter the number of columns in the array :");
        int columnsArray = scanner.nextInt();

        int[][] arrays = new int[rowsArray][columnsArray];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = 1 + random.nextInt(100);
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }

        MaxArrayTwoWay.maxArrayTwoWay(arrays);
    }
}
