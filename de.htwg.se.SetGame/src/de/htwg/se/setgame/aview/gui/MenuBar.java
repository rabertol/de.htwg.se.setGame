package de.htwg.se.setgame.aview.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author raina
 *
 */
public class MenuBar extends JMenuBar implements ActionListener {
	
	private static final long serialVersionUID = 1L;
    private JMenuItem mHelp, mExit, mNewGame, mSaveGame, mLoadGame, kiEasy, kiMedium,kiHard;

    public MenuBar() {
		
		JMenu menu = new JMenu("Game");
		mHelp = new JMenuItem("Help");
		mHelp.addActionListener(this);
		mExit = new JMenuItem("Exit");
		mExit.addActionListener(this);
		mNewGame = new JMenuItem("New Game");
		mNewGame.addActionListener(this);
		mSaveGame = new JMenuItem("Save Game");
		mSaveGame.addActionListener(this);
		mLoadGame = new JMenuItem("Load Game");
        mLoadGame.addActionListener(this);
        kiEasy = new JMenuItem("Easy");
        kiEasy.addActionListener(this);
        kiHard = new JMenuItem("Hard");
        kiHard.addActionListener(this);
        kiMedium = new JMenuItem("Medium");
        kiMedium.addActionListener(this);


        menu.add(mNewGame);
		menu.add(mSaveGame);
		menu.add(mLoadGame);
        menu.add(kiEasy);
        menu.add(kiMedium);
        menu.add(kiHard);
        menu.add(mHelp);
		menu.add(mExit);
		this.add(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	        if(e.getSource() == mHelp){
	        	JOptionPane.showConfirmDialog(null, ""
	        			+ "The SET game is a puzzle that uses cards\n"
	        			+ "which have 4 features on them:\n"
	        			+ "COLORS, SYMBOLS, SHADINGS\n"
	        			+ "and the NUMBER of symbols.\n\n"
	        			+ "The COLOR can be\n"
	        			+ "RED, GREEN or PURPLE...\n\n"
	        			+ "... the SYMBOLS can be\n"
	        			+ "SQUIGGLES, DIAMONDS or OVALS...\n\n"
	        			+ "...the SHADING can be\n"
	        			+ "SOLID, STRIPED or QUOLINED...\n\n"
	        			+ "...and for NUMBER, each card has either\n"
	        			+ "ONE, TWO or THREE symbols on it.\n\n"
	        			+ "There is only one rule to make a SET.\n\n"
	        			+ "A SET is 3 cards in which each individual feature is\n"
	        			+ "either all the SAME on each card...\n"
	        			+ "...or all DIFFEREN on each card.\n\n"
	        			+ "Have fun!", "Close", JOptionPane.CLOSED_OPTION);
	        }else if ( e.getSource() == mExit ){
	        	exit();
	        }else if ( e.getSource() == mSaveGame ){
	        	saveGame();
	        }else if ( e.getSource() == mLoadGame ){
	        	loadGame();
            } else if (e.getSource() == kiEasy) {
                kiEasyWay();

            } else if (e.getSource() == kiHard) {
                kiHardWay();
            }else if (e.getSource() == kiMedium) {
                kiMediumWay();
            } else {
                if ( JOptionPane.showConfirmDialog(null,
	        			"Really start a new Game?", "Choice", JOptionPane.YES_NO_OPTION) == 0) {
	        		newGame();
	        	}
	    }
		
	}

    private void kiMediumWay() {
        GUI.getController().setKIPlayer("Medium");
    }

    private void kiHardWay() {
        GUI.getController().setKIPlayer("Hard");

    }

    private void kiEasyWay() {
        GUI.getController().setKIPlayer("Easy");


    }

    public void saveGame() {
		String uid = GUI.getController().saveGame(1);
        JOptionPane.showMessageDialog(null, "Your game is saved under:\n\n" + uid + "\n\nIf you want to continue your game you will need this key.");
	}

	public void loadGame() {
		String uid = (String) JOptionPane.showInputDialog(null, "Game token:");
		if ((uid != null) && (uid.length() > 0)) {
		    int result = GUI.getController().loadGame(uid);
		    if (result < 0) {
		    	JOptionPane.showMessageDialog(null, "No game found under this token.");
		    }
		}
	}
	
	public void exit() {
		if(GUI.getController().getPlayerOnePoints() > GUI.getController().getPlayerTwoPoints()) {
    		playerOneWin();
    	} else if (GUI.getController().getPlayerOnePoints() < GUI.getController().getPlayerTwoPoints()) {
    		playerTwoWin();
    	} else {
    		noOneWin();
    	}
    	
    	GUI.getController().newGame();
    	
    	if(JOptionPane.showConfirmDialog(null,"Really finish the game?",
                    "Close",JOptionPane.YES_NO_OPTION) == 0){
    		System.exit(0);
    	}
	}
	
	public void newGame() {
		if(GUI.getController().getPlayerOnePoints() > GUI.getController().getPlayerTwoPoints()) {
    		playerOneWin();
    	} else if (GUI.getController().getPlayerOnePoints() < GUI.getController().getPlayerTwoPoints()) {
    		playerTwoWin();
    	} else {
    		noOneWin();
    	}
		
		GUI.getController().newGame();
	}
	
	public void playerOneWin() {
		JOptionPane.showConfirmDialog(null, "Player1 wins!", "Winner", JOptionPane.CLOSED_OPTION);
	}
	
	public void playerTwoWin() {
		JOptionPane.showConfirmDialog(null, "Player2 wins!", "Winner", JOptionPane.CLOSED_OPTION);
	}
	
	public void noOneWin() {
		JOptionPane.showConfirmDialog(null, "Dead heat!", "Fail", JOptionPane.CLOSED_OPTION);
	}

}
