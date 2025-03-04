import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Hiển thị menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tính tổng các ước của số");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt(); // Nhập lựa chọn

            if (choice == 4) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            System.out.print("Nhập số cần kiểm tra: ");
            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("Vui lòng nhập số nguyên dương.");
                continue;
            }

            if (choice == 1) { // Kiểm tra số nguyên tố
                int isPrime = 1; // Giả sử là số nguyên tố
                if (n == 1) {
                    isPrime = 0;
                } else {
                    for (int i = 2; i * i <= n; i++) { // Kiểm tra từ 2 đến √n
                        if (n % i == 0) {
                            isPrime = 0; // Không phải số nguyên tố
                            break;
                        }
                    }
                }
                if (isPrime == 1) {
                    System.out.println(n + " là số nguyên tố.");
                } else {
                    System.out.println(n + " không phải số nguyên tố.");
                }

            } else if (choice == 2) { // Kiểm tra số hoàn hảo
                int sum = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        sum += i; // Cộng các ước (không bao gồm chính nó)
                    }
                }
                if (sum == n) {
                    System.out.println(n + " là số hoàn hảo.");
                } else {
                    System.out.println(n + " không phải số hoàn hảo.");
                }

            } else if (choice == 3) { // Tính tổng các ước
                int sum = 0;
                System.out.print("Các ước của " + n + ": ");
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        System.out.print(i + " "); // In từng ước
                        sum += i;
                    }
                }
                System.out.println("\nTổng các ước của " + n + " là: " + sum);

            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }

        sc.close();
    }
}
