import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxDemo implements ItemListener{
    JCheckBox jcb;
    JLabel jlab;

    CheckBoxDemo() {
        // JFrame
        JFrame jfrm = new JFrame("Check Box Demo");
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        // Jlabel
        jlab = new JLabel("Box is Unchecked");

        // Check Box
        jcb = new JCheckBox("Checked/Unchecked");
        jcb.addItemListener(this);

        //Add to content pane
        jfrm.getContentPane().add(jlab);
        jfrm.getContentPane().add(jcb);

        //Set visible
        jfrm.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (jcb.isSelected()) {
            jlab.setText("Box is Checked");
        } else {
            jlab.setText("Box is Unchecked");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckBoxDemo();
            }
        });
    }
}
