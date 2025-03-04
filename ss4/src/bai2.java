import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên N:");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("không phải số nguyên tố!");

        } else {
            // Math.sqrt(n) trong Java là hàm tính căn bậc hai của số n.
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("số nguyên tố!");
                    break;
                }else {
                    System.out.println("không phải số nguyên tố!");
                }
                break;
            }

        }
    }
}
