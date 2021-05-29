import java.util.Scanner;

public class Bolunebilme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,i,c=0;
        double total=0;

        System.out.println("Bir sayı giriniz :");
        num=input.nextInt();

        for(i=0;i<=num;i++) {                //sorudaki "ve" bağlacını "logic and" olarak aldım.
            if (i % 3 == 0 && i % 4 == 0){
                total+=i;
                c++;
            }
        }
        System.out.println("Ortalama :"+total/c);
    }
}
