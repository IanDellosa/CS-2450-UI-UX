import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollPaneDemo {
    ScrollPaneDemo() {
        // jfrm
        JFrame jfrm = new JFrame("Scroll Pane");
        jfrm.setSize(200, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jpanel = new JPanel();

        ImageIcon myImage = new ImageIcon(getClass().getResource("keroppi.png"));
        JLabel image = new JLabel(myImage);

        JLabel jlab = new JLabel("<html>JScrollPane"
                 + "<br> Using JScrollPane allows us to "
                 + "<br> have more content than visible "
                 + "<br> in one label."
                 + "<br> We are able to have \"hidden\" "
                 + "<br> lines of content. "
                 + "<br> More words as filler "
                 + "<br> If there aren't enough words "
                 + "<br> then the scroll bar will not show."
                 + "<br> Adding more lines to fill space"
                 + "<br> And another line!"
                 + "<br> Created By:"
                 + "<br> Ian Dellosa"
                 + "<br> Date:"
                 + "<br> November 6th, 2023");

        jpanel.add(jlab);

        JScrollPane jsp = new JScrollPane(jpanel);
        jfrm.add(jsp);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScrollPaneDemo();
            }
        });
    }

}
