import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tshirt extends JFrame implements ActionListener, ItemListener
 {
    // put the object variables here
    JPanel SOUTH, NORTH, WEST, EAST, CENTER;
    JLabel LABEL1, LABEL2, LABEL3, LABEL4, LABEL5,LABEL6;
    JRadioButton small, medium, large, xlarge, blue, red, magenta, black;
    JCheckBox Sleeves, Collar, D, S, Q1, Q2;
    JTextField TF;
	private double price1 = 0;
    private double price2 = 0;
 	private double tax = getPrice()*.08875;
	private double total = getPrice() + tax;
    private String tfs = ("OG Price: " + getPrice() + " Tax: " + tax + "Total: " + total );
    public static void main(String args[])
    {
     new Tshirt();
    }


      public Tshirt()
      {
       super("Vineyard Vito");                     // change this   ?
       Container cp = getContentPane();        // create object for GUI
       cp.setLayout(new BorderLayout());         // set default Layout
       setSize(700,500);                       // the size of the window

       // creating objects goes here?
       SOUTH= new JPanel();
       NORTH= new JPanel();
       WEST= new JPanel();
       EAST= new JPanel();
       CENTER= new JPanel();

       LABEL1 = new JLabel("Sizes");
       LABEL2 = new JLabel("Colors");
       LABEL3 = new JLabel("Vineyard Vito");
       LABEL4 = new JLabel("Decals");
       LABEL5 = new JLabel();

       small = new JRadioButton("s");
       medium = new JRadioButton("m");
       large = new JRadioButton("l");
       xlarge = new JRadioButton("xl");

       blue = new JRadioButton("Blue");
	   red = new JRadioButton("Red");
	   magenta = new JRadioButton("Magenta");
	   black = new JRadioButton("Black");

	   Sleeves = new JCheckBox("Sleeves");
	   Collar = new JCheckBox("Collar");
	   S = new JCheckBox("S");
	   D = new JCheckBox("D");
	   Q1 = new JCheckBox("Q1");
	   Q2 = new JCheckBox("Q2");
		LABEL6 = new JLabel(tfs);
      //TF = new JTextField(tfs);
	   //SOUTH.add(TF);
		SOUTH.add(LABEL6);
       ButtonGroup size = new ButtonGroup();
       size.add(small);
       size.add(medium);
       size.add(large);
       size.add(xlarge);
       WEST.add(small);
       WEST.add(medium);
       WEST.add(large);
       WEST.add(xlarge);
       small.addActionListener(this);
       medium.addActionListener(this);
       large.addActionListener(this);
       xlarge.addActionListener(this);

       ButtonGroup color = new ButtonGroup();
	   color.add(blue);
	   color.add(red);
	   color.add(magenta);
	   color.add(black);
	   EAST.add(D);
	   EAST.add(S);
	   EAST.add(Q1);
	   EAST.add(Q2);
	   EAST.add(Sleeves);
	   blue.addActionListener(this);
	   red.addActionListener(this);
	   magenta.addActionListener(this);
	   black.addActionListener(this);

	   LABEL3.setFont(new Font("Times new Roman",1,20));
	   LABEL1.setFont(new Font("Times new Roman",1,20));
	   LABEL4.setFont(new Font("Times new Roman",1,20));
	   LABEL2.setFont(new Font("Times new Roman",1,20));

       // add containers here
       cp.add(SOUTH, BorderLayout.SOUTH);
       SOUTH.setBackground(Color.blue);

       cp.add(NORTH, BorderLayout.NORTH);
       NORTH.setBackground(Color.red);
       NORTH.add(LABEL3);

       cp.add(WEST, BorderLayout.WEST);
       WEST.setBackground(Color.green);
       WEST.add(LABEL1);

       cp.add(EAST, BorderLayout.EAST);
       EAST.setBackground(Color.yellow);
       EAST.add(LABEL4);

       cp.add(CENTER, BorderLayout.CENTER);
       CENTER.setBackground(Color.pink);


       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //needed for good closing
       setVisible(true);                       //Make Window Visible - Do NOT remove
       }
       public void init()
       {


	   }
	   public void actionPerformed(ActionEvent e)
	   {


           if(e.getSource() == small)
		   {
			   price1 = price1 + 5.00;
		   }
		   if(e.getSource() == medium)
		   {
			   price1 = price1 + 6.00;
		   }
		   if(e.getSource() == large)
		   {
			   price1 = price1 +7.00;
		   }
		   if(e.getSource() == xlarge)
		   {
			   price1 = price1 + 8.00;
		   }
           if(e.getSource() == blue)
		   {
			   price1 = price1 + 4.50;
		   }
		   if(e.getSource() == red)
		   {
			   price1 = price1 + 4.50;
		   }
		   if(e.getSource() == magenta)
		   {
			   price1 = price1 + 4.50;
		   }
		   if(e.getSource() == black)
		   {
			   price1 = price1 + 4.50;
		   }

		refresh();

        }
           public void itemStateChanged(ItemEvent event)
           {
               if(Sleeves.isSelected())
			   {
				   price2 = price2 + 2.00;

			   }
			   if(Collar.isSelected())
			   {
				   price2 = price2 + 2.00;
			   }
			   if(D.isSelected())
			   {
				   price2 = price2 + 2.00;
			   }
			   if(S.isSelected())
			   {
				   price2 = price2 + 2.00;
			   }
			   if(Q1.isSelected())
			   {
				    price2 = price2 + 2.00;
			   }
			   if(Q2.isSelected())
			   {
				   price2 = price2 + 2.00;
			   }

				refresh();
		   }

		   public double getPrice()
		   {
				return price1+price2;
		   }
		   public void refresh()
		   {
			revalidate();
			repaint();
			//TF = new JTextField(tfs);
			}
	   }




