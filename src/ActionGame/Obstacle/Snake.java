package ActionGame.Obstacle;
import java.util.Random;

public class Snake extends Obstacle{
    Random random=new Random();
    public Snake(int k) {
        super(4, "Yılan",k, 12, 0);
    }
}
