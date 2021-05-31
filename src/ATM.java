import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            int control = userName.equals("patika") && password.equals("dev123") ? 1 : 0;
            switch (control) {
                case 1 -> {
                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    do {
                        System.out.println("""
                                1-Para yatırma
                                2-Para Çekme
                                3-Bakiye Sorgula
                                4-Çıkış Yap""");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select = input.nextInt();
                        switch (select) {
                            case 1 -> {
                                System.out.print("Para miktarı : ");
                                int price = input.nextInt();
                                balance += price;
                                System.out.println("Yeni bakiyeniz : " + balance+" TL");
                            }
                            case 2 -> {
                                System.out.print("Para miktarı : ");
                                int price = input.nextInt();
                                if (price > balance) {
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                    balance -= price;
                                }
                            }
                            case 3 -> {
                                System.out.println("Bakiyeniz : " + balance+" TL");
                            }
                            default -> {
                                System.out.println("Yanlış bir seçimde bulundunuz.");
                            }
                        }
                    } while (select != 4);
                    System.out.println("Tekrar görüşmek üzere.");
                }
                case 0 -> {
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    switch(right){
                        case 0: {
                            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                        } default: {
                            System.out.println("Kalan Hakkınız : " + right);
                        }
                    }
                }
            }
        }
    }
}
