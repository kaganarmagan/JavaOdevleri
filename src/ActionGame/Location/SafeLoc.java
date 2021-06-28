package ActionGame.Location;

import ActionGame.Characters.Player;

public abstract class SafeLoc extends Location {
    public SafeLoc(Player player, String name) {
        super(player, name);
    }

    public boolean onLocation(){
       return true;
    }
}
