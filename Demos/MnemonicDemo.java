import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MnemonicDemo {
    JTextField emailInput;
    JTextField nameInput;
    JLabel email;
    JLabel name;

    MnemonicDemo() {
        // JFrame
        JFrame jfrm = new JFrame("Mnemonic Demo");
        jfrm.setSize(300,200);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        email = new JLabel("Email: ");
        name = new JLabel("Name: ");

        // Text Fields
        emailInput = new JTextField(15);
        nameInput = new JTextField(15);

        // Create Button
        JButton jbtn = new JButton("Button");

        // Set mnemonics for label and button
        email.setDisplayedMnemonic('e');
        name.setDisplayedMnemonic('n');
        jbtn.setMnemonic('b');

        // Set labels for email and name to respective textfields
        email.setLabelFor(emailInput);
        name.setLabelFor(nameInput);

        // Add to content pane
        jfrm.add((email));
        jfrm.add(emailInput);
        jfrm.add(name);
        jfrm.add(nameInput);
        jfrm.add(jbtn);

        // Set Visible
        jfrm.setVisible(true);

    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MnemonicDemo();
            }
        });
    }

}
