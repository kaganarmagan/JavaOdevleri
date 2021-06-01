import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz :");
        int k= input.nextInt();
        int t=0,f=1;
        System.out.print(k+" Elemanlı Fibonacci Serisi : "+t+" ");
        for(int i=1;i<=k;i++){
            int fnew=f+t;
            t=f;
            f=fnew;
            System.out.print(t+" ");
        }
    }
}
