import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] dizi=new int[]{15,12,788,1,-1,-788,2,0};

        System.out.print("Bir sayı giriniz :");
        int k= input.nextInt();

        int[] sortedDizi=Arrays.copyOf(dizi,dizi.length);
        Arrays.sort(sortedDizi);


        System.out.print("Dizi : {"+print(dizi,0)+"}\n");
        System.out.println("Girilen sayı : "+k);
        System.out.println("Girilen sayıdan küçük en yakın sayı :  "+closestSmall(dizi,k));
        System.out.println("Girilen sayıdan büyük en yakın sayı :  "+closestLarge(sortedDizi,k));







    }

    static String closestLarge(int[] c,int a){  //en yakın  girilen sayıdan büyük sayıyı bulan method.
        if(a>=c[c.length-1]){
            return "Sayı bulunamadı.";
        }
        for (int i: c){

            if(i>a){
                a=i;
                break;
            }

        }


    return ""+a;
    }

    static String closestSmall(int[] c,int a) {  // en yakın girilen sayıdan küçük sayıyı bulan method.
       int rev;                               //çalışma presibi bütün array ve sayıyı eksiyle çarpıp
        for(int i=0;i<c.length;i++){          //arrayi sıralattıktan sonra en girilen sayıdan ilk büyük sayıyı bulmak üzere.
          c[i]*=-1;
       }
        Arrays.sort(c);
        a*=-1;
        if(a>=c[c.length-1]){
            return "Sayı bulunamadı.";
        }
        for (int i: c){
            if(i>a){
                a=i;
                break;
            }

        }

       return ""+-1*a;


    }
    static String print(int [] c ,int a){      // örnek çıktıda square bracket  yerine curly braces vardı bende çıktıya uygun olması için recursive method yazdım.
        if(a==(c.length-1)){
            return c[a]+"";
        }
        return c[a]+","+print(c,a+1);
    }

}
