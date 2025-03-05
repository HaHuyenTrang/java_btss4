import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào số nguyên N: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("số nhập vào không hợp lệ!");
        }
        int result = 0;
        for(int i=1;i<=n;i++){
            result += i;

        }
        System.out.println("tổng các số từ 1 đến "+n+ " = " +result );
    }
}
