import java.lang.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent.*; 
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

class HomePage extends JFrame implements ActionListener{
	
	private JButton enterbtn;
	private Container c;
	private ImageIcon img;
	private JLabel imgLabel;

HomePage(){
	
	
    c=this.getContentPane();
	c.setLayout(null);
	c.setVisible(true);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1280,720);
	
	ImageIcon img =new ImageIcon("HomePageImg.png");
    JLabel imgLabel=new JLabel(img);
    imgLabel.setBounds(0, 0, 1280, 720);
    //imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
    c.add(imgLabel);
    c.setVisible(true);
	
	this.setTitle("Home Page");

   	JLabel l2=new JLabel("Welcome To");
    l2.setFont(new Font("Courier",Font.BOLD,30)); // Courier, Arial, Helvetica, Castellar
    l2.setForeground(new Color(172,40,94));	
    l2.setBounds(500,20, 700,100); 
	imgLabel.add(l2);
	
	JLabel l1=new JLabel("Airline Reservations System");
    l1.setFont(new Font("Courier",Font.BOLD,30)); // Courier, Arial, Helvetica, Castellar
    l1.setForeground(new Color(172,40,94));	
    l1.setBounds(400,60, 700,100); 
	imgLabel.add(l1);
	

    enterbtn=new JButton("Enter To Process");    
    enterbtn.setBounds(1000,550, 150,30);
    //enterbtn.setFont(new Font("Arial",Font.BOLD,12));	
	enterbtn.setForeground(new Color(0, 0, 0));	
	enterbtn.setBackground(new Color(0, 191, 255));
	enterbtn.addActionListener(this);
    imgLabel.add(enterbtn);
	

 
 

}

public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==enterbtn){
		dispose();
		LoginFrame frame = new LoginFrame();
	    frame.setVisible(true);
		
	}
				
}

public static void main(String args[])
	{
		HomePage frame = new HomePage();
        frame.setVisible(true);
		
	}
}