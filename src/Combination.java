import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int var, i,n=1,var2,var3,r=1,k=1;
        System.out.println("Kümenin eleman sayısını yazınız :");
        var= input.nextInt();
        System.out.println("Kaç elemanlı kombinasyonunu istediğinizi yaznız :");
        var2= input.nextInt();
        var3=var-var2;

        if(var<0||var2<0||var3<0){
            System.out.println("Hatalı veri girdiniz.");
            System.exit(0);
        }
        for(i=1;i<=var;i++){
            n*=i;
        }
        for(i=1;i<=var2;i++){
            r*=i;
        }
        for(i=1;i<=var3;i++){
            k*=i;
        }
        System.out.println(n/(r*k));
    }
}
