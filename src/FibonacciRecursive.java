import java.util.Scanner;

public class FibonacciRecursive {
    public static int fib(int a){
        if(a==0){
            return 0;
        }else if(a==1||a==2){
            return 1;
        }else if(a<0){
            return -1;
        }

        return fib(a-1)+fib(a-2);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int k= input.nextInt();
        System.out.println(fib(k)==-1?"Yanlış bir sayı girdiniz":"F("+k+") = "+fib(k));
    }
}
