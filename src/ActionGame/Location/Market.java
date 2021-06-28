package ActionGame.Location;

import ActionGame.Characters.Player;
import ActionGame.Tool.*;

public class Market extends SafeLoc {

    private final Weapon[] weapons={new Gun(),new Sword(),new Rifle()};
    private final Armor[] armors={new LightArmor(),new MedArmor(),new HeavyArmor()};
    public Market(Player player) {
        super(player, "Mağaza");
    }
    public boolean onLocation(){
        menu();
        int select=input.nextInt();

        if(select==0){
            System.out.println("Geri dönülüyor...");

        }else {
            buy(select);
        }return true;
    }
    public void buy(int select){
        select-=1;

        try {
           if(select< weapons.length){
                if (player.getMoney() >=  weapons[select].getMoney()) {
                    player.getInventory().setWeapon(weapons[select]);
                    player.setMoney(player.getMoney() - weapons[select].getMoney());
                } else {
                    System.out.println("Yetersiz bakiye.");
                }
           }else{
               select-=weapons.length;
               if (player.getMoney() >= armors[select].getMoney()) {
                   player.getInventory().setArmor(armors[select]);
                   player.setMoney(player.getMoney() - armors[select].getMoney());
               } else {
                   System.out.println("Yetersiz bakiye.");
               }
           }
            onLocation();
        }catch (Exception e){
            System.out.println("Yanlış bir sayı girdiniz.");
            onLocation();
        }
    }
    public void menu(){
        System.out.print("""
                 =========================
                   Mağazaya hoş geldiniz!
                                    
                         Ürünler
                =========================
                        Silahlar
                """);
        for(int i=0;i< weapons.length;i++) {
            System.out.println((i+1)+"- "+ weapons[i].getName()+"\thasar: "+weapons[i].getFeature()+"\tpara: "+weapons[i].getMoney());

        }
        System.out.print("""
                =========================
                        Zırhlar
                """);
        for(int i=0;i< armors.length;i++) {
            System.out.println((weapons.length+i+1)+"- "+ armors[i].getName()+"\tengelleme: "+armors[i].getFeature()+"\tpara: "+armors[i].getMoney());

        }
        System.out.println("=========================\n"+"Bakiyeniz : "+player.getMoney());
        System.out.println("\n0- Çıkış");
        System.out.println("Silahınız :"+player.getInventory().getWeapon().getName()+"\tZırhınız :"+player.getInventory().getArmor().getName()+"\t\tHasar :"+player.getDamage()+"\t\tSağlık :"+player.getHealth());
        System.out.print("Seçiminiz :");
    }
}
