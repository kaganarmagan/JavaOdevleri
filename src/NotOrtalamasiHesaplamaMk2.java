import java.util.Scanner;

public class NotOrtalamasiHesaplamaMk2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,muzik,turkce,total=0,count=0;

        System.out.println("Matematik notunu giriniz :");
        mat = input.nextInt();

        System.out.println("Fizik notunu giriniz :");
        fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz :");
        kimya = input.nextInt();

        System.out.println("Türkçe notunu giriniz :");
        turkce = input.nextInt();

        System.out.println("Müzik notunu giriniz :");
        muzik = input.nextInt();

        int[] notlar ={mat,fizik,kimya,muzik,turkce};


        for (int i: notlar ){
            if (i>0&&i<=100){
                total+=i;
                count++;
            }
            else{
                total=total;
            }

        }
        double ortalama=total/count;


        System.out.println("Ortalamanız :"+ortalama);
        System.out.println(ortalama>=55?"Sınıfı geçtiniz":"Sınıfta kaldınız");



    }
}
