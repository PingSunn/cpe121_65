import javax.swing.*;
import java.awt.*;

public class ControlCircleWithoutEventHandling extends JFrame {
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircleWithoutEventHandling() {
      JPanel panel = new JPanel(); // Use the panel to group buttons
      panel.add(jbtEnlarge);
      panel.add(jbtShrink);
      this.add(canvas, BorderLayout.CENTER); // Add canvas to center
      this.add(panel, BorderLayout.SOUTH); // Add buttons to the frame
    }
}
