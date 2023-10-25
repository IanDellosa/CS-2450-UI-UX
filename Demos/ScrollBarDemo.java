import java.awt.Adjustable;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import javax.swing.*;
import java.awt.event.AdjustmentListener;

public class ScrollBarDemo {

    // Horizontal and Vertical Scroll Bar
    JScrollBar jsbHoriz, jsbVert;

    // Labels to get current value of scrollbar, and display info for vert scroll bar
    JLabel currValHoriz, currValVert, infoVertSB;

    ScrollBarDemo() {
        JFrame jfrm = new JFrame("Scroll Bar Demo");
        jfrm.setSize(500, 500);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set labels for scroll bars
        currValHoriz = new JLabel("Current Value for Horizontal Scroll Bar: 0");
        currValVert = new JLabel("Current Value for Vertical Scroll Bar: 0");

        // Initialize hrizontal and vertical scroll bars
        jsbHoriz = new JScrollBar(Adjustable.HORIZONTAL);
        jsbVert = new JScrollBar(Adjustable.VERTICAL, 0, 50, 0, 300);
        jsbVert.setPreferredSize(new Dimension(20, 300));
        jsbHoriz.setPreferredSize(new Dimension(300, 20));

        // Add Adjustment listeners
        jsbVert.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                currValVert.setText("Current Value of the Vertical Scroll Bar: " + e.getValue());
            }
        });

        jsbHoriz.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                currValHoriz.setText("Current Value of the Horizontal Scroll Bar: " + e.getValue());
            }
        });

        // Set info for infoVertSB
        infoVertSB = new JLabel("<html>Scroll Bar Defaults"
                + "<br>Minimum Value: " + jsbVert.getMinimum()
                + "<br>Maximum Value: " + jsbVert.getMaximum()
                + "<br>Visible Amount (extent): " + jsbVert.getVisibleAmount()
                + "<br>Block Increment: " + jsbVert.getBlockIncrement()
                + "<br>Unit Increment: " + jsbVert.getUnitIncrement());

        // Add
        jfrm.add(jsbVert);
        jfrm.add(jsbHoriz);
        jfrm.add(currValVert);
        jfrm.add(currValHoriz);
        jfrm.add(infoVertSB);

        // Visible
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScrollBarDemo();
            }
        });
    }

}
