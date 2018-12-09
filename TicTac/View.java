import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;

public  class View extends JFrame{
	
	
	JButton buttons [] = new JButton [9];
	
	public View (){
		setLayout(new GridLayout(3,3));

		
		}
	
	public void initialize (ActionListener a ){
		for (int i=0;i < 9 ;i++){
			buttons[i] = new JButton();
			buttons[i].setText("");
			buttons[i].addActionListener(a);
			add(buttons[i]);
		}
	}
	
	public void reset(){
		for (int i=0; i <9 ; i++){
			buttons[i].setText("");
		}
	} 
	
}
