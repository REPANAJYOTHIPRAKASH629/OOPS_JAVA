import javax.swing.*;
import java.awt.*;
import java.lang.Exception;
public class CreateALoginPage {
    CreateALoginPage()
    {
        JFrame f = new JFrame("Login Form");
        JLabel UserNameLabel = new JLabel("User Name");
        JLabel UserPwdLabel = new JLabel("Password");
        JButton loginButton = new JButton("Login");
        JButton forgetPwdButton = new JButton("Forgot Password");
        JTextField UserNameTxtField = new JTextField();
        JTextField UserPwdTxtField = new JTextField();
        JPanel newPanel = new JPanel(new GridLayout(3,1));
        newPanel.add(UserNameLabel);
        newPanel.add(UserNameTxtField);
        newPanel.add(UserPwdLabel);
        newPanel.add(UserPwdTxtField);
        newPanel.add(forgetPwdButton);
        newPanel.add(loginButton);
        f.add(newPanel,BorderLayout.CENTER);
        f.setSize(700,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public static void main(String args[])
    {
        CreateALoginPage c = new CreateALoginPage();
    }
}
