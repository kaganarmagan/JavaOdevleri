import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        String month;

        System.out.println("Doğum tarihinizi(gün ay şeklinde)giriniz :");
        day = input.nextInt();
        month = input.next();

        if (month.equals("ocak")) {                                    //İlk önce ayı daha sonra günü kontrol ediyor
            if (day < 22) {
                System.out.println("Oğlak");
            } else if (day > 21 && day < 32) {
                System.out.println("Kova");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("subat")) {
            if (day < 20) {
                System.out.println("Kova");
            } else if (day > 19 && day < 30) {
                System.out.println("Balık");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("mart")) {
            if (day < 21) {
                System.out.println("Balık");
            } else if (day > 20 && day < 32) {
                System.out.println("Koç");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("nisan")) {
            if (day < 21) {
                System.out.println("Koç");
            } else if (day > 20 && day < 31) {
                System.out.println("Boğa");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("mayis")) {
            if (day < 22) {
                System.out.println("Boğa");
            } else if (day > 21 && day < 32) {
                System.out.println("İkizler");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("haziran")) {
            if (day < 23) {
                System.out.println("ikizler");
            } else if (day > 22 && day < 31) {
                System.out.println("Yengeç");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("temmuz")) {
            if (day < 23) {
                System.out.println("Yengeç");
            } else if (day > 22 && day < 32) {
                System.out.println("Aslan");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("agustos")) {
            if (day < 23) {
                System.out.println("Aslan");
            } else if (day > 22 && day < 32) {
                System.out.println("Başak");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("eylul")) {
            if (day < 23) {
                System.out.println("Başak");
            } else if (day > 22 && day < 31) {
                System.out.println("Terazi");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("ekim")) {
            if (day < 23) {
                System.out.println("Terazi");
            } else if (day > 22 && day < 32) {
                System.out.println("Akrep");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("kasim")) {
            if (day < 22) {
                System.out.println("Akrep");
            } else if (day > 21 && day < 31) {
                System.out.println("Yay");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else if (month.equals("aralik")) {
            if (day < 22) {
                System.out.println("Yay");
            } else if (day > 21 && day < 32) {
                System.out.println("Oğlak");
            } else {
                System.out.println("Yanlış tarih girdiniz.");
            }
        } else {
            System.out.println("Yanlış tarih girdiniz.");
        }

    }
}
