import javax.swing.JFrame;

public class ex10_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 10_03");
        ColorShape cs = new ColorShape();
        
        frame.add(cs);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
