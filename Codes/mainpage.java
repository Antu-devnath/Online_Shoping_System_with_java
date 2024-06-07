package Codes;
//package Images;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
//import java.nio.file.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

//import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.plaf.basic.BasicComboBoxUI;
//import java.awt.Component;
public class mainpage extends javax.swing.JFrame
{
private Container c;
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
private JPanel p,mainPanel;
private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
private JTextField t1;
private ImageIcon icon1,icon2,shoe,pant,watch,shirt;
private JComboBox combobox;
private JMenuBar m1,m2;
private JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11;
private JMenu file,file2;
//private JScrollPane scrollPane;

mainpage()
{
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(700,50,400,400);
setSize(1920,1080);
setTitle("main page");
setLocationRelativeTo(null);
setResizable(false);
//setBorderPainted(false);
setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
setUndecorated(true);


        
        


String[] item = {"shirt","pant","wallet","watch","mobile","ac","shoe","bag","camera","makeup"};
  
  
  
  combobox = new JComboBox(item);
  combobox.setEditable(true);
  combobox.setBounds(600,150,300,30);
  //combobox.setSelectedIndex(0);
  //AutoCompleteDecorator.decorate(combobox);
  combobox.setSelectedItem("search here");
  
  combobox.addFocusListener(new FocusListener(){
			  
			  public void focusGained(FocusEvent event){
				  if (combobox.getSelectedItem().equals("search here")){
					  combobox.setSelectedItem("");
				  }
			  }
			  public void focusLost(FocusEvent event){
				  if(combobox.getSelectedItem().equals("")){
					  combobox.setSelectedItem("search here");
				  }
			  }
		  });

       
  add(combobox);
        b6 = new JButton("search");
		b6.setBounds(900,150,100,30);
        b6.setBackground(Color.WHITE);
		b6.setBorder(null);
  b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				String product = (String) combobox.getSelectedItem();
                //setVisible(false);
	        
				if (product.equals("shirt"))
				{
					shirt i1=new shirt();
				i1.setVisible(true);
				i1.setBounds(200,200,500,600);
				i1.setSize(1920,1080);
				i1.setTitle("Shirt");
                i1.setLocationRelativeTo(null);
                i1.setResizable(false);
				i1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("pant"))
				{
					pant i2=new pant();
				i2.setVisible(true);
				i2.setBounds(200,200,500,600);
				i2.setSize(1920,1080);
				i2.setTitle("Pant");
                i2.setLocationRelativeTo(null);
                i2.setResizable(false);
				i2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("watch"))
				{
					watch i3=new watch();
				i3.setVisible(true);
				i3.setBounds(200,200,500,600);
				i3.setTitle("Watch");
				i3.setSize(1920,1080);
                i3.setLocationRelativeTo(null);
                i3.setResizable(false);
				i3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("wallet"))
				{
					wallet i4=new wallet();
				i4.setVisible(true);
				i4.setBounds(200,200,500,600);
				i4.setTitle("Wallet");
				i4.setSize(1920,1080);
                i4.setLocationRelativeTo(null);
                i4.setResizable(false);
				i4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("mobile"))
				{
					mobile i6=new mobile();
				i6.setVisible(true);
				i6.setBounds(200,200,500,600);
				i6.setTitle("Mobile");
				i6.setSize(1920,1080);
                i6.setLocationRelativeTo(null);
                i6.setResizable(false);
				i6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				
				else if(product.equals("ac"))
				{
					ac i8=new ac();
				i8.setVisible(true);
				i8.setBounds(200,200,500,600);
				i8.setTitle("Ac");
				i8.setSize(1920,1080);
                i8.setLocationRelativeTo(null);
                i8.setResizable(false);
				i8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("shoe"))
				{
					shoe i7=new shoe();
				i7.setVisible(true);
				i7.setBounds(200,200,500,600);
				i7.setTitle("Shoe");
				i7.setSize(1920,1080);
                i7.setLocationRelativeTo(null);
                i7.setResizable(false);
				i7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("bag"))
				{
					bag i5=new bag();
				i5.setVisible(true);
				i5.setBounds(200,200,500,600);
				i5.setTitle("Bag");
				i5.setSize(1920,1080);
                i5.setLocationRelativeTo(null);
                i5.setResizable(false);
				i5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("camera"))
				{
					camera i10=new camera();
				i10.setVisible(true);
				i10.setBounds(200,200,500,600);
				i10.setTitle("Camera");
				i10.setSize(1920,1080);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				i10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				else if(product.equals("makeup"))
				{
					makeup i9=new makeup();
				i9.setVisible(true);
				i9.setBounds(200,200,500,600);
				i9.setTitle("Makeup");
				i9.setSize(1920,1080);
                i9.setLocationRelativeTo(null);
                i9.setResizable(false);
				i9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				}
				
			    
				
			}
		});
		add(b6);
		

		
		




m1=new JMenuBar();



file=new JMenu("Products");
file2=new JMenu("dashboard");

i1=new JMenuItem("Shirt");
i2=new JMenuItem("Pant");
i3=new JMenuItem("Watch");
i4=new JMenuItem("Wallet");
i5=new JMenuItem("Bag");
i6=new JMenuItem("Mobile");
i7=new JMenuItem("Shoe");
i8=new JMenuItem("Ac");
i9=new JMenuItem("Makeup");
i10=new JMenuItem("Camera");
i11=new JMenuItem("panel");

file.add(i1);
file.add(i2);
file.add(i3);
file.add(i4);
file.add(i5);
file.add(i6);
file.add(i7);
file.add(i8);
file.add(i9);
file.add(i10);
file2.add(i11);

m1.add(file);
setJMenuBar(m1);
m1.add(file2);


i1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				shirt i1=new shirt();
				i1.setVisible(true);
				i1.setBounds(200,200,500,600);
				i1.setSize(1920,1080);
				i1.setTitle("Shirt");
                i1.setLocationRelativeTo(null);
                i1.setResizable(false);
				i1.setUndecorated(true);
				i1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				//dispose();
				
			}
		});
		
		i2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				pant i2=new pant();
				i2.setVisible(true);
				i2.setBounds(200,200,500,600);
				i2.setSize(1920,1080);
				i2.setTitle("Pant");
                i2.setLocationRelativeTo(null);
                i2.setResizable(false);
				i2.setUndecorated(true);
				i2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				watch i3=new watch();
				i3.setVisible(true);
				i3.setBounds(200,200,500,600);
				i3.setTitle("Watch");
				i3.setSize(1920,1080);
                i3.setLocationRelativeTo(null);
                i3.setResizable(false);
				i3.setUndecorated(true);
				i3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				wallet i4=new wallet();
				i4.setVisible(true);
				i4.setBounds(200,200,500,600);
				i4.setTitle("Wallet");
				i4.setSize(1920,1080);
                i4.setLocationRelativeTo(null);
                i4.setResizable(false);
				i4.setUndecorated(true);
				i4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				bag i5=new bag();
				i5.setVisible(true);
				i5.setBounds(200,200,500,600);
				i5.setTitle("Bag");
				i5.setSize(1920,1080);
                i5.setLocationRelativeTo(null);
                i5.setResizable(false);
				i5.setUndecorated(true);
				i5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mobile i6=new mobile();
				i6.setVisible(true);
				i6.setBounds(200,200,500,600);
				i6.setTitle("Mobile");
				i6.setSize(1920,1080);
                i6.setLocationRelativeTo(null);
                i6.setResizable(false);
				i6.setUndecorated(true);
				i6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				shoe i7=new shoe();
				i7.setVisible(true);
				i7.setBounds(200,200,500,600);
				i7.setTitle("Shoe");
				i7.setSize(1920,1080);
                i7.setLocationRelativeTo(null);
                i7.setResizable(false);
				i7.setUndecorated(true);
				i7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				ac i8=new ac();
				i8.setVisible(true);
				i8.setBounds(200,200,500,600);
				i8.setTitle("Ac");
				i8.setSize(1920,1080);
                i8.setLocationRelativeTo(null);
                i8.setResizable(false);
				i8.setUndecorated(true);
				i8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
			   makeup i9=new makeup();
				i9.setVisible(true);
				i9.setBounds(200,200,500,600);
				i9.setTitle("Makeup");
				i9.setSize(1920,1080);
                i9.setLocationRelativeTo(null);
                i9.setResizable(false);
				i9.setUndecorated(true);
				i9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		
		i10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				camera i10=new camera();
				i10.setVisible(true);
				i10.setBounds(200,200,500,600);
				i10.setTitle("Camera");
				i10.setSize(1920,1080);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				i10.setUndecorated(true);
				i10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});
		i11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				dashboard i11=new dashboard();
				i11.setVisible(true);
				i11.setBounds(200,200,500,600);
				i11.setTitle("dashboard");
				i11.setSize(1920,1080);
                i11.setLocationRelativeTo(null);
                i11.setResizable(false);
				i11.setUndecorated(true);
				i11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
			}
		});









		/*b6 = new JButton("search");
		b6.setBounds(900,150,100,30);
        b6.setBackground(Color.WHITE);
		//b6.setIcon(new ImageIcon("search1.jpg"));
        add(b6);
		//validate();
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				//JOptionPane.showMessageDialog(null,"Oops! Button Coming Soon");
				//setVisible(false);
				
			}
		});*/


c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.WHITE);
    //label
l1=new JLabel("Black Mart");
l1.setBounds(1070,30,250,50);
l1.setFont(new Font("Arial",Font.BOLD,40));

c.add(l1);




        //search bar
          
		/* t1=new JTextField(30);
		  t1.setBounds(600,150,300,30);
		  t1.setText("search here");
		  add(t1);
		  t1.addFocusListener(new FocusListener(){
			  
			  public void focusGained(FocusEvent event){
				  if (t1.getText().equals("search here")){
					  t1.setText("");
				  }
			  }
			  public void focusLost(FocusEvent event){
				  if(t1.getText().equals("")){
					  t1.setText("search here");
				  }
			  }
		  });*/
		  
		  
		 //main page er button 

        b1 = new JButton("shirt");
		b1.setBounds(30,300,180,180);
        b1.setBackground(Color.ORANGE);
		b1.setBorder(null);
		b1.setIcon(new ImageIcon(".\\Images\\s1.jpg"));
		
        add(b1);
		validate();
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      first f=new first();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Hawai Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				f.setUndecorated(true);
			}
		});
		l4=new JLabel("Hawai shirt $500");
        l4.setBounds(45,400,180,180);
        l4.setFont(new Font("Arial",Font.BOLD,18));
        add(l4);
	    
		b2=new JButton("pant");
		b2.setBounds(250,300,180,180);
        b2.setBackground(Color.ORANGE);
		b2.setBorder(null);
		b2.setIcon(new ImageIcon(".\\Images\\p1.jpg"));
        add(b2);
		validate();
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      second s=new second();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("Black Pant");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		
		l5=new JLabel("black pant $250");
        l5.setBounds(265,400,180,180);
        l5.setFont(new Font("Arial",Font.BOLD,18));
        add(l5);
		
		b3 = new JButton("shoe");
		b3.setBounds(470,300,180,180);
        b3.setBackground(Color.ORANGE);
		b3.setBorder(null);
		b3.setIcon(new ImageIcon(".\\Images\\shoe1.jpg"));
        add(b3);
		validate();
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      third t=new third();
				t.setVisible(true);
				t.setBounds(200,200,500,600);
				t.setTitle("Leather Shoe");
                t.setLocationRelativeTo(null);
                t.setResizable(false);
			}
		});
		
		
		l6=new JLabel("leather shoe $650");
        l6.setBounds(485,400,180,180);
        l6.setFont(new Font("Arial",Font.BOLD,18));
        add(l6);
		
		b4 = new JButton("watch");
		b4.setBounds(690,300,180,180);
        b4.setBackground(Color.ORANGE);
		b4.setBorder(null);
		b4.setIcon(new ImageIcon(".\\Images\\w1.jpg"));
        add(b4);
		validate();
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      fourth f1=new fourth();
				f1.setVisible(true);
				f1.setBounds(200,200,500,600);
				f1.setTitle("Wrist Watch");
                f1.setLocationRelativeTo(null);
                f1.setResizable(false);
			}
		});
		l7=new JLabel("wrist watch $1000"); 
        l7.setBounds(705,400,180,180);
        l7.setFont(new Font("Arial",Font.BOLD,18));
        add(l7);
		
		b5 = new JButton("Logout");
		b5.setBounds(1400,100,100,50);
		b5.setBorder(null);
		b5.setFont(new Font("Arial",Font.BOLD,18));
       // b5.setBackground(new Color(220,77,1));
		b5.setForeground(Color.WHITE);
				b5.setBackground(Color.RED);
        add(b5);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				int a=JOptionPane.showConfirmDialog(null,"do you want to logout","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
				homepage h = new homepage();
				h.setVisible(true);
				h.setSize(1920,1080);
				h.setLocationRelativeTo(null);
				dispose();
				}
				//setVisible(false);
				
			}
		});
		/*b6 = new JButton("cart");
		b6.setBounds(1400,200,100,30);
        b6.setBackground(Color.BLUE); 
		b6.setBorder(null);
		b6.setForeground(Color.BLACK);
		//b6.setIcon(new ImageIcon("search1.jpg"));
        add(b6);
		//validate();
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				 hello h=new hello();
				h.setVisible(true);
				h.setBounds(200,200,500,600);
				h.setTitle("Add to cart");
				h.setSize(1920,1080);
                h.setLocationRelativeTo(null);
                h.setResizable(false);
				h.setUndecorated(true);
				h.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				
			}
		});*/
		b7=new JButton("wallet");
		b7.setBounds(905,300,180,180);
        b7.setBackground(Color.ORANGE);
		b7.setBorder(null);
		b7.setIcon(new ImageIcon(".\\Images\\m1.jpg"));
        add(b7);
		validate();
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      sixth s=new sixth();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("Wallet");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		l8=new JLabel("wallet  $2000"); 
        l8.setBounds(935,400,180,180);
        l8.setFont(new Font("Arial",Font.BOLD,18));
        add(l8);
		
	b8=new JButton("camera");
		b8.setBounds(1125,300,180,180);
        b8.setBackground(Color.ORANGE);
		b8.setBorder(null);
		b8.setIcon(new ImageIcon(".\\Images\\c1.jpg"));
        add(b8);
		validate();
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      seven s=new seven();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("Camera");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		l9=new JLabel("camera  $46,000"); 
        l9.setBounds(1170,400,180,180);
        l9.setFont(new Font("Arial",Font.BOLD,18));
        add(l9);
		
		b9=new JButton("bag");
		b9.setBounds(1340,300,180,180);
        b9.setBackground(Color.ORANGE);
		b9.setBorder(null);
		b9.setIcon(new ImageIcon(".\\Images\\bag1.jpg"));
        add(b9);
		validate();
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      eight s=new eight();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("Bag");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		l10=new JLabel("bag  $2500"); 
        l10.setBounds(1380,400,180,180);
        l10.setFont(new Font("Arial",Font.BOLD,18));
        add(l10);
		
		
		
		b10=new JButton("ac");
		b10.setBounds(30,520,180,180);
        b10.setBackground(Color.ORANGE);
		b10.setBorder(null);
		b10.setIcon(new ImageIcon(".\\Images\\ac1.jpg"));
        add(b10);
		validate();
		b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      nine s=new nine();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("ac");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		l11=new JLabel("ac $1,00000"); 
        l11.setBounds(50,620,180,180);
        l11.setFont(new Font("Arial",Font.BOLD,18));
        add(l11);
		
		
		
		b11=new JButton("makeup");
		b11.setBounds(250,520,180,180);
        b11.setBackground(Color.ORANGE);
		b11.setIcon(new ImageIcon(".\\Images\\makeup1.jpg"));
		b11.setBorder(null);
        add(b11);
		validate();
		b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      ten s=new ten();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("Makeup");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		l12=new JLabel("makeup  $1500"); 
        l12.setBounds(270,620,180,180);
        l12.setFont(new Font("Arial",Font.BOLD,18));
        add(l12);
		
		b12=new JButton("perfume");
		b12.setBorder(null);
		b12.setBounds(475,520,180,180);
        b12.setBackground(Color.ORANGE);
		b12.setIcon(new ImageIcon(".\\Images\\per1.jpg"));
        add(b12);
		validate();
		b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      eleven s=new eleven();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("perfume");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		l13=new JLabel("perfume $50"); 
        l13.setBounds(500,620,180,180);
        l13.setFont(new Font("Arial",Font.BOLD,18));
        add(l13);
		
		b13=new JButton("water");
		b13.setBounds(692,520,180,180);
		b13.setBorder(null);
        b13.setBackground(Color.ORANGE);
		b13.setIcon(new ImageIcon(".\\Images\\water1.jpg"));
        add(b13);
		validate();
		
		b13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      twoelve s=new twoelve();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("water");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
			}
		});
		l14=new JLabel("water $10"); 
        l14.setBounds(730,620,180,180);
        l14.setFont(new Font("Arial",Font.BOLD,18));
        add(l14);
		
		b14=new JButton("iPhone");
		b14.setBounds(911,520,180,180);
		b14.setBorder(null);
        b14.setBackground(Color.ORANGE);
		b14.setIcon(new ImageIcon(".\\Images\\i1.jpeg"));
        add(b14);
		validate();
		
		b14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      thirteen s=new thirteen();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("iPhone");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
				
			}
		});
		l15=new JLabel("iPhone 14 $999"); 
        l15.setBounds(930,620,180,180);
        l15.setFont(new Font("Arial",Font.BOLD,18));
        add(l15);
		
		b15=new JButton("speaker");
		b15.setBounds(1131,520,180,180);
        b15.setBackground(Color.ORANGE);
		b15.setBorder(null);
		b15.setIcon(new ImageIcon(".\\Images\\speaker1.jpg"));
        add(b15);
		validate();
		
		b15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      fourteen s=new fourteen();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("speaker");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
				
			}
		});
		l16=new JLabel("speaker $120"); 
        l16.setBounds(1170,620,180,180);
        l16.setFont(new Font("Arial",Font.BOLD,18));
        add(l16);
		
				b16=new JButton("Headphone");
		b16.setBounds(1340,520,180,180);
        b16.setBackground(Color.ORANGE);
		b16.setBorder(null);
		b16.setIcon(new ImageIcon(".\\Images\\headphone1.jpg"));
        add(b16);
		validate();
		
		b16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
		      fifteen s=new fifteen();
				s.setVisible(true);
				s.setBounds(200,200,500,600);
				s.setTitle("Headphone");
                s.setLocationRelativeTo(null);
                s.setResizable(false);
				
			}
		});
		l17=new JLabel("HeadPhone $100"); 
        l17.setBounds(1350,620,180,180);
        l17.setFont(new Font("Arial",Font.BOLD,18));
        add(l17);
		
		
		icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l2=new JLabel(icon1);
        l2.setBounds(0,0,1530,180);
		add(l2);
		
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		
		l3=new JLabel(icon2);
        l3.setBounds(0,100,1920,900);
		add(l3);
		//JScrollPane sp=new JScrollPane(sp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//add(sp);
		setUndecorated(true);
		



}

class first extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	first()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpageshirt i10=new mainpageshirt();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
	
	
}

class second extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	second()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagepant i10=new mainpagepant();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
	}
}




class third extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	third()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpageshoe i10=new mainpageshoe();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
	}
	
}
class fourth extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	fourth()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagewatch i10=new mainpagewatch();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class sixth extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	sixth()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("m1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagewallet i10=new mainpagewallet();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}

class seven extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	seven()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("c1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagecamera i10=new mainpagecamera();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class eight extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	eight()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagebag i10=new mainpagebag();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class nine extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	nine()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpageac i10=new mainpageac();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class ten extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ten()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagemakeup i10=new mainpagemakeup();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class eleven extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	eleven()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Perfume");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("per1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$100 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$50");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpageperfume i10=new mainpageperfume();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}

class twoelve extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	twoelve()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("twoelve");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("water1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$20 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$10");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagewater i10=new mainpagewater();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}

class thirteen extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	thirteen()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("i1.jpeg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagemobile i10=new mainpagemobile();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
				
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
	}
	
}

class fourteen extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	fourteen()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("speaker");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("speaker1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$165 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$120");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpagespeaker i10=new mainpagespeaker();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
	}
	
}

class fifteen extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	fifteen()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("HeadPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("headphone1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$120 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$100");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				mainpageheadphone i10=new mainpageheadphone();
				i10.setVisible(true);
				i10.setBounds(200,200,1000,800);
				i10.setTitle("payment");
				i10.setSize(1000,800);
                i10.setLocationRelativeTo(null);
                i10.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
	}
	
}
                                           //menu product items
//...............................................................................................................
//...............................................................................................................
//...............................................................................................................
//...............................................................................................................

//package shirt;
class shirt extends JFrame
{
		
	    
		private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12,backBtn;
	shirt()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\shirt1.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s1 f=new s1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\shirt2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s2 f=new s2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\shirt3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s3 f=new s3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\shirt4.jpeg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s4 f=new s4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\shirt5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s5 f=new s5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\shirt6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s6 f=new s6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\shirt7.jpeg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s7 f=new s7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\shirt8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s8 f=new s8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\shirt9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s9 f=new s9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\shirt10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      s10 f=new s10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Shirt");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(Color.YELLOW);
		//b11.setIcon(new ImageIcon("a1.jpeg"));
		b11.setForeground(Color.BLACK);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a1.jpeg"));
		add(b12);
		
		
		
		l13=new JLabel("10 items found for Shirts ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
		
		
		
		/*	icon1=new ImageIcon(this.getClass().getResource("add1.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
	    
	
		setUndecorated(true);
		
	}
}
class pant extends JFrame
{
		private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	pant()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\pant1.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant1 f=new pant1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\pant2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant2 f=new pant2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\pant3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant3 f=new pant3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\pant4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant4 f=new pant4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\pant5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant5 f=new pant5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\pant6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant6 f=new pant6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\pant7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant7 f=new pant7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\pant8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant8 f=new pant8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\pant9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant9 f=new pant9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\pant10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      pant10 f=new pant10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("Pant");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a2.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for Pants ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
		/*	icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		
		setUndecorated(true);
		
		
	}
}

class watch extends JFrame
{
				private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	watch()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\watch1.jpeg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch1 f=new watch1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\watch2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch2 f=new watch2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\watch3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch3 f=new watch3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\watch4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch4 f=new watch4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\watch5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch5 f=new watch5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\watch6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch6 f=new watch6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\watch7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch7 f=new watch7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\watch8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch8 f=new watch8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\watch9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch9 f=new watch9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\watch10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      watch10 f=new watch10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a3.jpeg"));
		add(b12);
		
		
		
		
		l13=new JLabel("10 items found for Watchs ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
	/*		icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		setUndecorated(true);
		
	}
}

class wallet extends JFrame
{			private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	wallet()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\wallet1.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet1 f=new wallet1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\wallet2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet2 f=new wallet2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\wallet3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet3 f=new wallet3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\wallet4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet4 f=new wallet4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\wallet5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet5 f=new wallet5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\wallet6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet6 f=new wallet6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\wallet7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet7 f=new wallet7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\wallet8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet8 f=new wallet8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\wallet9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet9 f=new wallet9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\wallet10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      wallet10 f=new wallet10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("wallet");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a4.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for Wallets ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
		/*	icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		setUndecorated(true);
	}
}

class bag extends JFrame
{
				private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	bag()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\bag11.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag1 f=new bag1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\bag2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag2 f=new bag2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\bag3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag3 f=new bag3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\bag4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag4 f=new bag4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\bag5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag5 f=new bag5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\bag6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag6 f=new bag6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\bag7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag7 f=new bag7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\bag8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag8 f=new bag8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\bag9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag9 f=new bag9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("bag");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\bag10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      bag10 f=new bag10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("watch");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a5.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for bags ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
	/*		icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		setUndecorated(true);
	}
}
class mobile extends JFrame
{
				private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	mobile()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\mobile1.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile1 f=new mobile1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\mobile2.jpeg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile2 f=new mobile2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\mobile3.jpeg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile3 f=new mobile3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\mobile4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile4 f=new mobile4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\mobile5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile5 f=new mobile5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\mobile6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile6 f=new mobile6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\mobile7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile7 f=new mobile7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\mobile8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile8 f=new mobile8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\mobile9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile9 f=new mobile9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\mobile10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      mobile10 f=new mobile10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("mobile");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a6.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for mobiles ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
		/*	icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		setUndecorated(true);
	}
}
class shoe extends JFrame
{
				private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	shoe()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\shoe11.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe1 f=new shoe1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\shoe22.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe2 f=new shoe2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\shoe3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe3 f=new shoe3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\shoe4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe4 f=new shoe4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\shoe5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe5 f=new shoe5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\shoe6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe6 f=new shoe6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\shoe7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe7 f=new shoe7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\shoe8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe8 f=new shoe8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\shoe9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe9 f=new shoe9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\shoe10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      shoe10 f=new shoe10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("shoe");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a7.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for Shoes ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
	/*		icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		setUndecorated(true);
	}
}
class ac extends JFrame
{
				private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	ac()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\ac11.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac1 f=new ac1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\ac2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac2 f=new ac2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\ac3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac3 f=new ac3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\ac4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac4 f=new ac4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\ac5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac5 f=new ac5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\ac6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac6 f=new ac6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\ac7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac7 f=new ac7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\ac8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac8 f=new ac8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\ac9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac9 f=new ac9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\ac10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      ac10 f=new ac10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("ac");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a8.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for AC ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
		/*	icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		setUndecorated(true);
	}
}
class makeup extends JFrame
{
				private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	makeup()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\makeup11.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup1 f=new makeup1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\makeup2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup2 f=new makeup2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\makeup3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup3 f=new makeup3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\makeup4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup4 f=new makeup4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\makeup5.jpg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup5 f=new makeup5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\makeup6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup6 f=new makeup6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\makeup7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup7 f=new makeup7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\makeup8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup8 f=new makeup8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\makeup9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup9 f=new makeup9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\makeup10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      makeup10 f=new makeup10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("makeup");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setIcon(new ImageIcon(".\\Images\\a9.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for Makeup");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
		/*	icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		
		setUndecorated(true);
	}
}
class camera extends JFrame
{
				private ImageIcon icon1, icon2;
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b12;
	camera()
	{
		
		
		
		b1=new JButton();
		b1.setBounds(30,280,220,220);
		b1.setIcon(new ImageIcon(".\\Images\\camera1.jpg"));
		add(b1);
		l3=new JLabel("product 1 ");
		l3.setBounds(40,400,220,220);
		add(l3);
		l3.setFont(new Font("Arial",Font.BOLD,22));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera1 f=new camera1();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		
		b2=new JButton();
		b2.setBounds(320,280,220,220);
		b2.setIcon(new ImageIcon(".\\Images\\camera2.jpg"));
		add(b2);
		l4=new JLabel("product 2 ");
		l4.setBounds(320,400,220,220);
		l4.setFont(new Font("Arial",Font.BOLD,22));
		

		add(l4);
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera2 f=new camera2();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b3=new JButton();
		b3.setBounds(620,280,220,220);
		b3.setIcon(new ImageIcon(".\\Images\\camera3.jpg"));
		add(b3);
		l5=new JLabel("product 3 ");
		l5.setBounds(620,400,220,220);
		l5.setFont(new Font("Arial",Font.BOLD,22));
		add(l5);
		b3.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera3 f=new camera3();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b4=new JButton();
		b4.setBounds(920,280,220,220);
		b4.setIcon(new ImageIcon(".\\Images\\camera4.jpg"));
		add(b4);
		l6=new JLabel("product 4 ");
		l6.setBounds(920,400,220,220);
		l6.setFont(new Font("Arial",Font.BOLD,22));

		add(l6);
		b4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera4 f=new camera4();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		b5=new JButton();
		b5.setBounds(1220,280,220,220);
		b5.setIcon(new ImageIcon(".\\Images\\camera5.jpeg"));
		add(b5);
		l7=new JLabel("product 5 ");
		l7.setBounds(1220,400,220,220);
		l7.setFont(new Font("Arial",Font.BOLD,22));

		add(l7);
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera5 f=new camera5();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b6=new JButton();
		b6.setBounds(30,550,220,220);
		b6.setIcon(new ImageIcon(".\\Images\\camera6.jpg"));
		add(b6);
		l8=new JLabel("product 6 ");
		l8.setBounds(40,680,220,220);
		l8.setFont(new Font("Arial",Font.BOLD,22));

		add(l8);
		b6.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera6 f=new camera6();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b7=new JButton();
		b7.setBounds(320,550,220,220);
		b7.setIcon(new ImageIcon(".\\Images\\camera7.jpg"));
		add(b7);
		l9=new JLabel("product 7 ");
		l9.setBounds(330,680,220,220);
		l9.setFont(new Font("Arial",Font.BOLD,22));

		add(l9);
		b7.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera7 f=new camera7();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b8=new JButton();
		b8.setBounds(620,550,220,220);
		b8.setIcon(new ImageIcon(".\\Images\\camera8.jpg"));
		add(b8);
		l10=new JLabel("product 8 ");
		l10.setBounds(630,680,220,220);
		l10.setFont(new Font("Arial",Font.BOLD,22));

		add(l10);
		b8.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera8 f=new camera8();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b9=new JButton();
		b9.setBounds(920,550,220,220);
		b9.setIcon(new ImageIcon(".\\Images\\camera9.jpg"));
		add(b9);
		l11=new JLabel("product 9 ");
		l11.setBounds(930,680,220,220);
		l11.setFont(new Font("Arial",Font.BOLD,22));

		add(l11);
		b9.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera9 f=new camera9();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b10=new JButton();
		b10.setBounds(1220,550,220,220);
		b10.setIcon(new ImageIcon(".\\Images\\camera10.jpg"));
		add(b10);
		l12=new JLabel("product 10 ");
		l12.setBounds(1230,680,220,220);
		l12.setFont(new Font("Arial",Font.BOLD,22));

		add(l12);
		b10.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      camera10 f=new camera10();
				f.setVisible(true);
				f.setBounds(200,200,500,600);
				f.setTitle("camera");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
			}
		});
		
		b11 = new JButton("Back");
		b11.setBounds(40,220,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
		b12=new JButton();
		b12.setBounds(0,0,1920,200);
		b12.setBorder(null);
		b12.setIcon(new ImageIcon(".\\Images\\a10.jpeg"));
		add(b12);
		
		
		l13=new JLabel("10 items found for Cameras ");
l13.setBounds(550,0,600,500);
l13.setFont(new Font("Arial",Font.BOLD,40));
add(l13);

l15=new JLabel("Black Mart");
l15.setBounds(1070,35,250,50);
l15.setFont(new Font("Arial",Font.BOLD,40));
add(l15);
		
		
		
		
		
		/*	icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1530,180);
		add(l1);*/
			
		JPanel p=new JPanel();
p.setBounds(0,0,1920,180);
p.setBackground(Color.BLACK);
add(p);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l2=new JLabel(icon2);
        l2.setBounds(0,100,1920,700);
		add(l2);
		setUndecorated(true);
		
	}
}

class hello extends JFrame
{
	private ImageIcon icon1, icon2;
	private JLabel l2,l3;
	private JTable table;
	private JPanel panel;
	private JButton btnBuy,backBtn,homebtn,profile;
	hello()
	{
		
		
				b11 = new JButton("Back");
		b11.setBounds(40,100,80,30);
		//b5.setFont(new Font("Arial",Font.BOLD,18));
        b11.setBackground(new Color(220,77,1));
		b11.setForeground(Color.WHITE);
		b11.setBorder(null);
        add(b11);
		b11.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				dispose();
				
				
			}
		});
	icon1=new ImageIcon(this.getClass().getResource("h3.jpg"));
		l2=new JLabel(icon1);
        l2.setBounds(0,0,1530,180);
		add(l2);
		icon2=new ImageIcon(this.getClass().getResource("b7.jpg"));
		;
		l3=new JLabel(icon2);
        l3.setBounds(0,100,1920,700);
		add(l3);
		
		setUndecorated(true);
		
	}
}

//..................................................................................................................
// menu page
class dashboard extends JFrame
{
	private JPanel panel3;
	private JButton back,welcome,contact,about;
	private Container c;
	private ImageIcon icon;
	private  JLabel l2;
   dashboard()
   {
	   c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.WHITE);

	   back=new JButton("back");
	   back.setBounds(100,100,100,30);
	    back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBorder(null);
	   add(back);
	   back.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				
			}
		});
	   
	   about=new JButton("about");
	   about.setBounds(0,200,300,50);
	    about.setBackground(Color.BLACK);
		about.setForeground(Color.WHITE);
		about.setBorder(null);
		about.setFont(new Font("Arial",Font.BOLD,18));
	   add(about);
	   about.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				About about=new About();
				about.setVisible(true);
				about.setBounds(0,0,1920,1080);
				about.setTitle("about");
                about.setLocationRelativeTo(null);
                about.setResizable(false);
				dispose();
				
				
			}
		});
	   
	   
	   contact=new JButton("contact");
	   contact.setBounds(0,300,300,50);
	    contact.setBackground(Color.BLACK);
		contact.setForeground(Color.WHITE);
		contact.setBorder(null);
		contact.setFont(new Font("Arial",Font.BOLD,18));
	   add(contact);
	   contact.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				Contact contact=new Contact();
				contact.setVisible(true);
				contact.setBounds(0,0,1920,1080);
				contact.setTitle("about");
                contact.setLocationRelativeTo(null);
                contact.setResizable(false);
				dispose();
				
			}
		});
	   
	   
	/*   welcome=new JButton("welcome");
	   welcome.setBounds(0,400,300,50);
	    welcome.setBackground(Color.BLACK);
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Arial",Font.BOLD,18));
	   add(welcome);
	    welcome.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				
				
			}
		});
	   */
	  
	   panel3=new JPanel();
	   panel3.setBounds(0,0,300,1920);
	   panel3.setBackground(Color.BLACK);
	   c.add(panel3);
	   
	   setUndecorated(true);
	    icon =new ImageIcon(this.getClass().getResource("dashboard.jpeg"));
	  l2=new JLabel(icon);
        l2.setBounds(0,0,1750,900);
		add(l2);
	  
   }   
}
/*class Welcome extends JFrame
{   private JPanel panel3;
	private JButton back,welcome,contact,about;
	private Container c;
	private ImageIcon icon;
	private  JLabel l2;
	Welcome()
	{
		 c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.WHITE);

	   back=new JButton("back");
	   back.setBounds(100,100,100,30);
	    back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
	   add(back);
	   back.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				
			}
		});
	   
	   about=new JButton("about");
	   about.setBounds(0,200,300,50);
	    about.setBackground(Color.BLACK);
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Arial",Font.BOLD,18));
	   add(about);
	   about.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				About about=new About();
				about.setVisible(true);
				about.setBounds(0,0,1920,1080);
				about.setTitle("about");
                about.setLocationRelativeTo(null);
                about.setResizable(false);
				dispose();
				
				
			}
		});
	   
	   
	   contact=new JButton("contact");
	   contact.setBounds(0,300,300,50);
	    contact.setBackground(Color.BLACK);
		contact.setForeground(Color.WHITE);
		contact.setFont(new Font("Arial",Font.BOLD,18));
	   add(contact);
	   contact.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				Contact contact=new Contact();
				contact.setVisible(true);
				contact.setBounds(0,0,1920,1080);
				contact.setTitle("about");
                contact.setLocationRelativeTo(null);
                contact.setResizable(false);
				dispose();
				
			}
		});
	   
	/*   welcome=new JButton("welcome");
	   welcome.setBounds(0,400,300,50);
	    welcome.setBackground(Color.BLACK);
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Arial",Font.BOLD,18));
	   add(welcome);
	    welcome.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				
				
			}
		});
	   
	  
	   panel3=new JPanel();
	   panel3.setBounds(0,0,300,1920);
	   panel3.setBackground(Color.BLACK);
	   c.add(panel3);
	   
	   setUndecorated(true);
	    icon =new ImageIcon(this.getClass().getResource("dashboard.jpeg"));
	  l2=new JLabel(icon);
        l2.setBounds(0,0,1750,900);
		add(l2);
	}
}
*/
class About extends JFrame
{
	private JPanel panel3;
	private JButton back,back1,welcome,contact,about;
	private Container c;
	private ImageIcon icon;
	private  JLabel l10,l1,l2,l3,l4,l5,l6,l7,l8,l9 ;;
	About()
	{
		 c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.WHITE);
	   back1=new JButton("back");
	   back1.setBounds(100,100,100,30);
	    back1.setBackground(Color.BLACK);
		back1.setForeground(Color.WHITE);
		back1.setBorder(null);
	   add(back1);
	   back1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				
			}
		});
	   	l1=new JLabel("Welcome to the BLACK MART ");
	l1.setBounds(500,100,550,30);
	l1.setFont(new Font("Arial",Font.BOLD,35));
	add(l1);
	
	l2=new JLabel("Operated by CyberBugs Ltd. Since 2023");
	l2.setBounds(500,120,550,30);
	l2.setFont(new Font("Arial",Font.BOLD,20));
	add(l2);
	
	l3=new JLabel("BLACK MART is the pioneer of the e-commerce industry ");
	l3.setBounds(500,180,550,30);
	l3.setFont(new Font("Arial",Font.BOLD,20));
	add(l3);
	
	l4=new JLabel("who has brought a new trend of online retail platforms and");
	l4.setBounds(500,200,550,30);
	l4.setFont(new Font("Arial",Font.BOLD,20));
	add(l4);
	
	l5=new JLabel("change in the shopping trend of Bangladesh. They are a ");
	l5.setBounds(500,220,600,30);
	l5.setFont(new Font("Arial",Font.BOLD,20));
	add(l5);
	
	
	l6=new JLabel("cutting edge e-commerce platform which brings the latest ");
	l6.setBounds(500,240,550,30);
	l6.setFont(new Font("Arial",Font.BOLD,20));
	add(l6);
	
	l7=new JLabel("local and international goods to people’s doorstep.They");
	l7.setBounds(500,260,550,30);
	l7.setFont(new Font("Arial",Font.BOLD,20));
	add(l7);
	
	l8=new JLabel("offer a wide selection of products from renowned brands in ");
	l7.setBounds(500,280,550,30);
	l7.setFont(new Font("Arial",Font.BOLD,20));
	add(l7);
	
	l8=new JLabel("Bangladesh with a promise of fast, safe and easy online ");
	l8.setBounds(500,300,550,30);
	l8.setFont(new Font("Arial",Font.BOLD,20));
	add(l8);
	
	l9=new JLabel("shopping experience.");
	l9.setBounds(500,320,550,30);
	l9.setFont(new Font("Arial",Font.BOLD,20));
	add(l9);
		
	   about=new JButton("about");
	   about.setBounds(0,200,300,50);
	    about.setBackground(Color.BLACK);
		about.setBorder(null);
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Arial",Font.BOLD,18));
	   add(about);
	   about.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				
				
			}
		});
	   
	   
	   contact=new JButton("contact");
	   contact.setBounds(0,300,300,50);
	   contact.setBorder(null);
	    contact.setBackground(Color.BLACK);
		contact.setForeground(Color.WHITE);
		contact.setFont(new Font("Arial",Font.BOLD,18));
	   add(contact);
	   contact.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				Contact contact=new Contact();
				contact.setVisible(true);
				contact.setBounds(0,0,1920,1080);
				contact.setTitle("about");
                contact.setLocationRelativeTo(null);
                contact.setResizable(false);
				dispose();
				
			}
		});
		
	   
	 /*  welcome=new JButton("welcome");
	   welcome.setBounds(0,400,300,50);
	    welcome.setBackground(Color.BLACK);
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Arial",Font.BOLD,18));
	   add(welcome);
	   contact.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				Welcome welcome=new Welcome();
				welcome.setVisible(true);
				welcome.setBounds(0,0,1920,1080);
				welcome.setTitle("welcome");
                welcome.setLocationRelativeTo(null);
                welcome.setResizable(false);
				dispose();
				
			}
		});
	   */
	   
	   
	  
	   panel3=new JPanel();
	   panel3.setBounds(0,0,300,1920);
	   panel3.setBackground(Color.BLACK);
	   c.add(panel3);
	   
	   setUndecorated(true);
	    icon =new ImageIcon(this.getClass().getResource("aboutcontact.jpeg"));
	  l10=new JLabel(icon);
        l10.setBounds(0,0,1550,900);
		add(l10);
	  
	
	}
}
class Contact extends JFrame
{
	private JPanel panel1,panel2,panel3;
	private JButton back,welcome,contact,about,constractor;
	private Container c;
	private ImageIcon icon;
	//private ImageIO image10,image8,image7;
	private  JLabel l10,l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12,l13,l14;
	Contact()
	{
		 c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.WHITE);
	   back=new JButton("back");
	   back.setBounds(100,100,100,30);
	    back.setBackground(Color.BLACK);
		back.setBorder(null);
		back.setForeground(Color.WHITE);
	   add(back);
	   back.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				
			}
		});
	   
	   about=new JButton("about");
	   about.setBounds(0,200,300,50);
	    about.setBackground(Color.BLACK);
		about.setBorder(null);
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Arial",Font.BOLD,18));
	   add(about);
	   about.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				About about=new About();
				about.setVisible(true);
				about.setBounds(0,0,1920,1080);
				about.setTitle("about");
                about.setLocationRelativeTo(null);
                about.setResizable(false);
				dispose();
				
			}
		});
	   
	   
	   contact=new JButton("contact");
	   contact.setBounds(0,300,300,50);
	    contact.setBackground(Color.BLACK);
		contact.setForeground(Color.WHITE);
		contact.setBorder(null);
		contact.setFont(new Font("Arial",Font.BOLD,18));
	   add(contact);
	   contact.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
	   
	/*   welcome=new JButton("welcome");
	   welcome.setBounds(0,400,300,50);
	    welcome.setBackground(Color.BLACK);
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Arial",Font.BOLD,18));
	   add(welcome);
	   welcome.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				Welcome welcome=new Welcome();
				welcome.setVisible(true);
				welcome.setBounds(0,0,1920,1080);
				welcome.setTitle("welcome");
                welcome.setLocationRelativeTo(null);
                welcome.setResizable(false);
				dispose();
				
			}
		});
		*/
		
		constractor=new JButton("Honarable");
		constractor.setBounds(1200,150,240,158);
		constractor.setIcon(new ImageIcon(".\\Images\\constructor.png"));
		//constractor.setBackground(Color.BLACK);
		//constractor.setForeground(Color.WHITE);
		constractor.setBorder(null);
		//constractor.setFont(new Font("Arial",Font.BOLD,18));
		//constractor.setIcon(new ImageIcon("constractor.png"));
	   add(constractor);
	    constractor.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				Constractor constractor=new Constractor();
				constractor.setVisible(true);
				constractor.setBounds(0,0,1920,1080);
				constractor.setTitle("constractor");
                constractor.setLocationRelativeTo(null);
                constractor.setResizable(false);
				dispose();
				
			}
		});
		
		
		l1=new JLabel("CONTACT WITH US");
		l1.setBounds(650,10,500,100);
		l1.setFont(new Font("Britannic Bold",Font.BOLD,25));
		add(l1);
		icon =new ImageIcon(this.getClass().getResource("alvi.png"));
		l11=new JLabel(icon);
        l11.setBounds(350,100,260,300);
		add(l11);
		
		l2=new JLabel("NAME:ALVEY REYHAN  ||  ID:22-49071");
		l2.setBounds(350,370,560,100);
		l2.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l2);
		
		
		l3=new JLabel("EMAIL:22-49071-3@student.aiub.edu");
		l3.setBounds(350,390,560,100);
		l3.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l3);
		
		icon =new ImageIcon(this.getClass().getResource("jitul.png"));
		l12=new JLabel(icon);
        l12.setBounds(700,100,260,300);
		add(l12);
		
		
		l4=new JLabel("NAME:SHAHARIA HASAN JETUL  ||  ID:22-49059");
		l4.setBounds(700,370,560,100);
		l4.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l4);
		
		
		l5=new JLabel("EMAIL:22-49059-3@student.aiub.edu");
		l5.setBounds(700,390,560,100);
		l5.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l5);
		
		icon =new ImageIcon(this.getClass().getResource("sadik.png"));
		l13=new JLabel(icon);
        l13.setBounds(630,450,260,300);
		add(l13);
		
		l6=new JLabel("NAME:MD.ZAMIUL SADIK NAHIN  ||  ID:20-44228-3");
		l6.setBounds(630,730,560,100);
		l6.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l6);
		
		l7=new JLabel("EMAIL:20-44228-3@student.aiub.edu");
		l7.setBounds(630,750,560,100);
		l7.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l7);
		
		icon =new ImageIcon(this.getClass().getResource("ontu.png"));
		l13=new JLabel(icon);
        l13.setBounds(1000,450,260,300);
		add(l13);
		
		l8=new JLabel("NAME:ANTU CHANDRA DEBNATH  ||  ID:22-49289-3");
		l8.setBounds(1000,730,560,100);
		l8.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l8);
		
		
		
		l9=new JLabel("EMAIL:22-49289-3@student.aiub.edu");
		l9.setBounds(1000,750,560,100);
		l9.setFont(new Font("Times New Roman",Font.BOLD,15));
		add(l9);
		
		   
		  
	  
	   panel3=new JPanel();
	   panel3.setBounds(0,0,300,1920);
	   panel3.setBackground(Color.BLACK);
	   c.add(panel3);
	   
	   setUndecorated(true);
	    icon =new ImageIcon(this.getClass().getResource("aboutcontact.jpeg"));
	  l10=new JLabel(icon);
        l10.setBounds(0,0,1550,900);
		add(l10);
	  
		
	}
}
class Constractor extends JFrame
{
	private JPanel panel1,panel2,panel3;
	private JButton back,welcome,contact,about,constractor;
	private Container c;
	private ImageIcon icon;
	//private ImageIO image10,image8,image7;
	private  JLabel l10,l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12,l13,l14;
	Constractor()
	{
		l5=new JLabel("nazmul@aiub.edu");
		l5.setBounds(600,400,560,100);
		l5.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(l5);
		
		l6=new JLabel("MD. NAZMUL HOSSAIN ||Lecturer , Computer Science");
		l6.setBounds(600,420,560,100);
		l6.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(l6);
		
		
		 icon =new ImageIcon(this.getClass().getResource("sir1.jpg"));
	  l1=new JLabel(icon);
        l1.setBounds(600,100,300,300);
		add(l1);
		l3=new JLabel("MD. NAZMUL HOSSAIN is currently working as");
	l3.setBounds(300,480,700,30);
	l3.setFont(new Font("Arial",Font.BOLD,20));
	add(l3);
	
	l4=new JLabel(" a Lecturer in the Department of Computer Science at American International University Bangladesh(AIUB)");
	l4.setBounds(300,500,1500,30);
	l4.setFont(new Font("Arial",Font.BOLD,20));
	add(l4);
	
	l11=new JLabel("NAZMUL completed his MSc in Computer Science ");
	l11.setBounds(300,520,800,30);
	l11.setFont(new Font("Arial",Font.BOLD,20));
	add(l1);
	
	
	l12=new JLabel("from American International University - Bangladesh (AIUB) in 2019  ");
	l12.setBounds(300,540,1000,30);
	l12.setFont(new Font("Arial",Font.BOLD,20));
	add(l12);
	
	l7=new JLabel("NAZMUL believes that discipline, punctuality and ");
	l7.setBounds(300,560,1000,30);
	l7.setFont(new Font("Arial",Font.BOLD,20));
	add(l7);
	
	l8=new JLabel("dedication clears all the obstacles and helps to reach the highest goal. ");
	l7.setBounds(300,580,1000,30);
	l7.setFont(new Font("Arial",Font.BOLD,20));
	add(l7);
	
	l8=new JLabel("Data Mining, Machine Learning, Human-Computer Interaction ");
	l8.setBounds(300,600,1000,30);
	l8.setFont(new Font("Arial",Font.BOLD,20));
	add(l8);
		
		back=new JButton("back");
	   back.setBounds(100,100,100,30);
	    back.setBackground(Color.BLACK);
		back.setBorder(null);
		back.setForeground(Color.WHITE);
	   add(back);
	   back.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				
				
			}
		});
		setUndecorated(true);
	    icon =new ImageIcon(this.getClass().getResource("constructor b.jpg"));
	  l10=new JLabel(icon);
        l10.setBounds(0,0,1920,1080);
		add(l10);
	}
}
class s1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s1()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt1 f=new paymentshirt1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s2()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt2 f=new paymentshirt2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s3()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt3 f=new paymentshirt3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s4()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt4.jpeg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt4 f=new paymentshirt4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
       add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s5()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt5 f=new paymentshirt5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
		
	}
}
class s6 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s6()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt6 f=new paymentshirt6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s7()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt7.jpeg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt7 f=new paymentshirt7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s8()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt8 f=new paymentshirt8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s9()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt9 f=new paymentshirt9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		
		setUndecorated(true);
		
	}
}
class s10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	s10()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Hawai shirt");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shirt10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshirt10 f=new paymentshirt10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
		
	}
}

class pant1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant1()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant1 f=new paymentpant1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant2()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant2 f=new paymentpant2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant3()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant3 f=new paymentpant3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant4()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant4 f=new paymentpant4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant5()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        
		b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant5 f=new paymentpant5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant6 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant6()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant6 f=new paymentpant6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant7()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant7 f=new paymentpant7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant8()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant8 f=new paymentpant8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant9()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant9 f=new paymentpant9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class pant10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	pant10()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Black Pant");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("pant10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$500 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$250");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpant10 f=new paymentpant10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}

class watch1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch1()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch1.jpeg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch1 f=new paymentwatch1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}	
}
class watch2 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch2()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch2 f=new paymentwatch2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class watch3 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch3()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch3 f=new paymentwatch3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class watch4 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch4()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch4 f=new paymentwatch4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class watch5 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch5()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch5 f=new paymentwatch5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class watch6 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch6()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch6 f=new paymentwatch6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class watch7 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch7()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch7 f=new paymentwatch7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class watch8 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch8()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch8 f=new paymentwatch8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class watch9 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch9()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch9 f=new paymentwatch9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class watch10 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	watch10()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Wrist Watch");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("watch10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwatch10 f=new paymentwatch10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}

class wallet1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet1()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet1 f=new paymentwallet1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet2()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet2 f=new paymentwallet2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet3()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet3 f=new paymentwallet3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet4()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet4 f=new paymentwallet4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet5()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet5 f=new paymentwallet5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet6 extends JFrame
{
private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet6()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet6 f=new paymentwallet6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}	
}
class wallet7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet7()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet7 f=new paymentwallet7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet8()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet8 f=new paymentwallet8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet9()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet9 f=new paymentwallet9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class wallet10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	wallet10()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Wallet");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("wallet10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentwallet10 f=new paymentwallet10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}

class bag1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag1()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag11.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag1 f=new paymentbag1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class bag2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag2()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag2 f=new paymentbag2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class bag3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag3()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag3 f=new paymentbag3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class bag4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag4()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag4 f=new paymentbag4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class bag5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag5()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag5 f=new paymentbag5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class bag6 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag6()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag6 f=new paymentbag6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class bag7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag7()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag7 f=new paymentbag7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class bag8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag8()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag8 f=new paymentbag8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class bag9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag9()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag9 f=new paymentbag9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class bag10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	bag10()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Bag");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("bag10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$5000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$2500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbag10 f=new paymentbag10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class mobile1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile1()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile1 f=new paymentmobile1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
		
	}
	
}
class mobile2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile2()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile2.jpeg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile2 f=new paymentmobile2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
	}
	
}
class mobile3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile3()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile3.jpeg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile3 f=new paymentmobile3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
		
	}
	
}
class mobile4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile4()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile4 f=new paymentmobile4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
		
	}
	
}
class mobile5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile5()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile5 f=new paymentmobile5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
		
	}
	
}
class mobile6 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile6()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile6 f=new paymentmobile6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
		
	}
	
}
class mobile7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile7()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile7 f=new paymentmobile7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
		
        add(b2);*/setUndecorated(true);
		
	}
	
}
class mobile8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile8()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile8 f=new paymentmobile8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class mobile9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile9()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile9 f=new paymentmobile9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class mobile10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	mobile10()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("iPhone");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("mobile10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1350 -20%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$999");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmobile10 f=new paymentmobile10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class shoe1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe1()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe11.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe1 f=new paymentshoe1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe2()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe22.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe2 f=new paymentshoe2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*(b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe3()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe3 f=new paymentshoe3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe4()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe4 f=new paymentshoe4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe5()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe5 f=new paymentshoe5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe6 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe6()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe6 f=new paymentshoe6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe7()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe7 f=new paymentshoe7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe8()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe8 f=new paymentshoe8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe9()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe9 f=new paymentshoe9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}
class shoe10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	shoe10()
	{
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("Leather Shoe");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("shoe10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$1300 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$650");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentshoe10 f=new paymentshoe10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
}

class ac1 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac1()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac11.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac1 f=new paymentac1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac2 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac2()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac2 f=new paymentac2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/
		setUndecorated(true);
	}
	
}
class ac3 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac3()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac3 f=new paymentac3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac4 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac4()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac4 f=new paymentac4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac5 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac5()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac5 f=new paymentac5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac6 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac6()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac6 f=new paymentac6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac7 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac7()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac7 f=new paymentac7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac8 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac8()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac8 f=new paymentac8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac9 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac9()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac9 f=new paymentac9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class ac10 extends JFrame
{
		private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	ac10()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("ac");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("ac10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$2,00000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1,00000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentac10 f=new paymentac10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class makeup1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup1()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup11.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup1 f=new paymentmakeup1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2)*/setUndecorated(true);
	}
}
class makeup2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup2()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup2 f=new paymentmakeup2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup3()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup3 f=new paymentmakeup3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup4()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup4 f=new paymentmakeup4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup5()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup5.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup5 f=new paymentmakeup5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup6 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup6()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup6 f=new paymentmakeup6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup7()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup7 f=new paymentmakeup7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup8()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup8 f=new paymentmakeup8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup9()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup9 f=new paymentmakeup9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class makeup10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	makeup10()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("makeup");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("makeup10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$3000 -50%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$1500");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentmakeup10 f=new paymentmakeup10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
}
class camera1 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera1()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera1.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera1 f=new paymentcamera1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera2 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera2()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera2.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera2 f=new paymentcamera2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);dispose();
			}
		});
        add(b1);
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera3 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera3()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera3.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera3 f=new paymentcamera3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera4 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera4()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera4.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera4 f=new paymentcamera4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera5 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera5()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera5.jpeg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera5 f=new paymentcamera5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera6 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera6()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera6.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera6 f=new paymentcamera6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera7 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera7()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera7.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera7 f=new paymentcamera7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera8 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera8()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera8.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera8 f=new paymentcamera8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera9 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera9()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera9.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera9 f=new paymentcamera9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
	/*	b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
class camera10 extends JFrame
{
	private ImageIcon icon;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	private Container c;
	camera10()
	{
	
		c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		l1=new JLabel("camera");
        l1.setBounds(300,100,180,180);
        l1.setFont(new Font("Arial",Font.BOLD,18));
       
		
         add(l1);
		validate();
		icon =new ImageIcon(this.getClass().getResource("camera10.jpg"));
		l4=new JLabel(icon);
        l4.setBounds(0,0,260,300);
		add(l4);
		
		l2=new JLabel("$50000 -10%");
		l2.setBounds(300,150,180,180);
		l2.setBackground(Color.RED);
		l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial",Font.BOLD,18));
		add(l2);
		l3=new JLabel("$46,000");
		l3.setBounds(300,200,180,180);
		l3.setBackground(Color.RED);
		l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial",Font.BOLD,25));
		add(l3);
		
		b1 = new JButton("Buy Now");
		b1.setBounds(180,400,100,30);
        b1.setBackground(Color.RED);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentcamera10 f=new paymentcamera10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
        add(b1);
        add(b1);
		/*b2 = new JButton("Add To");
		b2.setBounds(300,400,100,30);
        b2.setBackground(Color.BLUE);
		
        add(b2);*/setUndecorated(true);
	}
	
}
//....................................................................................................
                                     //payment options
class paymentshirt1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt1 f=new paymentbkashshirt1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt1 f=new paymentpaypalshirt1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt2 f=new paymentbkashshirt2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt2 f=new paymentpaypalshirt2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt3 f=new paymentbkashshirt3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt1 f=new paymentpaypalshirt1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt4 f=new paymentbkashshirt4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt4 f=new paymentpaypalshirt4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt5 f=new paymentbkashshirt5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt5 f=new paymentpaypalshirt5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt6 f=new paymentbkashshirt6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt6 f=new paymentpaypalshirt6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt7 f=new paymentbkashshirt7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt7 f=new paymentpaypalshirt7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt8 f=new paymentbkashshirt8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt8 f=new paymentpaypalshirt8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt9 f=new paymentbkashshirt9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt9 f=new paymentpaypalshirt9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshirt10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshirt10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshirt10 f=new paymentbkashshirt10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshirt10 f=new paymentpaypalshirt10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant1 f=new paymentbkashpant1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant1 f=new paymentpaypalpant1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant2 f=new paymentbkashpant2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant2 f=new paymentpaypalpant2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant3 f=new paymentbkashpant3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant3 f=new paymentpaypalpant3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant4 f=new paymentbkashpant4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant4 f=new paymentpaypalpant4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant5 f=new paymentbkashpant5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant5 f=new paymentpaypalpant5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant6 f=new paymentbkashpant6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant6 f=new paymentpaypalpant6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant7 f=new paymentbkashpant7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant7 f=new paymentpaypalpant7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant8 f=new paymentbkashpant8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant8 f=new paymentpaypalpant8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant9 f=new paymentbkashpant9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant9 f=new paymentpaypalpant9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentpant10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentpant10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpant10 f=new paymentbkashpant10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalpant10 f=new paymentpaypalpant10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch1 f=new paymentbkashwatch1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch1 f=new paymentpaypalwatch1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch2 f=new paymentbkashwatch2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch2 f=new paymentpaypalwatch2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch3 f=new paymentbkashwatch3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch3 f=new paymentpaypalwatch3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch4 f=new paymentbkashwatch4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch4 f=new paymentpaypalwatch4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch5 f=new paymentbkashwatch5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch5 f=new paymentpaypalwatch5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch6 f=new paymentbkashwatch6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch6 f=new paymentpaypalwatch6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch7 f=new paymentbkashwatch7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch7 f=new paymentpaypalwatch7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch8 f=new paymentbkashwatch8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch8 f=new paymentpaypalwatch8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch9 f=new paymentbkashwatch9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch9 f=new paymentpaypalwatch9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwatch10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwatch10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwatch10 f=new paymentbkashwatch10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwatch10 f=new paymentpaypalwatch10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}

class paymentwallet1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet1 f=new paymentbkashwallet1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet1 f=new paymentpaypalwallet1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet2 f=new paymentbkashwallet2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet2 f=new paymentpaypalwallet2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet3 f=new paymentbkashwallet3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet3 f=new paymentpaypalwallet3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet4 f=new paymentbkashwallet4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet4 f=new paymentpaypalwallet4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet5 f=new paymentbkashwallet5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet5 f=new paymentpaypalwallet5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet6 f=new paymentbkashwallet6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet6 f=new paymentpaypalwallet6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet7 f=new paymentbkashwallet7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet7 f=new paymentpaypalwallet7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet8 f=new paymentbkashwallet8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet8 f=new paymentpaypalwallet8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet9 f=new paymentbkashwallet9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet9 f=new paymentpaypalwallet9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentwallet10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentwallet10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashwallet10 f=new paymentbkashwallet10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalwallet10 f=new paymentpaypalwallet10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag1 f=new paymentbkashbag1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag1 f=new paymentpaypalbag1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag2 f=new paymentbkashbag2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag2 f=new paymentpaypalbag2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag3 f=new paymentbkashbag3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag3 f=new paymentpaypalbag3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag4 f=new paymentbkashbag4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag4 f=new paymentpaypalbag4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag5 f=new paymentbkashbag5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag5 f=new paymentpaypalbag5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag6 f=new paymentbkashbag6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag6 f=new paymentpaypalbag6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag7 f=new paymentbkashbag7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag7 f=new paymentpaypalbag7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag8 f=new paymentbkashbag8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag8 f=new paymentpaypalbag8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag9 f=new paymentbkashbag9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag9 f=new paymentpaypalbag9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentbag10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentbag10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashbag10 f=new paymentbkashbag10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalbag10 f=new paymentpaypalbag10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile1 f=new paymentbkashmobile1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile1 f=new paymentpaypalmobile1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile2 f=new paymentbkashmobile2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile2 f=new paymentpaypalmobile2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile3 f=new paymentbkashmobile3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile3 f=new paymentpaypalmobile3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile4 f=new paymentbkashmobile4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile4 f=new paymentpaypalmobile4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile5 f=new paymentbkashmobile5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile5 f=new paymentpaypalmobile5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile6 f=new paymentbkashmobile6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile6 f=new paymentpaypalmobile6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile7 f=new paymentbkashmobile7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile7 f=new paymentpaypalmobile7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile8 f=new paymentbkashmobile8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile8 f=new paymentpaypalmobile8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile9 f=new paymentbkashmobile9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile9 f=new paymentpaypalmobile9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmobile10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmobile10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmobile10 f=new paymentbkashmobile10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmobile10 f=new paymentpaypalmobile10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe1 f=new paymentbkashshoe1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe1 f=new paymentpaypalshoe1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe2 f=new paymentbkashshoe2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe2 f=new paymentpaypalshoe2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe3 f=new paymentbkashshoe3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe3 f=new paymentpaypalshoe3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe4 f=new paymentbkashshoe4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe4 f=new paymentpaypalshoe4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe5 f=new paymentbkashshoe5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe5 f=new paymentpaypalshoe5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe6 f=new paymentbkashshoe6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe6 f=new paymentpaypalshoe6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe7 f=new paymentbkashshoe7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe7 f=new paymentpaypalshoe7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe8 f=new paymentbkashshoe8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe8 f=new paymentpaypalshoe8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe9 f=new paymentbkashshoe9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe9 f=new paymentpaypalshoe9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentshoe10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentshoe10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashshoe10 f=new paymentbkashshoe10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalshoe10 f=new paymentpaypalshoe10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac1 f=new paymentbkashac1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac1 f=new paymentpaypalac1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac2 f=new paymentbkashac2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac2 f=new paymentpaypalac2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac3 f=new paymentbkashac3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac3 f=new paymentpaypalac3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac4 f=new paymentbkashac4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac4 f=new paymentpaypalac4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac5 f=new paymentbkashac5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac5 f=new paymentpaypalac5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac6 f=new paymentbkashac6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac6 f=new paymentpaypalac6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac7 f=new paymentbkashac7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac7 f=new paymentpaypalac7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac8 f=new paymentbkashac8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac8 f=new paymentpaypalac8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac9 f=new paymentbkashac9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac9 f=new paymentpaypalac9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentac10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentac10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashac10 f=new paymentbkashac10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalac10 f=new paymentpaypalac10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup1 f=new paymentbkashmakeup1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup1 f=new paymentpaypalmakeup1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup2 f=new paymentbkashmakeup2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup2 f=new paymentpaypalmakeup2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup3 f=new paymentbkashmakeup3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup3 f=new paymentpaypalmakeup3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup4 f=new paymentbkashmakeup4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup4 f=new paymentpaypalmakeup4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup5 f=new paymentbkashmakeup5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup5 f=new paymentpaypalmakeup5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup6 f=new paymentbkashmakeup6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup6 f=new paymentpaypalmakeup6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup7 f=new paymentbkashmakeup7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup7 f=new paymentpaypalmakeup7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup8 f=new paymentbkashmakeup8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup8 f=new paymentpaypalmakeup8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup9 f=new paymentbkashmakeup9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup9 f=new paymentpaypalmakeup9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentmakeup10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentmakeup10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmakeup10 f=new paymentbkashmakeup10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmakeup10 f=new paymentpaypalmakeup10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera1()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera1 f=new paymentbkashcamera1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera1 f=new paymentpaypalcamera1();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera2()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera2 f=new paymentbkashcamera2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera2 f=new paymentpaypalcamera2();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera3()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera3 f=new paymentbkashcamera3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera3 f=new paymentpaypalcamera3();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera4()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera4 f=new paymentbkashcamera4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera4 f=new paymentpaypalcamera4();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera5()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera5 f=new paymentbkashcamera5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera5 f=new paymentpaypalcamera5();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera6()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera6 f=new paymentbkashcamera6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera6 f=new paymentpaypalcamera6();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera7()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera7 f=new paymentbkashcamera7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera7 f=new paymentpaypalcamera7();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera8()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera8 f=new paymentbkashcamera8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera8 f=new paymentpaypalcamera8();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera9()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera9 f=new paymentbkashcamera9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera9 f=new paymentpaypalcamera9();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class paymentcamera10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	paymentcamera10()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashcamera10 f=new paymentbkashcamera10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalcamera10 f=new paymentpaypalcamera10();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}

class mainpageshirt extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpageshirt()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpageshirt f=new paymentbkashmainpageshirt();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpageshirt f=new paymentpaypalmainpageshirt();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshirt.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagepant extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagepant()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagepant f=new paymentbkashmainpagepant();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagepant f=new paymentpaypalmainpagepant();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentpant.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpageshoe extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpageshoe()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpageshoe f=new paymentbkashmainpageshoe();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpageshoe f=new paymentpaypalmainpageshoe();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentshoe.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagewatch extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagewatch()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagewatch f=new paymentbkashmainpagewatch();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagewatch f=new paymentpaypalmainpagewatch();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwatch.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagewallet extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagewallet()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashpmainpagewallet f=new paymentbkashpmainpagewallet();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagewallet f=new paymentpaypalmainpagewallet();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwallet.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagecamera extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagecamera()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagecamera f=new paymentbkashmainpagecamera();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagecamera f=new paymentpaypalmainpagecamera();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentcamera.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagebag extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagebag()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagebag f=new paymentbkashmainpagebag();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagebag f=new paymentpaypalmainpagebag();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentbag.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpageac extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpageac()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpageac f=new paymentbkashmainpageac();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpageac f=new paymentpaypalmainpageac();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentac.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagemakeup extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagemakeup()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagemakeup f=new paymentbkashmainpagemakeup();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagemakeup f=new paymentpaypalmainpagemakeup();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmakeup.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}

class mainpageperfume extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpageperfume()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpageperfume f=new paymentbkashmainpageperfume();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpageperfume f=new paymentpaypalmainpageperfume();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentperfume.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagewater extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagewater()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagewater f=new paymentbkashmainpagewater();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagewater f=new paymentpaypalmainpagewater();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentwater.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagemobile extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagemobile()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagemobile f=new paymentbkashmainpagemobile();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagemobile f=new paymentpaypalmainpagemobile();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentmobile.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpagespeaker extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpagespeaker()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpagespeaker f=new paymentbkashmainpagespeaker();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpagespeaker f=new paymentpaypalmainpagespeaker();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentspeaker.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
class mainpageheadphone extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2,b3;
	mainpageheadphone()
	{
		
		 b1=new JButton("BKash");
		b1.setBounds(370,690,100,30);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentbkashmainpageheadphone f=new paymentbkashmainpageheadphone();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b1);
		
		b2=new JButton("PayPal");
		b2.setBounds(600,690,100,30);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		      paymentpaypalmainpageheadphone f=new paymentpaypalmainpageheadphone();
				f.setVisible(true);
				f.setBounds(200,200,1000,800);
				f.setTitle("payment");
                f.setLocationRelativeTo(null);
                f.setResizable(false);
				dispose();
			}
		});
		add(b2);
		
		b3=new JButton("Cancel");
		b3.setBounds(850,690,100,30);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{
				
		     dispose();
			}
		});
		add(b3);
		
		icon1=new ImageIcon(this.getClass().getResource("paymentheadphone.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);
		setUndecorated(true);
	}
}
//............................................................................................................
                                                    //payment options
class paymentbkashshirt1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		//t1.setText("800");
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b2=new JButton("PAY");
		b2.setBounds(700,700,150,40);
		b2.setFont(new Font("Arial",Font.BOLD,25));
		b2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				dispose();
			/*	if (JPasswordField.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"Please Pay First");
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null,"Successfully Payment");
				}
				dispose();*/
				
			}
		});
		add(b2);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshirt10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshirt10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshirt10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshirt10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpant10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpant10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalpant10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalpant10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("800");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);setUndecorated(true);
		add(l1);
	}
}
class paymentpaypalwatch9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwatch10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwatch10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwatch10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwatch10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("200");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}class paymentbkashwallet6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("100");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("350");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashwallet10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashwallet10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("350");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalwallet10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalwallet10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("350");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("350");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("350");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		
		
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("350");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("350");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashbag10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashbag10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalbag10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalbag10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1050");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
	
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
	
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmobile10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmobile10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmobile10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmobile10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashshoe10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashshoe10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalshoe10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalshoe10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("50");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashac10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashac10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalac10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalac10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("1500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmakeup10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmakeup10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmakeup10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmakeup10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera1 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera1()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera2 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera2()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera3 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera3()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera4 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera4()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera5 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera5()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera6 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera6()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera7 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera7()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera8 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera8()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera9 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera9()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashcamera10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashcamera10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalcamera10 extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalcamera10()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpageshirt extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpageshirt()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("25");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpageshirt extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpageshirt()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("25");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagepant extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagepant()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("40");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagepant extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagepant()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("40");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpageshoe extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpageshoe()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpageshoe extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpageshoe()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("400");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagewatch extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagewatch()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("300");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagewatch extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagewatch()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("300");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashpmainpagewallet extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashpmainpagewallet()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("60");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagewallet extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagewallet()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("60");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagecamera extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagecamera()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagecamera extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagecamera()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("2500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagebag extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagebag()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagebag extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagebag()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("500");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpageac extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpageac()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("6000");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpageac extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpageac()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("6000");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagemakeup extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagemakeup()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("150");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagemakeup extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagemakeup()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("150");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpageperfume extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpageperfume()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("30");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpageperfume extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpageperfume()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("30");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagewater extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagewater()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("10");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagewater extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagewater()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("10");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagemobile extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagemobile()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagemobile extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagemobile()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("999");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpagespeaker extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpagespeaker()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		add(t2);
		t1.setText("250");
		t2.setText("01873342992");
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpagespeaker extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpagespeaker()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("250");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentbkashmainpageheadphone extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentbkashmainpageheadphone()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,500,1000);
		b1.setIcon(new ImageIcon(".\\Images\\bkashadd1.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(700,450,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(700,330,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("60");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(700,560,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("bkash.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}
class paymentpaypalmainpageheadphone extends JFrame
{
	private ImageIcon icon1;
	private JLabel l1;
	private JButton b1,b2;
	private JTextField t1,t2;
	private JPasswordField t3;
	paymentpaypalmainpageheadphone()
	{
		
		b1=new JButton();
		b1.setBounds(0,0,525,1000);
		b1.setIcon(new ImageIcon(".\\Images\\paypaladd.jpeg"));
		
		add(b1);
		//amount

		t1=new JTextField();
		t1.setBounds(750,490,150,40);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		add(t1);
		//mobile
		t2=new JTextField();
		t2.setBounds(750,370,170,40);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t1.setText("60");
		t2.setText("01873342992");
		add(t2);
		//pin
		t3=new JPasswordField();
		t3.setBounds(750,610,150,40);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		add(t3);
		
		b1=new JButton("PAY");
		b1.setBounds(700,700,150,40);
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null,"Successfully Payment");
				//setVisible(false);
				dispose();
				
			}
		});
		add(b1);
		
		
		icon1=new ImageIcon(this.getClass().getResource("paypal.jpeg"));
		l1=new JLabel(icon1);
        l1.setBounds(0,0,1000,800);
		add(l1);setUndecorated(true);
	}
}



public static void main(String[]args)
{

mainpage frame=new mainpage();
frame.setVisible(true);
//JScrollPane sp=new JScrollPane(frame,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//frame.add(sp);

 
}



}