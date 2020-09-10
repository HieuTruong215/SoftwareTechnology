package HW;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mathCalculation extends JFrame {

	private JButton Bt1, Bt2, Bt3, Bt4;
	private JTextField Tf1, Tf2, Tf3;
	private double Result;
	private Container Conn = getContentPane();
	private JPanel Pn1, Pn2;

	public static void main(String args[]) {
		mathCalculation mathCalculation = new mathCalculation("mathCalculation");
		mathCalculation.setLocationRelativeTo(null);
	}
	public mathCalculation(String tt) {
		super(tt);
		Conn.setPreferredSize(new Dimension(500, 200));
		JLabel Lb1 = new JLabel("first: ");
		Tf1 = new JTextField();
		JLabel Lb2 = new JLabel("Seccond: ");
		Tf2 = new JTextField();
		JLabel Lb3 = new JLabel("Result: ");
		Tf3 = new JTextField();
		Tf3.setEditable(false);

		Pn1 = new JPanel();
		GridLayout gr = new GridLayout(3, 2, 20, 15);
		Pn1.setLayout(gr);
		Pn1.add(Lb1);
		Pn1.add(Tf1);
		Pn1.add(Lb2);
		Pn1.add(Tf2);
		Pn1.add(Lb3);
		Pn1.add(Tf3);

		Bt1 = new JButton("+");
		Bt2 = new JButton("-");
		Bt3 = new JButton("*");
		Bt4 = new JButton("/");
		Pn2 = new JPanel();
		Pn2.setLayout(new FlowLayout(1, 50, 20));

		Pn2.add(Bt1);
		Pn2.add(Bt2);
		Pn2.add(Bt3);
		Pn2.add(Bt4);

		Conn.add(Pn1);
		Conn.add(Pn2, "South");
		
		funtionbutton();
		this.pack();
		this.setVisible(true);
	}
	private void funtionbutton() {
		BtPlusEvent();
		BtMinusEvent();
		BtMultEvent();
		BtDivEvent();
	}
	private void BtPlusEvent() {
		Bt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(Tf1.getText()) + Double.parseDouble(Tf2.getText());
				Tf3.setText(String.valueOf(Result));
			}
		});

	}
	private void BtMinusEvent() {
		Bt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(Tf1.getText()) - Double.parseDouble(Tf2.getText());
				Tf3.setText(String.valueOf(Result));
			}
		});

	}
	private void BtMultEvent() {
		Bt3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(Tf1.getText()) * Double.parseDouble(Tf2.getText());
				Tf3.setText(String.valueOf(Result));
			}
		});

	}
	private void BtDivEvent() {
		Bt4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(Tf1.getText()) / Double.parseDouble(Tf2.getText());
				Tf3.setText(String.valueOf(Result));
			}
		});
	}
	
}