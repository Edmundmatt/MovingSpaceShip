import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class SpaceShip {

    private int x;
    private int y;
    private int dx;
    private int dy;
    private int w;
    private int h;
    private Image image;

    public SpaceShip(int x, int y){
        this.x = x;
        this.y = y;
        this.dx = 0;
        this.dy = 0;
        loadImage();
    }

    private void loadImage() {

        ImageClass ic = new ImageClass();
        ImageIcon ii = new ImageIcon("src/resources/NicePng_space-ship-png_176093.png");
        image = ic.resize(ii.getImage(), 0.25);

        w = image.getWidth(null);
        h = image.getHeight(null);
    }
    public void move(){
        x += dx;
        y += dy;
    }

    public Image getImage(){
        return this.image;
    }

    private void fire(){

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getWidth(){
        return this.w;
    }

    public int getHeight(){
        return this.h;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }

        if (key == KeyEvent.VK_SPACE) {
            shoot();
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}

