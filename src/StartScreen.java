import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class StartScreen extends JFrame {

	public static void main(String[] args) {
			 
		EventQueue.invokeLater(new Runnable() {
			@Override
			
			public void run(){

				StartScreen buttons = new StartScreen();
				
				buttons.setVisible(true);
				
			}
		});

	}
	
	public StartScreen(){
		
		initUI();
	}
	
	
	private void initUI(){
		Container pane = getContentPane();
		//JPanel paneTwo = (JPanel) getContentPane();
		GroupLayout layout = new GroupLayout(pane);
		pane.setLayout(layout);
		//paneTwo.setToolTipText("Content paneTwo");
		
		JButton quitButton = new JButton("Quit");
		quitButton.setBounds(200, 120, 100, 30);
		 
		
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
			
		});
		
		JButton startButton = new JButton("Start new game");
		startButton.setBounds(175, 60, 150,30);
	
		
		 add(quitButton);
		 add(startButton);
		
		pack();
		setTitle("Start screen");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	

	}
}