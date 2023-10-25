import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleStopwatch implements ActionListener{
    JLabel jlab;
    double start;
    double end;

    SimpleStopwatch() {
        // Set title
        JFrame jfrm = new JFrame("A Simple Stopwatch");
        // Flow Layout
        jfrm.getContentPane().setLayout(new FlowLayout());
        // Set size
        jfrm.setSize(300, 200);
        // Stop on CLose
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlab = new JLabel("Start the stopwatch:");

        // Create buttons
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        // Add listener
        start.addActionListener(this);
        stop.addActionListener(this);
        // Add buttons to content frame
        jfrm.getContentPane().add(start);
        jfrm.getContentPane().add(stop);

        jfrm.getContentPane().add(jlab);

        //Set visible
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Start")) {
            start = System.currentTimeMillis();
            jlab.setText("Counting...");
        }
        else {
            end = System.currentTimeMillis();
            jlab.setText("Time elapsed: " + (end - start) + " ms");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleStopwatch();
            }
        });
    }
}
