import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số N: ");
        int n = sc.nextInt();
        int result=0;
        if (n < 0) {
            n = -n;
        }
        while (n > 0) {
            int digit = n % 10; // Lấy chữ số cuối cùng
            System.out.print(digit + " là chữ số lấy ra\n"); // In ra chữ số
            result = result + digit;
            n /= 10; // Bỏ chữ số cuối cùng
        }
        System.out.println("Tổng các chữ số : " + result);
    }
}
