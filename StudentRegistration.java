import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class StudentRegistration implements ActionListener
{	
	JFrame jf;
	JLabel name,rollno,gender,dob,lang,address;
	JTextField nametxt,rollnotxt,dobtxt;
	JTextArea addresstxt;
	JRadioButton male,female,ptns;
	JButton reset,submit;
	JCheckBox tel,eng,hin;
    ButtonGroup bg = new ButtonGroup();
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
		JPanel jp = new JPanel(new GridLayout(7,2));
        JPanel sublangJPanel = new JPanel(new GridLayout(1,4));
        JPanel subgenderJPanel = new JPanel(new GridLayout(1,3));
		jp.add(name);
		jp.add(nametxt);
		jp.add(rollno);
		jp.add(rollnotxt);
		jp.add(dob);
		jp.add(dobtxt);
		jp.add(gender);
		    subgenderJPanel.add(male);
		    subgenderJPanel.add(female);
            subgenderJPanel.add(ptns);
            jp.add(subgenderJPanel);
		jp.add(lang);
		    sublangJPanel.add(tel);
		    sublangJPanel.add(hin);
		    sublangJPanel.add(eng);
            jp.add(sublangJPanel);
		jp.add(address);
		jp.add(addresstxt);
		jp.add(reset);
		jp.add(submit);
        bg.add(male);
        bg.add(female);
        bg.add(ptns);
		jf.setSize(600,600);
		jf.setLayout(new GridLayout(1,1));
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