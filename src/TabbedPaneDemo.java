import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TabbedPaneDemo {
    TabbedPaneDemo() {
        //JFrame
        JFrame jfrm = new JFrame("Tabbed Pane Demo");
        jfrm.setSize(400,200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tabbed Pane
        JTabbedPane jtp = new JTabbedPane();
        // Create three panels
        JPanel first = new JPanel();
        JPanel second = new JPanel();
        JPanel third = new JPanel();

        // Create label for first tab
        JLabel jlab1 = new JLabel("<html>Top Level Containers: "
                + "<br>JFrame"
                + "<br>JApplet"
                + "<br>JDialog"
                + "<br>JWindow</html>");

        // Second tab different buttons and BoundedRangedModelItems
        JCheckBox jcb = new JCheckBox("Slider Enabled");
        JSlider jslide = new JSlider();
        jslide.setEnabled(false);
        JButton jbtn = new JButton("Hover Over Me");
        jbtn.setToolTipText("This is a tooltip!");
        jcb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(jcb.isSelected()) {
                    jslide.setEnabled(true);
                }
                else jslide.setEnabled(false);
            }
        });

        // Third tab list of other containers
        JLabel jlab3 = new JLabel("<html>Other Containers: "
                + "<br>JPanel"
                + "<br>JScrollPane"
                + "<br>JTabbedPane</html>");

        // Add components
        first.add(jlab1);
        second.add(jcb);
        second.add(jslide);
        second.add(jbtn);
        third.add(jlab3);

        // Add JPanels to JTabbedPane
        jtp.addTab("First Tab", null, first, "Top-Level Containers");
        jtp.addTab("Second Tab", second);
        jtp.addTab("Third Tab", third);

        // Add to content pane
        jfrm.add(jtp);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TabbedPaneDemo();
            }
        });
    }
}
