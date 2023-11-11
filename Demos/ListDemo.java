import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo implements ListSelectionListener{
    JList fruitList;
    String[] fruit = {"apple", "banana", "tomato", "grapes"};
    JLabel purchasedFruit;

    ListDemo() {
        // JFrame
        JFrame jfrm = new JFrame("Basic List");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(350, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create fruitList using fruit array
        fruitList = new JList(fruit);

        // Wrap fruitList in scroll pane
        JScrollPane jscroll = new JScrollPane(fruitList);

        // List Selection Listener
        fruitList.addListSelectionListener(this);

        // Prompt user to select a fruit
        purchasedFruit = new JLabel("Select a fruit.");

        // Add to content pane
        jfrm.add(jscroll);
        jfrm.add(purchasedFruit);

        // Set Visible
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int i = fruitList.getSelectedIndex();

        if (i != -1) {
            purchasedFruit.setText("Selected Fruit: " + fruit[i]);
        }
    }
}
