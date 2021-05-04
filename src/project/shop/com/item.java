package project.shop.com;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class item extends JPanel{
	public item(String itm_name, String itm_description, int itm_available, int itm_sold, String itm_path) {
		
		setLayout(new GridLayout(1,5));
		setBackground(Color.green);
		
		//Table headers
		JLabel name = new JLabel(itm_name);
		JLabel description = new JLabel(itm_description);
		
		//Availability Panel
		JPanel av = new JPanel();
		av.setLayout(new GridLayout(2,1));
		JLabel available = new JLabel("Available:"+itm_available);
		JLabel sold = new JLabel("Sold:"+itm_sold);
		av.add(available);
		av.add(sold);
		
		//Actions Panel
		JPanel actions = new JPanel();
		actions.setLayout(new GridLayout(2,1));
		JButton remove = new JButton("Remove");
		JButton edit = new JButton("Edit");
		actions.add(remove);
		actions.add(edit);
		
		JLabel picture = new JLabel("Picture");
		//Adding headers to table_header 
		add(name);
		add(description);
		add(av);
		add(actions);
		add(picture);
		
	}

}
