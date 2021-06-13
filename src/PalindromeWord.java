import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi yazınız : ");
        String word = input.nextLine();
        String test = word;

        test = test.trim().toLowerCase();
//Kullanılan harfleri küçültüp kenar boşlukları trimleniyor
        String str1;
        String str2;

        if (test.length() % 2 == 1) { //sözcük uzunluğu tek mi çift mi kontrol ediliyor
            str1 = word.substring(0, (test.length() - 1) / 2);
            str2 = word.substring(((test.length() - 1) / 2) + 1, test.length());
            // sözcük iki parçaya bölünüyor

            byte[] strAsByteArray = str2.getBytes();

            byte[] result = new byte[strAsByteArray.length];


            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            //ikinci parça ters çevriliyor
            str2 = new String(result);

        } else {
            str1 = word.substring(0, test.length() / 2);
            str2 = word.substring(test.length() / 2, test.length());
            byte[] strAsByteArray = str2.getBytes();

            byte[] result = new byte[strAsByteArray.length];


            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];

            str2 = new String(result);


        }
        if (str1.equals(str2)) { //eşitlik durumuna göre çıktı veriyor
            System.out.println(word + " palindromik bir kelimedir.");
        } else {
            System.out.println(word + " palindromik bir kelime değildir.");
        }
    }
}
