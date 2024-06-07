
package Codes;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import javax.imageio.*;
import java.nio.file.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

class SignUp extends JFrame 
{
	JTextField t1,t4,t5,t6,t7;
	JPasswordField t2,t3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JComboBox securityQsn,date,month,year;
	Cursor cursor; 
	
	SignUp(){
		
		//Frame
		
		super(" SIGN_UP ");
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Panel
		
		JPanel login = new JPanel();
		login.setLayout(null);
		login.setBackground(new Color(255,255,255));
		login.setBounds(450,85,600,650);  
		
		
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		//Button
		
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Dosis",Font.BOLD,15));
		b1.setCursor(cursor);
		b1.setBackground(new Color(66, 95, 236));
		b1.setForeground(Color.white);
		b1.setBounds(80,550,400,30);
		b1.setBorder(null);
		login.add(b1);
		
		
		
		b2 = new JButton("LogIn Here");
		b2.setFont(new Font("Dosis",Font.BOLD,13));
		b2.setCursor(cursor);
		b2.setBackground(new Color(149,189,255));
		b2.setForeground(Color.black);
		b2.setBounds(320,600,80,20);
		Border border2 = BorderFactory.createMatteBorder(0,0,1,0,Color.black);
		b2.setBorder(border2);
		login.add(b2);
		
		
		
		
		JCheckBox checkBox1 = new JCheckBox("I Agree with Terms & Conditions");  
        checkBox1.setBounds(80,490,300,40);
	    checkBox1.setBackground(new Color(255, 255, 255));		
        login.add(checkBox1);    
		
		
		
		l1 = new JLabel("Register");
		l1.setFont(new Font("Dosis",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(240,25,300,40);
		login.add(l1);
		
		l2 = new JLabel("UserName");
		l2.setFont(new Font("Dosis",Font.BOLD,15));
		l2.setForeground(Color.black);
		l2.setBounds(80,60,300,40);
		login.add(l2);
		
		l4 = new JLabel("Password");
		l4.setFont(new Font("Dosis",Font.BOLD,15));
		l4.setForeground(Color.black);
		l4.setBounds(80,110,300,40);
		login.add(l4);
		
		l5 = new JLabel("Confirm Password");
		l5.setFont(new Font("Dosis",Font.BOLD,15));
		l5.setForeground(Color.black);
		l5.setBounds(80,160,300,40);
		login.add(l5);
		
		l6 = new JLabel(" E-Mail");
		l6.setFont(new Font("Dosis",Font.BOLD,15));
		l6.setForeground(Color.black);
		l6.setBounds(80,210,300,40);
		login.add(l6);
		
		l7 = new JLabel("Mobile phone");
		l7.setFont(new Font("Dosis",Font.BOLD,15));
		l7.setForeground(Color.black);
		l7.setBounds(80,260,300,40);
		login.add(l7);
		
		
		l8 = new JLabel("Date OF Birth");
		l8.setFont(new Font("Dosis",Font.BOLD,15));
		l8.setForeground(Color.black);
		l8.setBounds(80,310,300,40);
		login.add(l8);
		
		
		l9 = new JLabel("Question");
		l9.setFont(new Font("Dosis",Font.BOLD,15));
		l9.setForeground(Color.black);
		l9.setBounds(80,365,300,40);
		login.add(l9);
		
		l11 = new JLabel("Answer");
		l11.setFont(new Font("Dosis",Font.BOLD,15));
		l11.setForeground(Color.black);
		l11.setBounds(80,420,300,40);
		login.add(l11);
		
		
		String[] secQsn = { "Choose a Security Question...", "Your childhood friend?", "Your favorite place?",
                "First pet's name?", "Your favorite food?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(80,400,400,30);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(new Font("Dosis",Font.BOLD,20));
		securityQsn.setForeground(new Color(0,0,0));
        securityQsn.setBackground(new Color(230, 255, 253));
        login.add(securityQsn);
		
		l10 = new JLabel("Already have an Account?");
		l10.setFont(new Font("Dosis",Font.BOLD,13));
		l10.setForeground(Color.black);
		l10.setBounds(160,590,300,40);
		login.add(l10);
		
		
		
		
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
		
		
		//textfield 
		
		t1 = new JTextField();
		t1.setBorder(null);
		t1.setBounds(80,90,400,30);
		t1.setFont(new Font("Dosis",Font.BOLD,20));
		Border bottomBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		t1.setBorder(bottomBorder);
		t1.setForeground(new Color(0,0,0));
		t1.setBackground(new Color(255,255,255));
		login.add(t1);
		
		
		t2 = new JPasswordField();
		t2.setBorder(null);
		t2.setBounds(80,140,400,30);
		t2.setFont(new Font("Dosis",Font.BOLD,20));
		Border bottomBorder1 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		t2.setBorder(bottomBorder1);
		t2.setForeground(new Color(0,0,0));
		t2.setBackground(new Color(255,255,255));
		login.add(t2);
		
		t3 = new JPasswordField();
		t3.setBorder(null);
		t3.setBounds(80,190,400,30);
		t3.setFont(new Font("Dosis",Font.BOLD,20));
		Border bottomBorder2 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		t3.setBorder(bottomBorder2);
		t3.setForeground(new Color(0,0,0));
		t3.setBackground(new Color(255,255,255));
		login.add(t3);
		
		t4 = new JTextField();
	    t4.setBorder(null);
		t4.setBounds(80,240,400,30);
		t4.setFont(new Font("Dosis",Font.BOLD,20));
		Border bottomBorder3 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		t4.setBorder(bottomBorder3);
		t4.setForeground(new Color(0,0,0));
		t4.setBackground(new Color(255,255,255));
		login.add(t4);
		
		t5 = new JTextField();
	    t5.setBorder(null);
		t5.setBounds(80,290,400,30);
		t5.setFont(new Font("Dosis",Font.BOLD,20));
		Border bottomBorder4 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		t5.setBorder(bottomBorder4);
		t5.setForeground(new Color(0,0,0));
		t5.setBackground(new Color(255,255,255));
		login.add(t5);
		
		/*t6 = new JTextField();
		t6.setBorder(null);
		t6.setBounds(80,340,400,30);
		t6.setFont(new Font("Dosis",Font.BOLD,20));
		Border bottomBorder5 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		t6.setBorder(bottomBorder5);
		t6.setForeground(new Color(0,0,0));
		t6.setBackground(new Color(255,255,255));
		login.add(t6);*/
		
		String[] secdt = { "SelectDate", "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        date = new JComboBox(secdt);
        date.setBounds(80,340,140,30);
        date.setSelectedIndex(0);
        date.setFont(new Font("Dosis",Font.BOLD,20));
		date.setForeground(new Color(0,0,0));
        date.setBackground(new Color(230, 255, 253));
        login.add(date);
		
		String[] secmn = { "SelectMonth", "January","February","March","April","May","June","July","August","September","October","November","December"};
        month = new JComboBox(secmn);
        month.setBounds(225,340,150,30);
        month.setSelectedIndex(0);
        month.setFont(new Font("Dosis",Font.BOLD,20));
		month.setForeground(new Color(0,0,0));
        month.setBackground(new Color(230, 255, 253));
        login.add(month);
		
		String[] secyr = { "SelectYear", "2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004",
		"2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980"};
        year = new JComboBox(secyr);
        year.setBounds(380,340,140,30);
        year.setSelectedIndex(0);
        year.setFont(new Font("Dosis",Font.BOLD,20));
		year.setForeground(new Color(0,0,0));
        year.setBackground(new Color(230, 255, 253));
        login.add(year);
		
		t7 = new JTextField();
		t7.setBorder(null);
		t7.setBounds(80,450,400,30);
		t7.setFont(new Font("Dosis",Font.BOLD,20));
		Border bottomBorder6 = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
		t7.setBorder(bottomBorder6);
		t7.setForeground(new Color(0,0,0));
		t7.setBackground(new Color(255,255,255));
		login.add(t7);
		
		
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				String uname = t1.getText().toString();
				String pwd = t2.getText().toString();
				String pwd1 = t3.getText().toString();
				String em = t4.getText().toString();
				String mb = t5.getText().toString();
				String as = t7.getText().toString();
				
				
				if(uname.isEmpty()||pwd.isEmpty()||pwd1.isEmpty()||em.isEmpty()||mb.isEmpty()||as.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please Fill all of the Fields.","Warning!",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
				
				try{
				FileWriter fw = new FileWriter(".\\Data\\login.txt",true);
				FileWriter fw1 = new FileWriter(".\\Data\\login1.txt",true);
				FileWriter fw2 = new FileWriter(".\\Data\\login2.txt",true);
				FileWriter fw3 = new FileWriter(".\\Data\\login3.txt",true);
				//FileWriter fw3 = new FileWriter("E:\\AIUB\\AIUB\\Semester - 2\\Java\\Practice\\Project_SuperMarket\\Data\\login3.txt",true);
				fw.write("User Name : "+t1.getText()+"\n"+"Password : "+t2.getText()+"\n"+"Email : "+t4.getText()+"\n"+"Mobile Number : "+t5.getText()+"\n"+"Answer : "+t7.getText()+"\n"+"********************************"+"\n");
				fw1.write(t1.getText()+"\t"+t2.getText()+"\n");
				fw2.write(t4.getText()+"\t"+t2.getText()+"\n");
				fw3.write(t5.getText()+"\t"+t2.getText()+"\n");
				fw.close();
				fw1.close();
				fw2.close();
				fw3.close();
				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f,"Registration Completed Successfully.","Account Created",JOptionPane.INFORMATION_MESSAGE);
				dispose();
				Login l = new Login();
				l.setVisible(true);
				}catch(Exception e){}
			  
				}
			}
		});
		
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Login l = new Login();
				l.setVisible(true);
				l.setSize(1920,1080);
				l.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		
	
		setUndecorated(true);
		setSize(1920,1080);
		setVisible(true);
		setResizable(false);
		
	}
	
	
	
		public  static void main(String []args){
			
		new SignUp();	
		}
	
}