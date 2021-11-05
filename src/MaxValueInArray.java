import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers row: ");
        int row = sc.nextInt();
        System.out.println("Enter numbers column: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập phần tử mảng arr["+ i +"["+ j +"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] c :arr) {
            System.out.println(Arrays.toString(c));
        }
        System.out.println("Giá trị lớn nhất của mảng 2 chiều là: "+MaxValueArray(arr,row,column));

    }
    static int MaxValueArray(int[][] arr,int row,int column){
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }

        }
        return max;
    }
}
