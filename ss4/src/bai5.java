import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số N: ");
        int n = sc.nextInt();
        int result=0;
        for(int i=1;i<=n;i++){
            System.out.println("các số từ 1 đến n: "+i);
            if (n % i == 0) { // Nếu i là ước của n
                System.out.print(i + " là ước của n\n"); // In ra ước
                result += i; // Cộng vào tổng
            }
        }
        System.out.println("Tổng các ước của " + n + " là: " + result);
    }
}
