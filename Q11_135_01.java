import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import  javax.swing.*;

public class Q11_135_01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CPE 121 : Quiz 11 GUI");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));

        //Label
        JLabel label = new JLabel("*** Please Login ***");
        label.setForeground(Color.red);
        panel.add(label);

        // input
        JPanel zone2 = new JPanel();
        zone2.setLayout(new GridLayout(2, 2));
        JTextField usr = new JTextField("", 10);
        JPasswordField pwd = new JPasswordField("", 10);
        zone2.add(new JLabel("username"));
        zone2.add(usr);
        zone2.add(new JLabel("password"));
        zone2.add(pwd);
        panel.add(zone2);

        //Button
        JPanel zone3 = new JPanel();
        zone3.setLayout(new FlowLayout());
        zone3.add(new JButton("Log in"));
        zone3.add(new JButton("Cancel"));
        panel.add(zone3);
        //CheckBox Radio
        panel.add(new JCheckBox("Ongkharak"));
        panel.add(new JCheckBox("P"));




        frame.add(panel);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null); // Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Display the frame
    }
}