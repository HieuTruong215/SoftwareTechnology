package HW;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mathCalculation extends JFrame implements ActionListener {

	private JButton bt1, bt2, bt3, bt4;

	private JTextField tf1, tf2, tf3;

	private double result;

	private Container cont = getContentPane();

	private JPanel panel1, panel2;

	public mathCalculation(String s) {
		super(s);
		cont.setPreferredSize(new Dimension(500, 200));
		JLabel num1lb = new JLabel("first: ");
		tf1 = new JTextField();
		JLabel num2lb = new JLabel("Seccond: ");
		tf2 = new JTextField();
		JLabel resultlb = new JLabel("Result: ");
		tf3 = new JTextField();
		tf3.setEditable(false);

		panel1 = new JPanel();
		GridLayout grlayout = new GridLayout(3, 2, 20, 15);
		panel1.setLayout(grlayout);
		panel1.add(num1lb);
		panel1.add(tf1);
		panel1.add(num2lb);
		panel1.add(tf2);
		panel1.add(resultlb);
		panel1.add(tf3);

		bt1 = new JButton("+");
		bt2 = new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(1, 50, 20));

		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);

		panel2.add(bt1);
		panel2.add(bt2);
		panel2.add(bt3);
		panel2.add(bt4);

		cont.add(panel1);
		cont.add(panel2, "South");
		this.pack();
		this.setVisible(true);
	}

	public void doPlus() {
				
			bt1.setEnabled(true);
			result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
			tf3.setText(String.valueOf(result));
		
		
	}

	public void doMinus() {
		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}

	public void doMult() {
		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}

	public void doDiv() {
		result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}

	public void name(JButton bt12) {
		if (tf1.getText() == null || tf2.getText() == null) {
			bt12.setEnabled(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "+")
			doPlus();
		if (e.getActionCommand() == "-")
			doMinus();
		if (e.getActionCommand() == "*")
			doMult();
		if (e.getActionCommand() == "/")
			doDiv();

	}

	public static void main(String args[]) {
		mathCalculation mathCalculation = new mathCalculation("mathCalculation");
		mathCalculation.setLocationRelativeTo(null);
	}
}