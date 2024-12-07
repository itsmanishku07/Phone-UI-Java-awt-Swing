import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.IOException;

class MyPhone extends JFrame implements ActionListener
{
    ImageIcon windows = new ImageIcon("windows.png");
    ImageIcon vscode = new ImageIcon("vscode.png");
    ImageIcon android = new ImageIcon("android.png");
    ImageIcon java = new ImageIcon("java.png");
    ImageIcon python = new ImageIcon("python.png");
    ImageIcon linux = new ImageIcon("linux.png");
    ImageIcon chorme = new ImageIcon("chrome.png");
    ImageIcon home = new ImageIcon("home.png");
    ImageIcon IntelliJ = new ImageIcon("intellij.png");
    ImageIcon c = new ImageIcon("c.png");
    ImageIcon apple = new ImageIcon("apple.png");
    ImageIcon musicapk = new ImageIcon("musicapk.png");
    ImageIcon tictaci = new ImageIcon("tictac.png");
    ImageIcon callapki = new ImageIcon("callapkic.png");
    ImageIcon appsic = new ImageIcon("appic.png");
    ImageIcon calcic = new ImageIcon("calc.png");
    ImageIcon homeicon = new ImageIcon("homeic.png");
    ImageIcon settingicon = new ImageIcon("settingicon.png");
    ImageIcon settingicon60 = new ImageIcon("settingic60.png");
    JButton settings = new JButton();
    
    static JFrame frame = new JFrame();
    static JPanel screen = new JPanel();
    JButton btn1 = new JButton();
    JButton btnH = new JButton();
    JButton btn3 = new JButton();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel apps = new JLabel();
    JLabel appH = new JLabel();
    JLabel clock = new JLabel();
    JLabel date = new JLabel();
    JPanel appT = new JPanel();
    JPanel appI = new JPanel();
    JLabel applist = new JLabel();
    static JPanel homep = new JPanel();
    static JLabel homeic = new JLabel();
    static JPanel homesettingiconpanel = new JPanel();
    JButton butt1 = new JButton();
    JButton butt2 = new JButton();
    JButton butt3 = new JButton();
    JButton butt4 = new JButton();
    Desktop desk = Desktop.getDesktop();
    JButton[] ic1 = new JButton[15];

    MyPhone()
    {
    	
    	settings.setIcon(settingicon);
    	settings.setBorder(null);
    	settings.setContentAreaFilled(false);
    	settings.addActionListener(this);
    	
    	homesettingiconpanel.setBounds(210,40,40,40);
    	homesettingiconpanel.setBackground(Color.white);
    	homesettingiconpanel.add(settings);
    	
        butt1.setIcon(musicapk);
        butt1.addActionListener(this);
        butt1.setBorder(null);
        butt1.setContentAreaFilled(false);
        butt1.addActionListener(this);;
        
        butt2.setIcon(tictaci);
        butt2.addActionListener(this);
        butt2.setContentAreaFilled(false);
        butt2.setBorder(null);
        butt2.addActionListener(this);;
        
        butt3.setIcon(callapki);
        butt3.addActionListener(this);
        butt3.setContentAreaFilled(false);
        butt3.setBorder(null);
        butt3.addActionListener(this);;
        
        butt4.setIcon(calcic);
        butt4.addActionListener(this);
        butt4.setContentAreaFilled(false);
        butt4.setBorder(null);
        butt4.addActionListener(this);;
 

        applist.setText("My Apps");
        applist.setSize(300,100);
        applist.setForeground(Color.BLUE);
        applist.setFont(new Font("Mv Boli",Font.BOLD,20));

        JLabel ic = new JLabel();
        ic.setIcon(android);


        appT.setBackground(Color.lightGray);
        appT.setBounds(7,10,270,40);
        appT.setVisible(false);
        appT.add(applist);


        homeic.setIcon(home);
  
        homep.setBounds(87,130,100,100);
        homep.setBackground(Color.WHITE);
        homep.add(homeic);
        
        appI.setBackground(Color.PINK);
        appI.setBounds(7,50,270,300);
        appI.setLayout(new GridLayout(4,3));
        appI.setVisible(false);


        for(int i = 0; i < 15; i++)
        {
            ic1[i] = new JButton();
            appI.add(ic1[i]);
            ic1[i].setBorder(null);
            ic1[i].setContentAreaFilled(false);
            ic1[i].addActionListener(this);
        }

        ic1[0].setIcon(callapki);
        ic1[1].setIcon(calcic);
        ic1[2].setIcon(tictaci);
        ic1[3].setIcon(musicapk);
        ic1[4].setIcon(settingicon60);

        DateFormat dt = new SimpleDateFormat("hh:mm");
        String time = dt.format(new Date());
        DateFormat ddt = new SimpleDateFormat("dd/MM/yyyy");
        String datee = ddt.format(new Date());

        btn1.setIcon(appsic);
        btn1.setBorder(null);
        btn1.setContentAreaFilled(false);
        btn1.setSize(150,40);
        btn1.addActionListener(this);
        btn1.setFont(new Font("MV BOLI",Font.BOLD,30));
        btn1.setBackground(Color.CYAN);

        btnH.setIcon(homeicon);
        btnH.setBorder(null);
        btnH.setContentAreaFilled(false);
        btnH.setSize(100,40);
        btnH.addActionListener(this);
        btnH.setFont(new Font("MV BOLI",Font.BOLD,15));

        apps.setBounds(10,300,150,60);
        apps.add(btn1);

        appH.setBounds(175,300,175,60);
        appH.add(btnH);


        clock.setText(String.valueOf(time));
        clock.setForeground(new Color(0x1234));
        clock.setFont(new Font("Mv Boli",Font.BOLD,30));
        clock.setBounds(10,0,300,100);
        clock.setVisible(true);

        date.setText(String.valueOf(datee));
        date.setForeground(Color.red);
        date.setFont(new Font("Mv Boli",Font.BOLD,15));
        date.setBounds(10,30,300,100);
        date.setVisible(true);


        label1.setIcon(vscode);
        label2.setIcon(android);
        label4.setIcon(windows);
        label5.setIcon(chorme);
        label3.setIcon(IntelliJ);

        screen.setBackground(Color.WHITE);
        screen.setBounds(0,360,300,65);
        screen.setBackground(Color.LIGHT_GRAY);
        screen.add(btn1);
        screen.add(butt3);
        screen.add(btnH);


        frame.setSize(300,460);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setTitle("Phone");
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.add(homesettingiconpanel);
        frame.add(clock);
        frame.add(date);
        frame.add(homep);
        frame.add(appT);
        frame.add(appI);
        frame.add(apps);
        frame.add(screen);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1)
        {
            System.out.println("Apps List");
            appT.setVisible(true);
            appI.setVisible(true);
            homep.setVisible(false);
            clock.setVisible(false);
            date.setVisible(false);
            homesettingiconpanel.setVisible(false);
        }
        if(e.getSource() == btnH)
        {
            System.out.println("Home");
            appT.setVisible(false);
            homep.setVisible(true);
            appI.setVisible(false);
            clock.setVisible(true);
            homesettingiconpanel.setVisible(true);
            date.setVisible(true);
        }
        if(e.getSource() == butt1)
        {
        	System.out.println("Music");
        	Music_Player musicapp = new Music_Player();
        }
        if(e.getSource() == butt2)
        {
        	System.out.println("TicTacToe");
            TicTacToe ticTacToe = new TicTacToe();
        }
        if(e.getSource() == butt3)
        {
        	Callapk callapk = new Callapk();
            System.out.println("Call Dialer");
        }
        if(e.getSource() == butt4)
        {
        	System.out.println("Calculator");
            new Calculator();
        }
        if(e.getSource() == settings)
        {
        	System.out.println("Settings");
        	new Settings();
        }
        if(e.getSource() == ic1[0])
        {
            new Callapk();
            System.out.println("Call");
        }
        if(e.getSource() == ic1[1])
        {
            new Calculator();
            System.out.println("Calculator");
        }
        if(e.getSource() == ic1[2])
        {
            new TicTacToe();
            System.out.println("TicTacToe");
        }
        if(e.getSource() == ic1[3])
        {
            new Music_Player();
            System.out.println("Music Player");
        }
        if(e.getSource() == ic1[4])
        {
            new Settings();
            System.out.println("Settings");
        }


    }
}
    
class Music_Player extends JFrame implements ActionListener{
    ImageIcon musicicon = new ImageIcon("musicplayer.png");
    ImageIcon play = new ImageIcon("play.png");
    ImageIcon next = new ImageIcon("next.png");
    ImageIcon prev = new ImageIcon("prev.png");
    ImageIcon pause = new ImageIcon("pause.png");
    JFrame musicframe = new JFrame();
    JPanel musicpanel = new JPanel();
    JLabel musicic = new JLabel();
    JPanel playpanel = new JPanel();
    JButton playb = new JButton();
    JButton nextb = new JButton();
    JButton prevb = new JButton();
    JButton pauseb = new JButton();
    JButton musicplayerexit = new JButton("X");
	public Music_Player()
    {
        playb.setIcon(play);
        playb.setBorder(null);
        playb.setContentAreaFilled(false);
        playb.addActionListener(this);
        nextb.setIcon(next);
        nextb.setBorder(null);
        nextb.setContentAreaFilled(false);
        nextb.addActionListener(this);
        prevb.setIcon(prev);
        prevb.setBorder(null);
        prevb.setContentAreaFilled(false);
        prevb.addActionListener(this);
        pauseb.setIcon(pause);
        pauseb.setBorder(null);
        pauseb.setContentAreaFilled(false);
        pauseb.addActionListener(this);
        pauseb.setVisible(false);

        musicplayerexit.setBounds(195, 0, 90,34);
        musicplayerexit.setFont(new Font("Mv Boli",Font.BOLD, 20));
        musicplayerexit.setContentAreaFilled(false);
        musicplayerexit.setForeground(Color.RED);
        musicplayerexit.setBorder(null);
        musicplayerexit.addActionListener(this);

        playpanel.setBounds(0,300,290,100);
        playpanel.add(prevb);
        playpanel.add(playb);
        playpanel.add(pauseb);
        playpanel.add(nextb);

	    musicic.setIcon(musicicon);
        //musicic.setBackground(Color.ORANGE);
        //musicic.setOpaque(true);
	    
	    musicpanel.setBounds(0,0,290,200);
	    //musicpanel.setBackground(Color.cyan);
	    musicpanel.add(musicic);

	    musicframe.setSize(300,460);
	    musicframe.setVisible(true);
        musicframe.setLayout(null);
        musicframe.setTitle("Our Music");
	    musicframe.setDefaultCloseOperation(musicframe.DO_NOTHING_ON_CLOSE);
	    musicframe.setResizable(false);
        musicframe.add(musicplayerexit);
        musicframe.add(musicpanel);
        musicframe.add(playpanel);
	}
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == playb)
        {
           pauseb.setVisible(true);
           playb.setVisible(false);
           System.out.println("Pause");
           File file = new File("music.mp3");
   		   Desktop desk = Desktop.getDesktop();
   		   try {
			desk.open(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        }
        if(e.getSource() == pauseb)
        {
            playb.setVisible(true);
            pauseb.setVisible(false);
            System.out.println("Play");
        }
        if(e.getSource() == nextb)
        {
            System.out.println("Next Music");
        }
        if(e.getSource() == prevb)
        {
            System.out.println("Previous Music");
        }
        if(e.getSource() == musicplayerexit)
        {
            musicframe.setVisible(false);
        }
    }
}

class TicTacToe extends JFrame implements ActionListener
{
    JFrame ticframe = new JFrame();
    JPanel ticpanel = new JPanel();
    JButton[] ticbtn = new JButton[9];
    JPanel toppanel = new JPanel();
    JLabel toplabel = new JLabel();
    JLabel bottomlabel = new JLabel();
    JPanel bottompanel = new JPanel();
    ImageIcon x = new ImageIcon("x.png");
    ImageIcon o = new ImageIcon("o.png");
    boolean turn = true;
    JButton ticexit = new JButton("X");
    JButton replay = new JButton("  Replay");
    JPanel replaypanel = new JPanel();

    TicTacToe()
    {
    	replay.setFont(new Font("Mv Boli",Font.BOLD, 20));
    	replay.setBorder(null);
    	replay.setContentAreaFilled(false);
    	replay.setForeground(Color.WHITE);
    	replay.addActionListener(this);
        toplabel.setText("Hello! Welcome");
        toplabel.setFont(new Font("Mv Boli",Font.BOLD,15));
        toplabel.setForeground(Color.BLACK);
        
        ticexit.setBounds(205, 0, 80,34);
        ticexit.setFont(new Font("Mv Boli",Font.BOLD, 20));
        ticexit.setContentAreaFilled(true);
        ticexit.setBackground(new Color(175,125,116));
        ticexit.setForeground(Color.RED);
        ticexit.addActionListener(this);
        ticexit.setBorder(null);

        bottomlabel.setText("X turn");
        bottomlabel.setFont(new Font("Mv Boli",Font.BOLD, 20));
        bottomlabel.setForeground(Color.WHITE);
        
        toppanel.setBackground(new Color(113,123,129));
        toppanel.setBounds(0,0,205,34);
        toppanel.setOpaque(true);
        toppanel.add(toplabel);
        
        replaypanel.setBounds(0,380,100,50);
        replaypanel.setLayout(new FlowLayout());
        replaypanel.setBackground(new Color(24,65,56));
        replaypanel.setOpaque(true);
        replaypanel.add(replay);

        bottompanel.setBackground(new Color(24,65,56));
        bottompanel.setBounds(100,380,200,50);
        bottompanel.setOpaque(true);
        bottompanel.add(bottomlabel);

        ticpanel.setBounds(0,32,300,350);
        ticpanel.setLayout(new GridLayout(3,3));

        for(int i = 0; i < 9; i++)
        {
            ticbtn[i] = new JButton();
            ticbtn[i].setBackground(Color.lightGray);
            ticpanel.add(ticbtn[i]);
            ticbtn[i].addActionListener(this);
        }


        ticframe.setSize(300,460);
        ticframe.setVisible(true);
        ticframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ticframe.setLayout(null);
        ticframe.setTitle("TicTacToe");
        ticframe.add(toppanel);
        ticframe.add(ticexit);
        ticframe.add(ticpanel);
        ticframe.add(replaypanel);
        ticframe.add(bottompanel);
       
    }
    public void cheak() {
        if ((ticbtn[0].getText() == "x") &&
                (ticbtn[1].getText() == "x") &&
                (ticbtn[2].getText() == "x")) {
            xWin(0, 1, 2);
        }

        if ((ticbtn[3].getText() == "x") &&
                (ticbtn[4].getText() == "x") &&
                (ticbtn[5].getText() == "x")) {
            xWin(3, 4, 5);
        }

        if ((ticbtn[6].getText() == "x") &&
                (ticbtn[7].getText() == "x") &&
                (ticbtn[8].getText() == "x")) {
            xWin(6, 7, 8);
        }

        if ((ticbtn[0].getText() == "x") &&
                (ticbtn[3].getText() == "x") &&
                (ticbtn[6].getText() == "x")) {
            xWin(0, 3, 6);
        }

        if ((ticbtn[1].getText() == "x") &&
                (ticbtn[4].getText() == "x") &&
                (ticbtn[7].getText() == "x")) {
            xWin(1, 4, 7);
        }

        if ((ticbtn[2].getText() == "x") &&
                (ticbtn[5].getText() == "x") &&
                (ticbtn[8].getText() == "x")) {
            xWin(2, 5, 8);
        }

        if ((ticbtn[0].getText() == "x") &&
                (ticbtn[4].getText() == "x") &&
                (ticbtn[8].getText() == "x")) {
            xWin(0, 4, 8);
        }

        if ((ticbtn[2].getText() == "x") &&
                (ticbtn[4].getText() == "x") &&
                (ticbtn[6].getText() == "x")) {
            xWin(2, 4, 6);
        }

        //

        if ((ticbtn[0].getText() == "o") &&
                (ticbtn[1].getText() == "o") &&
                (ticbtn[2].getText() == "o")) {
            oWin(0, 1, 2);
        }

        if ((ticbtn[3].getText() == "o") &&
                (ticbtn[4].getText() == "o") &&
                (ticbtn[5].getText() == "o")) {
            oWin(3, 4, 5);
        }

        if ((ticbtn[6].getText() == "o") &&
                (ticbtn[7].getText() == "o") &&
                (ticbtn[8].getText() == "o")) {
            oWin(6, 7, 8);
        }

        if ((ticbtn[0].getText() == "o") &&
                (ticbtn[3].getText() == "o") &&
                (ticbtn[6].getText() == "o")) {
            oWin(0, 3, 6);
        }

        if ((ticbtn[1].getText() == "o") &&
                (ticbtn[4].getText() == "o") &&
                (ticbtn[7].getText() == "o")) {
            oWin(1, 4, 7);
        }

        if ((ticbtn[2].getText() == "o") &&
                (ticbtn[5].getText() == "o") &&
                (ticbtn[8].getText() == "o")) {
            oWin(2, 5, 8);
        }

        if ((ticbtn[0].getText() == "o") &&
                (ticbtn[4].getText() == "o") &&
                (ticbtn[8].getText() == "o")) {
            oWin(0, 4, 8);
        }

        if ((ticbtn[2].getText() == "o") &&
                (ticbtn[4].getText() == "o") &&
                (ticbtn[6].getText() == "o")) {
            oWin(2, 4, 6);
        }
    
    }

    public void xWin(int a, int b, int c) {
        ticbtn[a].setBackground(new Color(158,137,34));
        ticbtn[b].setBackground(new Color(158,137,34));
        ticbtn[c].setBackground(new Color(158,137,34));

        for(int i = 0; i < 9; i++)
        {

        }
        bottomlabel.setText("Yes! X Won");

    }

    public void oWin(int a, int b, int c) {

        ticbtn[a].setBackground(new Color(131,28,138));
        ticbtn[b].setBackground(new Color(131,28,138));
        ticbtn[c].setBackground(new Color(131,28,138));

        for(int i = 0; i < 9; i++)
        {

        }
        bottomlabel.setText("Yes! O Won");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == ticbtn[i]) {
                if (turn == true) {
                    if (ticbtn[i].getText() == "")
                    {
                        ticbtn[i].setText("x");
                        ticbtn[i].setIcon(x);
                        ticbtn[i].setFont(new Font("MV Boli",Font.BOLD,0));
                        turn = false;
                        bottomlabel.setText("O Turn");
                        cheak();
                    }
                }
                else {
                    if (ticbtn[i].getText() == "") {
                        ticbtn[i].setIcon(o);
                        ticbtn[i].setForeground(new Color(255, 0, 0));
                        ticbtn[i].setText("o");
                        ticbtn[i].setIcon(o);
                        ticbtn[i].setFont(new Font("MV Boli",Font.BOLD,0));
                        turn = true;
                        bottomlabel.setText("X Turn");
                        cheak();
                    }

                }
            }
            if(e.getSource() == ticexit)
            {
                ticframe.setVisible(false);
            }
            if(e.getSource() == replay)
            {
            	int r1 = ((int)(Math.random()*100));
            	int g1 = ((int)(Math.random()*100));
            	int b1 = ((int)(Math.random()*100));
            	
            	int r2 = ((int)(Math.random()*100));
            	int g2 = ((int)(Math.random()*100));
            	int b2 = ((int)(Math.random()*100));
            	
            	for(int j = 0;j < 9; j++)
            	{
            		ticbtn[j].setText("");
            		ticbtn[j].setIcon(null);
            		bottomlabel.setText("X Turn");
            		ticbtn[j].setBackground(new Color(r1+r2,g1+g2,b1+b2));
            	}
            }
        }
    }
}

class Callapk extends JFrame implements ActionListener
{
	JFrame callframe = new JFrame();
	JFrame callingframe = new JFrame();
	JButton[] dialbtn = new JButton[12];
	JPanel dialpanel = new JPanel();
	JPanel callingpanelbtn = new JPanel();
	JPanel callingic = new JPanel();
	JLabel callingiclabel = new JLabel();
	JPanel callingnopanel = new JPanel();
	JLabel callingno = new JLabel();
	JButton callbtn = new JButton();
	JLabel callscreen = new JLabel();
	JButton callexit = new JButton("X");
	JButton callend = new JButton("X");
	ImageIcon callbtnicon = new ImageIcon("call.png");
	ImageIcon callingwho = new ImageIcon("callingic.png");
	ImageIcon endcallic = new ImageIcon("endcall.png");
	JButton endcallbtn = new JButton();
	JButton[] callingbtn = new JButton[6];
	JPanel endcallpanel = new JPanel();

    JFrame contactframe = new JFrame();
    JPanel contactpanel = new JPanel();
    JButton[] contactNo = new JButton[10];
    ImageIcon addnewic = new ImageIcon("addnew.png");
    ImageIcon contactic = new ImageIcon("contactic.png");
    JPanel addnewpanel = new JPanel();
    JPanel addpanel = new JPanel();
    JButton addnew = new JButton();
    JTextField inname = new JTextField(15);
    JTextField inno = new JTextField(15);
    JButton submit = new JButton("Submit");
    JPanel haeder = new JPanel();
    JLabel headlabel = new JLabel();
    JButton contbutt = new JButton();
    JPanel conticp = new JPanel();
    JButton contexit = new JButton("X");

	Callapk() {

        contexit.setBounds(195, 0, 90,34);
        contexit.setFont(new Font("Mv Boli",Font.BOLD, 20));
        contexit.setContentAreaFilled(false);
        contexit.setForeground(Color.BLUE);
        contexit.addActionListener(this);
        contexit.setBorder(null);

        contbutt.setIcon(contactic);
        contbutt.addActionListener(this);
        contbutt.setBackground(Color.WHITE);
        contbutt.setContentAreaFilled(false);

        conticp.setBounds(220,355,50,50);
        conticp.add(contbutt);


        endcallbtn.setIcon(endcallic);
        endcallbtn.setBorder(null);
        endcallbtn.setContentAreaFilled(false);
        endcallbtn.addActionListener(this);

        endcallpanel.setBackground(Color.BLACK);
        endcallpanel.setBounds(90, 345, 100, 100);
        endcallpanel.add(endcallbtn);

        callingno.setVerticalAlignment(JLabel.CENTER);
        callingno.setFont(new Font("Mv Boli", Font.BOLD, 16));
        callingno.setBounds(0, 0, 150, 20);
        callingno.setBackground(Color.BLACK);
        callingno.setForeground(Color.white);
        callingno.setOpaque(true);


        callingnopanel.setBounds(65, 115, 150, 20);
        callingnopanel.setBackground(Color.WHITE);
        callingnopanel.add(callingno);
        callingnopanel.setLayout(null);


        callingiclabel.setIcon(callingwho);
        callingiclabel.setBounds(0, 0, 100, 100);
        callingiclabel.setBackground(Color.BLACK);
        callingiclabel.setOpaque(true);

        callingic.setBounds(90, 10, 100, 100);
        callingic.add(callingiclabel);
        callingic.setBackground(Color.BLACK);

        callend.setBounds(195, 0, 90, 34);
        callend.setFont(new Font("Mv Boli", Font.BOLD, 20));
        callend.setContentAreaFilled(false);
        callend.setForeground(Color.RED);
        callend.addActionListener(this);
        callend.setBorder(null);

        callingpanelbtn.setBounds(42, 145, 200, 200);
        callingpanelbtn.setBackground(Color.LIGHT_GRAY);
        callingpanelbtn.setLayout(new GridLayout(2, 3));

        for (int i = 0; i < 6; i++)
        {
            callingbtn[i] = new JButton();
            callingbtn[i].setText("Hey");
            callingpanelbtn.add(callingbtn[i]);
            callingbtn[i].setBorder(null);
            callingbtn[i].setContentAreaFilled(false);
            callingbtn[i].setFont(new Font("Mv Boli", Font.BOLD, 15));
            callingbtn[i].setForeground(Color.BLUE);
            callingbtn[i].addActionListener(this);
        }

        callingbtn[0].setText("Video");
        callingbtn[1].setText("Add Call");
        callingbtn[2].setText("Note");
        callingbtn[3].setText("Mute");
        callingbtn[4].setText("Hold");
        callingbtn[5].setText("Record");


        callingframe.setVisible(false);
        callingframe.setSize(300, 460);
        callingframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        callingframe.setLayout(null);
        callingframe.setTitle("Calling...");
        callingframe.getContentPane().setBackground(Color.black);
        callingframe.add(callend);
        callingframe.add(callingic);
        callingframe.add(callingnopanel);
        callingframe.add(callingpanelbtn);
        callingframe.add(endcallpanel);


        callexit.setBounds(195, 0, 90, 34);
        callexit.setFont(new Font("Mv Boli", Font.BOLD, 20));
        callexit.setContentAreaFilled(false);
        callexit.setForeground(Color.RED);
        callexit.addActionListener(this);
        callexit.setBorder(null);


        callscreen.setBackground(Color.LIGHT_GRAY);
        callscreen.setOpaque(true);
        callscreen.setBounds(0, 0, 300, 100);
        callscreen.setText("+91 ");
        callscreen.setFont(new Font("Mv Boli", Font.BOLD, 30));
        callscreen.setHorizontalAlignment(JLabel.CENTER);

        dialpanel.setBackground(Color.WHITE);
        dialpanel.setBounds(16, 100, 250, 250);
        dialpanel.setLayout(new GridLayout(4, 3));

        callbtn.setIcon(callbtnicon);
        callbtn.setBounds(90, 335, 100, 100);
        callbtn.setBorder(null);
        callbtn.setContentAreaFilled(false);
        callbtn.addActionListener(this);

        for (int i = 0; i < 12; i++) {
            dialbtn[i] = new JButton();
            dialpanel.add(dialbtn[i]);
            dialbtn[i].setBorder(null);
            dialbtn[i].setContentAreaFilled(false);
            dialbtn[i].setFont(new Font("Mv Boli", Font.BOLD, 25));
            dialbtn[i].addActionListener(this);
        }

        dialbtn[0].setText("1");
        dialbtn[1].setText("2");
        dialbtn[2].setText("3");
        dialbtn[3].setText("4");
        dialbtn[4].setText("5");
        dialbtn[5].setText("6");
        dialbtn[6].setText("7");
        dialbtn[7].setText("8");
        dialbtn[8].setText("9");
        dialbtn[9].setText("*");
        dialbtn[10].setText("0");
        dialbtn[11].setText("#");

        callframe.setSize(300, 460);
        callframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        callframe.setVisible(true);
        callframe.setLayout(null);
        callframe.setTitle("Call");
        callframe.add(callexit);
        callframe.add(callscreen);
        callframe.add(dialpanel);
        callframe.add(callbtn);
        callframe.add(conticp);



        headlabel.setBackground(Color.BLACK);
        headlabel.setText("My Contact");
        headlabel.setFont(new Font("Mv Boli", Font.BOLD, 15));

        haeder.setBounds(0, 0, 300, 27);
        haeder.setBackground(Color.WHITE);
        haeder.add(headlabel);


        submit.setBackground(Color.GRAY);
        submit.addActionListener(this);

        addpanel.setBounds(40, 100, 200, 90);
        addpanel.setBackground(Color.orange);
        addpanel.setVisible(false);
        addpanel.add(inname);
        addpanel.add(inno);
        addpanel.add(submit);


        addnew.setIcon(addnewic);
        addnew.addActionListener(this);

        addnewpanel.setBounds(225, 355, 38, 38);
        addnewpanel.setBackground(Color.RED);
        addnewpanel.setLayout(new GridLayout(1, 1));
        addnewpanel.add(addnew);

        //contactpanel.setBackground(new Color());
        contactpanel.setBounds(0, 25, 300, 400);
        contactpanel.setLayout(new GridLayout(9, 2));
        contactpanel.setBackground(Color.ORANGE);

        for (int i = 0; i < 10; i++) {
            contactNo[i] = new JButton();
            contactpanel.add(contactNo[i]);
            contactNo[i].setContentAreaFilled(false);
            contactNo[i].setBorder(null);
            contactNo[i].addActionListener(this);
            contactNo[i].setFont(new Font("Mv Boli", Font.BOLD, 15));
        }

        contactNo[0].setText("Mummy :)");
        contactNo[1].setText("9304*****1");

        contactNo[2].setText("Papa :)");
        contactNo[3].setText("6203*****3");

        contactNo[4].setText("Bhai");
        contactNo[5].setText("6205*****2");

        contactNo[6].setText("Sis :)");
        contactNo[7].setText("7260*****3");

        contactNo[8].setText("UnderStanding :)");
        contactNo[9].setText("9905*****4");


        contactframe.setSize(300, 460);
        contactframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        contactframe.setLayout(null);
        contactframe.setVisible(false);
        contactframe.add(contexit);
        contactframe.add(haeder);
        contactframe.add(addpanel);
        contactframe.setResizable(false);
        contactframe.add(addnewpanel);
        contactframe.add(contactpanel);
    }


	@Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dialbtn[0]) {
            callscreen.setText(callscreen.getText() + "1");
        }
        if (e.getSource() == dialbtn[1]) {
            callscreen.setText(callscreen.getText() + "2");
        }
        if (e.getSource() == dialbtn[2]) {
            callscreen.setText(callscreen.getText() + "3");
        }
        if (e.getSource() == dialbtn[3]) {
            callscreen.setText(callscreen.getText() + "4");
        }
        if (e.getSource() == dialbtn[4]) {
            callscreen.setText(callscreen.getText() + "5");
        }
        if (e.getSource() == dialbtn[5]) {
            callscreen.setText(callscreen.getText() + "6");
        }
        if (e.getSource() == dialbtn[6]) {
            callscreen.setText(callscreen.getText() + "7");
        }
        if (e.getSource() == dialbtn[7]) {
            callscreen.setText(callscreen.getText() + "8");
        }
        if (e.getSource() == dialbtn[8]) {
            callscreen.setText(callscreen.getText() + "9");
        }
        if (e.getSource() == dialbtn[9]) {
            callscreen.setText(callscreen.getText() + "*");
        }
        if (e.getSource() == dialbtn[10]) {
            callscreen.setText(callscreen.getText() + "0");
        }
        if (e.getSource() == dialbtn[11]) {
            callscreen.setText(callscreen.getText() + "#");
        }
        if (e.getSource() == callbtn) {
            System.out.println("Calling... " + callscreen.getText());
            callingframe.setVisible(true);
            callingno.setText(callscreen.getText());
            callingframe.setTitle("Calling " + callscreen.getText());
        }

        if (e.getSource() == callingbtn[0]) {
            System.out.println("Video Call");
        }
        if (e.getSource() == callingbtn[1]) {
            System.out.println("Add Another Call");
        }
        if (e.getSource() == callingbtn[2]) {
            System.out.println("Note");
        }
        if (e.getSource() == callingbtn[3]) {
            System.out.println("Call On Mute");
        }
        if (e.getSource() == callingbtn[4]) {
            System.out.println("Call On Hold");
        }
        if (e.getSource() == callingbtn[5]) {
            System.out.println("Recording Call..");
        }


        if (e.getSource() == callexit) {
            callframe.setVisible(false);
        }
        if (e.getSource() == callend) {
            callingframe.setVisible(false);
        }
        if (e.getSource() == endcallbtn) {
            callingframe.setVisible(false);
            System.out.println("Call End.. " + callscreen.getText());
            callingframe.setTitle("Call End");
        }

        if (e.getSource() == addnew) {
            System.out.println("Not Working");

        }
       /* if (e.getSource() == submit) {
            contactpanel.setVisible(true);
            addpanel.setVisible(false);
        }*/
        if(e.getSource() == contbutt)
        {
            contactframe.setVisible(true);
        }
        if(e.getSource() == contexit)
        {
            contactframe.setVisible(false);
        }
        if(e.getSource() == contactNo[0])
        {
            callingno.setText("     " + contactNo[0].getText());
            callingframe.setVisible(true);
        }
        if(e.getSource() == contactNo[2])
        {
            callingno.setText("Calling..   " + contactNo[2].getText());
            callingframe.setVisible(true);
        }
        if(e.getSource() == contactNo[4])
        {
            callingno.setText("Calling..   " + contactNo[4].getText());
            callingframe.setVisible(true);
        }
        if(e.getSource() == contactNo[6])
        {
            callingno.setText("Calling..  " + contactNo[6].getText());
            callingframe.setVisible(true);
        }
        if(e.getSource() == contactNo[8])
        {
            callingno.setText(" " + contactNo[8].getText());
            callingframe.setVisible(true);
        }


    }
}

class Settings extends ImagesIconCls implements ActionListener
{
	JFrame settingframe = new JFrame();
	JButton[] settingoption = new JButton[7];
	JPanel settingoptinpanel = new JPanel();
	JPanel settingtitle = new JPanel();
	JLabel aboutphoneoption1 = new JLabel();
	JLabel aboutphoneoption2 = new JLabel();
	JLabel aboutphoneoption3 = new JLabel();
	JLabel aboutphoneoption4 = new JLabel();
	JLabel aboutphoneoption5 = new JLabel();
	JLabel aboutphoneoption6 = new JLabel();
	JLabel aboutphoneoption7 = new JLabel();
	JLabel aboutphoneoption8 = new JLabel();
	JLabel aboutphoneoption9 = new JLabel();
	JLabel aboutphoneoption10 = new JLabel();
	JLabel settingtitlelabel = new JLabel();
	JPanel aboutphonepanel = new JPanel();
	JButton settingexit = new JButton("X");
	JButton settingback = new JButton("<");
	JPanel displaywallpanel = new JPanel();
	JButton choosebtn = new JButton("Ok");
	JPanel colorpanel = new JPanel();	
	JPanel displaypanel = new JPanel();
	JButton[] displayoption = new JButton[7]; 
	JLabel walllabel = new JLabel("Enter Color Code");
	JLabel choosed = new JLabel("Choosed Color");
	JButton choosebtn2 = new JButton("Ok");
	JLabel appbar = new JLabel("Choose Appbar Color");
	JPanel displayappbarpanel = new JPanel();
	JLabel choosed2 = new JLabel("Choosed Color");
	JPanel wifipanel = new JPanel();

	JLabel wifilabel1 = new JLabel();
	JButton wifioff = new JButton("OFF");
	JButton wifion = new JButton("ON");
	JPanel wifipanel1 = new JPanel();
	JLabel wifilabel2 = new JLabel();
	JPanel bluetoothpanel = new JPanel();
	JLabel bluetoothlabel2 = new JLabel();
	JPanel bluetoothpanel1 = new JPanel();
	JLabel bluetoothlabel1 = new JLabel();
	JButton bluetoothoff = new JButton("OFF");
	JButton bluetoothon = new JButton("ON");
	JLabel bluetoothlabel3 = new JLabel();
	JLabel wifilabel3 = new JLabel();
    JButton appsbackbtn = new JButton(" < ");
    JFrame appsoptframe = new JFrame();
    JButton[] appsoptbtn = new JButton[7];
    JPanel displayhomeic = new JPanel();
    JButton[] displayhomeicitem = new JButton[12];
    JTextField colorr = new JTextField(6);
    JTextField colorg = new JTextField(6);
    JTextField colorb = new JTextField(6);
    JTextField colorr2 = new JTextField(6);
    JTextField colorg2 = new JTextField(6);
    JTextField colorb2 = new JTextField(6);
	Settings()
	{


		bluetoothlabel2.setText("Looking For Bluetooth Devices...");
		bluetoothlabel2.setFont(new Font("Mv Boli",Font.LAYOUT_NO_LIMIT_CONTEXT,15));
		bluetoothlabel2.setBounds(0,0,300,50);
		bluetoothlabel2.setVisible(false);
		
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY,1);
		bluetoothlabel3.setText("Devices Name:        MyBauaa 2.0");
		bluetoothlabel3.setFont(new Font("Mv Boli",Font.BOLD,15));
		bluetoothlabel3.setBounds(2,38,280,33);
		bluetoothlabel3.setVisible(false);
		bluetoothlabel3.setBorder(border);
		
		bluetoothpanel1.setBounds(0,73,300,347);
		//bluetoothpanel1.setBackground(Color.ORANGE);
		bluetoothpanel1.setVisible(true);
		bluetoothpanel1.setOpaque(true);
		bluetoothpanel1.setLayout(null);
		bluetoothpanel1.add(bluetoothlabel2);
		bluetoothpanel1.add(bluetoothlabel3);
		
		bluetoothlabel1.setText("Bluetooth");
        bluetoothlabel1.setForeground(Color.WHITE);
		bluetoothlabel1.setFont(new Font("Mv Boli",Font.BOLD,20));
		bluetoothlabel1.setHorizontalAlignment(JLabel.LEFT);
		bluetoothlabel1.setBounds(10,0,150,40);
		
		bluetoothoff.setBounds(200,6,75,30);
        bluetoothoff.setFont(new Font("Mv Boli",Font.BOLD,15));
		bluetoothoff.setContentAreaFilled(true);
        bluetoothoff.setBackground(Color.WHITE);
		bluetoothoff.addActionListener(this);
		
		bluetoothon.setBounds(200,6,75,30);
		bluetoothon.setContentAreaFilled(true);
		bluetoothon.setVisible(false);
		bluetoothon.addActionListener(this);
		
		
		bluetoothpanel.setBounds(0,30,300,40);
		bluetoothpanel.setBackground(new Color(8,112,196));
		bluetoothpanel.setVisible(false);
		bluetoothpanel.setOpaque(true);
		bluetoothpanel.setLayout(null);
		bluetoothpanel.add(bluetoothlabel1);
		bluetoothpanel.add(bluetoothoff);
		bluetoothpanel.add(bluetoothon);
		
		wifilabel3.setText("WiFi Name:             MyBauaa");
		wifilabel3.setFont(new Font("Mv Boli",Font.BOLD,15));
		wifilabel3.setBounds(2,38,280,33);
		wifilabel3.setVisible(false);
		wifilabel3.setBorder(border);
		
		wifilabel2.setText("Looking For Network...");
		wifilabel2.setFont(new Font("Mv Boli",Font.ITALIC,15));
		wifilabel2.setBounds(0,0,300,50);
		wifilabel2.setVisible(false);
		
		wifipanel1.setBounds(0,73,300,347);
		//wifipanel1.setBackground(Color.GREEN);
		wifipanel1.setVisible(false);
		wifipanel1.setOpaque(true);
		wifipanel1.setLayout(null);
		wifipanel1.add(wifilabel2);
		wifipanel1.add(wifilabel3);
		
		wifilabel1.setText("Wi Fi");
		wifilabel1.setFont(new Font("Mv Boli",Font.BOLD,20));
		wifilabel1.setHorizontalAlignment(JLabel.LEFT);
        wifilabel1.setForeground(Color.WHITE);
		wifilabel1.setBounds(10,0,150,40);
		
		wifioff.setBounds(200,6,75,30);
        wifioff.setFont(new Font("Mv Boli",Font.BOLD,15));
		wifioff.setContentAreaFilled(true);
        wifioff.setBackground(Color.WHITE);
        wifioff.setForeground(Color.BLACK);
		wifioff.addActionListener(this);
		
		wifion.setBounds(200,6,75,30);
		wifion.setContentAreaFilled(true);
		wifion.setVisible(false);
		wifion.addActionListener(this);
		
		
		wifipanel.setBounds(0,30,300,40);
		wifipanel.setBackground(new Color(8,112,196));
		wifipanel.setVisible(false);
		wifipanel.setOpaque(true);
		wifipanel.setLayout(null);
		wifipanel.add(wifilabel1);
		wifipanel.add(wifioff);
		wifipanel.add(wifion);


        for(int i = 0;i < 12; i++)
        {
            displayhomeicitem[i] = new JButton();
            displayhomeic.add(displayhomeicitem[i]);
            displayhomeicitem[i].addActionListener(this);
        }
        displayhomeicitem[0].setText("None");
        displayhomeicitem[0].setFont(new Font("Mv Boli",Font.BOLD,25));
        displayhomeicitem[1].setIcon(wallic1);
        displayhomeicitem[2].setIcon(wallic2);
        displayhomeicitem[3].setIcon(wallic3);
        displayhomeicitem[4].setIcon(wallic4);
        displayhomeicitem[5].setIcon(wallic5);
        displayhomeicitem[6].setIcon(wallic6);
        displayhomeicitem[7].setIcon(wallic7);
        displayhomeicitem[8].setIcon(wallic8);
        displayhomeicitem[9].setIcon(wallic9);
        displayhomeicitem[10].setIcon(wallic10);
        displayhomeicitem[11].setIcon(wallic11);


		
		choosebtn2.addActionListener(this);
		
		appbar.setFont(new Font("Mv Boli",Font.BOLD,25));
		appbar.setForeground(Color.WHITE);
		choosed2.setFont(new Font("Mv Boli",Font.BOLD,30));
		choosed2.setForeground(Color.WHITE);


        displayhomeic.setBounds(10,50,260,350);
        displayhomeic.setOpaque(true);
        displayhomeic.setVisible(false);
        displayhomeic.setBackground(Color.DARK_GRAY);
        displayhomeic.setLayout(new GridLayout(4,3));



        /*displayappbarpanel.setBounds(10,50,260,150);
		displayappbarpanel.setOpaque(true);
		displayappbarpanel.setVisible(false);
		displayappbarpanel.setBackground(Color.DARK_GRAY);
		displayappbarpanel.add(appbar);
 		displayappbarpanel.add(choosebtn2);
	    displayappbarpanel.add(choosed2);	*/

        displayappbarpanel.setBounds(10,50,260,150);
        displayappbarpanel.setOpaque(true);
        displayappbarpanel.setVisible(false);
        displayappbarpanel.setBackground(Color.DARK_GRAY);
        displayappbarpanel.add(appbar);
        displayappbarpanel.add(colorr2);
        displayappbarpanel.add(colorg2);
        displayappbarpanel.add(colorb2);
        displayappbarpanel.add(choosebtn2);
        displayappbarpanel.add(choosed2);



		for(int i = 0; i < 7; i++)
		{
			displayoption[i] = new JButton();
			displaypanel.add(displayoption[i]);
			displayoption[i].setBackground(new Color(238,238,231));
			displayoption[i].setFont(new Font("Mv Boli",Font.BOLD,20));
			displayoption[i].setForeground(Color.black);
			displayoption[i].addActionListener(this);
			
		}
        displayoption[2].setText("Change HomeIcon");
		displayoption[1].setText("Change AppBar");
		
		choosed.setForeground(Color.WHITE);
		choosed.setFont(new Font("ITALIC",Font.BOLD,30));
		
		walllabel.setFont(new Font("Mv Boli",Font.BOLD,25));
		walllabel.setForeground(Color.WHITE);
		
		displayoption[0].setText("Change Wallpaper");
		
		choosebtn.addActionListener(this);

        //colorr.setBounds(50,10,20,40);
		
		displaywallpanel.setBounds(10,50,260,150);
		displaywallpanel.setOpaque(true);
		displaywallpanel.setVisible(false);
		displaywallpanel.setBackground(Color.DARK_GRAY);
		displaywallpanel.add(walllabel);
        displaywallpanel.add(colorr);
        displaywallpanel.add(colorg);
        displaywallpanel.add(colorb);
		displaywallpanel.add(choosebtn);
		displaywallpanel.add(choosed);


		
		
	   
		displaypanel.setBounds(0,30,300,395);
		displaypanel.setBackground(Color.CYAN);
		displaypanel.setVisible(false);
		displaypanel.setOpaque(true);
		displaypanel.setLayout(new GridLayout(7,1));
		
		aboutphoneoption1.setBackground(Color.yellow);
		aboutphoneoption1.setText("OS: " + "BauaaOS");
		aboutphoneoption1.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption2.setBackground(Color.yellow);
		aboutphoneoption2.setText("OS Version: " + "1.0.1MANIS");
		aboutphoneoption2.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption3.setBackground(Color.yellow);
		aboutphoneoption3.setText("Model No: " + "01understanding");
		aboutphoneoption3.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption4.setBackground(Color.yellow);
		aboutphoneoption4.setText("RAM: " + "4GB");
		aboutphoneoption4.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption5.setBackground(Color.yellow);
		aboutphoneoption5.setText("CPU: " + "Helio G90T 2.05GHz");
		aboutphoneoption5.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption6.setBackground(Color.yellow);
		aboutphoneoption6.setText("Kernel: " + "1.001.110eaf");
		aboutphoneoption6.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption7.setBackground(Color.yellow);
		aboutphoneoption7.setText("IMEI: " + "070415735742219");
		aboutphoneoption7.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption8.setBackground(Color.yellow);
		aboutphoneoption8.setText("IP Address: " + "127.0.0.1");
		aboutphoneoption8.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption9.setBackground(Color.yellow);
		aboutphoneoption9.setText("Phone Name: " + "MyBauaa 2.0");
		aboutphoneoption9.setFont(new Font("Mv Boli",Font.BOLD,20));
		aboutphoneoption9.setForeground(Color.red);
		aboutphoneoption10.setBackground(Color.yellow);
		aboutphoneoption10.setText("");
		aboutphoneoption10.setFont(new Font("Mv Boli",Font.BOLD,20));
		
		
		aboutphonepanel.setBounds(0,30,300,395);
		aboutphonepanel.setBackground(Color.white);
		aboutphonepanel.setVisible(false);
		aboutphonepanel.setLayout(new GridLayout(10,1));
		aboutphonepanel.add(aboutphoneoption1);
		aboutphonepanel.add(aboutphoneoption2);
		aboutphonepanel.add(aboutphoneoption3);
		aboutphonepanel.add(aboutphoneoption4);
		aboutphonepanel.add(aboutphoneoption5);
		aboutphonepanel.add(aboutphoneoption6);
		aboutphonepanel.add(aboutphoneoption7);
		aboutphonepanel.add(aboutphoneoption8);
		aboutphonepanel.add(aboutphoneoption9);
		aboutphonepanel.add(aboutphoneoption10);
	
		settingback.setBounds(0, 0, 90,31);
		settingback.setFont(new Font("Mv Boli",Font.BOLD, 20));
		settingback.setContentAreaFilled(true);
		settingback.setBackground(Color.BLACK);
		settingback.setForeground(Color.WHITE);
		settingback.addActionListener(this);
		settingback.setBorder(null);
		
		settingexit.setBounds(195, 0, 90,31);
		settingexit.setFont(new Font("Mv Boli",Font.BOLD, 20));
		settingexit.setContentAreaFilled(true);
		settingexit.setBackground(Color.BLACK);
		settingexit.setForeground(Color.WHITE);
		settingexit.addActionListener(this);
		settingexit.setBorder(null);
		
		settingtitlelabel.setText("Settings");
		settingtitlelabel.setFont(new Font("Mv Boli",Font.BOLD,20));
		settingtitlelabel.setForeground(Color.WHITE);
		settingtitlelabel.setBounds(100,0,150,34);
		
		
		settingtitle.setBounds(0,0,300,32);
		settingtitle.setBackground(Color.BLACK);
		settingtitle.add(settingtitlelabel);
		settingtitle.setLayout(null);
		
		settingoptinpanel.setBounds(0,30,300,395);
		settingoptinpanel.setBackground(Color.white);
		settingoptinpanel.setLayout(new GridLayout(7,1));
		
		
		for(int i = 0; i < 7; i++)
		{
			settingoption[i] = new JButton();
			settingoptinpanel.add(settingoption[i]);
			settingoption[i].setBackground(new Color(238,238,231));
			settingoption[i].setFont(new Font("Mv Boli",Font.BOLD,20));
			settingoption[i].setForeground(Color.black);
			settingoption[i].addActionListener(this);
			
		}
		
		settingoption[0].setText("About Phone");
		settingoption[1].setText("Wi-Fi");
    	settingoption[2].setText("BlueTooth");
		settingoption[3].setText("Display");
		settingoption[4].setText("Home Screen");
		settingoption[5].setText("Battery");
		settingoption[6].setText("Apps");
		
		
		settingframe.setSize(300,460);
		settingframe.setVisible(true);
		settingframe.setLayout(null);
		settingframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		settingframe.setResizable(false);
		settingframe.add(settingback);
		settingframe.add(settingexit);
		settingframe.add(settingtitle);
		settingframe.add(aboutphonepanel);
		settingframe.add(settingoptinpanel);
		settingframe.add(wifipanel);
		settingframe.add(wifipanel1);
		settingframe.add(bluetoothpanel);
		settingframe.add(bluetoothpanel1);
		settingframe.add(displaywallpanel);
		settingframe.add(displayappbarpanel);
        settingframe.add(displayhomeic);
		settingframe.add(displaypanel);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == settingoption[0])
		{
			System.out.println("About Phone");
			aboutphonepanel.setVisible(true);
			settingoptinpanel.setVisible(false);
		}
		if(e.getSource() == settingoption[1])
		{
			System.out.println("Wi-Fi");
			wifipanel.setVisible(true);
			wifipanel1.setVisible(true);
			settingoptinpanel.setVisible(false);
		}
		if(e.getSource() == settingoption[2])
		{
			System.out.println("BlueTooth");
			bluetoothpanel.setVisible(true);
			bluetoothpanel1.setVisible(true);
			settingoptinpanel.setVisible(false);
		}
		if(e.getSource() == settingoption[3])
		{
			System.out.println("Display");
			displaypanel.setVisible(true);
			settingoptinpanel.setVisible(false);
			//wifipanel.setVisible(false);
            aboutphonepanel.setVisible(false);
			//bluetoothpanel1.setVisible(false);

		}
		if(e.getSource() == settingoption[4])
		{
			System.out.println("Home Screen");
		}
		if(e.getSource() == settingoption[5])
		{
			System.out.println("Battery");
		}
		if(e.getSource() == settingoption[6])
		{
			System.out.println("Apps");
            JPanel appstoppanel = new JPanel();
            JLabel appslabel = new JLabel();
            JPanel appsoptpanel = new JPanel();

            appsoptpanel.setBackground(Color.CYAN);
            appstoppanel.setLayout(new GridLayout(7,1));
            appsoptpanel.setBounds(0,40,300,360);

            for(int i = 0; i < 7; i++)
            {
                appsoptbtn[i] = new JButton();
                appsoptbtn[i].setText("Hey");
                appsoptbtn[i].setFont(new Font("Mv Boli", Font.BOLD,20));
                appsoptpanel.add(appsoptbtn[i]);
            }

            appslabel.setText("Apps");
            appslabel.setBounds(120,0,50,40);
            appslabel.setFont(new Font("Mv Boli",Font.BOLD,20));
            appslabel.setForeground(Color.WHITE);

            appsbackbtn.setBounds(10,5,60,30);
            appsbackbtn.setBackground(Color.orange);
            appsbackbtn.setBackground(Color.WHITE);
            appsbackbtn.addActionListener(this);
            appstoppanel.setBackground(new Color(8,122,196));
            appstoppanel.setLayout(null);
            appstoppanel.setBounds(0,0,300,40);
            appstoppanel.add(appsbackbtn);
            appstoppanel.add(appslabel);

            appsoptframe.setSize(300,460);
            appsoptframe.setLayout(null);
            appsoptframe.setVisible(true);
            appsoptframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            appsoptframe.add(appstoppanel);
            appsoptframe.add(appsoptpanel);
		}
        if(e.getSource() == appsbackbtn)
        {
            System.out.println("Apps back");
            appsoptframe.setVisible(false);
        }

		if(e.getSource() == settingexit)
		{
			settingframe.setVisible(false);
			System.out.println("Exit Setting");
		}
		if(e.getSource() == settingback)
		{
			settingoptinpanel.setVisible(true);
			aboutphonepanel.setVisible(false);
			displaypanel.setVisible(false);
			displaywallpanel.setVisible(false);
			displayappbarpanel.setVisible(false);
            displayhomeic.setVisible(false);
			wifipanel.setVisible(false);
			wifipanel1.setVisible(false);
			bluetoothpanel.setVisible(false);
			bluetoothpanel1.setVisible(false);
		}
		if(e.getSource() == choosebtn)
		{
            int red = Integer.parseInt(colorr.getText());
            int green = Integer.parseInt(colorg.getText());
            int blue = Integer.parseInt(colorb.getText());
            MyPhone.frame.getContentPane().setBackground(new Color(red,green,blue));
            MyPhone.homesettingiconpanel.setBackground(new Color(red,green,blue));
            MyPhone.homep.setBackground(new Color(red,green,blue));
            choosed.setForeground(new Color(red,green,blue));

		}
		if(e.getSource() == choosebtn2)
		{
            int red = Integer.parseInt(colorr2.getText());
            int green = Integer.parseInt(colorg2.getText());
            int blue = Integer.parseInt(colorb2.getText());
			MyPhone.screen.setBackground(new Color(red,green,blue));
			choosed2.setForeground(new Color(red,green,blue));
		}
		if(e.getSource() == displayoption[0])
		{
			displaywallpanel.setVisible(true);
			displaypanel.setVisible(false);
		}
		if(e.getSource() == displayoption[1])
		{
			displayappbarpanel.setVisible(true);
			displaypanel.setVisible(false);
		}
        if(e.getSource() == displayoption[2])
        {
            displaypanel.setVisible(false);
            displayhomeic.setVisible(true);
        }
        if(e.getSource() == displayhomeicitem[0])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[0].getIcon());
        }
        if(e.getSource() == displayhomeicitem[1])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[1].getIcon());
        }
        if(e.getSource() == displayhomeicitem[2])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[2].getIcon());
        }
        if(e.getSource() == displayhomeicitem[3])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[3].getIcon());
        }
        if(e.getSource() == displayhomeicitem[4])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[4].getIcon());
        }
        if(e.getSource() == displayhomeicitem[5])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[5].getIcon());
        }
        if(e.getSource() == displayhomeicitem[6])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[6].getIcon());
        }
        if(e.getSource() == displayhomeicitem[7])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[7].getIcon());
        }
        if(e.getSource() == displayhomeicitem[8])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[8].getIcon());
        }
        if(e.getSource() == displayhomeicitem[9])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[9].getIcon());
        }
        if(e.getSource() == displayhomeicitem[10])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[10].getIcon());
        }
        if(e.getSource() == displayhomeicitem[11])
        {
            MyPhone.homeic.setIcon(displayhomeicitem[11].getIcon());
        }
		if(e.getSource() == wifioff)
        {
			wifion.setVisible(true);
            wifion.setBackground(Color.ORANGE);
            wifion.setFont(new Font("Mv Boli",Font.BOLD,15));
		    wifioff.setVisible(false);
		    wifilabel2.setVisible(true);
		    wifilabel3.setVisible(true);
		}
		if(e.getSource() == wifion)
		{
			wifion.setVisible(false);
			wifioff.setVisible(true);
			wifilabel2.setVisible(false);
			wifilabel3.setVisible(false);
			
		}
		if(e.getSource() == bluetoothoff)
        {
			bluetoothon.setVisible(true);
            bluetoothon.setBackground(Color.orange);
            bluetoothon.setFont(new Font("Mv Boli",Font.BOLD,15));
			bluetoothoff.setVisible(false);
			bluetoothlabel2.setVisible(true);
			bluetoothlabel3.setVisible(true);
		}
		if(e.getSource() == bluetoothon)
		{
			bluetoothon.setVisible(false); 
			bluetoothoff.setVisible(true);
			bluetoothlabel2.setVisible(false);
			bluetoothlabel3.setVisible(false);
		}
	}
}

class Calculator extends JFrame implements ActionListener
{
    JButton[] calcbtn = new JButton[12];
    JButton[] calcbtn1 = new JButton[4];
    JFrame calcframe = new JFrame();
    JPanel calcpanel = new JPanel();
    JPanel calcpanel1 = new JPanel();
    JButton clearbtn = new JButton("<");
    JButton allclearbtn = new JButton("AC");
    JPanel calbtn2 = new JPanel();
    JPanel calcscreenpanel1 = new JPanel();
    JPanel calcscreenpanel11 = new JPanel();
    JPanel calcscreenpanel111 = new JPanel();
    JPanel calcscreenpanel2 = new JPanel();
    JLabel calcscreenin = new JLabel();
    JLabel calcscreenin1 = new JLabel();
    JLabel calcscreenin2 = new JLabel();
    JLabel calcscreenout = new JLabel();
    JButton calcexit = new JButton("X");
    int a;
    int b;
    boolean ch = false;
    char opretor;

    Calculator()
    {
        calcexit.setBounds(195, 0, 90,34);
        calcexit.setFont(new Font("Mv Boli",Font.BOLD, 20));
        calcexit.setContentAreaFilled(false);
        calcexit.setForeground(Color.RED);
        calcexit.addActionListener(this);
        calcexit.setBorder(null);

        calcscreenin.setText("");
        calcscreenin.setFont(new Font("Mv Boli",Font.BOLD,25));

        calcscreenin2.setText("");
        calcscreenin2.setFont(new Font("Mv Boli",Font.BOLD,25));

        calcscreenin1.setText("");
        calcscreenin1.setFont(new Font("Mv Boli",Font.BOLD,25));

        calcscreenout.setText("");
        calcscreenout.setFont(new Font("Mv Boli",Font.BOLD,25));



        calcscreenpanel1.setBackground(Color.LIGHT_GRAY);
        calcscreenpanel1.setBounds(0,0,135,45);
        calcscreenpanel1.add(calcscreenin);

        calcscreenpanel11.setBackground(Color.LIGHT_GRAY);
        calcscreenpanel11.setBounds(165,0,135,45);
        calcscreenpanel11.add(calcscreenin1);

        calcscreenpanel111.setBackground(Color.LIGHT_GRAY);
        calcscreenpanel111.setBounds(135,0,30,45);
        calcscreenpanel111.add(calcscreenin2);

        calcscreenpanel2.setBackground(Color.LIGHT_GRAY);
        calcscreenpanel2.setBounds(0,45,300,45);
        calcscreenpanel2.add(calcscreenout);


        allclearbtn.setBackground(Color.RED);
        allclearbtn.setFont(new Font("Mv Boli", Font.BOLD,20));
        allclearbtn.setForeground(Color.white);
        allclearbtn.addActionListener(this);

        clearbtn.setBackground(Color.BLUE);
        clearbtn.setFont(new Font("Mv Boli", Font.BOLD,25));
        clearbtn.setForeground(Color.white);
        clearbtn.addActionListener(this);

        calbtn2.setBackground(Color.ORANGE);
        calbtn2.setBounds(0,90,300,30);
        calbtn2.setLayout(new GridLayout(1,2));
        calbtn2.add(allclearbtn);
        calbtn2.add(clearbtn);

        calcpanel.setBounds(0,120,220,300);
        calcpanel.setBackground(Color.gray);
        calcpanel.setLayout(new GridLayout(4,3));

        calcpanel1.setBounds(220,120,70,300);
        calcpanel1.setBackground(Color.gray);
        calcpanel1.setLayout(new GridLayout(6,1));
        calcpanel1.setLayout(new GridLayout(4,3));

        for(int i = 0; i < 4; i++)
        {
            calcbtn1[i] = new JButton();
            calcbtn1[i].setBackground(Color.green);
            calcbtn1[i].setFont(new Font("Mv Boli", Font.BOLD,25));
            calcpanel1.add(calcbtn1[i]);
            calcbtn1[i].addActionListener(this);
        }
        calcbtn1[0].setText("/");
        calcbtn1[1].setText("*");
        calcbtn1[2].setText("-");
        calcbtn1[3].setText("+");

        for(int i = 0; i < 12; i++)
        {
            calcbtn[i] = new JButton();
            calcbtn[i].setBackground(Color.YELLOW);
            calcbtn[i].setText("1");
            calcbtn[i].addActionListener(this);
            calcbtn[i].setFont(new Font("Mv Boli", Font.BOLD,20));
            calcpanel.add(calcbtn[i]);
        }

        calcbtn[0].setText("1");
        calcbtn[1].setText("2");
        calcbtn[2].setText("3");
        calcbtn[3].setText("4");
        calcbtn[4].setText("5");
        calcbtn[5].setText("6");
        calcbtn[6].setText("7");
        calcbtn[7].setText("8");
        calcbtn[8].setText("9");
        calcbtn[9].setText(".");
        calcbtn[9].setBackground(Color.CYAN);
        calcbtn[10].setText("0");
        calcbtn[11].setText("=");
        calcbtn[11].setBackground(Color.CYAN);

        calcframe.setSize(300,460);
        calcframe.setVisible(true);
        calcframe.setLayout(null);
        calcframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        calcframe.add(calcexit);
        calcframe.add(calcscreenpanel1);
        calcframe.add(calcscreenpanel111);
        calcframe.add(calcscreenpanel11);
        calcframe.add(calcscreenpanel2);
        calcframe.add(calbtn2);
        calcframe.add(calcpanel);
        calcframe.add(calcpanel1);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if(ch == false)
        {
            if(e.getSource() == calcbtn[0])
            {
                a = Integer.parseInt(calcscreenin.getText() + "1");
                calcscreenin.setText(calcscreenin.getText() + "1");
                System.out.println(ch);
                System.out.println("1");
            }
            if(e.getSource() == calcbtn[1])
            {
                a = Integer.parseInt(calcscreenin.getText() + "2");
                calcscreenin.setText(calcscreenin.getText() + "2");
                System.out.println("2");
            }
            if(e.getSource() == calcbtn[2])
            {
                a = Integer.parseInt(calcscreenin.getText() + "3");
                calcscreenin.setText(calcscreenin.getText() + "3");
                System.out.println("3");
            }
            if(e.getSource() == calcbtn[3])
            {
                a = Integer.parseInt(calcscreenin.getText() + "4");
                calcscreenin.setText(calcscreenin.getText() + "4");
                System.out.println("4");
            }
            if(e.getSource() == calcbtn[4])
            {
                a = Integer.parseInt(calcscreenin.getText() + "5");
                calcscreenin.setText(calcscreenin.getText() + "5");
                System.out.println("5");
            }
            if(e.getSource() == calcbtn[5])
            {

                a = Integer.parseInt(calcscreenin.getText() + "6");
                calcscreenin.setText(calcscreenin.getText() + "6");
                System.out.println("6");
            }
            if(e.getSource() == calcbtn[6])
            {
                a = Integer.parseInt(calcscreenin.getText() + "7");
                calcscreenin.setText(calcscreenin.getText() + "7");
                System.out.println("7");
            }
            if(e.getSource() == calcbtn[7])
            {
                a = Integer.parseInt(calcscreenin.getText() + "8");
                calcscreenin.setText(calcscreenin.getText() + "8");
                System.out.println("8");
            }
            if(e.getSource() == calcbtn[8])
            {
                a = Integer.parseInt(calcscreenin.getText() + "9");
                calcscreenin.setText(calcscreenin.getText() + "9");
                System.out.println("9");
            }

            if(e.getSource() == calcbtn[10])
            {

                a = Integer.parseInt(calcscreenin.getText() + "0");
                calcscreenin.setText(calcscreenin.getText() + "0");
                System.out.println("0");
            }
        }

        if(ch == true)
        {
            if(e.getSource() == calcbtn[0])
            {
                //b = Integer.parseInt(calcscreenin1.getText() + "1");
                calcscreenin1.setText(calcscreenin1.getText() + "1");
                System.out.println("1");
            }
            if(e.getSource() == calcbtn[1])
            {
                b = Integer.parseInt(calcscreenin1.getText() + "2");
                calcscreenin1.setText(calcscreenin1.getText() + "2");
                System.out.println("2");
            }
            if(e.getSource() == calcbtn[2])
            {
                b = Integer.parseInt(calcscreenin1.getText() + "3");
                calcscreenin1.setText(calcscreenin1.getText() + "3");
                System.out.println("3");
            }
            if(e.getSource() == calcbtn[3])
            {
                b = Integer.parseInt(calcscreenin1.getText() + "4");
                calcscreenin1.setText(calcscreenin1.getText() + "4");
                System.out.println("4");
            }
            if(e.getSource() == calcbtn[4])
            {
                b = Integer.parseInt(calcscreenin1.getText() + "5");
                calcscreenin1.setText(calcscreenin1.getText() + "5");
                System.out.println("5");
            }
            if(e.getSource() == calcbtn[5])
            {

                b = Integer.parseInt(calcscreenin1.getText() + "6");
                calcscreenin1.setText(calcscreenin1.getText() + "6");
                System.out.println("6");
            }
            if(e.getSource() == calcbtn[6])
            {
                b = Integer.parseInt(calcscreenin1.getText() + "7");
                calcscreenin1.setText(calcscreenin1.getText() + "7");
                System.out.println("7");
            }
            if(e.getSource() == calcbtn[7])
            {
                b = Integer.parseInt(calcscreenin1.getText() + "8");
                calcscreenin1.setText(calcscreenin1.getText() + "8");
                System.out.println("8");
            }
            if(e.getSource() == calcbtn[8])
            {
                b = Integer.parseInt(calcscreenin1.getText() + "9");
                calcscreenin1.setText(calcscreenin1.getText() + "9");
                System.out.println("9");
            }

            if(e.getSource() == calcbtn[10])
            {

                b = Integer.parseInt(calcscreenin1.getText() + "0");
                calcscreenin1.setText(calcscreenin1.getText() + "0");
                System.out.println("0");
            }
        }

        if(e.getSource() == calcbtn[9])
        {
            calcscreenin.setText(calcscreenin.getText() + ".");
        }

        if(e.getSource() == calcbtn[11])
        {
            System.out.println("=");
            switch (opretor)
            {
                case '+': {
                    int add = a + b;
                    String resadd = Integer.toString(add);
                    calcscreenout.setText(resadd);
                    break;
                }
                case '-': {
                    int sub = a - b;
                    String ressub = Integer.toString(sub);
                    calcscreenout.setText(ressub);
                    break;
                }
                case '*': {
                    int mul = a * b;
                    String resmul = Integer.toString(mul);
                    calcscreenout.setText(resmul);
                    break;
                }
                case '/': {
                    int div = a / b;
                    String resdiv = Integer.toString(div);
                    calcscreenout.setText(resdiv);
                    break;
                }

            }
        }


        if(e.getSource() == calcbtn1[0])
        {
            ch = true;
            opretor = '/';
            calcscreenin2.setText(" / ");
            System.out.println("/");
        }
        if(e.getSource() == calcbtn1[1])
        {
            ch = true;
            opretor = '*';
            calcscreenin2.setText(" * ");
            System.out.println("*");
        }
        if(e.getSource() == calcbtn1[2])
        {
            ch = true;
            opretor = '-';
            calcscreenin2.setText(" - ");
            System.out.println("-");
        }
        if(e.getSource() == calcbtn1[3])
        {
            ch = true;
            opretor = '+';
            calcscreenin2.setText(" + ");
            System.out.println("+");
        }

        if(e.getSource() == allclearbtn)
        {
            calcscreenin.setText("");
            calcscreenin1.setText("");
            calcscreenin2.setText("");
            calcscreenout.setText("");
            ch = false;
        }
        if(e.getSource() == calcexit)
        {
            calcframe.setVisible(false);
        }
    }
}



class Main
{
    public static void main(String[] args)
    {
        MyPhone myphone = new MyPhone();
        //new TicTacToe();
        //new Settings();
    }
}

class ImagesIconCls
{
        ImageIcon wallic1 = new ImageIcon("wallic1.png");
        ImageIcon wallic2 = new ImageIcon("wallic2.png");
        ImageIcon wallic3 = new ImageIcon("wallic3.png");
        ImageIcon wallic4 = new ImageIcon("wallic4.png");
        ImageIcon wallic5 = new ImageIcon("wallic5.png");
        ImageIcon wallic6 = new ImageIcon("wallic6.png");
        ImageIcon wallic7 = new ImageIcon("wallic7.png");
        ImageIcon wallic8 = new ImageIcon("wallic8.png");
        ImageIcon wallic9 = new ImageIcon("wallic9.png");
        ImageIcon wallic10 = new ImageIcon("wallic10.png");
        ImageIcon wallic11 = new ImageIcon("wallic11.png");
}

    
