package project2022;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class project2022 extends JFrame {
	private double op1 = 0;
	private double op2 = 0;
	private String operator = "+";//이벤트발생시 연산자를 담을 변수
	private JLabel status;
	
	Stack<String> stack = new Stack<>();
	List<String> result = new ArrayList<>();
	List<String> output = new ArrayList<>();
	TextArea txtA;




	public project2022() {
		this.setTitle("계산기");
		this.setBounds(100,100,300,450);
		this.setLayout(new BorderLayout());
		
		
			GridLayout gridLayout  = new GridLayout(8, 0);
			JMenuBar menuBar =new JMenuBar();
			JMenu fileMenu = new JMenu("≡");
			JMenu editMenu = new JMenu("표준");
			menuBar.add(fileMenu);
			menuBar.add(editMenu);
			JMenuItem openMenuItem = new JMenuItem("⇱");
			JMenuItem saveMenuItem = new JMenuItem("");
			menuBar.add(openMenuItem);
			menuBar.add(saveMenuItem);
			this.setJMenuBar(menuBar);
	

			
		
		Image icon = Toolkit.getDefaultToolkit().getImage("cal2.GIF");
		this.setIconImage(icon);
		
		JTextField display = new JTextField("0");
		display.setFont(new Font("궁서체", Font.BOLD , 50 ));
		display.setHorizontalAlignment(JTextField.RIGHT);
		this.add( BorderLayout.NORTH, display);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 4));

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener( e -> {
			op2 =0;
			operator="+";
			display.setText("0");
			status.setText(" ");
		});
		panel.add(btnCE);
		JButton btnClear = new JButton("C");
		btnClear.addActionListener( e -> {
			op1 =0;
			op2 =0;
			operator="+";
			display.setText("0");
			status.setText(" ");
		});
		panel.add(btnClear);
		
		JButton btnfraction = new JButton("1/x");
		btnfraction.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
			display.setText("0");
			operator = "1/x";
		});
		panel.add(btnfraction);
	
		JButton btnsquare = new JButton("x²");
		btnsquare.addActionListener( e -> {
		op1 = Double.parseDouble( display.getText() );
		display.setText("0");
		operator = "x²";
		});
		panel.add(btnsquare);
	
		
		JButton btnroot = new JButton("√");
		btnroot.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
			display.setText("0");
			operator = "√";
			
			});
		
	
		panel.add(btnroot);
		
		JButton btndivide = new JButton("÷");
		btndivide.addActionListener( e -> {
		
		op1 = Double.parseDouble( display.getText() );
		display.setText("0");
		operator = "/";
		status.setText(op1+"/");
	});
		panel.add(btndivide);
 
		JButton btn7 = new JButton("7");
		btn7.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn7.getText() );	
			} else {
				display.setText( display.getText() + btn7.getText() );
			}
		});
		JButton btn8 = new JButton("8");
		btn8.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn8.getText() );	
			} else {
				display.setText( display.getText() + btn8.getText() );
			}
		});
		JButton btn9 = new JButton("9");
		btn9.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn9.getText() );	
			} else {
				display.setText( display.getText() + btn9.getText() );
			}
		});
		JButton btnMult = new JButton("X");
		btnMult.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
			display.setText("0");
			operator = "*";
		});
		panel.add(btnMult);

		

		JButton btn4 = new JButton("4");
		btn4.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn4.getText() );	
			} else {
				display.setText( display.getText() + btn4.getText() );
			}
		});
		JButton btn5 = new JButton("5");
		btn5.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn5.getText() );	
			} else {
				display.setText( display.getText() + btn5.getText() );
			}
		});
		JButton btn6 = new JButton("6");
		btn6.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn6.getText() );	
			} else {
				display.setText( display.getText() + btn6.getText() );
			}
		});
			
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
			display.setText("0");
			operator = "-";
			status.setText(op1+"-");
		});
		panel.add(btnMinus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn1.getText() );	
			} else {
				display.setText( display.getText() + btn1.getText() );
			}
		});
		JButton btn2 = new JButton("2");
		btn2.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn2.getText() );	
			} else {
				display.setText( display.getText() + btn2.getText() );
			}
		});
		JButton btn3 = new JButton("3");
		btn3.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn3.getText() );	
			} else {
				display.setText( display.getText() + btn3.getText() );
			}
		});
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
			display.setText("0");
			operator = "+";
			status.setText(op1+"+");
		});
		panel.add(btnPlus);

		JButton btnnp = new JButton("+/-");
		btnnp.addActionListener( e -> {
		op1 = Double.parseDouble( display.getText() );
		op1=op1*-1;
		display.setText(""+this.op1);

		});
		panel.add(btnnp);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn0.getText() );	
			} else {
				display.setText( display.getText() + btn0.getText() );
			}
		});
	
	
		JButton btnDot = new JButton(".");
		btnDot.addActionListener( e -> {
			if(!display.getText().contains(".")) {
				display.setText( display.getText() + btnDot.getText() );
			}
		});
		panel.add(btnDot);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener( e -> {
			op2 = Double.parseDouble( display.getText() );
			double result =calc( op1, op2, operator );
			display.setText( "" + result );
		});

		panel.add(btnEqual);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
			display.setText("0");
			operator = op1+"%";
		});
		panel.add(btnpercent);
	

		JButton btnbackspace = new JButton("←");
		btnbackspace.addActionListener( e -> {
			  if (display.getText().length() != 0) {
				  display.setText(display.getText().substring(0, display.getText().length() - 1));
              }
			  display.requestFocusInWindow();
          
			

		});

		panel.add(btnbackspace);
		
		
		
		panel.add(btnpercent);panel.add(btnCE);panel.add(btnClear);panel.add(btnbackspace);
		panel.add(btnfraction);panel.add(btnsquare);panel.add(btnroot);panel.add(btndivide);
		panel.add(btn7);panel.add(btn8);panel.add(btn9);panel.add(btnMult);
		
		panel.add(btn4);panel.add(btn5);panel.add(btn6);panel.add(btnMinus);

		panel.add(btn1);panel.add(btn2);panel.add(btn3);panel.add(btnPlus);

		panel.add(btnnp);panel.add(btn0);panel.add(btnDot);panel.add(btnEqual);
		
		
		
		this.add( BorderLayout.CENTER, panel);	
		
		JLabel status = new JLabel("버튼을 클릭하세요");
	
		this.add( BorderLayout.SOUTH, status );
		this.setVisible(true);
	}
	
	private double calc(double op1, double op2, String operator) {
		double result = 0;
		
		switch( operator ){
	    case "+":
	    	result = op1 + op2;
	    	break;
		case "-":
			result = op1 - op2;
			break;
		case "*":
			result = op1 * op2;
			break;
		case "/":
			result = op1 / op2;
			break;
		case "%":
			result = op1 % op2;
			break;
		case "x²":
			result = op1 * op1;
			break;
		case "√":
			result=Math.sqrt(op1);
			break;
		case "1/x":
			result = 1/op1;
			break;
		}
		return result;
		
	}

	public static void main(String[] args) {
		

		new project2022().setVisible(true);
		
		
	}
	
	
}