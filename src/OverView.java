import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class OverView {
	JFrame frOver;
	JPanel paLeft;
	JPanel paRight;
	JButton buNewCargo;
	JTextField userName;
	String column[] = {"Sender", "Receiver", "Status"};
	String data[][] = {{"Client1", "Client2", "InTransfer"},
			{"Client3", "Client2", "Loaded"}};
	JTable table;
	JScrollPane scStatus;
	TransactionHandler trHandler;
	
	public OverView(TransactionHandler trHandler) {
		this.trHandler = trHandler;
		
		frOver = new JFrame();
		paLeft = new JPanel();
		paRight = new JPanel();
		buNewCargo = new JButton("New Cargo");
		userName = new JTextField(trHandler.user.toUpperCase());
		table = new JTable(data, column);
		scStatus = new JScrollPane(table);
		
		userName.setBounds(10, 10, 180, 80);
		userName.setEditable(false);
		userName.setHorizontalAlignment(JTextField.CENTER);
		
		buNewCargo.setBounds(50, 450, 100, 50);
		
		paLeft.setLayout(null);
		paLeft.setBackground(Color.lightGray);
		paLeft.setBounds(0, 0, 200, 600);
		paLeft.add(userName);
		paLeft.add(buNewCargo);
		
		scStatus.setBounds(200, 0, 800, 600);
		
		paRight.setLayout(null);
		paRight.add(scStatus);
		
		frOver.setTitle("Overview");
		frOver.setBounds(100, 100, 1000, 600);
		frOver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frOver.setResizable(false);
		frOver.add(paLeft);
		frOver.add(paRight);
		
		frOver.setVisible(true);
	}
}
