import java.awt.image.BufferedImage;

class Zombie extends Enemy {

  Zombie(Vector position, int width, int height, String name, Angle angle, BufferedImage sprite, double health,
      double speed, Weapon weapon) {
    super(position, width, height, name, angle, sprite, health, speed, weapon);
  }
}