import java.awt.*;
import javax.swing.*;

public class DisplayPanel extends JPanel {
	private Panel pan;

	// input labels created

	private JLabel leftLabel = new JLabel("ml to oz", JLabel.CENTER);
	
	private JLabel rightLabel = new JLabel("oz to mL", JLabel.CENTER);

	// result label
	private JLabel resLabel = new JLabel("Conversion Results", JLabel.CENTER);

	// creates the text fields
	private JTextField mlTxt = new JTextField("", 0);
	private JTextField ozTxt = new JTextField("", 10);
	private JTextField resTxt = new JTextField("", 10);

	/**
	 * creates the panel necessary to display information
	 * 
	 * @param pan
	 */
	public DisplayPanel(Panel pan) {
		this.pan = pan;
		//setBackground(Color.cyan);
		setLayout(new GridLayout(2, 3));
		resTxt.setBackground(new Color(255, 255, 153));
		resTxt.setEditable(false);
		add(leftLabel);
		//leftLabel.setFont(new Font ("Georgia", Font.PLAIN, 16));
		add(rightLabel);
		add(resLabel);
		add(mlTxt);
		add(ozTxt);
		add(resTxt);

	}

	// handling input
	double getmLTxt() {
		return Double.parseDouble(mlTxt.getText());
	}

	double getoZTxt() {
		return Double.parseDouble(ozTxt.getText());
	}

	void setResLbl(String lable) {
		resLabel.setText(lable);
	}

	void setResultTxt(double num) {
		resTxt.setText(String.valueOf(num));
	}

}
