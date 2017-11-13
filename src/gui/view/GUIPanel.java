package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Used to add all components to the screen and install a layoumanager.
	 * Also set color :d
	 */
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(appLayout);
		this.add(firstButton);
	}
	
	/**
	 * Used to hold the positioning for the layout.
	 * Place to put all the random constraint app layout messages.
	 */
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 115, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, -328, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, 172, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, -111, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
