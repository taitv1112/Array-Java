import java.util.Scanner;

public class AddElenmentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i + " của mảng");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập phần tử cần thêm vào mảng: ");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn vào mảng: ");
        int index = sc.nextInt();
        insertElement(arr,x,index);
        for (int c:insertElement(arr,x,index)) {
            System.out.println(c);
        }
    }

    public static int[] insertElement(int original[],
                                       int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index
                + 1, length - index);
        return destination;
    }

}


