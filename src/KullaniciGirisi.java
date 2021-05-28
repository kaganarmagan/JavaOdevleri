import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String uName1, pWord1, uName = "patika", pWord = "java123", renew;

        System.out.println("Kullanıcı adını giriniz :");
        uName1 = input.next();
        System.out.println("Şifreyi giriniz :");
        pWord1 = input.next();


        if (uName.equals(uName1) && pWord.equals(pWord1)) {
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Giriş başarısız. Şifrenizi yenilemek ister misiniz?(y/n)");
            renew = input.next();
            if (renew.equals("y")) {
                System.out.println("Lütfen yeni şifre giriniz :");
                String newpWord = input.next();
                if (newpWord.equals(pWord)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    pWord = input.next();
                    System.out.println("Şifre oluşturuldu");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else {
                System.out.println("Sistem kapatıldı");
            }
        }
    }
}

