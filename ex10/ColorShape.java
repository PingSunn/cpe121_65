import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorShape extends JPanel{
    private JRadioButton red = new JRadioButton("red");
    private JRadioButton yellow = new JRadioButton("Yellow");
    private JRadioButton white = new JRadioButton("White");
    private JRadioButton gray = new JRadioButton("Gray");
    private JRadioButton green = new JRadioButton("Green");

    private JRadioButton rectangle = new JRadioButton("Rectangle");
    private JRadioButton oval = new JRadioButton("Oval");

    public ColorShape() {
        JPanel panel = new JPanel(new BorderLayout());

        JPanel color = new JPanel();
        color.add(red);
        color.add(yellow);
        color.add(white);
        color.add(gray);
        color.add(green);
        panel.add(color, BorderLayout.NORTH);

        JPanel draw = new JPanel();
        panel.add(draw, BorderLayout.CENTER);

        JPanel shape = new JPanel();
        shape.add(rectangle);
        shape.add(oval);
        panel.add(shape, BorderLayout.SOUTH);

        add(panel);

        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                draw.setBackground(Color.red);
            }
        });
        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                draw.setBackground(Color.yellow);
            }
        });
        white.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                draw.setBackground(Color.white);
            }
        });
        gray.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                draw.setBackground(Color.gray);
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                draw.setBackground(Color.green);
            }
        });

        FigurePanel figure = new FigurePanel();
        draw.add(figure);

        rectangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                draw.removeAll();
                figure.paintRectangle();
                draw.add(figure);
                draw.repaint();
            }
        });

        oval.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                draw.removeAll();
                figure.paintOval();
                draw.add(figure);
                draw.repaint();
            }
        });
    }
}

class FigurePanel extends JPanel {

    private boolean isRectangle;

    public FigurePanel() {
        //do nothing
    }

    public void paintRectangle() {
        isRectangle = true;
        repaint();
    }

    public void paintOval() {
        isRectangle = false;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth() - 40;
        int height = getHeight() - 40;
        int x = (getWidth() - width) / 2;
        int y = (getHeight() - height) / 2;

        if (isRectangle) {
            g.drawRect(x, y, width, height);
            setOpaque(false);
        } else {
            g.drawOval(x, y, width, height);
            setOpaque(false);
        }

    }

    public Dimension getPreferredSize() {
        return new Dimension(250,100);
    }

}