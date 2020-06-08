
package calculator;
import java.awt.event.*;
import javax.swing.*;	
public class Calculator extends JFrame {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsubtract,bmultiply,bdivide,bequals,breset;
	JTextField t1;
	String s0, s1, s2;
	JLabel l2;
	Calculator(String s){
	     super(s);
	     s0 = s1 = s2 = "";
	}
	public void setComponents() {
		t1 = new JTextField(16);		
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("4");
		b5= new JButton("5");
		b6= new JButton("6");
		b7= new JButton("7");
		b8= new JButton("8");
		b9= new JButton("9");
		b0= new JButton("0");
		l2 = new JLabel();
		badd= new JButton("+");
		bsubtract= new JButton("-");
		bmultiply= new JButton("*");
		bdivide= new JButton("/");
		bequals = new JButton("=");
		breset = new JButton("C");
		bdot = new JButton(".");
		
		setLayout(null);
		t1.setBounds(10,30,460,50);
		t1.setEditable(false);
		b1.setBounds(30,110,50,30);
		b2.setBounds(90,110,50,30);
		b3.setBounds(150,110,50,30);
		b4.setBounds(210,110,50,30);
		b5.setBounds(30,150,50,30);
		b6.setBounds(90,150,50,30);
		b7.setBounds(150,150,50,30);
		b8.setBounds(210,150,50,30);
	    b9.setBounds(90,190,50,30);
	    b0.setBounds(150,190,50,30);
	    bdot.setBounds(210,190,50,30);
	    badd.setBounds(300,110,50,50);
	    bsubtract.setBounds(360,110,50,50);
	    bmultiply.setBounds(300,170,50,50);
	    bdivide.setBounds(360,170,50,50);
	    bequals.setBounds(420,110,50,110);
	    breset.setBounds(30,190,50,30);
	    l2.setBounds(30,230,40,40);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(bdot);
		add(badd);
		add(bsubtract);
		add(bmultiply);
		add(bdivide);
		add(bequals);
		add(breset);
		add(l2);
		operation o1 = new operation();
		b1.addActionListener(o1);
		b2.addActionListener(o1);
		b3.addActionListener(o1);
		b4.addActionListener(o1);
		b5.addActionListener(o1);
		b6.addActionListener(o1);
		b7.addActionListener(o1);
		b8.addActionListener(o1);
		b9.addActionListener(o1);
		b0.addActionListener(o1);
		badd.addActionListener(o1);
		bsubtract.addActionListener(o1);
		bmultiply.addActionListener(o1);
		bdivide.addActionListener(o1);
		bequals.addActionListener(o1);
		breset.addActionListener(o1);
		bdot.addActionListener(o1);
	}

class operation implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();  //This getActionCommand returns which button is pressed. 
			if(s.charAt(0) >= '0' && s.charAt(0)<= '9'|| s.charAt(0) == '.')
			{
				if(s1.equals("")) {  //It will check wheteher s0 has value or not.
					s0 = s0 + s;
					}
				else
					s2 = s2 + s;
				
				t1.setText(s0 + s1 + s2);
			}
			else if(s.charAt(0) == 'C')
			{
				s0 = s1 = s2 = "";
				t1.setText(s0 + s1 + s2);
			}
			else if(s.charAt(0) == '=')
			{
				double total;
				if(s1.equals("+"))
				
					total = (Double.parseDouble(s0) + Double.parseDouble(s2));
				
				else if(s1.equals("-")) 
					total = (Double.parseDouble(s0) - Double.parseDouble(s2));
				
				else if(s1.equals("/")) 
					total = (Double.parseDouble(s0) / Double.parseDouble(s0));
				
				else 
					total = (Double.parseDouble(s0) * Double.parseDouble(s2));
				
				t1.setText(s0 + s1 + s2 +"="+ total);
				s0 =Double.toString(total);
				
				s1 = s2 = "";
				t1.setText(s0 + s1 + s2);
			}
			else {
				if(s1.equals("") || s2.equals(""))
				{
					s1 = s;
				}
				t1.setText(s0 + s1 + s2);
			}
}
}
	public static void main(String[] args) {		
		Calculator c1 = new Calculator("Gaurav Calculator");
		c1.setComponents();
		c1.setVisible(true);
		c1.setSize(500,300);
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

