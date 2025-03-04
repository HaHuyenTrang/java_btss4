import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int result=0;
        while (true) { // Vòng lặp vô hạn
            System.out.print("Nhập một số : ");
            n = sc.nextInt();

            result +=n;

            if (n == 0) {
                System.out.println("Chương trình kết thúc.");
                break; // Thoát vòng lặp khi nhập 0
            }

            System.out.println("Bạn vừa nhập: " + n);
        }
        System.out.println("kết quả tổng các số đã nhập = " +result);
    }
}
