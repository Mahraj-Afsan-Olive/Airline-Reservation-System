import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent.*;




public class MASTERCard extends JFrame implements ActionListener  { 
             
			 JLabel l1,l2,backImg,l3,l4,l5,l6;
			 JTextField t1,t2,t3,t4;
			 JButton b1,c,m;
			 

public MASTERCard(){ 
             super("Payment Page");
	          setSize(1280,720);    
                setLayout(null);    
                  
     ImageIcon img = new ImageIcon("E:\\New folder\\Master.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);
	 
	     	l1=new JLabel("Payment Page");
		l1.setFont(new Font("Castellar",Font.BOLD,40));
		//l1.setForeground(new Color(171,39,93));
	    l1.setForeground(Color.RED);
		l1.setBounds(400, 25, 850, 250);
		backImg.add(l1);
		
		l2 = new JLabel("Complete Payment via Master Crad");
		l2.setFont(new Font("Century",Font.BOLD,16));
		//l2.setForeground(new Color(171,39,93));
		l2.setForeground(Color.YELLOW);
		l2.setBounds(400, 55, 850, 250);
		backImg.add(l2);
	 
        
	  
         l3=new JLabel("Enter card name:"); 
         l3.setFont(new Font("The New Roman",Font.BOLD,12));		 
         l3.setForeground(Color.WHITE);		 
        l3.setBounds(400,240, 250,30);
        backImg.add(l3);	

        t1 = new JTextField();  
        t1.setBounds(600,240, 200,30);
        backImg.add(t1);  		
     	 
        l4=new JLabel("Expiry / Validity Date:");
        l4.setFont(new Font("The New Roman",Font.BOLD,12));		
        l4.setForeground(Color.WHITE);		
        l4.setBounds(400,295, 250,30);
		backImg.add(l4);
		
		t2 = new JTextField();   
         t2.setBounds(600,295,200,30); 
         backImg.add(t2); 
		
		l5=new JLabel("Amount(Tk) :"); 
		l5.setFont(new Font("The New Roman",Font.BOLD,12));
		l5.setForeground(Color.WHITE);
        l5.setBounds(400,350,100,30); 
        backImg.add(l5); 

        t3 = new JTextField();  
        t3.setBounds(600,350, 200,30); 
		backImg.add(t3);
				
	    l6=new JLabel("Enter CVV :"); 
		l6.setFont(new Font("The New Roman",Font.BOLD,12));
		l6.setForeground(Color.WHITE);
        l6.setBounds(400,405,100,30); 
        backImg.add(l6); 

        t4 = new JTextField();  
        t4.setBounds(600,405, 200,30); 
		backImg.add(t4);
       		
		
        b1 = new JButton("Confirm Payment"); 
	b1.addActionListener(this);	
      b1.setBackground( Color.ORANGE);		
        b1.setBounds(650,450,130,20); 
        backImg.add(b1);

     	
	c=new JButton(" Cancel"); 
	c.setBounds(435,450,130,20);
	c.setBackground( Color.ORANGE);		
		c.addActionListener(this);
    backImg.add(c);	

    m = new JButton("Payment Details"); 
		m.addActionListener(this);	
		m.setBackground(Color.ORANGE);
        m.setBounds(550,500,170,20); 
        backImg.add(m);	
		
		       setVisible(true);
}

    public void actionPerformed(ActionEvent e) 
{
	
	 String name = t1.getText();
		String expiry = t2.getText();
		String amount = t3.getText();
		String cvv = t4.getText();
	 
if(e.getSource()==c)
	{
		
		ManagePaymentProcess frame = new ManagePaymentProcess();
		dispose();
        frame.setVisible(true);

	}
	else if(e.getSource()==b1)
	{
		
	    JOptionPane.showMessageDialog(null,"Payment Successfull");
		ManagePaymentProcess frame = new ManagePaymentProcess();
		dispose();
        frame.setVisible(true);
		
		
				 
				   
     try{
			FileWriter file = new FileWriter("masterCard.txt",true); 		
		    file.write (t1.getText() + "   "+ t2.getText()+"   "+t3.getText()+"   "+t4.getText()+  "\n" );
			file.close();  
			JFrame fr = new JFrame();
	
		}

		catch(Exception io)
		{
		
		}
		
		
		
	}
        
	else if(e.getSource() == m)
	{
		MasterInfo master = new MasterInfo(name , expiry,amount,cvv, this);
		master.setVisible(true);
		this.setVisible(false);
	}
					
				
}
       public static void main(String[] args) {    
   
   new MASTERCard();
}
}


