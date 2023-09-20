import java.awt.event.*;
import javax.swing.*;

public class HandleEvent extends JFrame{
    public HandleEvent() {
        JButton jbtOK = new JButton("OK"); 
        JButton jbtCancel = new JButton("Cancel");

        JPanel panel = new JPanel(); 

        panel.add(jbtOK); 
        panel.add(jbtCancel);

        add(panel);

        // Register listeners
        OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();
        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listener2);
    }

    
    class OKListenerClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked");
        }
    }
    class CancelListenerClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Cancel button clicked");
        } 
    }
}
