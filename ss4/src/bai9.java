import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số N: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("các số từ 1 đến n: "+i);
            int original = i;
            int reversed = 0;
            int num = i;

            // Đảo ngược số
            while (num > 0) {
                int digit = num % 10; // Lấy chữ số cuối
                reversed = reversed * 10 + digit; // Xây dựng số đảo ngược
                num /= 10; // Bỏ chữ số cuối
            }

            // Nếu số đảo ngược bằng số ban đầu, in ra
            if (reversed == original) {
                System.out.print(original + " là số Palindrome \n");
            }
        }


    }
}
