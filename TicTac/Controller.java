import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Controller implements ActionListener{
		
		private static int alternate=0,count =0;
		Model model ;View view ;
		
		public Controller(Model model,View view){
			this.view=view;
			this.model=model;
			
			}
		
		public void actionPerformed(ActionEvent e){
			int choice;
			
			JButton buttonClicked = (JButton)e.getSource();
			
			if ("".equals(buttonClicked.getText())){
				if(alternate%2 == 0){
					buttonClicked.setText("1");
					count++;
				}
				else{ 
					buttonClicked.setText("2");
					count++;
								}
				if(model.checkWon()==true){
					if(alternate%2 == 0)
					choice = JOptionPane.showOptionDialog(null,"Player 1 Won.\nRestart the game?","Player 1 Won",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null, null, null);
					else 
					choice = JOptionPane.showOptionDialog(null,"Player 2 Won.\nRestart the game?","Player 2 Won",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null, null, null);
					count=0;
					alternate=0;
					
					if(choice == JOptionPane.YES_OPTION) view.reset();
					if(choice == JOptionPane.NO_OPTION) System.exit(0) ;
					
				}
				else if (count==9){
				choice = JOptionPane.showOptionDialog(null,"Game is Draw.\nRestart the game?","Game is Draw",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null, null, null);
				count=0;
				alternate=0;
				if(choice == JOptionPane.YES_OPTION) view.reset();
				if(choice == JOptionPane.NO_OPTION) System.exit(0) ;
			    }
			    
			    
			    alternate++;	
			}
		} 
	}
