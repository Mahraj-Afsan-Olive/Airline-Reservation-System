import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent.*;




public class Nagad extends JFrame implements ActionListener  { 
             
			 JLabel l1,l2,backImg,l3,l4,l5;
			 JTextField t1,t2;
			 JPasswordField t3;
			 JButton c,b1,n;
			 

public Nagad(){ 
             super("Payment Page");
	         setSize(1280,720);    
             setLayout(null);    
                  
     ImageIcon img = new ImageIcon("Nogod.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);
	 
	    l1=new JLabel("Payment Page");
		l1.setFont(new Font("Castellar",Font.BOLD,40));
		//l1.setForeground(new Color(171,39,93));
		l1.setForeground(Color.ORANGE);	
		l1.setBounds(400, 25, 850, 250);
		backImg.add(l1);
		
		l2 = new JLabel("Complete Payment via Nagad");
		l2.setFont(new Font("Century",Font.BOLD,16));
		l2.setForeground(Color.WHITE);
		l2.setBounds(400, 55, 850, 250);
		backImg.add(l2);
	 
         
	  
        l3=new JLabel("Amount(Tk) :");  
        l3.setForeground(Color.WHITE);		 
        l3.setBounds(400,240, 250,30);
        backImg.add(l3);

        t1 = new JTextField();  
        t1.setBounds(600,240, 200,30);
        backImg.add(t1);  		
				
     	 
        l4=new JLabel("Nagad Account Number :"); 
		l4.setFont(new Font("The New Roman",Font.BOLD,12));
        l4.setForeground(Color.WHITE);		
        l4.setBounds(400,295, 250,30);
		backImg.add(l4);
		
		t2 = new JTextField();   
        t2.setBounds(600,295,200,30); 
        backImg.add(t2);
		
        l5=new JLabel("Nagad PIN :"); 
		l5.setFont(new Font("The New Roman",Font.BOLD,12));
		l5.setForeground(Color.WHITE);
        l5.setBounds(400,350,100,30); 
        backImg.add(l5); 

        t3 = new JPasswordField();  
        t3.setBounds(600,350, 200,30); 
		backImg.add(t3);  		
		
        b1 = new JButton("Confirm Payment"); 
		b1.setFont(new Font("The New Roman",Font.BOLD,12));
	    b1.addActionListener(this);	
        b1.setBackground(Color.YELLOW);
        b1.setBounds(650,450,130,20); 
        backImg.add(b1);

     	
	   c=new JButton(" Cancel"); 
	   c.setBounds(435,450,130,20);
	   c.setBackground(Color.YELLOW);
	   c.addActionListener(this);
	   backImg.add(c);		
	   
	   n = new JButton("Payment Details"); 
		n.setFont(new Font("The New Roman",Font.BOLD,12));
	    n.addActionListener(this);	
        n.setBackground(Color.YELLOW);
        n.setBounds(550,500,130,20); 
        backImg.add(n);

		
        
		       setVisible(true);
}

    public void actionPerformed(ActionEvent e) 
{
	
	String amount = t1.getText();
		String phnNum = t2.getText();
		String pin = t3.getText();
	
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
			FileWriter file = new FileWriter("nagad.txt",true); 		
		    file.write (t1.getText() + "   "+ t2.getText()+"   "+t3.getText()+  "\n" );
			file.close();  
			JFrame fr = new JFrame();
	
		}

		catch(Exception io)
		{
		
		}
		
		
		
	}	
     else if(e.getSource() == n)
	{
		NagadInfo na = new NagadInfo(amount , phnNum, pin, this);
		na.setVisible(true);
		this.setVisible(false);
	}
	
					
				
}

       public static void main(String[] args) {    
   
   new Nagad();
}
}