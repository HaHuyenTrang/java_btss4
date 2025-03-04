import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguên N: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("không hợp lệ");
        }
        for(int i=1;i<=n;i++) {
            System.out.println("các số từ 1 đến n: " + i);
            int original = i;
            int num = i;
            int count = 0;

            // Đếm số chữ số (k)
            int temp = num;
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            // Tính tổng lũy thừa bậc k của từng chữ số
            num = original; // Gán lại giá trị ban đầu
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;

                // Tính lũy thừa bằng vòng lặp (thủ công, không dùng Math.pow)
                int power = 1;
                for (int j = 0; j < count; j++) {
                    power *= digit;

                }
                sum += power;
                num /= 10;
            }

            // Nếu tổng lũy thừa bằng chính số đó, in ra
            if (sum == original) {
                System.out.print("\n"+original + "  là số Armstrong trong khoảng từ 1 đến N\n");
            }
        }


    }
}
