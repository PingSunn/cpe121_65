import javax.swing.JFrame;

public class ex10_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 10_02");
        MoveCircle circle = new MoveCircle();
        
        frame.add(circle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
