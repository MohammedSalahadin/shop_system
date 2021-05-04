package project.shop.com;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class items extends JPanel{
	private static final Insets insets = new Insets(0, 0, 0, 0);
	public JButton new_itm = new JButton("+ Add New Item");
	
	public items() {
		this.setBorder(BorderFactory.createTitledBorder("<html><h3 style='color:blue'> Items List </h3></html>"));
		

		
		JPanel table_header = new JPanel();
		table_header.setLayout(new FlowLayout());
		//Table headers
		JLabel name = new JLabel("Name");
		JLabel description = new JLabel("Description");
		JLabel quantity = new JLabel("Quantity");
		JLabel action = new JLabel("Action");
		JLabel picture = new JLabel("Picture");
		//Adding headers to table_header 
		table_header.add(name);
		table_header.add(description);
		table_header.add(quantity);
		table_header.add(action);
		table_header.add(picture);
				
		JPanel itemPanel = new item("Shoes", "Good quality shoes", 5, 2,"img/1.jpg");
		JPanel itemPanel2 = new item("Helmet", "Good quality shoes", 5, 2,"img/1.jpg");
		JPanel itemPanel3 = new item("Steering", "Best ever", 3, 1,"img/2.jpg");
		JPanel itemPanel4 = new item("Tyre", "Contenetal Best ever", 3, 1,"img/2.jpg");
		
		this.setLayout(new GridBagLayout());

		
//		this.add(Box.createHorizontalStrut(3));
//		this.add(table_header); //Adding table header panel to items_pan
//		this.add(itemPanel);  //Adding 
//		this.add(Box.createHorizontalStrut(3));
//		this.add(itemPanel2);
//		this.add(Box.createHorizontalStrut(3));
//		this.add(itemPanel3);
//		this.add(Box.createHorizontalStrut(3));
//		this.add(itemPanel4);
		

		addComponent(this, table_header, 0, 1, 1, 1, GridBagConstraints.EAST, 5);
		addComponent(this, new_itm, 0, 0, 4, 1, GridBagConstraints.EAST, 5);
		addComponent(this, new_itm, 0, 2, 4, 1, GridBagConstraints.EAST, 5);
		
	}
	  private static void addComponent(Container container, Component component, int gridx, int gridy,
		      int gridwidth, int gridheight, int anchor, int fill) {
		    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
		        anchor, fill, insets, 0, 0);
		    container.add(component, gbc);
		  }
}
