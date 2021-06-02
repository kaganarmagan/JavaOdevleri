import java.util.Scanner;

public class IsPrime {
    static int isPrime(int a,int b){
        if(a%b==0){
            return 1;
        }
        if(b==2){
            return 0;
        }
        return isPrime(a, b - 1);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int n= input.nextInt();
        int t=isPrime(n,n-1);
        System.out.println(t==0?n+" sayısı ASALDIR !":n+" sayısı ASAL değildir !");

    }
}


