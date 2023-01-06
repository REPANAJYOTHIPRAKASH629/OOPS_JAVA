import javax.swing.*;
class FrameButton
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame("Frame");
		JButton jb = new JButton("Button");
		
		jf.setSize(1000,1000);
		jb.setBounds(250,250,150,50);

		jf.add(jb);
		jf.setIcon(

		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}