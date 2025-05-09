import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

 public class ManageMaintenanceReport extends JFrame implements ActionListener{  
    JButton adds,add,dlt,ed,back1;
    JLabel backImg,l;
	
	public ManageMaintenanceReport(){
	
    super("Manage Maintanance");  
	 setSize(1280,720);    
     setLayout(null);    
                  
     ImageIcon img = new ImageIcon("Eshita2.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);
	 
	l = new JLabel("Welcome to Airline Reservation  System");
	l.setFont(new Font("Century",Font.BOLD,27));
	l.setForeground(Color.WHITE);
	l.setBounds(250, 55, 1000, 250);
	backImg.add(l);
	 
	 
	add=new JButton(" Add Report"); 
	add.setBounds(100,300,150,30);
	add.setBackground( Color.YELLOW);
	add.addActionListener(this);
	backImg.add(add);
 
    dlt=new JButton(" Delete"); 
	dlt.setBounds(500,300,150,30);
	dlt.setBackground( Color.YELLOW);
	dlt.addActionListener(this);
	backImg.add(dlt);  
	
    ed = new JButton("Edit");  
    ed.setBounds(900,300,150,30);
	ed.setBackground( Color.YELLOW);
    ed.addActionListener(this);		
    backImg.add(ed);  		
 	
    back1=new JButton(" Back"); 
	back1.setBounds(100,450,70,20);
	back1.setBackground( Color.ORANGE);
    back1.addActionListener(this);	
    backImg.add(back1);	
      
	  setVisible(true); 
   } 
   
    public void actionPerformed(ActionEvent e){
		 
		 if(e.getSource()==back1)
		 {
			 dispose();
			  ReservationAdmin frame = new ReservationAdmin();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
		 
		else if(e.getSource()==ed)
		 {
			 dispose();
			  DelReport frame = new DelReport();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
		 
		 else if(e.getSource()==dlt)
		 {
			 dispose();
			  DelReport frame = new DelReport();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
		 else if(e.getSource()==add)
		 {
			 JOptionPane.showMessageDialog(null,"Please add your report");
			 dispose();
			  Addreport frame = new Addreport();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
		 
	 }
   
   
   
   public static void main(String[] args) { 
	  new ManageMaintenanceReport();
   
   }   
}