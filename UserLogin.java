import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class UserLogin extends JFrame implements ActionListener 
{  
 
	   
	   JLabel backImg,l1,l2,l3,l4,l5,l6;
        
	   JTextField t1;
	   JPasswordField value ;
	    JCheckBox showPassword;
		  JButton l;


    
	public UserLogin()
	{
    	
	       super("Rservation System");
	          setSize(1280,720);    
                setLayout(null);    
                  
     ImageIcon img = new ImageIcon("tripty01.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);	
        
        l1 = new JLabel("Aeroport");
		l1.setFont(new Font("Matura MT Script Capitals",Font.BOLD,50));
		l1.setForeground(Color.RED);
		
		l1.setBounds(300, 15, 850, 250);
		backImg.add(l1);
			
     	l2 = new JLabel("Welcome to ");
		l2.setFont(new Font("Century",Font.BOLD,16));
		l2.setForeground(Color.ORANGE);
		l2.setBounds(300, 60, 2000, 250);
		backImg.add(l2);
		
		l3 = new JLabel("Aeroport ");
		l3.setFont(new Font("Century",Font.BOLD,35));
		l3.setForeground(new Color(171,39,93));
		l3.setBounds(400,50, 850, 250);
		backImg.add(l3);
	    
		l4 = new JLabel("Reservation System,A trusted reservation system. Your journey, our service");
		l4.setFont(new Font("Century",Font.BOLD,16));
		l4.setForeground(Color.BLACK);
		l4.setBounds(570,60, 850, 250);
		backImg.add(l4);
		
	  
		
	
        l5=new JLabel("Username:"); 
		l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Calibri",Font.BOLD,14));	
        l5.setBounds(400,300, 80,30);
        backImg.add(l5); 
        
		t1 = new JTextField();  
        t1.setBounds(500,300, 200,30); 
		backImg.add(t1);
		
        l6=new JLabel("Password :");
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("Calibri",Font.BOLD,14));
        l6.setBounds(400,350,80,30); 
        backImg.add(l6);  

 
	 value = new JPasswordField();   
     value.setBounds(500,350,200,30); 
     backImg.add(value); 
	
	    l = new JButton("Login");    //x  y  w  h
        l.setBounds(550,450,80,30); 
		l.setBackground(Color.ORANGE);	
		l.addActionListener(this);
        backImg.add(l);

		
		showPassword= new JCheckBox("show Password");
		showPassword.setBounds(700,400,120,20);
		showPassword.addActionListener(this);
		backImg.add(showPassword);
		
		this.add(backImg);
		   setVisible(true); 
		
		
	}
		        public void actionPerformed(ActionEvent e) { 

                if(e.getSource()==l)
			{				
                String userName=t1.getText();
				String password=value.getText();
		
				
				
				
				if(userName.equalsIgnoreCase("Fatema")&& password.equalsIgnoreCase("tripty"))
				{
					JOptionPane.showMessageDialog(null,"Login Successful");
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid");
			    }
				
				
			}
			else if (e.getSource() == showPassword) {
				if (showPassword.isSelected()) {
					value.setEchoChar((char) 0);
				} else {
					value.setEchoChar('*');
				}
	
	
			}
			
			
			
            }



       
	
	
    public static void main(String[] args) 
	{ 
	new UserLogin();  
	}
}
   
   
