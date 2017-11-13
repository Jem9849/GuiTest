package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIAppController appController)
	{
		super();
		
		this.appController = appController; 
		this.appPanel = new GUIPanel(appController);
		
		setupFrame();
	}
		
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Window title will go here.");
		this.setSize(500, 500);
		// this.setResizable(false);
		this.setVisible(true);
	}
}
