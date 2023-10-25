import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AlignLabelDemo {

    AlignLabelDemo() {
        //JFrame
        JFrame jfrm = new JFrame("Align Label Demo");
        jfrm.setSize(500,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridLayout(3, 3, 4, 4));

        // JLabel
        JLabel jlabs[] = new JLabel[9];

        // Set label text
        // Top Row
        jlabs[0] = new JLabel("Top Left", SwingConstants.LEFT);
        jlabs[0].setVerticalAlignment(SwingConstants.TOP);

        jlabs[1] = new JLabel("Top Mid", SwingConstants.CENTER);
        jlabs[1].setVerticalAlignment(SwingConstants.TOP);

        jlabs[2] = new JLabel("Top Right", SwingConstants.RIGHT);
        jlabs[2].setVerticalAlignment(SwingConstants.TOP);

        //Mid Row
        jlabs[3] = new JLabel("Mid Left", SwingConstants.LEFT);
        jlabs[3].setVerticalAlignment(SwingConstants.CENTER);

        jlabs[4] = new JLabel("Mid", SwingConstants.CENTER);
        jlabs[4].setVerticalAlignment(SwingConstants.CENTER);

        jlabs[5] = new JLabel("Mid Right", SwingConstants.RIGHT);
        jlabs[5].setVerticalAlignment(SwingConstants.CENTER);

        // Bottom Row
        jlabs[6] = new JLabel("Bottom Left", SwingConstants.LEFT);
        jlabs[6].setVerticalAlignment(SwingConstants.BOTTOM);

        jlabs[7] = new JLabel("Bottom Mid", SwingConstants.CENTER);
        jlabs[7].setVerticalAlignment(SwingConstants.BOTTOM);

        jlabs[8] = new JLabel("Bottom Right", SwingConstants.RIGHT);
        jlabs[8].setVerticalAlignment(SwingConstants.BOTTOM);

        //Border
        Border etched = BorderFactory.createEtchedBorder();
        for(int i = 0; i < 9; ++i) {
            jlabs[i].setBorder(etched);
        }

        // add to jfrm
        for(int i = 0; i < 9; ++i) {
            jfrm.add(jlabs[i]);
        }

        // Set Visibility
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlignLabelDemo();
            }
        });
    }

}
