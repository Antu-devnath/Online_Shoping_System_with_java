package Codes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.nio.file.*;
import javax.swing.ImageIcon;

import java.awt.Component;
public class homepage extends JFrame
{
//private Container c;
private JLabel l1;
private JPanel p;
private JButton b1,b2,b3,b4;
private JTextField t1;
private ImageIcon icon;
private Container c;

public homepage()
{
	
	    super("HOME PAGE");
		this.setSize(1920,1080);
		//this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		 
	c=this.getContentPane ();
	c.setLayout(null);
	c.setBackground(Color.BLACK);
	
	Image image1 = null;
		try{
		File sourceimage = new File(".\\Images\\h1.jpg");
	    image1 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img = new ImageIcon(image1);
		Image img2 = background_img.getImage();
		Image temp_img = img2.getScaledInstance(1520,855,Image.SCALE_SMOOTH);
		background_img = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_img,JLabel.CENTER);
		background.setBounds(0,0,1520,855);
		c.add(background);
	
		
		
		b1=new JButton("Shop Now");
		b1.setBounds(1040,550,240,60);
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Arial",Font.BOLD,20));
		background.add(b1);
		validate();
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Login l = new Login();
				l.setVisible(true);
				l.setSize(1920,1080);
				l.setResizable(false);
				l.setLocationRelativeTo(null);
				dispose();
			}
		});
			b2=new JButton("About");
			b2.setBounds(160,80,80,30);
			b2.setBackground(Color.ORANGE);
			b2.setForeground(Color.WHITE);
			b2.setFont(new Font("Arial",Font.BOLD,12));
		    background.add(b2);
			validate();
			b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				about a=new about();
				a.setVisible(true);
				a.setSize(626,887);
				a.setTitle("About");
                a.setLocationRelativeTo(null);
                a.setResizable(false);
			}

			});
			
		
            b3=new JButton("Contact");
			b3.setBounds(250,80,80,30);
			b3.setBackground(Color.ORANGE);
			b3.setForeground(Color.WHITE);
			b3.setFont(new Font("Arial",Font.BOLD,12));
		    background.add(b3);
			validate();
			b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				contact c1=new contact();
				c1.setVisible(true);
				c1.setSize(626,887);
				c1.setTitle("Contact");
                c1.setLocationRelativeTo(null);
                c1.setResizable(false);
			}

			});
			
			b4=new JButton("AdminLogin");
			b4.setBounds(340,80,100,30);
			b4.setBackground(Color.ORANGE);
			b4.setForeground(Color.WHITE);
			b4.setFont(new Font("Arial",Font.BOLD,12));
		    background.add(b4);
			
			b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				adminlogin aa = new adminlogin();
				aa.setVisible(true);
				aa.setSize(1920,1080);
				aa.setLocationRelativeTo(null);
				dispose();
			}
		});
		
			setVisible(true);
		    setResizable(false);
		
}	
class about extends JFrame
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9 ;
	private ImageIcon icon;
	private Container c;


 about()
{
	c=this.getContentPane ();
	c.setLayout(null);
	c.setBackground(Color.BLACK);
	
	l1=new JLabel("Welcome to the BLACK MART ");
	l1.setBounds(50,100,550,30);
	l1.setFont(new Font("Arial",Font.BOLD,25));
	add(l1);
	
	l2=new JLabel("Operated by CyberBugs Ltd. Since 2023");
	l2.setBounds(50,120,550,30);
	l2.setFont(new Font("Arial",Font.BOLD,10));
	add(l2);
	
	l3=new JLabel("BLACK MART is the pioneer of the e-commerce industry ");
	l3.setBounds(50,180,550,30);
	l3.setFont(new Font("Arial",Font.BOLD,15));
	add(l3);
	
	l4=new JLabel("who has brought a new trend of online retail platforms and");
	l4.setBounds(50,200,550,30);
	l4.setFont(new Font("Arial",Font.BOLD,15));
	add(l4);
	
	l5=new JLabel("change in the shopping trend of Bangladesh. They are a ");
	l5.setBounds(50,220,550,30);
	l5.setFont(new Font("Arial",Font.BOLD,15));
	add(l5);
	
	
	l6=new JLabel("cutting edge e-commerce platform which brings the latest ");
	l6.setBounds(50,240,550,30);
	l6.setFont(new Font("Arial",Font.BOLD,15));
	add(l6);
	
	l7=new JLabel("local and international goods to people’s doorstep.They");
	l7.setBounds(50,260,550,30);
	l7.setFont(new Font("Arial",Font.BOLD,15));
	add(l7);
	
	l8=new JLabel("offer a wide selection of products from renowned brands in ");
	l7.setBounds(50,280,550,30);
	l7.setFont(new Font("Arial",Font.BOLD,15));
	add(l7);
	
	l8=new JLabel("Bangladesh with a promise of fast, safe and easy online ");
	l8.setBounds(50,300,550,30);
	l8.setFont(new Font("Arial",Font.BOLD,15));
	add(l8);
	
	l9=new JLabel("shopping experience.");
	l9.setBounds(50,320,550,30);
	l9.setFont(new Font("Arial",Font.BOLD,15));
	add(l9);
	
	

	
	Image image3 = null;
		try{
		File sourceimage = new File(".\\Images\\About.jpg");
	    image3 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img2 = new ImageIcon(image3);
		Image img4 = background_img2.getImage();
		Image temp_img2 = img4.getScaledInstance(626,887,Image.SCALE_SMOOTH);
		background_img2 = new ImageIcon(temp_img2);
		JLabel background2 = new JLabel("",background_img2,JLabel.CENTER);
		background2.setBounds(0,0,626,887);
		c.add(background2);
	
	/*icon=new ImageIcon(this.getClass().getResource("about.jpg"));
		l2=new JLabel(icon);
        l2.setBounds(0,0,626,887);
		c.add(l2);*/
}
}
class contact extends JFrame
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	private ImageIcon icon;
	private Container c;
	contact()
	
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		l1=new JLabel("CONTACT WITH US");
		l1.setBounds(150,0,500,100);
		l1.setFont(new Font("Britannic Bold",Font.BOLD,25));
		add(l1);
		
		
		
		l2=new JLabel("ALVEY REYHAN || ID:22-49071-3");
		l2.setBounds(10,180,500,100);
		l2.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l2);
		
		
		Image image7 = null;
		try{
		File sourceimage = new File(".\\Images\\alvey.jpg");
	    image7 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img4 = new ImageIcon(image7);
		Image img8 = background_img4.getImage();
		Image temp_img4 = img8.getScaledInstance(150,150,Image.SCALE_SMOOTH);
		background_img4 = new ImageIcon(temp_img4);
		JLabel background4 = new JLabel("",background_img4,JLabel.CENTER);
		background4.setBounds(40,70,150,150);
		add(background4);
		   
		
		
		l3=new JLabel("EMAIL:22-49071-3@student.aiub.edu");
		l3.setBounds(10,200,500,100);
		l3.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l3);
		
		l4=new JLabel("SHAHARIA HASAN JETUL || ID:22-49059-3");
		l4.setBounds(10,410,500,100);
		l4.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l4);
		
		Image image9 = null;
		try{
		File sourceimage = new File(".\\Images\\jitul.jpg");
	    image9 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img6 = new ImageIcon(image9);
		Image img10 = background_img6.getImage();
		Image temp_img6 = img10.getScaledInstance(150,150,Image.SCALE_SMOOTH);
		background_img6 = new ImageIcon(temp_img6);
		JLabel background6 = new JLabel("",background_img6,JLabel.CENTER);
		background6.setBounds(40,300,150,150);
		add(background6);
		
		
		l5=new JLabel("EMAIL:22-49059-3@student.aiub.edu");
		l5.setBounds(10,430,500,100);
		l5.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l5);
		
		l6=new JLabel("ZAMIUL SADIK NAHIN || ID:20-44228-3");
		l6.setBounds(310,410,500,100);
		l6.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l6);
		
		Image image10 = null;
		try{
		File sourceimage = new File(".\\Images\\sadik.jpg");
	    image10 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img7 = new ImageIcon(image10);
		Image img11 = background_img7.getImage();
		Image temp_img7 = img11.getScaledInstance(150,150,Image.SCALE_SMOOTH);
		background_img7 = new ImageIcon(temp_img7);
		JLabel background7 = new JLabel("",background_img7,JLabel.CENTER);
		background7.setBounds(350,300,150,150);
		add(background7);
		
		
		
		l7=new JLabel("EMAIL:20-44228-3@student.aiub.edu");
		l7.setBounds(310,430,500,100);
		l7.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l7);
		
		
		l8=new JLabel("ANTU CHANDRA DEBNATH || ID:22-49289-3");
		l8.setBounds(300,180,500,100);
		l8.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l8);
		
		Image image8 = null;
		try{
		File sourceimage = new File(".\\Images\\antu1.jpg");
	    image8 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img5 = new ImageIcon(image8);
		Image img9 = background_img5.getImage();
		Image temp_img5 = img9.getScaledInstance(150,150,Image.SCALE_SMOOTH);
		background_img5 = new ImageIcon(temp_img5);
		JLabel background5 = new JLabel("",background_img5,JLabel.CENTER);
		background5.setBounds(350,70,150,150);
		add(background5);
		
		l9=new JLabel("EMAIL:22-49289-3@student.aiub.edu");
		l9.setBounds(300,200,500,100);
		l9.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l9);
		
		
		Image image5 = null;
		try{
		File sourceimage = new File(".\\Images\\About.jpg");
	    image5 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img3 = new ImageIcon(image5);
		Image img6 = background_img3.getImage();
		Image temp_img3 = img6.getScaledInstance(626,887,Image.SCALE_SMOOTH);
		background_img3 = new ImageIcon(temp_img3);
		JLabel background3 = new JLabel("",background_img3,JLabel.CENTER);
		background3.setBounds(0,0,626,887);
		c.add(background3);
		   
		  
		  setVisible(true);
		  setResizable(false);
		 
		
	}
	
	
}
 public static void main(String[] args) {

       new homepage();
	 
    }

}