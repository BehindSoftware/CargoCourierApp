import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class menuScreen extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public menuScreen() {
		setTitle("Menu");
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTracking = new JButton("Tracking");
		btnTracking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				table = new JTable();
				table.setBounds(147, 26, 278, 205);
				contentPane.add(table);
				
			}
		});
		btnTracking.setBounds(12, 32, 114, 25);
		contentPane.add(btnTracking);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JComboBox<?> productSelection = new JComboBox<Object>();
				productSelection.setBounds(170, 32, 90, 24);
				contentPane.add(productSelection);
				
				JComboBox<?> receiverSelection = new JComboBox<Object>();
				receiverSelection.setBounds(170, 74, 90, 24);
				contentPane.add(receiverSelection);
				
				JButton btnAdd = new JButton("Add");
				btnAdd.setBounds(170, 119, 82, 25);
				contentPane.add(btnAdd);
				
				JTextPane textPane = new JTextPane();
				textPane.setBounds(285, 35, 143, 196);
				contentPane.add(textPane);
				
				JButton btnApply = new JButton("Apply");
				btnApply.setBounds(170, 206, 82, 25);
				contentPane.add(btnApply);
				
			}
		});
		btnSend.setBounds(12, 74, 114, 25);
		contentPane.add(btnSend);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JTextPane textPane = new JTextPane();
				textPane.setBounds(184, 32, 226, 175);
				contentPane.add(textPane);
				
			}
		});
		btnProfile.setBounds(12, 119, 114, 25);
		contentPane.add(btnProfile);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//frame.setVisible(false);
				
			}
		});
		btnLogout.setBounds(12, 206, 114, 25);
		contentPane.add(btnLogout);
		
	}
}
