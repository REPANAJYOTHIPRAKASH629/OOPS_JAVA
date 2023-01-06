import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class CreateALoginForm extends WindowAdapter
{	
	Frame f = new Frame("CreateALoginForm");
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	CreateALoginForm()
	{
		Label name = new Label("NAME : ");
		TextField nametxt = new TextField();
		Label pwd = new Label("PASSWORD");
		TextField pwdtxt = new TextField();
		Button login = new Button("Login");
		Button frgtpwd= new Button("Forgot password");
		Panel p = new Panel(new GridLayout(3,3));
		p.add(name);
		p.add(nametxt);
		p.add(pwd);
		p.add(pwdtxt);
		p.add(login);
		p.add(frgtpwd);
		f.setSize(500,500);
		f.setLayout(new GridLayout(3,1));
		f.setVisible(true);
		f.add(p,BorderLayout.CENTER);
		f.addWindowListener(this);
	}
	public static void main(String args[])
	{
		CreateALoginForm c = new CreateALoginForm();
	}
}
