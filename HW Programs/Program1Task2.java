import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Program1Task2 implements ActionListener{
    JLabel jlab, hours, priceLabel;
    JCheckBox oc, lj, rf, tf, i, mr, tr, nr;
    JTextField hoursInput;

    JButton calc;

    Program1Task2() {
        // JFrame
        JFrame jfrm = new JFrame("Joe's Automotive Services");
        jfrm.setSize(275,450);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel
        jlab = new JLabel("Please Check the Services Required");
        hours = new JLabel("If Checked, Please Enter Amount of Hours:");
        priceLabel = new JLabel("");

        // JCheckBoxes
        oc = new JCheckBox("Oil Change - $36.00");
        lj = new JCheckBox("Lube Job - $18.00");
        rf = new JCheckBox("Radiator Flush - $30.00");
        tf = new JCheckBox("Transmission Flush - $80.00");
        i = new JCheckBox("Inspection - $15.00");
        mr = new JCheckBox("Muffler Replacement - $100.00");
        tr = new JCheckBox("Tire Rotation - $20.00");
        nr = new JCheckBox("Non-Routine Service - $20.00/hr");

        // JTextField
        hoursInput = new JTextField(15);
        hoursInput.addActionListener(this);

        // JButton
        calc = new JButton("Calculate Cost");
        calc.addActionListener(this);

        // Add to Content Pane
        jfrm.add(jlab);
        jfrm.add(oc);
        jfrm.add(lj);
        jfrm.add(rf);
        jfrm.add(tf);
        jfrm.add(i);
        jfrm.add(mr);
        jfrm.add(tr);
        jfrm.add(nr);
        jfrm.add(hours);
        jfrm.add(hoursInput);
        jfrm.add(calc);
        jfrm.add(priceLabel);

        // Visible
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double price = 0.0;
        if(oc.isSelected()) {
            price += 36.0;
        }
        if(lj.isSelected()) {
            price += 18.0;
        }
        if(rf.isSelected()) {
            price += 30.0;
        }
        if(tf.isSelected()) {
            price += 80.0;
        }
        if(i.isSelected()) {
            price += 15.0;
        }
        if(mr.isSelected()) {
            price += 100.0;
        }
        if(tr.isSelected()) {
            price += 20.0;
        }
        if(nr.isSelected() && !hoursInput.getText().isEmpty()) {
            price = price + (Integer.parseInt(hoursInput.getText()) * 20.0);
        } else if (nr.isSelected() && hoursInput.getText().isEmpty()){
            priceLabel.setText("Error: Please enter amount of hours.");
        }
        if(e.getActionCommand().equals("Calculate Cost")) {
            priceLabel.setText("Price: $" + price);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Program1Task2();
            }
        });
    }
}
