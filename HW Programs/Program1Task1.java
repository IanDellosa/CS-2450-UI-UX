import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Program1Task1 implements ActionListener{

    JLabel jlab;
    JLabel wholeLabel;
    JLabel markupLabel;
    JButton calc;
    JTextField whole;
    JTextField markup;

    Program1Task1() {
        // JFrame
        JFrame jfrm = new JFrame("Markup Calculator");
        jfrm.setSize(300,200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        // JLabels
        jlab = new JLabel();
        wholeLabel = new JLabel("Enter wholesale cost: ");
        markupLabel = new JLabel("Enter percentage markup: ");

        // JButtons
        calc = new JButton("Calculate");
        calc.addActionListener(this);

        // JTextFields
        whole = new JTextField(15);
        markup = new JTextField(15);
        whole.addActionListener(this);
        markup.addActionListener(this);

        // Add to content pane
        jfrm.add(wholeLabel);
        jfrm.add(whole);
        jfrm.add(markupLabel);
        jfrm.add(markup);
        jfrm.add(calc);
        jfrm.add(jlab);

        // set visible
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double result = 0.0;
        if((!whole.getText().isBlank() || !isNumeric(whole.getText())) && (!markup.getText().isBlank() || isNumeric(markup.getText())) && e.getActionCommand().equals("Calculate")) {
            result = Double.parseDouble(whole.getText()) * (1 + Double.parseDouble(markup.getText())/100);
            jlab.setText("Retail Price: $" + result);
        } else {
            jlab.setText("Error: Please type decimal numbers only.");
        }
    }

    public boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Program1Task1();
            }
        });
    }


}
