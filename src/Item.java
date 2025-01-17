import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Item extends GameObject implements Pickupable {

    Item(Vector position, int width, int height, String name, Angle angle, BufferedImage sprite) {
        super(position, width, height, name, angle, sprite);
        
    }

    public void draw(Graphics g){
        g.fillRect((int)this.getPosition().getX(), (int)this.getPosition().getY(), this.getWidth(), this.getHeight());
    }

    @Override
    public void onPickup(){}
}
