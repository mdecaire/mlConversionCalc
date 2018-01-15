import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BtnPanel extends JPanel {
	private Panel secPan;
	private Conversions operation;

	// adds buttons
	private JButton mlBtn = new JButton("mL to oz");
	private JButton ozBtn = new JButton("oz to mL");

	/**
	 * creates buttons on panel
	 * 
	 * @param secPan1
	 */
	public BtnPanel(Panel secPan) {
		this.secPan = secPan;
		setLayout(new FlowLayout(FlowLayout.CENTER));
		mlBtn.setToolTipText("Converts to oz");
		ozBtn.setToolTipText("Converts to ml");
		add(mlBtn);
		add(ozBtn);

		// action event for mlBtn
		mlBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setResLbl("Volume in Ounces");
				operation = new MltoOz();
				btnOperator(mlBtn);
			}
		});

		// action event for ozBtn
		ozBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setResLbl("Volume in Milliliter");
				operation = new OztoMl();
				btnOperator(ozBtn);
			}
		});

	}
	public void setResLbl(String label) {
		secPan.disp.setResLbl(label);
	}
	public void btnOperator(JButton btn) {
	      if(btn.equals(mlBtn)){
	    	  double mlConversion = secPan.disp.getmLTxt();
	    	  secPan.disp.setResultTxt(operation.convert(mlConversion));
	      }
	      else if (btn.equals(ozBtn)){
	    	  double ozConversion = secPan.disp.getoZTxt();
	    	  secPan.disp.setResultTxt(operation.convert(ozConversion));
	    	  
	      }
	   }

	

}
