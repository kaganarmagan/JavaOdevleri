import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Üçgenin basamak sayısını giriniz :");
        int k= input.nextInt();
        int m=0,t=k;

        for(int i=1;i<=k;i++){
            for(int z=1;z<=m;z++){
                System.out.print(" ");
            }
            m++;
            for(int z=1;z<=2*t-1;z++){
                System.out.print("*");
            }
            t--;
            System.out.println();


        }


    }
}
