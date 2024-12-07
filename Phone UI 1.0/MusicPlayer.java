import java.awt.Color;

import javax.swing.*;
class MusicPlayer {
	public MusicPlayer() {
	    ImageIcon musicIcon = new ImageIcon("musicplayer.png");
	    JFrame musicframe = new JFrame();
	    JPanel musicpanel = new JPanel();
	    
	    musicpanel.setBounds(0,0,290,450);
	    musicpanel.setBackground(Color.cyan);
	    
	    musicframe.setSize(300,460);
	    musicframe.setVisible(true);
	    musicframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    musicframe.setResizable(false);
        musicframe.add(musicpanel);	    
	}

	public static void main(String[] args) {
		new MusicPlayer();
	}
}
