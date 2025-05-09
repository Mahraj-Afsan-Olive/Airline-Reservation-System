import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;  
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.Formatter;
import java.util.*;


class Addreport extends JFrame implements ActionListener
{ 
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
private JRadioButton checkBox1,checkBox2;
private JButton add,cancel,btn;
private Container c;
private JLabel l,imgLabel;
private ImageIcon img;
 
Addreport()  
    {
    c=this.getContentPane();
	c.setLayout(null);
	c.setVisible(true);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1280,720);
	
	this.setTitle("Add Report");	
	
	img =new ImageIcon("btr.png");
    imgLabel=new JLabel(img);
    imgLabel.setBounds(0, 0, 1280, 720);
    c.add(imgLabel);
    
    l1=new JLabel("First Name:");
    l1.setForeground(Color.white);	
    l1.setBounds(50,150, 100,30);
    t1=new JTextField();  
    t1.setBounds(150,150, 300,30); 
	imgLabel.add(l1);imgLabel.add(t1);
    	
    l2=new JLabel("Last Name:");
    l2.setForeground(Color.white);	
    l2.setBounds(50,200, 100,30);
	t2=new JTextField();  
    t2.setBounds(150,200,300,30);
	imgLabel.add(l2);imgLabel.add(t2);
	
	
    l3=new JLabel("ID No:");
	l3.setForeground(Color.white);
    l3.setBounds(50,250, 100,30);
	t3=new JTextField();  
    t3.setBounds(150,250,300,30);
	imgLabel.add(l3);imgLabel.add(t3);
	
	
    l4=new JLabel("Mobile :");
	l4.setForeground(Color.white);
    l4.setBounds(50,300, 100,30);
	t4=new JTextField();  
    t4.setBounds(150,300,300,30);
	imgLabel.add(l4);imgLabel.add(t4); 
	
	
    l5=new JLabel("Flight ID:");
	l5.setForeground(Color.white);
    l5.setBounds(50,450, 100,30);
	imgLabel.add(l5);
	t10=new JTextField();  
    t10.setBounds(150,450, 300,30);
	imgLabel.add(t10);
	
	
	
	
	l6=new JLabel("From :");
	l6.setForeground(Color.white);
    l6.setBounds(50,400, 100,30);
	imgLabel.add(l6);
	t9=new JTextField();  
    t9.setBounds(150,400, 300,30);
	imgLabel.add(t9);

	
    l7=new JLabel("Date :");
	l7.setForeground(Color.white);
    l7.setBounds(50,350, 100,30);
	t5=new JTextField();  
    t5.setBounds(150,350, 300,30);
	imgLabel.add(l7);imgLabel.add(t5);
	
	
    l8=new JLabel("Gender:");
	l8.setForeground(Color.white);
    l8.setBounds(700,150, 100,30);
	t6=new JTextField();  
    t6.setBounds(800,150, 300,30);
	imgLabel.add(l8);imgLabel.add(t6);
	
	l9=new JLabel("To:");
    l9.setForeground(Color.white);	
    l9.setBounds(700,400, 100,30);
	
    t7=new JTextField();  
    t7.setBounds(800,400, 300,30); 
	imgLabel.add(l9);imgLabel.add(t7);
	
	
	
	
	
	
	add=new JButton("Add Report");	
    add.setBounds(500,600, 100,30); 
    add.addActionListener(this);  	
    imgLabel.add(add);
	
	cancel=new JButton("Cancel");   
    cancel.setBounds(650,600, 95,30);
    cancel.addActionListener(this);   
    imgLabel.add(cancel);
	
   
    
    
	
	
	}
	

  	 	

public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==add)
	{
		
		   String fname = t1.getText();
		   String lname = t2.getText();
		   String mobile = t4.getText();
		   String date = t5.getText();
		   String id = t3.getText();
		   String gender = t6.getText();
		   String from = t9.getText();
		   String to = t7.getText();
		   String flightid = t10.getText();
	
	
	
	          try{

     if(fname.equals("")&&mobile.equals("")&&lname.equals("")&&date.equals("")&&gender.equals("")&&id.equals("")&&flightid.equals("")&&from.equals("")&&to.equals(""))
      {
	JOptionPane.showMessageDialog(null, "Please Filled up all the details");
      }
       else{
		   
		   
		   
		   	FileWriter file = new FileWriter("reportdetails.txt",true); 
			
			 
			file.write (t1.getText()+","+t2.getText()+","+t4.getText()+","+t3.getText()+","+t6.getText()+","+t9.getText()+","+t7.getText()+","+t5.getText()+","+t10.getText()+"\n");
			file.close();  
	      
			
             JOptionPane.showMessageDialog(null, "Successfully Add Report");
			 
			 
			 	dispose();
		ShowReport frame = new ShowReport();
        frame.setVisible(true);
	
           }
		
		}

		catch(IOException io)
		{
		
		}

	}

   else if (e.getSource()==cancel){
	  
	   
	    JOptionPane.showMessageDialog(null, "Call Constructor for Back page ");
	   dispose();
			  ReservationAdmin frame = new ReservationAdmin();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }




	
}

public static void main(String[]args) 
{  
Addreport frame = new Addreport();
frame.setVisible(true);

} 
	
}