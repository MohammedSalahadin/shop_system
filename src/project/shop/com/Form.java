package project.shop.com;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import com.sun.jdi.connect.spi.Connection;

public class Form extends JFrame {
	public Form() {
		//Frame Specifications
		setTitle("Login to Shaheen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 300);
		

		JPanel panel = new JPanel();  
        //panel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Login");
        JLabel info = new JLabel();
        JTextField userName = new JTextField("", 20);
        JTextField password = new JTextField("", 20);
        JButton button = new JButton();  
        button.setText("Login");  
        panel.add(label); 
        panel.add(userName);
        panel.add(password);
        panel.add(button); 
        panel.add(info);
        add(panel);
        
        button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.println("button is clicked");
				String userInput = userName.getText();
				String passInput = password.getText();
				
				//System.out.println(userInput +" "+passInput);
				int result = login(userInput, passInput);
				//int resultInt = Integer.parseInt(result);
				
				//info.setText("Output is:"+ result);
				System.out.println(result);
//				if (result == 1) {
//					info.setForeground(Color.green);
//					info.setText("Succesfully Loged in to system");
//					Interface in = new Interface();
//					dispose();
//
//				}
//				else {
//					info.setForeground(Color.red);
//					info.setText("Wrong User Name or password");
//				}
			}
		});
        setVisible(true);
        
		}

    public static void main(String s[]) {  
    	JFrame loginForm = new Form();
    	
    }  
    
	private int login(String user, String pass) {
		String query = "SELECT login('"+user+"','"+pass+"') AS 'result';";
		java.sql.Connection conn = new DBConnection().getConnection();
		Statement stmt = null;
		ResultSet result = null;
		int login = 0;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeQuery(query);
			if(result.next()) {
				if (result.getInt("result") == 1) {
					login = 1;
				}
				else {
					login = 0;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} finally {
			try {
				result.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
		
		
		
		
		return login ;
	}
	
	
}
