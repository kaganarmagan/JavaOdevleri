package ActionGame;

import ActionGame.Characters.Player;
import ActionGame.Location.*;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    public void start() {
        Player p1 = Player.selectChar();
        Location location = null;
        while (true) {
            System.out.println("===========================================");
            System.out.println("         Bölgeler");
            System.out.println();
            System.out.println("1- Güvenli Ev--Canınızı doldurabileceğiniz güvenli bir ev.--");
            System.out.println("2- Market--Silah ve Zırh alabileceğiniz bir alan.--");
            System.out.println("3- Orman -- Bu sarımsağa gerçekten ihtiyacımız var mı? --");
            System.out.println("4- Nehir -- Yanınızda balla gelmeyin.--");
            System.out.println("5- Mağara-- Mağara ayılar için daha uygun değil mi?--");
            System.out.println("6- Maden -- Gözlerinizi yerden ayırmayın !!--");
            System.out.println("0- Oyundan çık");
            System.out.println("===========================================");
            System.out.print("Yapmak istediğiniz seçimi giriniz : ");
            int select = input.nextInt();
            if (select==0){
                System.out.println("Oyunu oynadığınız için teşekkür ederiz!");
                System.exit(0);
            }
            location = switch (select) {
                case 2 -> new Market(p1);
                case 3 -> new Forest(p1);
                case 4 -> new River(p1);
                case 5 -> new Cave(p1);
                case 6 -> new Mine(p1);
                default -> new SafeHouse(p1);
            };

            if (!location.onLocation()) {
                System.out.println("Game Over !");
                break;
            }
        }
    }


}