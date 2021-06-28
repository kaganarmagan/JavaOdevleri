package ActionGame.Characters;

import ActionGame.Inventory;

public class Samurai extends Player{
    public Samurai( String name) {
        super(new Inventory(),5 , 21, 15, "Samurai", name,1);
    }
}
