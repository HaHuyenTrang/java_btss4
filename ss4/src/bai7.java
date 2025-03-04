import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số N: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("các số từ 1 đến n: " + i);
            int num = i;
            int count = 0; // Biến đếm số lần lặp để tránh vòng lặp vô hạn

            while (num != 1 && count < 100) { // Giới hạn số lần lặp để tránh vòng lặp vô hạn
                int sum = 0, temp = num;

                // Tính tổng bình phương các chữ số (cách thủ công)
                while (temp > 0) {
                    int digit = temp % 10; // Lấy chữ số cuối
                    sum += digit * digit;  // Bình phương chữ số và cộng vào tổng
                    temp /= 10;            // Bỏ chữ số cuối
                }

                num = sum; // Cập nhật số mới
                count++;   // Tăng biến đếm số lần lặp
            }

            if (num == 1) {
                System.out.print(i + " là số happy\n"); // Nếu kết quả là 1, in số đó ra
            }
        }
    }
}
