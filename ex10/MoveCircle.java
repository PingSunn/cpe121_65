import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JPanel {
    private int radius = 5;
    private int x = 0;
    private int y = 0;

    public MoveCircle() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            int posX = 0;
            int posY = 0;

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    posY -= 10;
                    setLocation(posX, posY);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    posY += 10;
                    setLocation(posX, posY);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    posX -= 10;
                    setLocation(posX, posY);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    posX += 10;
                    setLocation(posX, posY);
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 2 * radius, 2 * radius);
    }
}
