import java.util.Scanner;

public class IsPalindrome {
    public static void isPalindrome(int a){
        int mod,comp=a,rec=0;
        while(comp!=0){
            mod=comp%10;
            comp/=10;
            rec=(rec*10)+mod;
        }
        if(rec==a){
            System.out.println(a+" bir Palindrom sayıdır.");
        }else{
            System.out.println(a+" bir Palindrom sayı değildir.");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int k= input.nextInt();
        isPalindrome(k);
    }
}
