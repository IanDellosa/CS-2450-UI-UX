import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo{
    JButton press, reset;
    JLabel percent;

    ProgressBarDemo() {
        // JFrame
        JFrame jfrm = new JFrame("Progress Bar");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(275,125);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make Progress bar
        JProgressBar jpb = new JProgressBar();

        // Label
        JLabel val = new JLabel("Current Percentage: " + jpb.getValue());

        // Buttons
        press = new JButton("Press Me!");
        press.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpb.setValue(jpb.getValue() + 10);
                val.setText("Current Percentage: " + jpb.getValue());
                if(jpb.getValue() == 100) {
                    press.setEnabled(false);
                    reset.setEnabled(true);
                }

            }
        });

        reset = new JButton("Reset");
        reset.setEnabled(false);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpb.setValue(0);
                val.setText("Current Percentage: " + jpb.getValue());
                press.setEnabled(true);
                reset.setEnabled(false);
            }
        });

        JLabel name = new JLabel("Name: Ian Dellosa, Date: 11/3/23");

        jfrm.add(jpb);
        jfrm.add(press);
        jfrm.add(reset);
        jfrm.add(val);
        jfrm.add(name);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgressBarDemo();
            }
        });
    }
}
