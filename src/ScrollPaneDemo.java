import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollPaneDemo {
    ScrollPaneDemo() {
        // jfrm
        JFrame jfrm = new JFrame("Scroll Pane");
        jfrm.setSize(250, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("<html>JScrollPane"
                 + "<br> Using JScrollPane allows us to "
                 + "<br> have more content than visible "
                 + "<br> in one label."
                 + "<br> We are able to have \"hidden\" "
                 + "<br> lines of content. "
                 + "<br> More words as filler "
                 + "<br> If there aren't enough words "
                 + "<br> then the scroll bar will not show.");

        JScrollPane jsp = new JScrollPane(jlab);

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
