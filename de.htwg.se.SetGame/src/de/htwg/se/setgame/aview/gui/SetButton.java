package de.htwg.se.setgame.aview.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.htwg.se.setgame.controller.IController;
import de.htwg.se.setgame.controller.impl.SetController;

public class SetButton extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton setbutton;
	
	private IController controller = new SetController();
	private final int zero = 0;
	private final int one = 1;
	
    private JTextField player1;
    private JTextField player2;
	
	
	public SetButton(final IController controller) {
		this.controller = controller;
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,1));
         
        JLabel p1 = new JLabel(" Player 1 ");
        JLabel p2 = new JLabel(" Player 2 ");
        player1 = new JTextField("0", 5 );
        player2 = new JTextField("0", 5 );
        player1.setEditable(false);
        player2.setEditable(false);
		
		
        setbutton = new JButton("SET");
        setbutton.addActionListener(this);
        panel1.add(setbutton);
    
        
        panel2.setLayout(new GridLayout(1,4));
        panel2.add(p1);
        panel2.add(player1);
        panel2.add(p2);
        panel2.add(player2);

        mainPanel.add(panel1);
        mainPanel.add(panel2);
        this.add(mainPanel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == setbutton) {
			Choice();
		} 
		
		Integer play1 = new Integer(controller.geTplayerOnePoints());
		player1.setText(play1.toString());
		Integer play2 = new Integer(controller.geTplayerTwoPoints());
		player2.setText(play2.toString());
		
	}
	
	public void Choice() {
		
			Object[] options = {"Player1", "Player2"};
	 
	        	int selected = JOptionPane.showOptionDialog(null,
	        			"Which Player?", "Choice",JOptionPane.DEFAULT_OPTION, 
	        			JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	        	if(selected == zero) {
	                	//TODO: Step 1
	            } else if (selected == one) {
	            		//TODO: Step 2
	            }	
	}
	

}