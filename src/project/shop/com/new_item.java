package project.shop.com;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class new_item extends JPanel{
	private static final Insets insets = new Insets(0, 0, 0, 0);
	public JButton cancel = new JButton("Cancel");

	public new_item() {
		
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createTitledBorder("<html><h3 style='color:blue'> Add New Item</h3></html>"));
		

		JLabel name = new JLabel("Item Name: ");
		JTextField name_input = new JTextField("", 20);
			  addComponent(this, name, 0, 0, 1, 1, GridBagConstraints.EAST, 5);
		addComponent(this, name_input, 1, 0, 3, 1, GridBagConstraints.WEST, 5);
		//System.out.println(GridBagConstraints.CENTER);

		JLabel quantity = new JLabel("Quantity: ");
		JTextField quantity_input =  new JTextField("", 20);
		  addComponent(this, quantity, 0, 1, 1, 1, GridBagConstraints.EAST, 5);
	addComponent(this, quantity_input, 1, 1, 3, 1, GridBagConstraints.WEST, 5);
		
		JLabel mass_price = new JLabel("Mass Price: ");
		JTextField mass_price_input =  new JTextField("", 20);
	
			  addComponent(this, mass_price, 0, 2, 1, 1, GridBagConstraints.EAST, 5);
		addComponent(this, mass_price_input, 1, 2, 1, 1, GridBagConstraints.WEST, 5);

		
		JLabel description = new JLabel("Description: ");
		JTextField description_input =  new JTextField("", 20);
			  addComponent(this, description, 0, 4, 1, 1, GridBagConstraints.EAST, 5);
		addComponent(this, description_input, 1, 4, 1, 1, GridBagConstraints.WEST, 5);

		JButton save = new JButton("Save");
		
	  addComponent(this, cancel, 1, 5, 1, 1, GridBagConstraints.EAST, 5);
		addComponent(this, save, 2, 5, 1, 1, GridBagConstraints.WEST, 5);
		


		
	}
	  private static void addComponent(Container container, Component component, int gridx, int gridy,
		      int gridwidth, int gridheight, int anchor, int fill) {
		    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
		        anchor, fill, insets, 0, 0);
		    container.add(component, gbc);
		  }

}
