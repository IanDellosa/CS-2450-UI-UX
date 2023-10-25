import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;


public class BorderDemo {
    JLabel simple, etched, empty, raisedBevel, loweredBevel;

    BorderDemo() {
        //JFrame
        JFrame jfrm = new JFrame("Border Demo");
        jfrm.setSize(200, 300);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Simple line Border
        Border simpleBorder = BorderFactory.createLineBorder(Color.red);
        simple = new JLabel("This is a simple border");
        simple.setBorder(simpleBorder);

        // Etched Line Border
        Border etchedBorder = BorderFactory.createEtchedBorder();
        etched = new JLabel("This is an etched border");
        etched.setBorder(etchedBorder);

        // Empty Line Border
        Border emptyBorder = BorderFactory.createEmptyBorder();
        empty = new JLabel("This is an empty border");
        empty.setBorder(emptyBorder);

        // RaisedBevel Border
        Border rBevelBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        raisedBevel = new JLabel("This is a Raised Bevel Border");
        raisedBevel.setBorder(rBevelBorder);

        // LoweredBevel Border
        Border lBevelBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        loweredBevel = new JLabel("This is a Lowered Bevel Border");
        loweredBevel.setBorder(lBevelBorder);

        //Add to content pane
        jfrm.add(simple);
        jfrm.add(etched);
        jfrm.add(empty);
        jfrm.add(raisedBevel);
        jfrm.add(loweredBevel);

        //Set visible
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BorderDemo();
            }
        });
    }
}
