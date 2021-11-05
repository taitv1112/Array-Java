import java.util.Scanner;

public class ComcatArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng arr1 : ");
        int number1 = sc.nextInt();
        System.out.println("Nhập số lượng phần tử mảng arr2 : ");
        int number2 = sc.nextInt();

        int[] arr1 = new int[number1];
        int[] arr2 = new int[number2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i + " của mảng");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i + " của mảng");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = comcatArray(arr1,arr2);

        for (int c: arr3) {
            System.out.println(c);
        }

    }
    static int[] comcatArray(int[] arr1 , int[] arr2){
        int[] comcat = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, comcat, 0, arr1.length);
        System.arraycopy(arr2, 0, comcat, arr1.length, arr2.length);
        return comcat;
    }
}
