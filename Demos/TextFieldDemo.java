import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldDemo implements ActionListener {
    JLabel jlab;
    JTextField jtf;

    TextFieldDemo() {
        // Create jfrm
        JFrame jfrm = new JFrame("Text Field Demo");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label for text field
        jlab = new JLabel("User Input: ");
        jfrm.getContentPane().add(jlab);

        // Create a text field
        jtf = new JTextField(15);
        // add actionListener
        jtf.addActionListener(this);
        // add to content pane
        jfrm.getContentPane().add(jtf);

        jfrm.setVisible(true);
    }
    //event handler
    public void actionPerformed(ActionEvent ae) {
        //get current text and set to label
        jlab.setText("Current contents of text field: " + jtf.getText());
    }
    // run on event dispatching thread

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextFieldDemo();
            }
        });
    }
}
