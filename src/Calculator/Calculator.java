package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(40, 122, 60, 48);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Scientific method");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 4, 209, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(40, 36, 343, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.setBounds(40, 170, 60, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.setBounds(40, 217, 60, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(40, 264, 60, 48);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(40, 309, 60, 48);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(40, 357, 60, 48);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(40, 405, 60, 48);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(110, 122, 60, 48);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(110, 170, 60, 48);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(110, 217, 60, 48);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBounds(110, 264, 60, 48);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_10.setBounds(110, 309, 60, 48);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_11.setBounds(110, 357, 60, 48);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_12.setBounds(110, 405, 130, 48);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_13.setBounds(180, 122, 60, 48);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_14.setBounds(180, 170, 60, 48);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_15.setBounds(180, 217, 60, 48);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("0");
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_16.setBounds(180, 264, 60, 48);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("0");
		btnNewButton_17.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_17.setBounds(180, 309, 60, 48);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("0");
		btnNewButton_18.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_18.setBounds(180, 357, 60, 48);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("0");
		btnNewButton_19.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_19.setBounds(250, 122, 60, 48);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("0");
		btnNewButton_20.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_20.setBounds(323, 122, 60, 48);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("0");
		btnNewButton_21.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_21.setBounds(250, 170, 60, 48);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("0");
		btnNewButton_22.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_22.setBounds(250, 217, 60, 48);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("0");
		btnNewButton_23.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_23.setBounds(250, 264, 60, 48);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("0");
		btnNewButton_24.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_24.setBounds(250, 309, 60, 48);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("0");
		btnNewButton_25.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_25.setBounds(250, 357, 60, 48);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("0");
		btnNewButton_26.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_26.setBounds(250, 405, 60, 48);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("0");
		btnNewButton_27.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_27.setBounds(323, 170, 60, 48);
		frame.getContentPane().add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("0");
		btnNewButton_28.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_28.setBounds(323, 217, 60, 48);
		frame.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("0");
		btnNewButton_29.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_29.setBounds(323, 264, 60, 48);
		frame.getContentPane().add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("0");
		btnNewButton_30.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_30.setBounds(323, 309, 60, 48);
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("0");
		btnNewButton_31.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_31.setBounds(323, 357, 60, 48);
		frame.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("0");
		btnNewButton_32.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_32.setBounds(323, 405, 60, 48);
		frame.getContentPane().add(btnNewButton_32);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(37, 91, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
	}
}
