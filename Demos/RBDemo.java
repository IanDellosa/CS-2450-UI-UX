import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class RBDemo implements ActionListener{
    JLabel jlabOptions;
    JLabel jlabWhat;
    JCheckBox jcbOptions;
    JRadioButton jrbSpeed;
    JRadioButton jrbSize;
    JRadioButton jrbDebug;

    RBDemo() {
        //JFrame
        JFrame jfrm = new JFrame("Radio Buttons Enabled by Checkbox");
        jfrm.setSize(300, 300);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create labels
        jlabOptions = new JLabel("Choose Option: ");
        jlabWhat = new JLabel("Option Selected: Speed");

        //Create checkbox
        jcbOptions = new JCheckBox("Enable Options");

        //Create radio buttons
        jrbSpeed = new JRadioButton("Speed", true);
        jrbSize = new JRadioButton("Size");
        jrbDebug = new JRadioButton("Debug");

        //Add radio buttons to group
        ButtonGroup rbOptions = new ButtonGroup();
        rbOptions.add(jrbSpeed);
        rbOptions.add(jrbSize);
        rbOptions.add(jrbDebug);

        //Disable Radio button options
        jrbSpeed.setEnabled(false);
        jrbSize.setEnabled(false);
        jrbDebug.setEnabled(false);
        jlabWhat.setEnabled(false);

        //item listenr for jcbOptions
        jcbOptions.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(jcbOptions.isSelected()) {
                    jrbSpeed.setEnabled(true);
                    jrbSize.setEnabled(true);
                    jrbDebug.setEnabled(true);
                    jlabWhat.setEnabled(true);
                } else {
                    jrbSpeed.setEnabled(false);
                    jrbSize.setEnabled(false);
                    jrbDebug.setEnabled(false);
                    jlabWhat.setEnabled(false);
                }
            }
        });

        // Action listener for radio buttons
        jrbSpeed.addActionListener(this);
        jrbSize.addActionListener(this);
        jrbDebug.addActionListener(this);

        // Add components to content pane
        jfrm.add(jlabOptions);
        jfrm.add(jcbOptions);
        jfrm.add(jrbSpeed);
        jfrm.add(jrbSize);
        jfrm.add(jrbDebug);
        jfrm.add(jlabWhat);

        //Set Frame visible
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jrbSpeed.isSelected()) {
            jlabWhat.setText("Option Selected: Speed");
        } else if (jrbSize.isSelected()) {
            jlabWhat.setText("Option Selected: Size");
        } else {
            jlabWhat.setText("Option Selected: Debug");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RBDemo();
            }
        });
    }

}
