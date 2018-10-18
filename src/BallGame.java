import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	void launchFrame(){
        setSize(300,300);
        setLocation(400,400);
        setVisible(true);
	}
	
	public static void main(String[] args){
		System.out.println("Œ“ «");
		BallGame game =  new BallGame();
		game.launchFrame();
	}
}