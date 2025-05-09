import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 


 public class ReservationFlightSchedule extends JFrame implements ActionListener{  
    JButton adds,add,dlt,e,back1;
    JLabel backImg,l;
	
	public ReservationFlightSchedule(){
	
    super("Flight Schedule");  
	 setSize(1280,720);    
     setLayout(null);    
                  
     ImageIcon img = new ImageIcon("Eshita.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);
	 
	l = new JLabel("Flight Schedule");
	l.setFont(new Font("ALGERIAN",Font.BOLD,40));
	l.setForeground(Color.BLACK);
	l.setBounds(380, 55, 1000, 250);
	backImg.add(l);
	 
	 
	add=new JButton(" Add Flight"); 
	add.setBounds(100,300,150,30);
	add.setBackground( Color.ORANGE);
	add.addActionListener(this);
	backImg.add(add);
 
    dlt=new JButton(" Delete"); 
	dlt.setBounds(500,300,150,30);
	dlt.setBackground( Color.ORANGE);
	dlt.addActionListener(this);
	backImg.add(dlt);  
	
    e = new JButton("Edit");  
    e.setBounds(900,300,150,30);
	e.setBackground( Color.ORANGE);
    e.addActionListener(this);		
    backImg.add(e);  		
 	
    back1=new JButton(" Back"); 
	back1.setBounds(100,450,70,20);
	back1.setBackground( Color.YELLOW);
    back1.addActionListener(this);	
    backImg.add(back1);	
    setVisible(true); 
   }

       public void actionPerformed(ActionEvent e){
		 
		 if(e.getSource()==add)
		 {
			 dispose();
			  AdminPage frame = new AdminPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 }
		 
		 else if(e.getSource()==dlt)
		 {
			 dispose();
			  AdminPage frame = new AdminPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
		 
		 else if(e.getSource()==e)
		 {
			 dispose();
			  ReservationAdmin frame = new ReservationAdmin();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
		 else if(e.getSource()==back1)
		 {
			 dispose();
			  ReservationAdmin frame = new ReservationAdmin();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
		 

		 
		 
	 }
   
      
   
   public static void main(String[] args) { 
	  new ReservationFlightSchedule();
   
   }  
}