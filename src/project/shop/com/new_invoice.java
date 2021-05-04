package project.shop.com;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class new_invoice extends JPanel {
	private static final Insets insets = new Insets(0, 0, 0, 0);
	
	public new_invoice() {
		setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder("<html><h3 style='color:blue'> New Invoice</h3></html>"));


	}
	
	  private static void addComponent(Container container, Component component, int gridx, int gridy,
		      int gridwidth, int gridheight, int anchor, int fill) {
		    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
		        anchor, fill, insets, 0, 0);
		    container.add(component, gbc);
		  }



}
