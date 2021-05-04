package project.shop.com;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;


public class Interface extends JFrame{
	public Interface() {
		//Get the screen size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double widthD = screenSize.getWidth()/2;
		double heightD = screenSize.getHeight()/2;
        int width = (int) widthD;
        int height = (int) heightD;	
        
        setJMenuBar(new MenuBar());
        
        /* Layouts: Box, Border, Grid, flow*/
        //setLayout(new GridLayout(10,1));
        //this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());
		
		JLabel footer = new JLabel("2021");
		JPanel panel = new JPanel(); //Toolbar Panel

		JButton itm_list = new JButton("Items List");
		JButton new_inv = new JButton("Invoice");
		JButton report = new JButton("Report");
		JButton customers = new JButton("Customers");
		JButton logout = new JButton("Logout");
		
		
		//Adding options to the panel
		panel.add(itm_list);
		
		panel.add(Box.createVerticalStrut(1));
		//panel.add(new_itm);
		panel.add(Box.createVerticalStrut(1));
		panel.add(new_inv);
		panel.add(Box.createVerticalStrut(1));
		panel.add(report);
		panel.add(Box.createVerticalStrut(1));
		panel.add(customers);
		panel.add(Box.createVerticalStrut(1));
		panel.add(logout);

		
		//Adding Title, table header and item_panel to items_pan
		items items_pan = new items();
		new_item new_itm_pan = new new_item();
		Invoice_list invoice_pan = new Invoice_list();
		new_invoice n_invoice = new new_invoice();
		Report_pan report_pan = new Report_pan();
		Customers customers_pan = new Customers();
		new_customer new_cust_pan = new new_customer();

		
		add(panel, BorderLayout.NORTH);
		//add(Box.createHorizontalStrut(10));//Space when using boxed layout

		
		//add(Box.createHorizontalStrut(3));//Space when using boxed layout
		add(footer, BorderLayout.SOUTH);

		setVisible(true);
		
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		items_pan.new_itm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				customers_pan.setVisible(false);
				n_invoice.setVisible(false);
				items_pan.setVisible(false);
				invoice_pan.setVisible(false);
				report_pan.setVisible(false);
				new_cust_pan.setVisible(false);
				add(new_itm_pan, BorderLayout.CENTER);
				new_itm_pan.setVisible(true);
                revalidate();

				
			}
		});
		
		new_itm_pan.cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				customers_pan.setVisible(false);
				n_invoice.setVisible(false);
				new_itm_pan.setVisible(false);
				invoice_pan.setVisible(false);
				report_pan.setVisible(false);
				new_cust_pan.setVisible(false);
				add(items_pan, BorderLayout.CENTER);
				items_pan.setVisible(true);
                revalidate();

				
			}
		});
		
		itm_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseClicked(e);
				customers_pan.setVisible(false);
				n_invoice.setVisible(false);
				new_itm_pan.setVisible(false);
				invoice_pan.setVisible(false);
				report_pan.setVisible(false);
				new_cust_pan.setVisible(false);
				add(items_pan, BorderLayout.CENTER);
				items_pan.setVisible(true);
                revalidate();

				
			}
		});
		
		new_inv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				customers_pan.setVisible(false);
				n_invoice.setVisible(false);
				new_itm_pan.setVisible(false);
				items_pan.setVisible(false);
				report_pan.setVisible(false);
				new_cust_pan.setVisible(false);
				add(invoice_pan, BorderLayout.CENTER);
				invoice_pan.setVisible(true);
				revalidate();
				
				
				
			}
		});
		
		report.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				customers_pan.setVisible(false);
				n_invoice.setVisible(false);
				new_itm_pan.setVisible(false);
				items_pan.setVisible(false);
				invoice_pan.setVisible(false);
				new_cust_pan.setVisible(false);
				add(report_pan, BorderLayout.CENTER);
				report_pan.setVisible(true);
				revalidate();
				
			}
		});
		
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?");
		        // 0=yes, 1=no, 2=cancel
				System.out.println("You Just Clicked");
		        if (input == 1 || input == 2) {
					//Do nothing
		        	System.out.println("don't logout");
				}else if (input == 0) {
					//
					dispose();
				}

			}
		});
		
		invoice_pan.add_invoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseClicked(e);
				customers_pan.setVisible(false);
				n_invoice.setVisible(false);
				new_itm_pan.setVisible(false);
				items_pan.setVisible(false);
				invoice_pan.setVisible(false);
				report_pan.setVisible(false);
				new_cust_pan.setVisible(false);
				add(n_invoice, BorderLayout.CENTER);
				n_invoice.setVisible(true);
				
			}
		});
		
		customers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseClicked(e);
				n_invoice.setVisible(false);
				new_itm_pan.setVisible(false);
				items_pan.setVisible(false);
				invoice_pan.setVisible(false);
				report_pan.setVisible(false);
				n_invoice.setVisible(false);
				new_cust_pan.setVisible(false);
				add(customers_pan, BorderLayout.CENTER);
				customers_pan.setVisible(true);

				
			}
		});
		
		customers_pan.new_cust.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseClicked(e);
				n_invoice.setVisible(false);
				new_itm_pan.setVisible(false);
				items_pan.setVisible(false);
				invoice_pan.setVisible(false);
				report_pan.setVisible(false);
				n_invoice.setVisible(false);
				customers_pan.setVisible(false);
				add(new_cust_pan, BorderLayout.CENTER);
				new_cust_pan.setVisible(true);
				
			}
			
		});
		
	}
	

	public static void main(String[] args) {
		Interface i1 = new Interface();
	}

	
}
