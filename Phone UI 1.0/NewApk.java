import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A1 extends JFrame implements ActionListener
{
    JFrame shapeframe = new JFrame();
    JPanel shapetoppanel = new JPanel();
    JLabel shapetoplabel = new JLabel();
    JPanel shapepanel = new JPanel();
    JButton[] shapeopt = new JButton[6];
    // Rectangle
    JFrame rectframe = new JFrame();
    JPanel rectpanel = new JPanel();
    JPanel recttoppanel = new JPanel();
    JLabel recttoplabel = new JLabel();
    JTextField length = new JTextField(10);
    JTextField width = new JTextField(10);
    JLabel heightlabel = new JLabel();
    JLabel widthlabel = new JLabel();
    JButton rectsubmit = new JButton("Submit");
    JLabel rectarea = new JLabel();
    JLabel rectperimeter = new JLabel();
    JLabel rectdiagonal = new JLabel();
    //
    //Circle
    JFrame cirframe = new JFrame();
    JPanel cirpanel = new JPanel();
    JTextField cirradius = new JTextField(10);
    JButton cirsubmit = new JButton("Submit");
    JLabel cirarea = new JLabel();
    JLabel cirperimeter = new JLabel();
    JLabel circircumference = new JLabel();
    JLabel cirdiameter = new JLabel();
    //
    // Triangle
    JFrame triframe = new JFrame();
    JPanel tripanel = new JPanel();
    JTextField triheight = new JTextField(10);
    JTextField tribase = new JTextField(10);
    JButton trisubmit = new JButton("Submit");
    JLabel triarea = new JLabel();
    JLabel triperimeter = new JLabel();
    //
    // Cube
    JFrame cubeframe = new JFrame();
    JPanel cubepanel = new JPanel();
    JButton cubesubmit = new JButton("Submit");
    JLabel cubevolume = new JLabel();
    JLabel cubesarea = new JLabel();
    JTextField cubeside = new JTextField(10);
    //
    JButton rectreset = new JButton("Reset");
    JButton cirreset = new JButton("Reset");
    JButton trireset = new JButton("Reset");
    JButton cubereset = new JButton("Reset");
    JButton rectback = new JButton("Back");
    JButton cirback = new JButton("Back");
    JButton triback = new JButton("Back");
    JButton cubeback = new JButton("Back");

    A1()
    {
        shapetoplabel.setText("Shapes");
        shapetoplabel.setBounds(85,5,100,40);
        shapetoplabel.setFont(new Font("Arial",Font.ITALIC,25));
        shapetoplabel.setForeground(Color.WHITE);

        shapetoppanel.setBounds(0,0,300,40);
        shapetoppanel.setBackground(new Color(8,112,196));
        shapetoppanel.add(shapetoplabel);

        shapepanel.setBounds(5,40,275,375);
        shapepanel.setBackground(Color.LIGHT_GRAY);
        shapepanel.setLayout(new GridLayout(3,2));

        for(int i = 0; i < 6; i++)
        {
            shapeopt[i] = new JButton();
            shapepanel.add(shapeopt[i]);
            shapeopt[i].setContentAreaFilled(false);
            shapeopt[i].setFont(new Font("Mv Boli",Font.BOLD,15));
            shapeopt[i].addActionListener(this);
        }
        shapeopt[0].setText("Rectangle");
        shapeopt[1].setText("Circle");
        shapeopt[2].setText("Triangle");
        shapeopt[3].setText("Cube");
        shapeopt[4].setText("Sphere");
        shapeopt[5].setText("Pyramid");

        shapeframe.setSize(300,460);
        shapeframe.setVisible(true);
        shapeframe.setLayout(null);
        shapeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shapeframe.add(shapetoppanel);
        shapeframe.add(shapepanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == shapeopt[0])
        {
            rectback.setBounds(5,5,70,30);
            rectback.setContentAreaFilled(false);
            rectback.setBorder(null);
            rectback.setForeground(Color.WHITE);
            rectback.addActionListener(this);

            rectreset.setBounds(90,320,90,30);
            rectreset.addActionListener(this);

            rectarea.setBounds(5,150,275,40);
            rectarea.setBackground(Color.orange);
            rectarea.setFont(new Font("Arial",Font.ITALIC,20));
            rectarea.setText("Area: ");
            rectarea.setOpaque(true);

            rectperimeter.setBounds(5,200,275,40);
            rectperimeter.setBackground(Color.orange);
            rectperimeter.setText("Perimeter: ");
            rectperimeter.setFont(new Font("Arial",Font.ITALIC,20));
            rectperimeter.setOpaque(true);

            rectdiagonal.setBounds(5,250,275,40);
            rectdiagonal.setBackground(Color.orange);
            rectdiagonal.setText("Diagonal: ");
            rectdiagonal.setFont(new Font("Arial",Font.ITALIC,20));
            rectdiagonal.setOpaque(true);

            rectsubmit.setBounds(80,70,100,30);
            rectsubmit.addActionListener(this);

            heightlabel.setText("Length:(cm) ");
            heightlabel.setBounds(10,5,120,18);
            heightlabel.setFont(new Font("Arial",Font.ITALIC,12));
            widthlabel.setText("Width:(cm) ");
            widthlabel.setBounds(143,5,120,18);
            widthlabel.setFont(new Font("Arial",Font.ITALIC,12));

            length.setBounds(10,25,120,30);
            width.setBounds(143,25,120,30);

            recttoplabel.setText("Rectangle");
            recttoplabel.setBounds(80,5,150,40);
            recttoplabel.setFont(new Font("Arial",Font.ITALIC,25));
            recttoplabel.setForeground(Color.WHITE);

            recttoppanel.setBounds(0,0,300,40);
            recttoppanel.setBackground(new Color(6,112,196));
            recttoppanel.setLayout(null);
            recttoppanel.add(rectback);
            recttoppanel.add(recttoplabel);

            rectpanel.setBounds(5,40,275,375);
            rectpanel.setBackground(Color.LIGHT_GRAY);
            rectpanel.setVisible(true);
            rectpanel.setLayout(null);
            rectpanel.add(heightlabel);
            rectpanel.add(widthlabel);
            rectpanel.add(length);
            rectpanel.add(width);
            rectpanel.add(rectsubmit);
            rectpanel.add(rectarea);
            rectpanel.add(rectperimeter);
            rectpanel.add(rectdiagonal);
            rectpanel.add(rectreset);

            rectframe.setSize(300,460);
            rectframe.setVisible(true);
            rectframe.setLayout(null);
            rectframe.getContentPane().setBackground(new Color(145, 144, 144));
            rectframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            rectframe.add(recttoppanel);
            rectframe.add(rectpanel);
        }
        if(e.getSource() == rectsubmit)
        {
            float intlangth = Float.parseFloat(length.getText());
            float intwidth = Float.parseFloat(width.getText());
            float areaa = areaOfrectangle(intwidth, intlangth);
            String arearect = Float.toString(areaa);
            rectarea.setText(rectarea.getText() + "             " +areaa);
            float parimeterr = perimeterofrectangle(intlangth, intwidth);
            rectperimeter.setText(rectperimeter.getText() + "       "  + parimeterr);
            rectdiagonal.setText(rectdiagonal.getText()  +  "        Not Working");
        }
        if(e.getSource() == rectreset)
        {
            rectarea.setText("");
            rectperimeter.setText("");
            rectdiagonal.setText("");
            rectarea.setText("Area: ");
            rectperimeter.setText("Perimeter: ");
            rectdiagonal.setText("Diagonal: ");
            length.setText("");
            width.setText("");
        }
        if(e.getSource() == rectback)
        {
            rectframe.setVisible(false);
            rectpanel.setVisible(false);
            rectarea.setText("Area: ");
            rectperimeter.setText("Perimeter: ");
            rectdiagonal.setText("Diagonal: ");
        }
        if(e.getSource() == shapeopt[1])
        {
            JLabel cirtoplabel = new JLabel();
            JPanel cirtoppanel = new JPanel();
            JLabel radiuslabel = new JLabel();

            cirback.setBounds(5,5,70,30);
            cirback.setContentAreaFilled(false);
            cirback.setBorder(null);
            cirback.setForeground(Color.WHITE);
            cirback.addActionListener(this);

            cirreset.setBounds(90,320,90,30);
            cirreset.addActionListener(this);

            cirarea.setBounds(5,140,275,40);
            cirarea.setBackground(Color.orange);
            cirarea.setFont(new Font("Arial",Font.ITALIC,20));
            cirarea.setText("Area: ");
            cirarea.setOpaque(true);

            circircumference.setBounds(5,190,275,40);
            circircumference.setBackground(Color.orange);
            circircumference.setFont(new Font("Arial",Font.ITALIC,20));
            circircumference.setText("Circumfenrence: ");
            circircumference.setOpaque(true);

            cirdiameter.setBounds(5,240,275,40);
            cirdiameter.setBackground(Color.orange);
            cirdiameter.setFont(new Font("Arial",Font.ITALIC,20));
            cirdiameter.setText("Diameter ");
            cirdiameter.setOpaque(true);

            /*cirperimeter.setBounds(5,290,275,40);
            cirperimeter.setBackground(Color.orange);
            cirperimeter.setFont(new Font("Arial",Font.ITALIC,20));
            cirperimeter.setText("Perimeter:  ");
            cirperimeter.setOpaque(true);*/


            cirsubmit.setBounds(80,70,100,30);
            cirsubmit.addActionListener(this);

            radiuslabel.setText("Radius:(cm) ");
            radiuslabel.setBounds(40,12,120,18);
            radiuslabel.setFont(new Font("Arial",Font.ITALIC,12));

            cirradius.setBounds(40, 30,200, 30);

            cirtoplabel.setText("Circle");
            cirtoplabel.setBounds(80,5,100,40);
            cirtoplabel.setFont(new Font("Arial",Font.ITALIC,25));
            cirtoplabel.setForeground(Color.WHITE);

            cirtoppanel.setBounds(0,0,300,40);
            cirtoppanel.setBackground(new Color(6,112,196));
            cirtoppanel.setLayout(null);
            cirtoppanel.add(cirback);
            cirtoppanel.add(cirtoplabel);

            cirpanel.setBounds(5,40,275,375);
            cirpanel.setBackground(Color.LIGHT_GRAY);
            cirpanel.setLayout(null);
            cirpanel.setVisible(true);
            cirpanel.add(radiuslabel);
            cirpanel.add(cirradius);
            cirpanel.add(cirsubmit);
            cirpanel.add(cirarea);
            cirpanel.add(circircumference);
            cirpanel.add(cirdiameter);
            cirpanel.add(cirreset);

            cirframe.setSize(300,460);
            cirframe.setVisible(true);
            cirframe.setLayout(null);
            cirframe.getContentPane().setBackground(new Color(145, 144, 144));
            cirframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            cirframe.add(cirtoppanel);
            cirframe.add(cirpanel);

        }
        if(e.getSource() == cirsubmit)
        {
            float radius = Float.parseFloat(cirradius.getText());
            String cirareaa = Float.toString(areaofcircle(radius));
            cirarea.setText(cirarea.getText() + "      " + cirareaa);

            String circum = Float.toString(circumferenceOfCircle(radius));
            circircumference.setText(circircumference.getText() + "     " + circum);

            String diameter = Float.toString(diameterofcir(radius));
            cirdiameter.setText(cirdiameter.getText() + "       " + diameter);
        }

        if(e.getSource() == cirreset)
        {
            cirarea.setText("");
            circircumference.setText("");
            cirdiameter.setText("");
            cirarea.setText("Area: ");
            circircumference.setText("Circumfenrence: ");
            cirdiameter.setText("Diameter: ");
            cirradius.setText("");

        }
        if(e.getSource() == cirback)
        {
            cirframe.setVisible(false);
            cirpanel.setVisible(false);
            cirarea.setText("Area");
            circircumference.setText("Circumference: ");
            cirperimeter.setText("Perimeter: ");
        }


        if(e.getSource() ==  shapeopt[2])
        {
            JPanel tritoppanel = new JPanel();
            JLabel tritoplabel = new JLabel();
            JLabel triheightlabel = new JLabel();
            JLabel tribaselabel = new JLabel();

            triback.setBounds(5,5,70,30);
            triback.setContentAreaFilled(false);
            triback.setBorder(null);
            triback.setForeground(Color.WHITE);
            triback.addActionListener(this);

            trireset.setBounds(90,320,90,30);
            trireset.addActionListener(this);

            triarea.setBounds(5,150,275,40);
            triarea.setBackground(Color.orange);
            triarea.setFont(new Font("Arial",Font.ITALIC,20));
            triarea.setText("Area: ");
            triarea.setOpaque(true);

            triperimeter.setBounds(5,200,275,40);
            triperimeter.setBackground(Color.orange);
            triperimeter.setText("Perimeter: ");
            triperimeter.setFont(new Font("Arial",Font.ITALIC,20));
            triperimeter.setOpaque(true);


            trisubmit.setBounds(80,70,100,30);
            trisubmit.addActionListener(this);

            triheightlabel.setText("Height:(cm) ");
            triheightlabel.setBounds(10,5,120,18);
            triheightlabel.setFont(new Font("Arial",Font.ITALIC,12));
            tribaselabel.setText("Base:(cm) ");
            tribaselabel.setBounds(143,5,120,18);
            tribaselabel.setFont(new Font("Arial",Font.ITALIC,12));

            triheight.setBounds(10,25,120,30);
            tribase.setBounds(143,25,120,30);

            tritoplabel.setText("Triangle");
            tritoplabel.setBounds(80,5,100,40);
            tritoplabel.setFont(new Font("Arial",Font.ITALIC,25));
            tritoplabel.setForeground(Color.WHITE);

            tritoppanel.setBounds(0,0,300,40);
            tritoppanel.setBackground(new Color(6,112,196));
            tritoppanel.setLayout(null);
            tritoppanel.add(triback);
            tritoppanel.add(tritoplabel);

            tripanel.setBounds(5,40,275,375);
            tripanel.setBackground(Color.LIGHT_GRAY);
            tripanel.setLayout(null);
            tripanel.setVisible(true);
            tripanel.add(triheightlabel);
            tripanel.add(tribaselabel);
            tripanel.add(triheight);
            tripanel.add(tribase);
            tripanel.add(trisubmit);
            tripanel.add(triarea);
            tripanel.add(trireset);


            triframe.setSize(300,460);
            triframe.setVisible(true);
            triframe.setLayout(null);
            triframe.getContentPane().setBackground(new Color(145, 144, 144));
            triframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            triframe.add(tritoppanel);
            triframe.add(tripanel);
        }

        if(e.getSource() == trisubmit)
        {
            float trih = Float.parseFloat(triheight.getText());
            float trib = Float.parseFloat(tribase.getText());
            String tria = Float.toString(areaoftrangle(trih, trib));
            triarea.setText(triarea.getText() + "     " + tria);
        }

        if(e.getSource() == trireset)
        {
            triarea.setText("");
            triheight.setText("");
            tribase.setText("");
            triarea.setText("Area: ");
        }
        if(e.getSource() == triback)
        {
            triframe.setVisible(false);
            tripanel.setVisible(false);
            triarea.setText("Area: ");
        }

        if(e.getSource() == shapeopt[3])
        {
            JPanel cubetoppanel = new JPanel();
            JLabel cubebaselabel = new JLabel();
            JLabel cubetoplabel = new JLabel();
            JLabel cubeheightlabel = new JLabel();

            cubeback.setBounds(5,5,70,30);
            cubeback.setContentAreaFilled(false);
            cubeback.setBorder(null);
            cubeback.setForeground(Color.WHITE);
            cubeback.addActionListener(this);

            cubereset.setBounds(90,320,90,30);
            cubereset.addActionListener(this);

            cubevolume.setBounds(5,150,275,40);
            cubevolume.setBackground(Color.orange);
            cubevolume.setFont(new Font("Arial",Font.ITALIC,20));
            cubevolume.setText("Volume: ");
            cubevolume.setOpaque(true);

            cubesarea.setBounds(5,200,275,40);
            cubesarea.setBackground(Color.orange);
            cubesarea.setText("Surface Area: ");
            cubesarea.setFont(new Font("Arial",Font.ITALIC,20));
            cubesarea.setOpaque(true);


            cubesubmit.setBounds(80,70,100,30);
            cubesubmit.addActionListener(this);

            cubeheightlabel.setText("Side:(cm) ");
            cubeheightlabel.setBounds(40,12,120,18);
            cubeheightlabel.setFont(new Font("Arial",Font.ITALIC,12));

            cubeside.setBounds(40, 30,200, 30);

             cubetoplabel.setText("Cube");
             cubetoplabel.setBounds(80,5,100,40);
             cubetoplabel.setFont(new Font("Arial",Font.ITALIC,25));
             cubetoplabel.setForeground(Color.WHITE);

             cubetoppanel.setBounds(0,0,300,40);
             cubetoppanel.setBackground(new Color(6,112,196));
             cubetoppanel.setLayout(null);
             cubetoppanel.add(cubeback);
             cubetoppanel.add(cubetoplabel);

            cubepanel.setBounds(5,40,275,375);
            cubepanel.setBackground(Color.LIGHT_GRAY);
            cubepanel.setLayout(null);
            cubepanel.setVisible(true);
            cubepanel.add(cubeheightlabel);
            cubepanel.add(cubeside);
            cubepanel.add(cubesubmit);
            cubepanel.add(cubevolume);
            cubepanel.add(cubesarea);
            cubepanel.add(cubereset);

            cubeframe.setSize(300,460);
            cubeframe.setVisible(true);
            cubeframe.setLayout(null);
            cubeframe.getContentPane().setBackground(new Color(145, 144, 144));
            cubeframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            cubeframe.add(cubetoppanel);
            cubeframe.add(cubepanel);
        }
        if(e.getSource() == cubesubmit)
        {
            float cubesidee = Float.parseFloat(cubeside.getText());
            String cside = Float.toString(volumeofcube(cubesidee));
            cubevolume.setText(cubevolume.getText() + "   " + cside);
        }
        if(e.getSource() == cubereset)
        {
            cubevolume.setText("Volume: ");
            cubeside.setText("");
        }
        if(e.getSource() == cubeback)
        {
            cubeframe.setVisible(false);
            cubepanel.setVisible(false);
            //cubeside.setText("");
            cubevolume.setText("Volume: ");
            cubesarea.setText("Surface Area: ");
        }

    }
    //Cube
    float volumeofcube(float s)
    {
        return ((s * s)*s);
    }
    //Triangle

    float areaoftrangle(float h, float b)
    {
        return ((b * h)/2);
    }
    //Circle

    float areaofcircle(float r)
    {
        return (3.14F * (r * r));
    }
    float circumferenceOfCircle(float r)
    {
        return ((2 * 3.14f) * r);
    }

    float diameterofcir(float r)
    {
        return (2 * r);
    }

    //Rectangle
    float areaOfrectangle(float l, float w)
    {
        return (l * w);
    }
    float perimeterofrectangle(float l, float w)
    {
        return (2 * l) + (2 * w);
    }
    float diagonal(float l, float w)
    {
        return ((l * l) + (w * w));
    }
    //
}

class NewApk{
    public static void main(String[] args) {
        new A1();
        String a = "3.14";
        String b = "12";

        float r = Float.parseFloat(b);
        float pi = Float.parseFloat(a);

        System.out.println(r);
        System.out.println(pi);
        System.out.println(pi * r * r);
    }
}