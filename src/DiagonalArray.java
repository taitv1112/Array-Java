import java.util.Arrays;
import java.util.Scanner;

public class DiagonalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers row: ");
        int row = sc.nextInt();

        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Nhập phần tử mảng arr[" + i + "[" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] c : arr) {
            System.out.println(Arrays.toString(c));
        }
        int sumSub = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    sumSub += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính là: " + sumSub);
    }
}
