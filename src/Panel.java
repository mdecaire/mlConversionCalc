import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel{
	public DisplayPanel disp= new DisplayPanel(this);
	public BtnPanel btn= new BtnPanel(this);
	
	public Panel() {
		setLayout(new BorderLayout());
		setBackground(Color.gray);
		setForeground(Color.blue);
		add(disp, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}

}
