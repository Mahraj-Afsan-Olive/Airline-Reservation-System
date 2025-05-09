import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;  
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class AdminPage extends JFrame implements ActionListener 
{  
 
	   JLabel backImg,l1,l2,l3,l4,l5,l6,l7;
	   JTextField text,text2;
	   JPasswordField value ;
	    JCheckBox b1;
		  private JButton b,adds;

	public AdminPage()
	{
    	
	       super("Admin Login");
	          setSize(1280,720);    
                setLayout(null);    
                  
     ImageIcon img = new ImageIcon("Eshita1.jpg");
	 JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	 backImg.setBounds(0,0,1280,720);
	 this.add(backImg);	
        
        l1 = new JLabel("Admin Page");
		l1.setFont(new Font("Castellar",Font.BOLD,50));
		l1.setForeground(Color.BLUE);
		l1.setBounds(480, 15, 850, 250);
		backImg.add(l1);
			
     	l5=new JLabel("Username:"); 
        l5.setFont(new Font("Calibri",Font.BOLD,14));	
        l5.setBounds(400,300, 80,30);
        backImg.add(l5); 
        
		text = new JTextField();  
        text.setBounds(500,300, 200,30); 
		backImg.add(text);
		
        l6=new JLabel("Password :");
		l6.setFont(new Font("Calibri",Font.BOLD,14));
        l6.setBounds(400,350,80,30); 
        backImg.add(l6);  

 
	 value = new JPasswordField();   
     value.setBounds(500,350,200,30); 
     backImg.add(value); 

        b = new JButton("Login");  
        b.setBounds(750,550,80,30);
		b.setBackground( Color.ORANGE); 
        b.addActionListener(this);		
        backImg.add(b); 

		this.add(backImg);
		   setVisible(true); 		   
	}
	
	
	 public void actionPerformed(ActionEvent e){
		 
		 if (e.getSource()==b)
			  
		 {
	 
			    String userId= text.getText();
                String password = value.getText();
                
                
                if(userId.equals("admin") && password.equals("admin"))
                {

              JOptionPane.showMessageDialog(null,"Login Successfull");
			 dispose();
			 ReservationAdmin frame= new ReservationAdmin();
			 frame.setVisible(true);
			 	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 frame.setSize(1280,720);
            
              
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, " Invalid user Id Or Password");
                }
			 
			 
			 
			 
			 
		 }
		 
		 
	 }
	
	public static void main(String[] args) 
	{ 
	new AdminPage();  
	}
}