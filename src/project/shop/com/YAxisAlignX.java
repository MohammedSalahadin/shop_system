package project.shop.com;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class YAxisAlignX {
  private static Container makeIt(String title, float alignment) {
    String labels[] = { "--", "----", "--------", "------------" };

    JPanel container = new JPanel();
    container.setBorder(BorderFactory.createTitledBorder(title));
    BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
    container.setLayout(layout);

    for (int i = 0, n = labels.length; i < n; i++) {
      JButton button = new JButton(labels[i]);
      button.setAlignmentX(alignment);
      container.add(button);
    }
    return container;
  }

  public static void main(String args[]) {
    JFrame frame = new JFrame("Alignment Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container panel1 = makeIt("Left", Component.LEFT_ALIGNMENT);
    Container panel2 = makeIt("Center", Component.CENTER_ALIGNMENT);
    Container panel3 = makeIt("Right", Component.RIGHT_ALIGNMENT);

    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(panel1);
    contentPane.add(panel2);
    contentPane.add(panel3);

    frame.pack();
    frame.setVisible(true);
  }
}