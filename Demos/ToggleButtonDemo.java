import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ToggleButtonDemo implements ItemListener{

    JLabel jlab;
    JToggleButton jtb;

    ToggleButtonDemo() {
        // new JFrame
        JFrame jfrm = new JFrame("Toggle Button Demo");
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        // jlabel
        jlab = new JLabel("Button is 'off'.");

        // Toggle Button
        jtb = new JToggleButton("On/Off");
        jtb.addItemListener(this);

        // Add to content pane
        jfrm.getContentPane().add(jlab);
        jfrm.getContentPane().add(jtb);

        // Set Visible
        jfrm.setVisible(true);

    }

    public void itemStateChanged(ItemEvent ie) {
        if(jtb.isSelected()) {
            jlab.setText("Button is 'On'");
        } else {
            jlab.setText("Button is 'Off'");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToggleButtonDemo();
            }
        });
    }

}
