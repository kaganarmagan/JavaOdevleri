import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int j, k,i=1,t=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz :");
        j= input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        k = input.nextInt();

        while(i<=j||i<=k){
            if(j%i==0&&k%i==0) t = i;
            i++;
        }
        int t2=j*k/t;
        System.out.println("EBOB :"+t+"\n"+ "EKOK :"+t2 );










    }
}
