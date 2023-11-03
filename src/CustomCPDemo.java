import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CustomCPDemo {
    CustomCPDemo() {
        JFrame jfrm = new JFrame("CustomCPDemo");
        jfrm.setSize(300, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create myContentPanel
        myContentPanel myCP = new myContentPanel();

        // setContentPane of jfrm to myCP
        jfrm.setContentPane(myCP);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomCPDemo();
            }
        });
    }
}

class myContentPanel extends JPanel {
    myContentPanel() {
        // set opague
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.green, 5));

        // Label to prompt user
        JLabel jLabel = new JLabel("Pick a border color: ");
        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.red, 5));
            }
        });

        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.green, 5));
            }
        });

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.blue, 5));
            }
        });

        // add to JPanel
        add(jLabel);
        add(red);
        add(green);
        add(blue);
    }
}