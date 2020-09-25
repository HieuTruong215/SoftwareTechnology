package softwaretechnology;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MathCalculation extends JFrame {

	private JButton buttonPlus, buttonMinus, buttonMultiplic, buttonDivide;
	private JTextField textFieldfFirstNumber, textFieldSecondNumber, textFieldResult;
	private double Result;
	private Container container = getContentPane();
	private JPanel panelTop, panelBottom;

	public static void main(String args[]) {
		MathCalculation mathCalculation = new MathCalculation("mathCalculation");
		mathCalculation.setLocationRelativeTo(null);
	}

	public MathCalculation(String title) {
		super(title);
		container.setPreferredSize(new Dimension(500, 200));
		JLabel lableFirstNumber = new JLabel("first: ");
		textFieldfFirstNumber = new JTextField();
		JLabel labelSecondNumber = new JLabel("Seccond: ");
		textFieldSecondNumber = new JTextField();
		JLabel labelResult = new JLabel("Result: ");
		textFieldResult = new JTextField();
		textFieldResult.setEditable(false);

		panelTop = new JPanel();
		GridLayout gridLayoutTop = new GridLayout(3, 2, 20, 15);
		panelTop.setLayout(gridLayoutTop);
		panelTop.add(lableFirstNumber);
		panelTop.add(textFieldfFirstNumber);
		panelTop.add(labelSecondNumber);
		panelTop.add(textFieldSecondNumber);
		panelTop.add(labelResult);
		panelTop.add(textFieldResult);

		buttonPlus = new JButton("+");
		buttonMinus = new JButton("-");
		buttonMultiplic = new JButton("*");
		buttonDivide = new JButton("/");
		panelBottom = new JPanel();
		panelBottom.setLayout(new FlowLayout(1, 50, 20));

		panelBottom.add(buttonPlus);
		panelBottom.add(buttonMinus);
		panelBottom.add(buttonMultiplic);
		panelBottom.add(buttonDivide);

		container.add(panelTop);
		container.add(panelBottom, "South");

		funtionButton();
		this.pack();
		this.setVisible(true);
	}

	private void funtionButton() {
		buttonPlusEvent();
		buttonMinusEvent();
		buttonMultiplicEvent();
		buttonDivideEvent();
	}
//-----------------------------------------------------------------------------
	private void buttonPlusEvent() {
		buttonPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(textFieldfFirstNumber.getText())
						+ Double.parseDouble(textFieldSecondNumber.getText());
				textFieldResult.setText(String.valueOf(Result));
			}
		});

	}

	private void buttonMinusEvent() {
		buttonMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(textFieldfFirstNumber.getText())
						- Double.parseDouble(textFieldSecondNumber.getText());
				textFieldResult.setText(String.valueOf(Result));
			}
		});

	}

	private void buttonMultiplicEvent() {
		buttonMultiplic.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(textFieldfFirstNumber.getText())
						* Double.parseDouble(textFieldSecondNumber.getText());
				textFieldResult.setText(String.valueOf(Result));
			}
		});

	}

	private void buttonDivideEvent() {
		buttonDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Result = Double.parseDouble(textFieldfFirstNumber.getText())
						/ Double.parseDouble(textFieldSecondNumber.getText());
				textFieldResult.setText(String.valueOf(Result));
			}
		});
	}

}