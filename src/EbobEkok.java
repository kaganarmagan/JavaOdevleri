import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int j, k,i=1,t=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz :");
        j= input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        k = input.nextInt();
        int b= Math.min(k, j);

        while(b>0){
            if(j%b==0&&k%b==0) {
                t = b;
                break;
            } else{
             b--;
            }
        }
        int t2=j*k/t;
        System.out.println("EBOB :"+t+"\n"+ "EKOK :"+t2 );










    }
}
