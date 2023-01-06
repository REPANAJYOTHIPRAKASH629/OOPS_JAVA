import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class StudentRegistration implements ActionListener
{	
	JFrame jf;
	JLabel name,rollno,gender,dob,lang,address;
	JTextField nametxt,rollnotxt,dobtxt;
	JTextArea addresstxt;
	JRadioButton male,female,ptns;
	JButton reset,submit;
	JCheckBox tel,eng,hin;
	public void actionPerformed(ActionEvent e)
	{
		nametxt.setText("");
		rollnotxt.setText("");
		dobtxt.setText("");
		addresstxt.setText("");
	}
	StudentRegistration()
	{
		jf = new JFrame("Student Registration");
		name = new JLabel("NAME : ");
		nametxt = new JTextField();
		rollno = new JLabel("ROLL NO. : ");
		rollnotxt = new JTextField();
		dob = new JLabel("DOB  : ");
		dobtxt = new JTextField();
		gender = new JLabel("GENDER : ");
		male = new JRadioButton("MALE");
		female = new JRadioButton("FEMALE");
		ptns =  new JRadioButton("prefer to not say");
		lang = new JLabel("LANGUAGES : ");
		tel = new JCheckBox("Telugu");
		eng = new JCheckBox("English");
		hin = new JCheckBox("Hindi");
		address = new JLabel("ADDRESS : ");
		addresstxt = new JTextArea();
		reset = new JButton("RESET");
		submit = new JButton("SUBMIT");
		JPanel jp = new JPanel(new GridLayout(3,2));
		jp.add(name);
		jp.add(nametxt);
		jp.add(rollno);
		jp.add(rollnotxt);
		jp.add(dob);
		jp.add(dobtxt);
		jp.add(gender);
		jp.add(male);
		jp.add(female);
		jp.add(ptns);
		jp.add(lang);
		jp.add(tel);
		jp.add(hin);
		jp.add(eng);
		jp.add(address);
		jp.add(addresstxt);
		jp.add(reset);
		jp.add(submit);
		jf.setSize(200,200);
		jf.setLayout(new GridLayout(2,2));
		jf.setVisible(true);
		jf.add(jp,BorderLayout.CENTER);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		reset.addActionListener(this);
	}
	public static void main(String args[])
	{
        	StudentRegistration s = new StudentRegistration();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           