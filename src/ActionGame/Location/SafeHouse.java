package ActionGame.Location;

import ActionGame.Characters.*;



public class SafeHouse extends SafeLoc {
    public SafeHouse(Player player ) {
        super(player,"Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        isWin(player);
        Player[] array={new Samurai(""),new Archer(""),new Knight("")};
        for(Player p:array)
            if(p.getID()==player.getID()){
                player.setHealth(p.getHealth());
            }


        System.out.println("""
                           =========================
                           *Güvenli evdesiniz.""");
        System.out.println("*Sağlık :"+player.getHealth()+"\n"+"""
                           *Canınız yenilendi.
                           0- Geri dön\040""");

        int select=1;

        while(!(select==0)){
            select=input.nextInt();

        }
        System.out.println("Geri dönülüyor...");
        return true;
    }
 public void isWin(Player p1){
        if(p1.getInventory().isFood()&&p1.getInventory().isFirewood()&&p1.getInventory().isWater()){
            System.out.println("Oyunu kazndınız !");
            System.exit(0);
        }
 }

}
