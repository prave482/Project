package Calculator;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculate4 {

	private JFrame frame;
	private JTextField textField;
	
	Double first;
	Double second;
	Double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate4 window = new calculate4();
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
	public calculate4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 429, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 400, 37);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 59, 400, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1_3 = new JButton("\u221A");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
			
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3.setBounds(10, 126, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_3_1 = new JButton("1/X");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_1.setBounds(10, 182, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_1);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXy.setBounds(10, 239, 71, 55);
		frame.getContentPane().add(btnXy);
		
		JButton btnNewButton_1_3_3 = new JButton("X^3");
		btnNewButton_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_3.setBounds(10, 293, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_3);
		
		JButton btnNewButton_1_3_4 = new JButton("X^2");
		btnNewButton_1_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_4.setBounds(10, 350, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_4);
		
		JButton btnNewButton_1_3_5 = new JButton("n!");
		btnNewButton_1_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
					
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnNewButton_1_3_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_5.setBounds(10, 405, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_5);
		
		JButton btnPluMin = new JButton("+/-");
		btnPluMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPluMin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPluMin.setBounds(10, 456, 71, 55);
		frame.getContentPane().add(btnPluMin);
		
		JButton btnNewButton_1_3_7 = new JButton("e^x");
		btnNewButton_1_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_7.setBounds(91, 126, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_7);
		
		JButton btnNewButton_1_3_1_1 = new JButton("Log");
		btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_1_1.setBounds(91, 182, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_1_1);
		
		JButton btnNewButton_1_3_2_1 = new JButton("%");
		btnNewButton_1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_2_1.setBounds(91, 239, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_2_1);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(91, 293, 71, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(91, 350, 71, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(91, 405, 71, 55);
		frame.getContentPane().add(btn1);
		
		JButton btnNewButton_1_3_8 = new JButton("Sin");
		btnNewButton_1_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton_1_3_8.setBounds(172, 126, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_8);
		
		JButton btnNewButton_1_3_1_2 = new JButton("Sinh");
		btnNewButton_1_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3_1_2.setBounds(172, 182, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_1_2);
		
		JButton btnNewButton_1_3_2_2 = new JButton("C");
		btnNewButton_1_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_1_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_3_2_2.setBounds(172, 239, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_2_2);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}

		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(172, 293, 71, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
			
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(172, 350, 71, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
			
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(172, 405, 71, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(91, 463, 152, 48);
		frame.getContentPane().add(btn0);
		
		JButton btnNewButton_1_3_9 = new JButton("Cos");
		btnNewButton_1_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnNewButton_1_3_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_3_9.setBounds(255, 126, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_9);
		
		JButton btnNewButton_1_3_1_3 = new JButton("Cosh");
		btnNewButton_1_3_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3_1_3.setBounds(255, 182, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_1_3);
		
		JButton btnNewButton_1_3_2_3 = new JButton("\uF0E7");
		btnNewButton_1_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				
				if(textField.getText().length()>0){
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					
					
				}
			}
		});
		btnNewButton_1_3_2_3.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnNewButton_1_3_2_3.setBounds(255, 239, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_2_3);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(255, 293, 71, 55);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(255, 350, 71, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
			
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(255, 405, 71, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnNewButton_1_3_6_1 = new JButton(".");
		btnNewButton_1_3_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(textField.getText());
				stringBuilder.append(btn3.getText());
				@SuppressWarnings("unused")
				String number =stringBuilder.toString();
				textField.setText(null);
				
			}
			
		});
		btnNewButton_1_3_6_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_3_6_1.setBounds(255, 456, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_6_1);
		
		JButton btnNewButton_1_3_10 = new JButton("Tan");
		btnNewButton_1_3_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_3_10.setBounds(339, 126, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_10);
		
		JButton btnNewButton_1_3_1_4 = new JButton("Tanh");
		btnNewButton_1_3_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnNewButton_1_3_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3_1_4.setBounds(339, 182, 71, 55);
		frame.getContentPane().add(btnNewButton_1_3_1_4);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(339, 239, 71, 55);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSub.setBounds(339, 293, 71, 55);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMul.setBounds(339, 350, 71, 55);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDiv.setBounds(339, 405, 71, 55);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEql = new JButton("=");
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if (operation=="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if (operation=="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operation=="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operation=="%") {
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operation=="X^Y")
				{
					
					double result=1;
					for(int i=0;i<second;i++) 
					{
					result=first*result;
						
					}
					answer=String.format("%.2f",result);
					textField.setText(answer);		
							
			}
			}
		});
		btnEql.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEql.setBounds(339, 456, 71, 55);
		frame.getContentPane().add(btnEql);
	}
}
