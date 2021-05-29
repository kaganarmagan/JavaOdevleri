import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,k,n,z;

        System.out.println("Üssünü almak istediğiniz sayıyı giriniz :");
        k= input.nextInt();
        z=k;

        System.out.println("Üssünü yazınız :");
        n= input.nextInt();

        for(i=1;i<n;i++){
            k*=z;
        }
        System.out.println("Üslü ifademizin cevabı :"+k);

    }

}
