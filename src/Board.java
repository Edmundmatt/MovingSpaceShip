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
    public void actionPerformed(ActionEvent e) {

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

