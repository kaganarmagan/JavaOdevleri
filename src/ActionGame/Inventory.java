package ActionGame;

import ActionGame.Tool.Armor;
import ActionGame.Tool.Weapon;


public class Inventory {
    private boolean water=false;
    private boolean food=false;
    private boolean firewood=false;
    private Weapon weapon=new Weapon(0,0,"Barehanded");
    private Armor armor=new Armor(0,0,"Shirt");

    public Inventory() { }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

}
