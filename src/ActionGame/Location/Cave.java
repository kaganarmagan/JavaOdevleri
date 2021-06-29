package ActionGame.Location;

import ActionGame.Characters.Player;
import ActionGame.Obstacle.Obstacle;
import ActionGame.Obstacle.Zombie;


public class Cave extends BattleLoc{
    Obstacle[] zombies;
    public Cave(Player player) {
        super(player, "Mağara");
        this.zombies=new Obstacle[random.nextInt(3)+1];
        for(int i=0;i< zombies.length;i++){
            zombies[i]=new Zombie();
        }



    }

    @Override
    public boolean onLocation() {
        if(player.getInventory().isFood()){
            System.out.println("Daha önce bu bölgeye geldiniz:");
            return true;
        }
        System.out.println("===========================================");
        System.out.println("Bölge düşmanı :"+zombies[0].getName()+"(1-3)"+
                    "\n\thasar  : "+zombies[0].getDamage()+
                    "\n\tsağlık : "+zombies[0].getHealth()+
                    "\n\tödül   : "+zombies[0].getReward()+" altın");

        System.out.print("1-Savaş 0-Çıkış  :");

        while(true){
            int k= input.nextInt();
                switch (k){
                    case 0 : return true;
                    case 1:{
                        for (Obstacle zombie : zombies) {
                            combat(zombie);
                            if (isDead()) {
                                return false;
                            }
                            player.setMoney(player.getMoney() + zombie.getReward());
                            System.out.println("\tSağlığınız :" + player.getHealth());
                            if (isFinished(zombie)) {
                                return true;
                            }
                            if (doContinue()) {
                                return true;
                            }
                            player.setMoney(player.getMoney() + zombie.getReward());
                        }
                        player.getInventory().setFood(true);
                        return true;
                    } default:
                        System.out.println("Yanlış bir değer girdiniz.");
                        break;
                }
            }
    }

    public boolean isFinished(Obstacle o){
        if(zombies[zombies.length-1]==o) {
            player.getInventory().setFood(true);
            return true;
        }
        return false;
    }




}
