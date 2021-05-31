import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,t=0,i;
        System.out.print("Bir sayı giriniz:");
        num= input.nextInt();
        for(i=1;i<num;i++){
            if(num%i==0)t+=i;
        }
        System.out.println(t==num?num+" Mükemmel sayıdır.":num+" Mükemmel sayı değildir.");
    }
}
