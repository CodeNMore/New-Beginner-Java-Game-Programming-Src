package dev.codenmore.gametutorial.display;

import javax.swing.JFrame;

public class Display {

	private String title;
	private int width, height;
	
	private JFrame frame;
	
	public Display(int width, int height, String title){
		this.width = width;
		this.height = height;
		this.title = title;
		
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
