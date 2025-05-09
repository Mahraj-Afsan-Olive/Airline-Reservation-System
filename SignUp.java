import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.Formatter;
import java.util.*;

class SignUp extends JFrame implements ActionListener
{
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,imgLabel,title;    
private	JTextField t1,t2,t3,t4,t5,t6;
private JPasswordField value1,value2;
private JRadioButton checkBox1,checkBox2;
private JButton back,create;
private Container c;
private ImageIcon img;
private JComboBox<String> cb;
private  ButtonGroup bg = new ButtonGroup();

	
SignUp()  
{  
    c=this.getContentPane();
	c.setLayout(null);
	c.setVisible(true);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1280,720);
	this.setTitle("SignUp Form");
	
	img =new ImageIcon("SignUp.png");
    imgLabel=new JLabel(img);
    imgLabel.setBounds(0, 0, 1280, 720);
    c.add(imgLabel);
	
	title=new JLabel("SignUp");
    title.setFont(new Font("Serif", Font.BOLD, 30));
    title.setForeground(Color.red);	
    title.setBounds(540,0, 500,100);
	imgLabel.add(title);
    
	
    l1=new JLabel("First Name:");  
    l1.setBounds(50,50, 100,30);
	l1.setForeground(Color.white);
    t1=new JTextField();  
    t1.setBounds(150,50, 300,30); 
	imgLabel.add(l1);imgLabel.add(t1);
    	
    l2=new JLabel("Last Name:");
    l2.setForeground(Color.white);	
    l2.setBounds(50,150, 100,30);
	t2=new JTextField();  
    t2.setBounds(150,150,300,30);
	imgLabel.add(l2);imgLabel.add(t2);
	
	
    l3=new JLabel("Profession:");
	l3.setForeground(Color.white);
    l3.setBounds(50,250, 100,30);
	t3=new JTextField();  
    t3.setBounds(150,250,300,30);
	imgLabel.add(l3);imgLabel.add(t3);
	
	
    l4=new JLabel("Date of Birth:");
	l4.setForeground(Color.white);
    l4.setBounds(50,350, 100,30);
	t4=new JTextField();  
    t4.setBounds(150,350,150,30);
	imgLabel.add(l4);imgLabel.add(t4); 
	
	
    l5=new JLabel("Gender:");
	l5.setForeground(Color.white);
    l5.setBounds(50,450, 100,30);
	imgLabel.add(l5);
	
	
	checkBox1 = new JRadioButton("Male");  
    checkBox1.setBounds(150,450, 70,30);  
    checkBox2 = new JRadioButton("Female");  
    checkBox2.setBounds(300,450, 70,30);
	imgLabel.add(checkBox1);  
    imgLabel.add(checkBox2);
	checkBox1.setActionCommand(checkBox1.getText());
    checkBox2.setActionCommand(checkBox2.getText());

    
	bg.add(checkBox1);
	bg.add(checkBox2);	
   
	
    l6=new JLabel("Country:");
	l6.setForeground(Color.white);
    l6.setBounds(700,50, 100,30);
	imgLabel.add(l6);
	
	String country[]={"Bangladesh","Australia","Canada","England","France","Germany","India","Italy","Japan","Newzealand","Pakistan","Russia","Singapore","Spain","Switzerland","Turkey","USA"};        
    cb=new JComboBox<String>(country);    
    cb.setBounds(800,50, 150,30);    
    imgLabel.add(cb);
	
	
    l7=new JLabel("City:");
	l7.setForeground(Color.white);
    l7.setBounds(700,150, 100,30);
	t5=new JTextField();  
    t5.setBounds(800,150, 150,30);
	imgLabel.add(l7);imgLabel.add(t5);
	
	
    l8=new JLabel("E-Mail:");
	l8.setForeground(Color.white);
    l8.setBounds(700,250, 100,30);
	t6=new JTextField();  
    t6.setBounds(800,250, 300,30);
	imgLabel.add(l8);imgLabel.add(t6);
	
	
    l9=new JLabel("Passsword:");
	l9.setForeground(Color.white);
    l9.setBounds(700,350, 100,30);
    l10=new JLabel("Confirm");
	l10.setForeground(Color.white);
    l10.setBounds(700,450, 100,30);
    l11=new JLabel("Passsword:");
	l11.setForeground(Color.white);
    l11.setBounds(700,480, 100,30);  	
    imgLabel.add(l9); imgLabel.add(l10);
    imgLabel.add(l11);	
 
   
	value1 = new JPasswordField();
	value1.setBounds(800,350, 150,30);
	value2 = new JPasswordField();
	value2.setBounds(800,460, 150,30);
	imgLabel.add(value1); imgLabel.add(value2);
	
	back=new JButton("BACK");  
    back.setBounds(300,600, 95,30);
    back.addActionListener(this);	
    imgLabel.add(back);
	
	create=new JButton("Create");    
    create.setBounds(800,595, 95,30);
    create.addActionListener(this);    
    imgLabel.add(create);
  	 	
    }

public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==back)
	{
		dispose();
		LoginFrame frame = new LoginFrame();
        frame.setVisible(true);

	}

   else if(e.getSource()==create)
	{
				
		  String name = t1.getText();
		  String last = t2.getText();
		  String pro = t3.getText();
		  String dob = t4.getText();
		  String city = t5.getText();
		  String mail = t6.getText();
		  String pass = value1.getText();
		  String cpass = value2.getText();
		  
		  
		  if (pass.equals(pass) && cpass.equals(pass)){
			

            try{
			FileWriter file = new FileWriter("signup.txt",true);
            String gender = bg.getSelection().getActionCommand();			
			
		    file.write (t1.getText()+"\t\t\t"+t2.getText()+"\t\t\t"+t3.getText()+"\t\t\t"+t4.getText()+"\t\t\t"+gender+"\t\t\t"+cb.getSelectedIndex()+"\t\t\t"+t5.getText()+"\t\t\t"+t6.getText()+"\t\t\t"+value1.getText()+"\t\t\t"+value2.getText()+"\n");
			file.close();  
			JFrame fr = new JFrame();
			
			if(name.equals("")&&last.equals("")&&pro.equals("")&&dob.equals("")&&city.equals("")&&mail.equals("")&&pass.equals("")&&cpass.equals("")&&gender.equals("")&&cb.equals(""))
            {
				
	       JOptionPane.showMessageDialog(null, "Please fill up all the details");
          }
    
        else {
			try{
			FileWriter fil = new FileWriter("forlogin.txt",true); 
			
		    fil.write (t6.getText()+"\t"+value1.getText()+"\n");
			fil.close();  
			JFrame fm = new JFrame();
			}
	
			catch(IOException io){}
			
		
		dispose();
		LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
		
		}	
        	  
			
		}

		catch(IOException io)
		{}	

	}
	}
}

public static void main(String[]args) 
{  
SignUp frame = new SignUp();
frame.setVisible(true);
}
}