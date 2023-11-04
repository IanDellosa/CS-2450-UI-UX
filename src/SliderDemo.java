import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo {
    SliderDemo() {
        // make frame
        JFrame jfrm = new JFrame("Slider Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create Jslider
        JSlider hor = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
        JSlider vert = new JSlider(JSlider.VERTICAL, 0, 100, 10);
        hor.setInverted(true);
        hor.setMajorTickSpacing(10);
        vert.setMajorTickSpacing(20);
        vert.setMinorTickSpacing(10);
        hor.setPaintTicks(true);
        hor.setPaintLabels(true);
        vert.setPaintTicks(true);
        vert.setPaintLabels(true);


        // Slider value labels
        JLabel horVal = new JLabel("Current horizontal value: " + hor.getValue());
        JLabel vertVal = new JLabel("Current vertical value: " + vert.getValue());

        // Add change listener and use anonymous inner class to handle event
        hor.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(hor.getValueIsAdjusting()) {
                    horVal.setText("Current horizontal value: " + hor.getValue());
                }
            }
        });

        vert.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(vert.getValueIsAdjusting()) {
                    vertVal.setText("Current vertical value: " + vert.getValue());
                }
            }
        });

        JLabel name = new JLabel("Name: Ian Dellosa, Date: 11/3/23");

        // Add to content pane
        jfrm.add(hor);
        jfrm.add(vert);
        jfrm.add(horVal);
        jfrm.add(vertVal);
        jfrm.add(name);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SliderDemo();
            }
        });
    }

}
