import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0,k,i=1;

        System.out.println("Lütfen sayıyı giriniz :");
        k= input.nextInt();

        for (i=1;i<=k;i++){
            total+=(1/i);
        }
        System.out.println( total);
    }
}
