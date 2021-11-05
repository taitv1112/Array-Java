import java.util.Arrays;
import java.util.Scanner;

public class SumColumnInArray {
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

        System.out.println("Cột muốn tính tổng: ");
        int indexColumn = sc.nextInt();

        System.out.println("Tổng của cột là: "+SumColumnArray(indexColumn,arr,row,column));
    }
    static int SumColumnArray(int indexColumn,int[][] arr,int row, int column){
        int sum =0;
        if(indexColumn>row || indexColumn <0){
            System.out.println("Nhập lại !");
        }else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (i == indexColumn){
                        sum += arr[i][j];
                    }
                }
            }
        }
        return sum;
    }

}
