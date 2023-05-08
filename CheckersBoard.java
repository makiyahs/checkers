

import javax.swing.*;


public class CheckersBoard extends JFrame{

  
	private static final long serialVersionUID = 1L;
	
	CheckerPanel p;

  //makes the checker board 
	public CheckersBoard(){

    // sets the size of the entire board 
		this.setSize(866,720);
		p = new CheckerPanel();
		this.add(p);
    //allows you to exit the application
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
		
	}

	
}
