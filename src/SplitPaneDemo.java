import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class SplitPaneDemo {
    SplitPaneDemo() {
        // JFrame
        JFrame jfrm = new JFrame("Split Pane Demo");
        jfrm.setSize(550,200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create new split pane
        JSplitPane jsp = new JSplitPane();

        // Create two panels
        JPanel left = new JPanel();
        JPanel right = new JPanel();

        // Create labels for each panel
        JLabel leftLabel = new JLabel("<html>This label is stored on the " +
                                            "<br>left side of the split pane");
        JButton red = new JButton("red");
        JButton blue = new JButton("blue");
        JButton cyan = new JButton("cyan");
        JLabel rightLabel = new JLabel("This label is stored on the right side of the split pane");

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                right.setBackground(Color.red);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                right.setBackground(Color.blue);
            }
        });
        cyan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                right.setBackground(Color.CYAN);
            }
        });


        //Add labels to panels
        left.add(leftLabel);
        right.add(rightLabel);
        left.add(red);
        left.add(blue);
        left.add(cyan);

        // Set the panels to respective side of the split pane
        jsp.setLeftComponent(left);
        jsp.setRightComponent(right);
        jsp.setDividerLocation(200);

        // add to pane
        jfrm.add(jsp);

        //Set visible
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SplitPaneDemo();
            }
        });
    }

}
