import java.awt.Toolkit;
import javax.swing.JFrame;

public class DDD extends JFrame
{
	static JFrame F = new DDD();
	Screen ScreenObject = new Screen();
	
	
	public DDD()
	{
		add(ScreenObject);
		setUndecorated(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
	}
	public static void main(String[] args)
	{
		
	}
}
