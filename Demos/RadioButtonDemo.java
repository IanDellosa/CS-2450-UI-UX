import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class RadioButtonDemo implements ActionListener {
    JLabel userSelected = new JLabel("");
    JRadioButton jrb1;
    JRadioButton jrb2;
    JRadioButton jrb3;

    RadioButtonDemo() {
        //JFrame
        JFrame jfrm = new JFrame("Radio Button Demo");
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        // Radio Buttons
        jrb1 = new JRadioButton("Option 1");
        jrb2 = new JRadioButton("Option 2");
        jrb3 = new JRadioButton("Option 3");

        // Add buttons to a ButtonGroup for mutual exclusive
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);

        // Add Action Listeners
        jrb1.addActionListener(this);
        jrb2.addActionListener(this);
        jrb3.addActionListener(this);

        // Add to content pane
        jfrm.add(userSelected);
        jfrm.add(jrb1);
        jfrm.add(jrb2);
        jfrm.add(jrb3);
        
        // Set Visible
        jfrm.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String userOption = "";
        if(jrb1.isSelected()) {
            userOption = "First Option";
        } else if (jrb2.isSelected()) {
            userOption = "Second Option";
        } else {
            userOption = "Third Option";
        }

        userSelected.setText("You selected the " + userOption);

    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RadioButtonDemo();
            }
        });
    }
}
