import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EgAdditionSwing implements ActionListener
{
	JFrame f;
	JLabel num1,num2;
	JTextField num1TF,num2TF,resultTF;
	JButton addBtn,subBtn,mulBtn,divBtn,modBtn;
	JPanel newPanel;
	EgAdditionSwing()
	{
		f=new JFrame("Arithmetic Operations ");
		num1=new JLabel("Enter the Num1 value:");
		num2=new JLabel("Enter the Num2  value:");
	
		num1TF=new JTextField();
		num2TF=new JTextField();
		resultTF=new JTextField();
	
		addBtn=new JButton("+");
		subBtn=new JButton("-");
		mulBtn=new JButton("*");
		divBtn=new JButton("/");
		modBtn=new JButton("%");
		newPanel=new JPanel(new GridLayout(5,1));
	
		newPanel.add(num1);
		newPanel.add(num1TF);
	
		newPanel.add(num2);
		newPanel.add(num2TF);
	
		newPanel.add(addBtn);
		newPanel.add(subBtn);
		newPanel.add(mulBtn);
		newPanel.add(divBtn);
		newPanel.add(modBtn);
		newPanel.add(resultTF);
	
		f.add(newPanel);
	
		addBtn.addActionListener(this);
		subBtn.addActionListener(this);
		mulBtn.addActionListener(this);
		divBtn.addActionListener(this);
		modBtn.addActionListener(this);
	
		f.setLayout(new GridLayout(1,1));
		f.setSize(300,400);
		f.setVisible(true);
	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		char ch=s.charAt(0);
		if(ch=='+')
		{
			int a=Integer.parseInt(num1TF.getText());
			int b=Integer.parseInt(num2TF.getText());
			int c=a+b;
			resultTF.setText("Addition is : "+c);
		}
		if(ch=='-')
		{
			int a=Integer.parseInt(num1TF.getText());
			int b=Integer.parseInt(num2TF.getText());
			int c=a-b;
			resultTF.setText("Substraction is : "+c);
		}
		if(ch=='*')
		{
			int a=Integer.parseInt(num1TF.getText());
			int b=Integer.parseInt(num2TF.getText());
			int c=a*b;
			resultTF.setText("Multiplication is : "+c);
		}
		if(ch=='/')
		{
			int a=Integer.parseInt(num1TF.getText());
			int b=Integer.parseInt(num2TF.getText());
			int c=a/b;
			resultTF.setText("Division is : "+c);
		}
		if(ch=='%')
		{
			int a=Integer.parseInt(num1TF.getText());
			int b=Integer.parseInt(num2TF.getText());
			int c=a%b;
			resultTF.setText("Modulus is : "+c);
		}
	}
	public static void main(String srgs[])
	{
		EgAdditionSwing e=new EgAdditionSwing();
	}
}