import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên N:");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("không phải số nguyên tố!");

        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Không cần kiểm tra thêm, vì đã xác định không phải số nguyên tố
                }
            }

            if (isPrime) {
                System.out.println(n + " là số nguyên tố!");
            } else {
                System.out.println(n + " không phải số nguyên tố!");
            }
        }
    }
}
