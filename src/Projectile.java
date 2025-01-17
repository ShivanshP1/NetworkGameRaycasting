import java.awt.image.BufferedImage;
import java.awt.Graphics;

class Projectile extends Entity {

  private double changeX;
  private double changeY;

  public double getChangeX() {
    return this.changeX;
  }

  public double getChangeY() {
    return this.changeY;
  }
  
  public void draw(Graphics g, double offSetX, double offSetY) {
      //System.out.println("drawing projectile");
      g.fillRect((int) (getPosition().getX() - getWidth() / 2 - offSetX), (int) (getPosition().getY() - getHeight() / 2 - offSetY), getWidth(), getHeight()); //draw the projectile
  }

  Projectile(Vector position, int width, int height, String name, Angle angle, BufferedImage sprite, int health,
      double speed, double changeX, double changeY) {
    super(position, width, height, name, angle, sprite, health, speed);
    this.changeX = changeX;
    this.changeY = changeY;
  }

}