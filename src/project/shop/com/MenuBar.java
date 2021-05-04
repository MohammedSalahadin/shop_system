package project.shop.com;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class MenuBar extends JMenuBar {
	
	public MenuBar() {
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu about = new JMenu("About");
		JButton logout = new JButton("Logout");
		
		JMenuItem open = new JMenuItem("Open");
		
		open.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setMultiSelectionEnabled(true);
				
				int result = fileChooser.showOpenDialog(null);
				if (result == fileChooser.APPROVE_OPTION) {
					File[] files = fileChooser.getSelectedFiles();
					
					for(File file: files) {
						System.out.println(file.getPath());
					}
					
					
					
				}
				
			}
		});
		
		JMenuItem close = new JMenuItem("Close");
		
		add(file);
		file.add(open);
		file.add(close);
		
		add(edit);
		add(about);
		
		
	}
	
}
