import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonDemo implements ActionListener{
    public JLabel jlab;
    ButtonDemo() {
        //Create a new JFrame container.
        JFrame jfrm = new JFrame("Button Demo");

        //Flow Layout for Layout Manager
        jfrm.getContentPane().setLayout(new FlowLayout());

        //Give the fram an initial size
        jfrm.setSize(300,200);

        //Terminate program when ser closes application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create label prompt
        jlab = new JLabel("Press a button");

        //Add label to content pane
        jfrm.getContentPane().add(jlab);

        //Create button
        JButton jbtn1 = new JButton("Yes");
        JButton jbtn2 = new JButton("No");

        //Add action listener
        jbtn1.addActionListener(this::actionPerformed);
        jbtn2.addActionListener(this::actionPerformed);

        jfrm.getContentPane().add(jbtn1);
        jfrm.getContentPane().add(jbtn2);

        //Display frame
        jfrm.setVisible(true);
    }
    //Handle action event
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Yes")) {
            jlab.setText("Yes was pressed");
        } else {
            jlab.setText("No was pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
