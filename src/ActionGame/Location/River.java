package ActionGame.Location;

import ActionGame.Characters.Player;
import ActionGame.Obstacle.*;




public class River extends BattleLoc{
    Obstacle[] bears;
    public River(Player player) {
        super(player,"Nehir");
        this.bears=new Obstacle[random.nextInt(3)+1];
        for(int i=0;i< bears.length;i++){
            bears[i]=new Bear();
        }
    }
    @Override
    public boolean onLocation() {
        if(player.getInventory().isWater()){
            System.out.println("Daha önce bu bölgeye geldiniz:");
            return true;
        }
        System.out.println("===========================================");
        System.out.println("Bölge düşmanı :"+bears[0].getName()+"(1-3)"+
                "\n\thasar  : "+bears[0].getDamage()+
                "\n\tsağlık : "+bears[0].getHealth()+
                "\n\tödül   : "+bears[0].getReward()+" altın");

        System.out.print("1-Savaş 0-Çıkış  :");

        while(true){
            int k= input.nextInt();
            switch (k){
                case 0 : return true;
                case 1:{
                    for (Obstacle bear : bears) {
                        combat(bear);
                        if (isDead()) {
                            return false;
                        }
                        player.setMoney(player.getMoney() + bear.getReward());
                        if (isFinished(bear)) {
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
        if(bears[bears.length-1]==o) {
            player.getInventory().setWater(true);
            return true;
        }
        return false;
    }
}

