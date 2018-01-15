import java.awt.Color;

public class AppDriver extends OutSideFrame {

	AppDriver(){
		super("Ml to Oz converter", 500,200);
		add(new Panel());
		setBackground(Color.YELLOW);
	}
	
	public static void main(String[] args) {
		AppDriver con = new AppDriver();
		con.display();
	}

}
