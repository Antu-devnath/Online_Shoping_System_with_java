
package Codes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.nio.file.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class adminlogin extends JFrame implements ActionListener {
        JLabel l1,l2,l3,l5;
		JTextField t1;
		JPasswordField t2;
		JButton b1,b2; 
		JPanel p1;
		Cursor cursor; 
  

    public adminlogin() {
        super("Admin Login");
		this.setLayout(null);
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setBackground(new Color(255,255,255, 30));
		login.setBounds(550,155,500,500);  
		
		
	   
		
		l1=new JLabel("User Name");
	    l1.setFont(new Font("Dosis",Font.BOLD,25));
	    l1.setForeground(Color.black);
	    l1.setBounds(50,120,150,20);
	    login.add(l1);
	  
	    l2=new JLabel("Password");
	    l2.setFont(new Font("Dosis",Font.BOLD,25));
	    l2.setForeground(Color.black);
	    l2.setBounds(50,200,150,20);
	    login.add(l2);
		
		l3 = new JLabel("ADMIN LOGIN");
		l3.setFont(new Font("Dosis",Font.BOLD,25));
		l3.setForeground(Color.black);
		l3.setBounds(165,35,300,40);
		login.add(l3);
		
		
		
	    l5 = new JLabel("Don't have Permission? To Return to Login Page");
		l5.setFont(new Font("Dosis",Font.BOLD,13));
		l5.setForeground(Color.white);
		l5.setBounds(50,430,300,40);
		login.add(l5);
		
		 t1 = new JTextField(30);
		 t1.setBorder(null);
		 t1.setBounds(50,150,400,35);
		 t1.setFont(new Font("Dosis",Font.BOLD,18));
		 Border bottomBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		 t1.setBorder(bottomBorder);
		// t1.setBackground(new Color(255,255,255));
		 t1.setForeground(new Color(0,0,0));
		 t1.setBackground(new Color(255,255,255));
		 login.add(t1);
		 
		 t2 = new JPasswordField(30);
		 t2.setBorder(null);
		 t2.setBounds(50,230,400,35);
		 t2.setFont(new Font("Dosis",Font.BOLD,18));
		 Border bottomBorder1 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		 t2.setBorder(bottomBorder1);
		 t2.setForeground(new Color(0,0,0));
		 t2.setBackground(new Color(255,255,255));
		 login.add(t2);
		
	  
	  cursor = new Cursor(Cursor.HAND_CURSOR);
	  
	  //Button
		
		b1=new JButton("Login");
	    b1.setFont(new Font("Dosis",Font.BOLD,16));
		b1.setCursor(cursor);
	    b1.setForeground(Color.black);
	    b1.setBounds(50,300,400,32);
	    b1.setBackground(new Color(32,182,199));
	    b1.setBorder(BorderFactory.createLineBorder(new Color(32,182,199)));
	    b1.setFocusable(false);
	    login.add(b1);
        b1.addActionListener(this);
		
		
		
			
		b2 = new JButton("Click Here.");
		b2.setFont(new Font("Dosis",Font.BOLD,13));
		b2.setCursor(cursor);
		b2.setBackground(new Color(149,189,255));
		b2.setForeground(Color.black);
		//b4.setContentAreaFilled(false);
		b2.setBounds(350,440,80,20);
		Border border2 = BorderFactory.createMatteBorder(0,0,1,0,Color.black);
		b2.setBorder(border2);
		login.add(b2);
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Login l = new Login();
				l.setVisible(true);
				l.setSize(1920,1080);
				l.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		
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
		File sourceimage = new File(".\\Images\\admin.png");
	    image3 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img2 = new ImageIcon(image3);
		Image img4 = background_img2.getImage();
		Image temp_img2 = img4.getScaledInstance(100,100,Image.SCALE_SMOOTH);
		background_img2 = new ImageIcon(temp_img2);
		JLabel background2 = new JLabel("",background_img2,JLabel.CENTER);
		background2.setBounds(750,85,100,100);
		background.add(background2);
		
		Image image5 = null;
		try{
		File sourceimage = new File(".\\Images\\1.png");
	    image5 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img3 = new ImageIcon(image5);
		Image img6 = background_img3.getImage();
		Image temp_img3 = img6.getScaledInstance(420,200,Image.SCALE_SMOOTH);
		background_img3 = new ImageIcon(temp_img3);
		JLabel background3 = new JLabel("",background_img3,JLabel.CENTER);
		background3.setBounds(590,440,420,200);
		background.add(background3);
		
		setUndecorated(true);
		setVisible(true);
		setResizable(false);
		
		
    }
	
	public void actionPerformed(ActionEvent ae)
		{
			if(t1.getText().toString().equals("admin") && t2.getText().toString().equals("admin"))
				{
				 JOptionPane.showMessageDialog(null,"You Are Successfully Logged In","Logged In",JOptionPane.INFORMATION_MESSAGE);
				 dispose();
				 adminpage a = new adminpage();
				 a.setVisible(true); 
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid UserName Or Password","ERROR",JOptionPane.WARNING_MESSAGE);
				}
		
		
		}

    public static void main(String[] args) {
       
        new adminlogin();
}
}
