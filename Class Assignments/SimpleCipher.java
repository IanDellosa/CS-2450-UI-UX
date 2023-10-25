import java.awt.*;
import java.awt.event.*;
import java.util.jar.JarEntry;
import javax.swing.*;

public class SimpleCipher implements ActionListener{
    JLabel jlab1, jlab2;
    JTextField plain;
    JTextField cipher;
    StringBuilder newString = new StringBuilder();

    SimpleCipher() {
        // Create frame
        JFrame jfrm = new JFrame("A Simple Cipher");
        // Flow layout
        jfrm.getContentPane().setLayout(new FlowLayout());
        // Set Size
        jfrm.setSize(300, 200);
        // Stop on Close
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Plain text
        jlab1 = new JLabel("Plain Text: ");
        jfrm.getContentPane().add(jlab1);
        plain = new JTextField(15);
        plain.addActionListener(this);
        jfrm.getContentPane().add(plain);

        //Cipher Text
        jlab2 = new JLabel("Cipher Text: ");
        jfrm.getContentPane().add(jlab2);
        cipher = new JTextField(15);
        cipher.addActionListener(this);
        jfrm.getContentPane().add(cipher);

        // Buttons
        JButton encode = new JButton("Encode");
        JButton decode = new JButton("Decode");
        JButton reset = new JButton("Reset");

        encode.addActionListener(this);
        decode.addActionListener(this);
        reset.addActionListener(this);

        jfrm.getContentPane().add(encode);
        jfrm.getContentPane().add(decode);
        jfrm.getContentPane().add(reset);

        jfrm.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Encode")) {
            newString.setLength(0);
            for(int i = 0; i < plain.getText().length(); ++i) {
                newString.append((char)(plain.getText().charAt(i) + 1));
            }
            cipher.setText("" + newString);
        }
        else if (e.getActionCommand().equals("Decode")) {
            newString.setLength(0);
            for(int i = 0; i < cipher.getText().length(); ++i) {
                newString.append((char)(cipher.getText().charAt(i) - 1));
            }
            plain.setText("" + newString);
        }
        else {
            newString.setLength(0);
            plain.setText("");
            cipher.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleCipher();
            }
        });

    }
}
