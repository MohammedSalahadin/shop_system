package project.shop.com;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class new_customer extends JPanel {
	private static final Insets insets = new Insets(0, 0, 0, 0);

	public new_customer() {
		// TODO Auto-generated constructor stub
		setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder("<html><h3 style='color:blue'> Add new Customer</h3></html>"));

		
	}
	private static void addComponent(Container container, Component component, int gridx, int gridy,
	      int gridwidth, int gridheight, int anchor, int fill) {
	    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
	        anchor, fill, insets, 0, 0);
	    container.add(component, gbc);
	  }

}
