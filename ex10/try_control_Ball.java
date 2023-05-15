import javax.swing.*;
import java.awt.*;

public class try_control_Ball {
  public static void main(String[] args) {
    JFrame frame = new ControlCircleWithoutEventHandling();
    frame.setTitle("ControlCircleWithoutEventHandling");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }
}

class CirclePanel extends JPanel {
  private int radius = 5; // Default circle radius

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
  }
}
