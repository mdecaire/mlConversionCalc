
//NiceFrame.java
import java.awt.Color;

import javax.swing.*;
public class OutSideFrame extends JFrame {
 public final static int WID= 250;
 public final static int HEI= 400;
 
 public OutSideFrame() {
	 super ("Ml to Oz conversion");
	 reSetFrame(WID, HEI);
 }
 public OutSideFrame(String title) {
	 super(title);
	 reSetFrame(WID, HEI);
 }
 private void reSetFrame(int wid2, int hei2) {
	setSize(wid2, hei2);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
}
public OutSideFrame(String title, int width, int height) {
	 super(title);
	 reSetFrame(width, height);
 }
 public void display() {
	 setVisible(true);
 }
 
}