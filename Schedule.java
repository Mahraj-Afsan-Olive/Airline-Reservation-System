import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;

public class Schedule extends JFrame implements ActionListener{  

      JLabel backImg,l,l1,l1a,l1b,l1c,l1d,l1e,l1f,l1g,l1h,l1i,l1j;
	  JLabel l2,l2a,l2b,l2c,l2d,l2e,l2f,l2g,l2h,l2i,l2j;
      JLabel l3,l3a,l3b,l3c,l3d,l3e,l3f,l3g,l3h,l3i,l3j;
      JLabel l4,l4a,l4b,l4c,l4d,l4e,l4f,l4g,l4h,l4i,l4j;
	  JLabel l5,l5a,l5b,l5c,l5d,l5e,l5f,l5g,l5h,l5i,l5j;
	  JLabel l6,l6a,l6b,l6c,l6d,l6e,l6f,l6g,l6h,l6i,l6j;
	  JButton b;
	  
	 public Schedule(){
		 super("Schedule Page");
	    setSize(1280,720);    
        setLayout(null); 
				
		
	    ImageIcon img = new ImageIcon("Tripty 04.jpg");
	    JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	    backImg.setBounds(0,0,1280,720);
	    this.add(backImg); 
		
	    l = new JLabel("Airline's Schedule Page");
		l.setFont(new Font("Castellar",Font.BOLD,40));
		//l.setForeground(Color.BLUE);
		l.setForeground(new Color(171,39,93));
		l.setBounds(300, 25, 850, 250);
		backImg.add(l);
	 
	
        l1=new JLabel("Flight ID");  
        l1.setFont(new Font("Elephant",Font.BOLD,15));
		l1.setForeground(new Color(171,39,93));		
        l1.setBounds(150,240, 80,30);
        backImg.add(l1); 
		
	
		l1a=new JLabel("F0001"); 
		l1a.setBounds(160,280, 80,30);
        backImg.add(l1a); 
		
		l1b=new JLabel("F0002"); 
		l1b.setBounds(160,300, 80,30);
        backImg.add(l1b); 
		
		l1c=new JLabel("F0003"); 
		l1c.setBounds(160,320, 80,30);
        backImg.add(l1c); 
		
		l1d=new JLabel("F0004"); 
		l1d.setBounds(160,340, 80,30);
        backImg.add(l1d); 
		
		l1e=new JLabel("F0005"); 
		l1e.setBounds(160,360, 80,30);
        backImg.add(l1e); 
		
		l1f=new JLabel("F0006"); 
		l1f.setBounds(160,380, 80,30);
        backImg.add(l1f); 
		
		l1g=new JLabel("F0007"); 
		l1g.setBounds(160,400, 80,30);
        backImg.add(l1g); 
		
		l1h=new JLabel("F0008"); 
		l1h.setBounds(160,420, 80,30);
        backImg.add(l1h); 
		
		l1i=new JLabel("F0009"); 
		l1i.setBounds(160,440, 80,30);
        backImg.add(l1i); 
		
		l1j=new JLabel("F0010"); 
		l1j.setBounds(160,460, 80,30);
        backImg.add(l1j); 
		
		l2=new JLabel("Customer ID");        //x,y,w,h
        l2.setFont(new Font("Elephant",Font.BOLD,15));
		l2.setForeground(new Color(171,39,93));		
		l2.setBounds(300,240, 180,30);
		backImg.add(l2);
		
		l2a=new JLabel("I0001"); 
		l2a.setBounds(330,280, 80,30);
        backImg.add(l2a); 
		
		l2b=new JLabel("I0002"); 
		l2b.setBounds(330,300, 80,30);
        backImg.add(l2b); 
		
		l2c=new JLabel("I0003"); 
		l2c.setBounds(330,320, 80,30);
        backImg.add(l2c);

        l2d=new JLabel("I0004"); 
		l2d.setBounds(330,340, 80,30);
        backImg.add(l2d); 
        
        l2e=new JLabel("I0005"); 
		l2e.setBounds(330,360, 80,30);
        backImg.add(l2e);

        l2f=new JLabel("I0006"); 
		l2f.setBounds(330,380, 80,30);
        backImg.add(l2f);
		
        l2g=new JLabel("I0007"); 
		l2g.setBounds(330,400, 80,30);
        backImg.add(l2g);  	

        l2h=new JLabel("I0007"); 
		l2h.setBounds(330,420, 80,30);
        backImg.add(l2h);  	

        l2i=new JLabel("I0007"); 
		l2i.setBounds(330,440, 80,30);
        backImg.add(l2i);  	
        		
		l2j=new JLabel("I0010"); 
		l2j.setBounds(330,460, 80,30);
        backImg.add(l2j);  	
		 
	    l3=new JLabel("Class");
		l3.setFont(new Font("Elephant",Font.BOLD,15));
    	l3.setForeground(new Color(171,39,93));		
        l3.setBounds(470,240,80,30); 
        backImg.add(l3);  	
		
		l3a=new JLabel("Economy"); 
		l3a.setBounds(470,280, 80,30);
        backImg.add(l3a);
		
		l3b=new JLabel("Economy"); 
		l3b.setBounds(470,300, 80,30);
        backImg.add(l3b);
		
		l3c=new JLabel("Economy"); 
		l3c.setBounds(470,320, 80,30);
        backImg.add(l3c);
		
	    l3d=new JLabel("Economy"); 
		l3d.setBounds(470,340, 80,30);
        backImg.add(l3d);
		
		l3e=new JLabel("Economy"); 
		l3e.setBounds(470,360, 80,30);
        backImg.add(l3e);
		
		l3f=new JLabel("Economy"); 
		l3f.setBounds(470,380, 80,30);
        backImg.add(l3f);
		
		l3g=new JLabel("Economy"); 
		l3g.setBounds(470,400, 80,30);
        backImg.add(l3g);

        l3h=new JLabel("Economy"); 
		l3h.setBounds(470,420, 80,30);
        backImg.add(l3h);

        l3i=new JLabel("Economy"); 
		l3i.setBounds(470,440, 80,30);
        backImg.add(l3i);	

        l3j=new JLabel("Economy"); 
		l3j.setBounds(470,460, 80,30);
        backImg.add(l3j);		
		
		
		
        l4=new JLabel("Country");
		l4.setFont(new Font("Elephant",Font.BOLD,15));
		l4.setForeground(new Color(171,39,93));		
        l4.setBounds(560,240,80,30); 
        backImg.add(l4); 

        l4a=new JLabel("Canada"); 
		l4a.setBounds(560,280, 80,30);
        backImg.add(l4a); 

        l4b=new JLabel("Saudi Arabia"); 
		l4b.setBounds(560,300, 80,30);
        backImg.add(l4b);  
        
        l4c=new JLabel("Japan"); 
		l4c.setBounds(560,320, 80,30);
        backImg.add(l4c); 

        l4d=new JLabel("Switzerland"); 
		l4d.setBounds(560,340, 80,30);
        backImg.add(l4d); 

        l4e=new JLabel("Australia"); 
		l4e.setBounds(560,360, 80,30);
        backImg.add(l4e); 

        l4f=new JLabel("Newzeland"); 
		l4f.setBounds(560,380, 80,30);
        backImg.add(l4f); 	

        l4g=new JLabel("Dubai"); 
		l4g.setBounds(560,400, 80,30);
        backImg.add(l4g); 

        l4h=new JLabel("Africa"); 
		l4h.setBounds(560,420, 80,30);
        backImg.add(l4h); 

        l4i=new JLabel("Germany"); 
		l4i.setBounds(560,440, 80,30);
        backImg.add(l4i); 

        l4j=new JLabel("France"); 
		l4j.setBounds(560,460, 80,30);
        backImg.add(l4j); 
		
		
	    l5=new JLabel("Departure Date");
		l5.setFont(new Font("Elephant",Font.BOLD,15));
	    l5.setForeground(new Color(171,39,93));		
        l5.setBounds(675,240,170,30); 
        backImg.add(l5);  
		
		l5a=new JLabel("Sunday"); 
		l5a.setBounds(700,280, 80,30);
        backImg.add(l5a); 		
		
		l5b=new JLabel("Monday"); 
		l5b.setBounds(700,300, 80,30);
        backImg.add(l5b);

        l5c=new JLabel("Tuesday"); 
		l5c.setBounds(700,320, 80,30);
        backImg.add(l5c); 		
		
        l5d=new JLabel("Wednesday"); 
		l5d.setBounds(700,340, 80,30);
        backImg.add(l5d); 		
		
        l5e=new JLabel("Thursday"); 
		l5e.setBounds(700,360, 80,30);
        backImg.add(l5e); 		
		 		
		l5f=new JLabel("Friday"); 
		l5f.setBounds(700,380, 80,30);
        backImg.add(l5f); 		
		
		l5g=new JLabel("Saturday"); 
		l5g.setBounds(700,400, 80,30);
        backImg.add(l5g); 

        l5h=new JLabel("Sunday"); 
		l5h.setBounds(700,420, 80,30);
        backImg.add(l5h); 

        l5i=new JLabel("Monday"); 
		l5i.setBounds(700,440, 80,30);
        backImg.add(l5i); 
        		
		l5j=new JLabel("Tuesday"); 
		l5j.setBounds(700,460, 80,30);
        backImg.add(l5j); 
		
	    l6=new JLabel("Departure Time");
		l6.setFont(new Font("Elephant",Font.BOLD,15));
		l6.setForeground(new Color(171,39,93));		
        l6.setBounds(880,240,170,30); 
        backImg.add(l6);  
		
		l6a=new JLabel("06.00 am"); 
		l6a.setBounds(905,280, 80,30);
        backImg.add(l6a); 
		
		l6b=new JLabel("09.00 am"); 
		l6b.setBounds(905,300, 80,30);
        backImg.add(l6b); 
		
		l6c=new JLabel("12.00 pm"); 
		l6c.setBounds(905,320, 80,30);
        backImg.add(l6c); 
		
		l6d=new JLabel("03.00 pm"); 
		l6d.setBounds(905,340, 80,30);
        backImg.add(l6d); 
		
		l6e=new JLabel("06.00 am"); 
		l6e.setBounds(905,360, 80,30);
        backImg.add(l6e); 
		
		l6f=new JLabel("09.00 pm"); 
		l6f.setBounds(905,380, 80,30);
        backImg.add(l6f); 
		
		l6g=new JLabel("12.00 am"); 
		l6g.setBounds(905,400, 80,30);
        backImg.add(l6g); 
		
		l6h=new JLabel("09.00 am"); 
		l6h.setBounds(905,420, 80,30);
        backImg.add(l6h); 
		
		l6i=new JLabel("03.00 am"); 
		l6i.setBounds(905,440, 80,30);
        backImg.add(l6i); 
		
		l6j=new JLabel("12.00 pm"); 
		l6j.setBounds(905,460, 80,30);
        backImg.add(l6j); 
		
		  
    b=new JButton(" Back");
    b.addActionListener(this);
    b.setBackground( Color.ORANGE);	
	b.setBounds(600,550,100,20);
    backImg.add(b);
          
		        
		setVisible(true);		  
				 
                	
                 

}

  public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==b)
	{
		
		Strange frame = new Strange();
		dispose();
        frame.setVisible(true);

	}	
	
}

  
public static void main(String[] args) {    
   
   new Schedule();
}
}

   
   
   
   