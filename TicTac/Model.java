import javax.swing.*;
import java.awt.event.ActionListener;

public class Model {
	
		JButton buttons [] = new JButton [9];
		
	public Model(JButton buttons []){
		this.buttons = buttons ;
		}
	
	public boolean checkWon(){
		if (checkAdjacent(0,1) && checkAdjacent(1,2))
			return true;
		else if (checkAdjacent(3,4) && checkAdjacent(4,5))
			return true;
		else if (checkAdjacent(6,7) && checkAdjacent(7,8))
			return true;
		
		else if (checkAdjacent(0,3) && checkAdjacent(3,6))
			return true;
		else if (checkAdjacent(1,4) && checkAdjacent(4,7))
			return true;
		else if (checkAdjacent(2,5) && checkAdjacent(2,8))
			return true;
		
		else if ( checkAdjacent(0,4) && checkAdjacent(4,8))
             return true;  
        else if ( checkAdjacent(2,4) && checkAdjacent(4,6))
             return true;
        else 
             return false;
	}
	
	 public boolean checkAdjacent(int a, int b)
        {
            if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") )
                return true;
            else
                return false;
        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
