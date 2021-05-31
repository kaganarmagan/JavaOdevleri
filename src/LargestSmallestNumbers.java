import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numbers,t,i,s=0,l=0;
        System.out.print("Kaç tane sayı gireceksiniz:");
        numbers= input.nextInt();

        for(i=1;i<=numbers;i++){
            System.out.print(i+". Sayıyı  giriniz: ");
            t= input.nextInt();
            if(t<s) s=t;
            else if (t>l) {
                l=t;
            }
        }
        System.out.println("En büyük sayı: " +l+"\n"+"En küçük sayı: " +s);

    }
}

