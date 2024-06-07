
package Codes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.nio.file.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

  class Login extends JFrame
{
	JTextField t1,t2;
	JPasswordField p1;
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3,l4,l5,l6;
	Cursor cursor;
	JCheckBox c;
	
	Login()
	{
		super(" USER_NAME LOGIN PAGE");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		//panel
		
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setBackground(new Color(255,255,255, 30));
		login.setBounds(500,130,500,550);
		
		
		
		//label
		
		l1 = new JLabel("LOGIN FORM");
		l1.setFont(new Font("Dosis",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(165,45,300,40);
		login.add(l1);
		
		/*l2 = new JLabel("Username");
		l2.setFont(new Font("Dosis",Font.BOLD,15));
		l2.setForeground(Color.white);
		l2.setBounds(50,100,300,40);
		login.add(l2);*/
		
		l2 = new JLabel("Username");
		l2.setFont(new Font("Dosis",Font.BOLD,15));
		l2.setForeground(Color.white);
		l2.setBounds(50,100,300,40);
		login.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Dosis",Font.BOLD,15));
		l3.setForeground(Color.white);
		l3.setBounds(50,180,300,40);
		login.add(l3);
		
		l5 = new JLabel("Or");
		l5.setFont(new Font("Dosis",Font.BOLD,20));
		l5.setForeground(Color.white);
		l5.setBounds(240,340,300,40);
		login.add(l5);
		
		l6 = new JLabel("Don't have an account?");
		l6.setFont(new Font("Dosis",Font.BOLD,13));
		l6.setForeground(Color.white);
		l6.setBounds(140,480,300,40);
		login.add(l6);
		
		
		//chechbox
		
		c = new JCheckBox("Show Password");
		c.setFont(new Font("Dosis",Font.BOLD,15));
		c.setForeground(Color.black);
		c.setBackground(new Color(255,255,255));
		c.setBounds(50,250,150,30);
		login.add(c);
		
		c.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
					if(c.isSelected())
					{
						p1.setEchoChar((char) 0);
					}
					else{
						p1.setEchoChar('*');
					}
				
			}
		});
		
		
		
		//TextField
		
	     t1 = new JTextField(30);
		 t1.setBorder(null);
		 t1.setBounds(50,130,400,30);
		 t1.setFont(new Font("Dosis",Font.BOLD,18));
		 Border bottomBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		 t1.setBorder(bottomBorder);
		// t1.setBackground(new Color(255,255,255));
		 t1.setForeground(new Color(0,0,0));
		 t1.setBackground(new Color(255,255,255));
		 login.add(t1);
		 
		
		
		p1 = new JPasswordField();
		p1.setBounds(50,210,400,30);
		p1.setFont(new Font("Dosis",Font.BOLD,18));
		Border bottomBorder1 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		p1.setBorder(bottomBorder1);
		p1.setBackground(new Color(255,255,255));
		login.add(p1);
		
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		//Button
		
		
		
		b1 = new JButton("Log In");
		b1.setFont(new Font("Dosis",Font.BOLD,15));
		b1.setCursor(cursor);
		b1.setBackground(new Color(66, 95, 236));
		b1.setForeground(Color.white);
		b1.setBounds(50,290,400,30);
		b1.setBorder(null);
		login.add(b1);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				boolean matched = false;
				String uname = t1.getText().toString();
				String pwd = p1.getText().toString();
				
				try{
					
				BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\login1.txt"));
					
				FileReader fr = new FileReader(".\\Data\\login1.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				while((line=br.readLine())!=null){
					if(line.equals(uname+"\t"+pwd)){
						matched = true;
						break;
					}
				}
				fr.close();
				}
				catch(Exception e){}
				if(matched){
				 JOptionPane.showMessageDialog(null,"You Are Successfully Logged In","Logged In",JOptionPane.INFORMATION_MESSAGE);
				 dispose();
				 mainpage m = new mainpage();
				 m.setVisible(true); 
				}
			else{
				JOptionPane.showMessageDialog(null,"Invalid UserName Or Password");
			}
		
			}
		});
		
		
		
		b4 = new JButton("SignUp Now");
		b4.setFont(new Font("Dosis",Font.BOLD,13));
		b4.setCursor(cursor);
		b4.setBackground(new Color(149,189,255));
		b4.setForeground(Color.black);
		b4.setBounds(290,490,80,20);
		Border border2 = BorderFactory.createMatteBorder(0,0,1,0,Color.black);
		b4.setBorder(border2);
		login.add(b4);
		
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				SignUp s = new SignUp();
				s.setVisible(true);
				s.setSize(1920,1080);
				s.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		
		b2 = new JButton("Sign in with Email");
		b2.setFont(new Font("Dosis",Font.BOLD,15));
		b2.setCursor(cursor);
		b2.setBackground(new Color(66, 95, 236));
		b2.setForeground(Color.white);
		b2.setBounds(30,430,210,30);
		b2.setBorder(null);
		login.add(b2);
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				EmailLogin e = new EmailLogin();
				e.setVisible(true);
				e.setSize(1920,1080);
				e.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		b3 = new JButton("Sign in with MobileNumber");
		b3.setFont(new Font("Dosis",Font.BOLD,15));
		b3.setCursor(cursor);
		b3.setBackground(new Color(220,77,1));
		b3.setForeground(Color.white);
		b3.setBounds(250,430,210,30);
		b3.setBorder(null);
		login.add(b3);
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				MobileLogin m = new MobileLogin();
				m.setVisible(true);
				m.setSize(1920,1080);
				m.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		
		
		
		//Image
		
		Image image1 = null;
		try{
		File sourceimage = new File(".\\Images\\Background.jpg");
	    image1 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img = new ImageIcon(image1);
		Image img2 = background_img.getImage();
		Image temp_img = img2.getScaledInstance(1920,1080,Image.SCALE_SMOOTH);
		background_img = new ImageIcon(temp_img);
		JLabel background = new JLabel("",background_img,JLabel.CENTER);
		background.add(login);
		background.setBounds(0,0,1920,1080);
		add(background);
		
		
		Image image3 = null;
		try{
		//File sourceimage = new File("E:\\AIUB\\AIUB\\Semester - 2\\Java\\Practice\\Project_SuperMarket\\Images\\icon.png");
		File sourceimage = new File(".\\Images\\icon.png");
	    image3 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img2 = new ImageIcon(image3);
		Image img4 = background_img2.getImage();
		Image temp_img2 = img4.getScaledInstance(150,150,Image.SCALE_SMOOTH);
		background_img2 = new ImageIcon(temp_img2);
		JLabel background2 = new JLabel("",background_img2,JLabel.CENTER);
		background2.setBounds(670,55,150,150);
		background.add(background2);
		
		
		
		Image image5 = null;
		try{
		//File sourceimage = new File("E:\\AIUB\\AIUB\\Semester - 2\\Java\\Practice\\Project_SuperMarket\\Images\\1.png");
		File sourceimage = new File(".\\Images\\1.png");
	    image5 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img3 = new ImageIcon(image5);
		Image img6 = background_img3.getImage();
		Image temp_img3 = img6.getScaledInstance(400,200,Image.SCALE_SMOOTH);
		background_img3 = new ImageIcon(temp_img3);
		JLabel background3 = new JLabel("",background_img3,JLabel.CENTER);
		background3.setBounds(550,425,400,200);
		background.add(background3);
		
	   
	   setUndecorated(true);
		setSize(1920,1080);
		setVisible(true);
		setResizable(false);
		
		
		
	}

     public  static void main(String []args){
			
		new Login();	
		}
	
}	






 