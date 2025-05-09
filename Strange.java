import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;



  public class Strange extends JFrame implements ActionListener{  
  
     JButton d,cr,back;
	 JLabel backImg,ls,l1,la;
	 
	 public Strange(){
  
     super("Reservation System");
	 setSize(1280,720);    
     setLayout(null);    
                  
     ImageIcon img = new ImageIcon("strange.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);
 
    
	
	 ls=new JLabel("Welcome to ");    
    ls.setFont(new Font("Century",Font.BOLD,20));
	ls.setForeground(new Color(171,39,93));
	ls.setBounds(450, 50, 1000, 250);
	backImg.add(ls); 
	
	la=new JLabel("AEROPORT");    
    la.setFont(new Font("Castellar",Font.BOLD,55));
	la.setForeground(Color.RED);
	la.setBounds(570, 50, 1000, 250);
	backImg.add(la); 
	
	l1=new JLabel("Select an option from below where you want to go");    
    l1.setFont(new Font("Century",Font.BOLD,27));
	l1.setForeground(Color.BLACK);
	l1.setBounds(330, 90, 1000, 250);
	backImg.add(l1); 
		
     d=new JButton("Complete Payment"); 
	d.setFont(new Font("The New Roman",Font.BOLD,12));
	d.setBackground(Color.YELLOW);
	d.addActionListener(this);
	d.setBounds(245,350,250,30);
    backImg.add(d); 
	
          cr = new JButton("Schedule"); 
         cr.setFont(new Font("The New Roman",Font.BOLD,12));
         cr.setBackground(Color.YELLOW);
	cr.addActionListener(this);		 
         cr.setBounds(800,350,250,30);   
 	     backImg.add(cr);  
		 
		 
     back=new JButton("Back"); 
	 back.setBackground(Color.PINK);
	back.setBounds(600,450,100,20);
	back.addActionListener(this);
    backImg.add(back); 	
      
	  setVisible(true);
	 
   } 
   
   public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==d)
	{
		
		ManagePaymentProcess frame = new ManagePaymentProcess();
		dispose();
        frame.setVisible(true);

	}	

    else if(e.getSource()==cr)
	{
		
		Schedule frame = new Schedule();
		dispose();
        frame.setVisible(true);
		
	}
	else if(e.getSource()==back)
	{
		
		TicketNo frame = new TicketNo();
		dispose();
        frame.setVisible(true);

	}

	
}
		
		      public static void main(String[] args) { 
	  new Strange();
   
   }  
  }