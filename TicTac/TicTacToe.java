import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TicTacToe {
	
	public static void main(String[] args) 
    {
		View ticView = new View();
        Model ticModel= new Model(ticView.buttons);
        Controller ticController=new Controller(ticModel, ticView);
		
		ticView.setTitle("Tic Toc Toe");
        ticView.initialize(ticController);
        ticView.setSize(300,300);
        ticView.setLocationRelativeTo(null);
        ticView.setVisible(true);
        ticView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	
	
	}
