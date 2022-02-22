import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {

    private SpaceShip spaceShip;
    private Timer timer;

    public Board(){
        initBoard();
    }

    private void initBoard(){
        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);

        spaceShip = new SpaceShip(50, 50);

        timer = new Timer(0, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(spaceShip.getImage(), spaceShip.getX(),
                spaceShip.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        step();
    }

    private void step(){
        spaceShip.move();
        repaint(spaceShip.getX()-1, spaceShip.getY()-5,
                spaceShip.getWidth()+10, spaceShip.getHeight()+10);
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            spaceShip.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e){
            spaceShip.keyReleased(e);
        }
    }
}

