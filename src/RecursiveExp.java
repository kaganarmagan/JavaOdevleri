import java.util.Scanner;

public class RecursiveExp {
    static double exp(int a,int b){
        if(b==0){
            return 1;
        }else if(b<0){
            return 1/exp(a,-b);
        }
        return a*exp(a,b-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,k;

        System.out.print("Üssü alınacak sayıyı giriniz :");
        n= input.nextInt();
        System.out.print("Üssünü giriniz :");
        k= input.nextInt();

        System.out.println("İşleminizin sonucu : "+exp(n,k));


    }

}
