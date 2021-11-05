import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.println("Nhập kí tự cần tìm trong chuỗi: ");
        char a = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a){
                count++;
            }

        }
        System.out.println("Số lần xuất hiện của kí tự " +a+ " trong chuỗi " +str + " là: " +count);
    }
}
