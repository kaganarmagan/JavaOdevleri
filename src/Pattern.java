import java.util.Scanner;

public class Pattern {
    static String pattern(int a,int b,int c){
        if(c==0){
            if(b==a){
                return " "+b;
            }
            return " "+b+pattern(a,b+5,0);
        }
        if(b<=0){
            return " "+b+pattern(a,b+5,0);
        }
        return  " "+b+pattern(a,b-5,1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=0;
        while(n<1) {                                    //Pattern'in açıklandığı şekilde oluşması için sayının sıfırdan büyük olması gerekiyor
            System.out.print("Lütfen sayı giriniz :");
            n = input.nextInt();
            if(n<1){
                System.out.println("Yanlış sayı girdiniz.");
            }
        }
        System.out.print("Desen oluşturuldu : "+pattern(n,n,1));

    }


}
