import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;

public class ListModelDemo {

    JList fruit;
    JLabel jlab;
    JButton buyFruit, manageFruit;

    ListModelDemo() {
        // JFrame
        JFrame jfrm = new JFrame("List Model Demo");
        jfrm.setSize(300,300);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a DefaultListModel
        DefaultListModel<String> lm = new DefaultListModel<>();
        // Add list model elements
        lm.addElement("Blueberry");
        lm.addElement("Apple");
        lm.addElement("Orange");
        lm.addElement("Peach");

        // Create JList and pass in lm
        fruit = new JList(lm);

        //Wrap fruit in a scroll pane
        JScrollPane fruitScroll = new JScrollPane(fruit);

        // Display label to user
        jlab = new JLabel("Select fruit");

        // AddListSelectionListener to fruit list
        fruit.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String selected = "";

                List<String> values = fruit.getSelectedValuesList();
                // Check if there is fruit selection
                if(values.size() == 0) {
                    jlab.setText("Please make a selection");
                } else {
                    for(int i = 0; i < values.size(); ++i) {
                        selected += values.get(i) + "<br>";
                    }
                    jlab.setText("<html>You selected: <br>" + selected);
                }

            }
        });

        buyFruit = new JButton("Buy Fruit");
        buyFruit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String purchased = "";

                List<String> values = fruit.getSelectedValuesList();

                if (values.size() == 0) {
                    jlab.setText("No fruit selected for purchase");
                } else {
                    for(int i = 0; i < values.size(); ++i) {
                        purchased += values.get(i) + "<br>";
                    }
                    jlab.setText("<html>You purchased: <br>" + purchased);
                }
            }
        });
        manageFruit = new JButton("Add Fruit");
        manageFruit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> refLM = (DefaultListModel<String>) fruit.getModel();

                if(refLM.getSize() > 4) {
                    for(int i = 6; i > 3; --i) {
                        refLM.remove(i);

                        manageFruit.setText("Add Fruit");
                    }
                } else {
                    refLM.addElement("Banana");
                    refLM.addElement("Strawberry");
                    refLM.addElement("Mango");

                    manageFruit.setText("Remove Extra Fruit");
                }
            }
        });

        jfrm.add(fruitScroll);
        jfrm.add(jlab);
        jfrm.add(buyFruit);
        jfrm.add(manageFruit);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListModelDemo();
            }
        });
    }
}
