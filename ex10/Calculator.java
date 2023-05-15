import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    private JLabel label1 = new JLabel("Number 1");
    private JTextField text1 = new JTextField(5);

    private JLabel label2 = new JLabel("Number 2");
    private JTextField text2 = new JTextField(5);

    private JLabel label3 = new JLabel("Result");
    private JTextField text3 = new JTextField(5);

    private JButton addBtn = new JButton("Add");
    private JButton subBtn = new JButton("Subtract");
    private JButton mulBtn = new JButton("Multiply");
    private JButton divBtn = new JButton("Divide");

    public Calculator() {
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        panel1.add(label1);
        panel1.add(text1);
        panel1.add(label2);
        panel1.add(text2);
        panel1.add(label3);
        panel1.add(text3);
        panel2.add(addBtn);
        panel2.add(subBtn);
        panel2.add(mulBtn);
        panel2.add(divBtn);
        text3.setEditable(false);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double result = num1 + num2;
                text3.setText(Double.toString(result));
            }
        });
        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double result = num1 - num2;
                text3.setText(Double.toString(result));
            }
        });
        mulBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double result = num1 * num2;
                text3.setText(Double.toString(result));
            }
        });
        divBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double result = num1 / num2;
                text3.setText(Double.toString(result));
            }
        });

        panel.add(panel1);
        panel.add(panel2);
        add(panel);
    }
}
