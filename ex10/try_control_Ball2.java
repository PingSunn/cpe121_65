public class try_control_Ball2 {
    public static void main(String[] args) {
        JFrame frame = new ControlCircle();
        frame.setTitle("ControlCircle");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

class EnlargeListener implements ActionListener { // Inner class
    @Override
    public void actionPerformed(ActionEvent e) {
        canvas.enlarge();
    }
}
