import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t,k,i,j;
        System.out.println("Bir sayı giriniz :");
        t= input.nextInt();


        for(i=0;i<t;i++) {
            for (k = 1; k < (t - i); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=t-1;i>0;--i){  //  Oluşturulan üçgenin x eksenine göre yansımasına almak yerine girilen sayının 1 eksiğinden yola çıkıp elması tamamladım.
            for(k=t;k>i;k--) {
                System.out.print(" ");
            }
            for(j=1;j<(i*2);j++) {
                System.out.print("*");
          }
            System.out.println();
       }
    }
}
