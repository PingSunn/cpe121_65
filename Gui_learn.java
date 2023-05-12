import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class Gui_learn {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame"); // Create a frame
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());

        JLabel name = new JLabel("Name");

        frame.setSize(300, 270); // Set the frame size
        // ImageIcon icon = new ImageIcon("");

        JButton jbt = new JButton("Button");
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        JButton jbtExit = new JButton("Exit");

        JTextField inputText = new JTextField("", 5);
        // inputText.setBackground(Color.black);
        // inputText.setForeground(Color.white);

        // panel.add(name);
        // panel.add(inputText);
        // panel.add(jbtOK);
        // panel.add(jbtCancel);
        // panel.add(jbtExit);
        panel2.add(new JButton("Button 1"), BorderLayout.WEST);
        panel2.add(new JButton("Button 2"), BorderLayout.CENTER);
        panel2.add(new JButton("Button 3"), BorderLayout.EAST);
        panel1.add(new JButton("Button 4"), BorderLayout.WEST);
        panel1.add(new JButton("Button 5"), BorderLayout.CENTER);
        panel1.add(new JButton("Button 6"), BorderLayout.EAST);




        frame.add(panel1);
        frame.add(panel2);
        frame.setLocationRelativeTo(null); // Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Display the frame
    }
}