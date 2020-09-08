//********************************************************************
// LightBulbPanel.java Java Foundations
//
// Represents the image for the LightBulb program.
//********************************************************************
import javax.swing.*;
import java.awt.*;
public class LightBulbPanel extends JPanel{
	private boolean on;
	private ImageIcon lightOn, lightOff;
	private JLabel imageLabel;
	//-----------------------------------------------------------------
	// Constructor: Sets up the images and the initial state.
	//-----------------------------------------------------------------
	public LightBulbPanel(){
		lightOn = new ImageIcon("downloads/lightBulbOn.jpg");
		lightOff = new ImageIcon("downloads/lightBulbOff.jpg");
		setBackground(Color.black);
		on = true;
		imageLabel = new JLabel(lightOff);
		add(imageLabel);
	}
	//-----------------------------------------------------------------
	//Paints the panel using the appropriate image.
	//-----------------------------------------------------------------
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		if (on)
			imageLabel.setIcon(lightOn);
		else
			imageLabel.setIcon(lightOff);
	}
	//-----------------------------------------------------------------
	//Sets the status of the light bulb.
	//-----------------------------------------------------------------
	public void setOn(boolean lightBulbOn){
		on = lightBulbOn;
	}
}
