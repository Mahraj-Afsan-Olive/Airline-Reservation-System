import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.Formatter;
import java.util.*;



public class LoginFrame extends JFrame implements ActionListener 
{  
 
	  
	    private JLabel backImg,l1,l2,l3,l4;
        private JLabel userLabel,passWordLabel,singUpLabel,l5;
	    private JTextField userTextField;
	    private JPasswordField value ;
	    private JCheckBox showPassword;
		private JButton signupButton,resetButton,loginButton,backButton,adminlogin;
		private Container c;


    
	public LoginFrame()
	{
    	
	c=this.getContentPane();
	c.setLayout(null);
	//c.setVisible(true);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1280,720);
    this.setTitle("Login Form");	
                  
        ///ImageIcon img = new ImageIcon("LogInPage.png");
        ImageIcon img = new ImageIcon("Login.png");
	    JLabel backImg = new JLabel(" ",img,JLabel.CENTER);
	    backImg.setBounds(0,0,1280,720);
	    c.add(backImg);
		c.setVisible(true); 		
        
        l1 = new JLabel("Aeroport");
		l1.setFont(new Font("Castellar",Font.BOLD,50));
		l1.setForeground(Color.RED);
		l1.setBounds(300, 15, 850, 250);
		backImg.add(l1);
			
     	l2 = new JLabel("Welcome to ");
		l2.setFont(new Font("Century",Font.BOLD,16));
		//l2.setForeground(Color.WHITE);
		l2.setBounds(300, 60, 2000, 250);
		backImg.add(l2);
		
		l3 = new JLabel("Aeroport ");
		l3.setFont(new Font("Century",Font.BOLD,35));
		l3.setForeground(new Color(171,39,93));
		l3.setBounds(400,50, 850, 250);
		backImg.add(l3);
	    
		l4 = new JLabel("Reservation System,A trusted reservation system. Your journey, our service");
		l4.setFont(new Font("Century",Font.BOLD,16));
		//l4.setForeground(Color.WHITE);
		l4.setBounds(570,60, 850, 250);
		backImg.add(l4);
		
	  /* l7 = new JLabel("Your journey, our service");
		l7.setFont(new Font("Century",Font.BOLD,16));
		l7.setForeground(Color.YELLOW);
		l7.setBounds(300, 100, 850, 250);
		backImg.add(l7);*/
		
	
        userLabel=new JLabel("E-Mail "); 
        userLabel.setFont(new Font("Calibri",Font.BOLD,20));
        userLabel.setForeground(Color.BLACK);		
        userLabel.setBounds(400,295, 100,30);
        backImg.add(userLabel); 
        
		userTextField = new JTextField();  
		userTextField.setFont(new Font("Calibri",Font.BOLD,15));
	  //userTextField.setForeground(Color.WHITE);
        userTextField.setBounds(535,290, 270,35); 
		backImg.add(userTextField);
		
        passWordLabel=new JLabel("PASSWORD ");
		passWordLabel.setFont(new Font("Calibri",Font.BOLD,20));
		passWordLabel.setForeground(Color.BLACK);
        passWordLabel.setBounds(400,355,110,30); 
        backImg.add(passWordLabel);  

 
	    value = new JPasswordField();   
        value.setBounds(535,350,240,35); 
        backImg.add(value);
		
		showPassword= new JCheckBox("👁️"); //"👁"
		showPassword.setFont(new Font("",Font.BOLD,20));
	    showPassword.setForeground(Color.BLACK);
	    showPassword.setBackground(Color.WHITE);
		showPassword.setBounds(755,350,50,34);
		showPassword.addActionListener(this);
		backImg.add(showPassword);
		
	 
	    singUpLabel = new JLabel("Don't have an account ?");
	    singUpLabel.setFont(new Font("Century",Font.BOLD,16));
	    singUpLabel.setForeground(Color.RED);
	    singUpLabel.setBounds    (420, 530, 450, 30);      // signupLabel 
	    backImg.add(singUpLabel);
	  
	    l5 = new JLabel("Please click on the singup button to create an account");
		l5.setFont(new Font("Century",Font.BOLD,16));
		l5.setForeground(Color.black);
		l5.setBounds(420, 555, 450, 30);
		backImg.add(l5);
	 
	    signupButton = new JButton("SIGNUP");
		signupButton.setFont(new Font("Calibri",Font.BOLD,15));
	    signupButton.setForeground(Color.BLACK);
	    //signupButton.setBackground(Color.WHITE);
	    signupButton.setBackground(new Color(0, 191, 255));
	    signupButton.setBounds (900, 550, 100, 30);    //   signupButton ("SIGNUP")
	    signupButton.addActionListener(this);
	    backImg.add(signupButton);
		
		
		adminlogin = new JButton("ADMIN LOGIN");
		adminlogin.setFont(new Font("Calibri",Font.BOLD,12));
	    adminlogin.setForeground(Color.BLACK);
	    //adminlogin.setBackground(Color.WHITE);
	    adminlogin.setBackground(new Color(0, 191, 255));
	    adminlogin.setBounds (1100, 30, 110, 30);    //   signupButton ("SIGNUP")
	    adminlogin.addActionListener(this);
	    backImg.add(adminlogin);
	  
	  		
	    backButton = new JButton("🔙");    //x  y  w  h
		backButton.setFont(new Font("",Font.BOLD,30));
	    backButton.setForeground(Color.WHITE);
	    //backButton.setBackground(Color.WHITE);
	    backButton.setBackground(new Color(0, 191, 255));
        backButton.setBounds(15,600,65,35); 
		backButton.addActionListener(this);
        backImg.add(backButton);
		
		
		loginButton = new JButton("LOG IN");    //x  y  w  h
		loginButton.setFont(new Font("Calibri",Font.BOLD,15));
	    //loginButton.setForeground(Color.BLACK);
	    loginButton.setForeground(Color.WHITE);
	    //loginButton.setBackground(Color.WHITE);
	    //loginButton.setBackground(new Color(0, 191, 255));
	    //loginButton.setBackground(new Color(100,149,237));
	    loginButton.setBackground(new Color(70,130,180));
        loginButton.setBounds(535,420,270,30); 
		loginButton.addActionListener(this);
        backImg.add(loginButton);

        /*resetButton = new JButton("Reset");  
		resetButton.setFont(new Font("Calibri",Font.BOLD,15));
	    resetButton.setForeground(Color.BLACK);
	    //resetButton.setBackground(Color.WHITE);
	    resetButton.setBackground(new Color(0, 191, 255));
        resetButton.setBounds(620,480,80,30); 
		resetButton.addActionListener(this);
        backImg.add(resetButton);*/

        resetButton = new JButton("🔃"); //resetbutton  
		resetButton.setFont(new Font("",Font.BOLD,15));
	    resetButton.setForeground(Color.BLACK);
	    //resetButton.setBackground(Color.WHITE);
	    resetButton.setBackground(new Color(0, 191, 255));
        resetButton.setBounds(640,480,50,40); 
		resetButton.addActionListener(this);
        backImg.add(resetButton);		
		
		
		
		//this.add(backImg);
		c.setVisible(true); 
		
		
		
	}
	
  public void actionPerformed(ActionEvent e) { 

    //Coding Part of signupButton button
  	if(e.getSource()==signupButton){
		dispose();
		SignUp frame = new SignUp();
		frame.setVisible(true);
	
	}
	
	//Coding Part of adminlogin button
  	if(e.getSource()==adminlogin){
		dispose();
		AdminPage frame = new AdminPage();
		frame.setVisible(true);
	
	}
	
	  //Coding Part of backButton button
           if (e.getSource() == backButton) {
                  dispose();
		          HomePage frame = new HomePage();
				  frame.setVisible(true);
           }
	
	
	//Coding Part of RESET button
            if (e.getSource() == resetButton) {
			  
               userTextField.setText("");
               value.setText("");
               }
			   
			   
   //Coding Part of showPassword JCheckBox
			if (e.getSource() == showPassword) {
				
				if (showPassword.isSelected()) {
					
					value.setEchoChar((char) 0);
					
				} 
				
				else {
					
					value.setEchoChar('*');
					
				}
	
	
			}
			
	//Coding Part of LOGIN button
		else if(e.getSource()==loginButton){
		
		        boolean matched = false;
			    String mail= userTextField.getText().toString();
				String pass = value.getText().toString();
				
				
				
				try{
				
				FileReader fir = new FileReader("forlogin.txt");
				BufferedReader bfr = new BufferedReader(fir);
				String line;
				while((line=bfr.readLine())!=null ){
					if(line.equals(mail+"\t"+pass)){
						matched=true;
						break;
						
					}
					
				}
				fir.close(); 
				}catch(Exception eo){}
				
				if(matched){
			       dispose();
		           CM frame = new CM();
                   frame.setVisible(true);
					
				}
				else{
					JOptionPane.showMessageDialog(null, " Invalid user Id Or Password");
				}
		
		
	
	}
	
	
			
			
			
            
			
			
}



       
	
	
    public static void main(String[] args) 
	{ 
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);	
	}
}
   
