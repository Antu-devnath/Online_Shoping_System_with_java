package Codes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import java.nio.file.*;
import java.lang.*;
import javax.swing.ImageIcon;

public class adminpage extends JFrame {

    private Container c;
    private ImageIcon icon, b2;
    private JLabel label1;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, nBtn,b5;
    private Cursor cursor;
	private JLabel imgLabel;
	

    private String[] column = { "User Name", "Password", "Email", "Security Question", "Answer", "Date and Time" };
    private String[] rows = new String[7];

    adminpage() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("adminpage");
        this.setSize(1920,1080);
		this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        //icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        //label1.setText("User Data");
        label1.setBounds(750, 65, 400, 80);
        label1.setFont(f1);
        c.add(label1);

        // JButtons
        btn1 = new JButton("Refresh");
        btn1.setBounds(54, 600, 184, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(new Color(255,85,187));
        c.add(btn1);

        btn2 = new JButton("Delete");
        btn2.setBounds(248, 600, 184, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(new Color(237,43,42));
        c.add(btn2);

        btn3 = new JButton("Add");
        btn3.setBounds(442, 600, 184, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);
		
		
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
		
		
		
		
		
		 table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 220, 578, 300);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);

		
		
		Image image4 = null;
		try{
		File sourceimage = new File(".\\Images\\ppp.jpg");
	    image4 = ImageIO.read(sourceimage);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		ImageIcon background_img4 = new ImageIcon(image4);
		Image img7 = background_img4.getImage();
		Image temp_img4 = img7.getScaledInstance(1920,1080,Image.SCALE_SMOOTH);
		background_img4 = new ImageIcon(temp_img4);
		JLabel background4 = new JLabel("",background_img4,JLabel.CENTER);
		background4.setBounds(0,0,1920,1080);
		c.add(background4);
		
		
        

        // JTable Layout
       
        String file = ".\\Data\\user_data.txt";
        String temp = ".\\Data\\temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // Email
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(20); // Security Question
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(9); // Answer
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }

        // Refresh Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                adminpage frame = new adminpage();
                frame.setVisible(true);

            }
        });

        // Delete Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    adminpage frame = new adminpage();
                    frame.setVisible(true);
                }

            }
        });
		
		
				// Back Button
        btn6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                adminpage frame = new adminpage();
                frame.setVisible(true);
            }
        });
		
		        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Add Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                adminpage frame = new adminpage();
                frame.setVisible(true);
            }
        });

        
		
		
				
     
		
		
		

    }

    public static void main(String[] args) {

        adminpage frame = new adminpage();
        frame.setVisible(true);
    }
}
