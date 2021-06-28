package ActionGame.Characters;

import ActionGame.Inventory;

public class Knight extends Player{
    public Knight(String name) {
        super(new Inventory(),8, 24, 5, "Şövalye", name,3);
    }
}
