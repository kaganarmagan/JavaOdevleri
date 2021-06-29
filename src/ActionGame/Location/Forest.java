package ActionGame.Location;

import ActionGame.Characters.Player;
import ActionGame.Obstacle.*;

public class Forest extends BattleLoc{
    public Obstacle[] vampires;


    public Forest(Player player) {
        super(player, "Orman");
        this.vampires=new Obstacle[random.nextInt(3)+1];
        for(int i=0;i< vampires.length;i++){
            vampires[i]=new Vampire();
        }

    }

    @Override
    public boolean onLocation() {
        if(player.getInventory().isFirewood()){
            System.out.println("Daha önce bu bölgeye geldiniz:");
            return true;
        }
        System.out.println("===========================================");
        System.out.println("Bölge düşmanı :"+vampires[0].getName()+"(1-3)"+
                "\n\thasar  : "+vampires[0].getDamage()+
                "\n\tsağlık : "+vampires[0].getHealth()+
                "\n\tödül   : "+vampires[0].getReward()+" altın");

        System.out.print("1-Savaş 0-Çıkış  :");

        while(true){
            int k= input.nextInt();
            switch (k){
                case 0 : return true;
                case 1:{
                    for (Obstacle vampire : vampires) {
                        combat(vampire);
                        if (isDead()) {
                            return false;
                        }
                        player.setMoney(player.getMoney() + vampire.getReward());
                        if (isFinished(vampire)) {
                            return true;
                        }
                        System.out.println("\tSağlığınız :" + player.getHealth());
                        if (doContinue()) {
                            return true;
                        }
                    }
                } default:
                    System.out.println("Yanlış bir değer girdiniz.");
                    break;
            }
        }
    }
    public boolean isFinished(Obstacle o){
        if(vampires[vampires.length-1]==o) {
            player.getInventory().setFirewood(true);
            return true;
        }
        return false;
    }
}
