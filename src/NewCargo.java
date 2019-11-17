import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewCargo {
	String product[] = { "Shoe", "Cabinet", "Book", "Computer" };
	String receiver[] = { "User 1", "User 2", "User 3", "User 4", "User 5" };
	JFrame frCargo;
	JPanel paCargo;
	JButton buDone;
	JLabel laProduct;
	JLabel laReceiver;
	JComboBox<String> coProducts;
	JComboBox<String> coReceivers;
	

	public NewCargo() {
		frCargo = new JFrame();
		paCargo = new JPanel();
		buDone = new JButton("Done");
		laProduct = new JLabel("Product");
		laReceiver = new JLabel("Receiver");
		coProducts = new JComboBox<String>(product);
		coReceivers = new JComboBox<String>(receiver);
		
		laProduct.setBounds(50, 30, 120, 40);
		laReceiver.setBounds(220, 30, 120, 40);
		coProducts.setBounds(50, 60, 120, 40);
		coReceivers.setBounds(220, 60, 120, 40);
		
		buDone.setBounds(150, 150, 100, 50);
		buDone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		paCargo.setLayout(null);
		paCargo.add(buDone);
		paCargo.add(laProduct);
		paCargo.add(laReceiver);
		paCargo.add(coProducts);
		paCargo.add(coReceivers);
		
		frCargo.setTitle("New Cargo");
		frCargo.setBounds(250, 250, 500, 250);
		frCargo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frCargo.setResizable(false);
		frCargo.add(paCargo);
		
		frCargo.setVisible(true);
	}
}
