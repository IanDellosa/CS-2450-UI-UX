import java.awt.GridLayout;
import javax.swing.*;

public class IconLabelDemo {
    IconLabelDemo() {
        //JFrame
        JFrame jfrm = new JFrame("Image in Labels");
        jfrm.setSize(500,500);
        jfrm.setLayout(new GridLayout(3, 3));
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1st Image
        ImageIcon myIcon = new ImageIcon(getClass().getResource("Puppycat.png"));
        JLabel imageOnly = new JLabel(myIcon, SwingConstants.LEFT);

        // 2nd Image
        JLabel imageAndText = new JLabel("beep boop", myIcon, SwingConstants.RIGHT);
        imageAndText.setVerticalAlignment(SwingConstants.TOP);
        imageAndText.setHorizontalTextPosition(SwingConstants.RIGHT);

        // 3rd Image
        JLabel imageTextLeft = new JLabel("beep boop", myIcon, SwingConstants.LEFT);
        imageTextLeft.setVerticalAlignment(SwingConstants.TOP);
        imageTextLeft.setHorizontalTextPosition(SwingConstants.LEFT);

        // 4th Image
        JLabel imageTextTop = new JLabel("beep boop", myIcon, SwingConstants.RIGHT);
        imageTextTop.setVerticalAlignment(SwingConstants.CENTER);
        imageTextTop.setHorizontalTextPosition(SwingConstants.CENTER);
        imageTextTop.setVerticalTextPosition(SwingConstants.TOP);

        // 5th Image
        JButton imageButton = new JButton("beep boop", myIcon);

        // add to content pane
        jfrm.add(imageOnly);
        jfrm.add(imageAndText);
        jfrm.add(imageTextLeft);
        jfrm.add(imageTextTop);
        jfrm.add(imageButton);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IconLabelDemo();
            }
        });
    }
}
