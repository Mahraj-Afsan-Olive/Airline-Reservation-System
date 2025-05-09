

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;


  public class ManagePaymentProcess extends JFrame implements ActionListener{  
  
     JButton d,cr,n,b,u,back;
	 JLabel backImg,ls,l1;
	 
	 public ManagePaymentProcess(){
     
     super("Payment Page");
	 setSize(1280,720);    
     setLayout(null);    
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  
     ImageIcon img = new ImageIcon("payment.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);
 
    
	
	 ls=new JLabel("Payment Process ");    
    ls.setFont(new Font("Castellar",Font.BOLD,55));
	ls.setForeground(new Color(171,39,93));
	ls.setBounds(350, 15, 1000, 250);
	backImg.add(ls); 
	
	 l1=new JLabel("Select a payment option from below to complete the payment ");    
    l1.setFont(new Font("Century",Font.BOLD,27));
	l1.setForeground(Color.BLACK);
	l1.setBounds(250, 55, 1000, 250);
	backImg.add(l1); 
		
    n=new JButton(" Nagad"); 
	n.setFont(new Font("The New Roman",Font.BOLD,12));
	n.setBackground(Color.YELLOW);
	n.addActionListener(this);
	//l2.setForeground(Color.YELLOW);
	n.setBounds(500,370,250,30);
    backImg.add(n);
	
	b=new JButton(" bKash"); 
	b.setFont(new Font("The New Roman",Font.BOLD,12));
	b.setBackground(Color.MAGENTA);
	b.addActionListener(this);
	b.setBounds(500,330,250,30);
    backImg.add(b);
	
	u=new JButton(" Upay"); 
	u.setFont(new Font("The New Roman",Font.BOLD,12));
	u.setBackground(new Color(0, 191, 255));
	u.addActionListener(this);
	u.setBounds(500,410,250,30);
    backImg.add(u);
	
	
		
    d=new JButton(" VISA Card"); 
	d.setFont(new Font("The New Roman",Font.BOLD,12));
	d.setBackground(Color.BLUE);
	d.addActionListener(this);
	d.setBounds(500,250,250,30);
    backImg.add(d); 
	
          cr = new JButton("MASTER Card"); 
         cr.setFont(new Font("The New Roman",Font.BOLD,12));	
         cr.setBackground(Color.ORANGE);	
         cr.addActionListener(this);		 
         cr.setBounds(500,290,250,30);   
 	     backImg.add(cr);  
		 
     back=new JButton(" Cancel");
	 back.setBackground(Color.PINK);	
    back.addActionListener(this);	 
	back.setBounds(600,550,100,20);
    backImg.add(back); 	
      
	  setVisible(true);
	 
   } 
   
   
public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==d)
	{
		
		VISACard frame = new VISACard();
		dispose();
        frame.setVisible(true);

	}	

    else if(e.getSource()==n)
	{
		
		Nagad frame = new Nagad();
		dispose();
        frame.setVisible(true);

	}	

   else if(e.getSource()==b)
	{
		
		Bkash frame = new Bkash();
		dispose();
        frame.setVisible(true);

	}	

else if(e.getSource()==cr)
	{
		
		MASTERCard frame = new MASTERCard();
		dispose();
        frame.setVisible(true);

	}	
else if(e.getSource()==u)
	{
		
		Upay frame = new Upay();
		dispose();
        frame.setVisible(true);

	}	
 
if(e.getSource()==back)
	{
		
		Strange frame = new Strange();
		dispose();
        frame.setVisible(true);

	}	
}

      public static void main(String[] args) { 
	  new ManagePaymentProcess();
   
   }  
  }