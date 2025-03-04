import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên N:");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("n không hợp lệ");
        }
        int result =0;
        for(int i=0;i<=10;i++){
            result= n *i;
            System.out.println(+n+ " * "+i+ " = " +result);

        }
    }
}
