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

 
class FlightID extends JFrame implements ActionListener 
{  

   private JButton  backButton, resetButton, addButton;
   private JLabel  flightIdL, fnameL, lnameL,      sourceL,      departureL,      dateL,      arrivalTimeL,       departureTimeL,      flightChargesL,    imgLabel;
   private JTextField    fnameTxtFld, lnameTxtFld, sourceTxtFld, departureTxtFld, dateTxtFld, arrivalTimeTxtFld,  departureTimeTxtFld, flightChargesTxtFld;
   private Container c;
   private ImageIcon img; 
	 
FlightID()  
    {
        c=this.getContentPane();
	    c.setLayout(null);
	    c.setVisible(true);
	
	    this.setTitle("Log In Form");
	    this.setSize(1280,720);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
     
   
	 
	//img =new ImageIcon("FlightID.jpg");
	img =new ImageIcon("Flight Booking.jpg");
    imgLabel=new JLabel(" ",img,JLabel.CENTER);
    imgLabel.setBounds(0, 0, 1280, 720);
    //imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
    c.add(imgLabel);
	
    
	
	
	flightIdL=new JLabel("Flight ID       F0001");
    flightIdL.setFont(new Font("Courier",Font.BOLD,30)); // Courier, Arial, Helvetica, Castellar
    flightIdL.setForeground(new Color(172,40,94));	
    flightIdL.setBounds(120,30, 400,50); 
	imgLabel.add(flightIdL);
	
	
    fnameL=new JLabel("First Name :");  
    fnameL.setBounds(120,120, 100,30);  
	imgLabel.add(fnameL);
	fnameTxtFld=new JTextField();  
    fnameTxtFld.setBounds(200,120, 250,30); 
	imgLabel.add(fnameTxtFld);
	
	
	lnameL=new JLabel("Last Name :");  
    lnameL.setBounds(120,200, 100,30);  
	imgLabel.add(lnameL);
	lnameTxtFld=new JTextField();  
    lnameTxtFld.setBounds(200,200, 250,30); 
	imgLabel.add(lnameTxtFld);
	
    /*l3=new JLabel("Source     :");  
    l3.setBounds(120,250, 100,30);
	imgLabel.add(l3);
	String source[]={"Bangladesh","Australia","Canada","England","France","Germany","India","Italy","Japan","Newzealand","Pakistan","Singapore","Russia","Spain","Switzerland","Turkey","USA"};        
    JComboBox<String> se=new JComboBox<String>(source);    
    se.setBounds(200,250, 250,30);    
    imgLabel.add(se);*/
	
	sourceL = new JLabel("Source     :");  
    sourceL.setBounds(120,360, 100,30);
	imgLabel.add(sourceL);
	sourceTxtFld=new JTextField();  
    sourceTxtFld.setBounds(200,360, 250,30);    
    imgLabel.add(sourceTxtFld);
	
    /*l4=new JLabel("Departure  :");
    l4.setBounds(120,420, 100,30);
	imgLabel.add(l4);
	String departure[]={"USA","Australia","Turkey","Switzerland","Spain","Russia","Singapore","Pakistan","Newzealand","Japan","Italy","India","Germany","France","England","Australia","Bangladesh"};        
    JComboBox<String> de=new JComboBox<String>(departure);    
    de.setBounds(200,420, 250,30);    
    imgLabel.add(de);*/
	
	departureL=new JLabel("Departure  :");
    departureL.setBounds(120,420, 100,30);
	imgLabel.add(departureL);
	departureTxtFld=new JTextField();  
    departureTxtFld.setBounds(200,420, 250,30);    
    imgLabel.add(departureTxtFld);
	
	
    dateL=new JLabel("Date             :");
    dateL.setBounds(650,50, 100,30);
	imgLabel.add(dateL);
	dateTxtFld=new JTextField();  
    dateTxtFld.setBounds(730,50,200,30);
	imgLabel.add(dateTxtFld);
	
	
	
    arrivalTimeL=new JLabel("Arrival Time   :");
    arrivalTimeL.setBounds(640,120, 100,30);
	imgLabel.add(arrivalTimeL);
	arrivalTimeTxtFld=new JTextField();  
    arrivalTimeTxtFld.setBounds(730,120, 250,30);
	imgLabel.add(arrivalTimeTxtFld);
	
    departureTimeL=new JLabel("Departure Time :");
    departureTimeL.setBounds(630,270, 100,30);
	imgLabel.add(departureTimeL);
	departureTimeTxtFld=new JTextField();  
    departureTimeTxtFld.setBounds(730,270,250,30);
	imgLabel.add(departureTimeTxtFld);
	
    flightChargesL=new JLabel("Flight Charges  :");
    flightChargesL.setBounds(630,420, 100,30);
	imgLabel.add(flightChargesL);
    flightChargesTxtFld=new JTextField();  
    flightChargesTxtFld.setBounds(730,420, 250,30);
	imgLabel.add(flightChargesTxtFld);
 
 
	backButton=new JButton("🔙");  
	backButton.setFont(new Font("",Font.BOLD,30));
    //backButton.setFont(new Font("Arial",Font.BOLD,12));	
	//backButton.setForeground(Color.WHITE);	
	backButton.setForeground(Color.BLACK);	
	backButton.setBackground(new Color(0, 191, 255));
	backButton.setBounds(200, 550, 65,35);
	backButton.addActionListener(this);	
    imgLabel.add(backButton);
	
	
	
	resetButton=new JButton("🔃");  
    resetButton.setFont(new Font("",Font.BOLD,15));	
	resetButton.setForeground(Color.BLACK);	
	resetButton.setBackground(new Color(0, 191, 255));
	resetButton.setBounds(600,550,50,40);
	resetButton.addActionListener(this);
	imgLabel.add(resetButton);
	
	
	addButton=new JButton("➕"); //➕     
    addButton.setFont(new Font("",Font.BOLD,15));
	//addButton.setFont(new Font("Arial",Font.BOLD,12));
	addButton.setForeground(Color.BLACK);
	//addButton.setForeground(new Color(0, 0, 0));
	//addButton.setBackground(Color.WHITE); 	
	addButton.setBackground(new Color(0, 191, 255));
	addButton.setBounds(900,550, 65,35);
	addButton.addActionListener(this);
	imgLabel.add(addButton);	
	
	 
	
    setVisible(true);
	
	
	
	
   	
    } 
	
	public void actionPerformed(ActionEvent e) 
{
	
	//Coding Part of backButton button
           if (e.getSource() == backButton) {
			   
                  dispose();
		          CM frame = new CM();
				  frame.setVisible(true);
				  
           }
		   
		   
		   //Coding Part of RESET button
            if (e.getSource() == resetButton) {
			  
               fnameTxtFld.setText("");
               lnameTxtFld.setText("");
               sourceTxtFld.setText("");
               dateTxtFld.setText("");
               departureTxtFld.setText("");
               arrivalTimeTxtFld.setText("");
               departureTimeTxtFld.setText("");
               flightChargesTxtFld.setText("");
              
               }
			   
		   
		   //Coding Part of ADD button
		   
           if (e.getSource() == addButton) 
        {
				
				   JOptionPane.showMessageDialog(null,"Flight book Successful ");
                   dispose();
				   CM frame = new CM();
				   frame.setVisible(true);
				   
				   String fname         = fnameTxtFld.getText();
				   String lname         = lnameTxtFld.getText();
				   String source        = sourceTxtFld.getText();
				   String departure     = departureTxtFld.getText();
				   String date          = dateTxtFld.getText();
				   String arrivalTime   = arrivalTimeTxtFld.getText();
				   String departureTime = departureTimeTxtFld.getText();
				   String flightCharges = flightChargesTxtFld.getText();
				   
		      //if(source.equals("")&&departure.equals("")&&date.equals("")&&departureTime.equals("")&&flightCharges.equals("")&&arrivalTime.equals("")&&fname.equals("")&&lname.equals(""));
                  
		          //{
	              //JOptionPane.showMessageDialog(null, "Please fill up all the details");
                   //}\*/
				   
			/*else{
				
	              JOptionPane.showMessageDialog(null,"Flight book Successful ");
				   dispose();
				   //FlightID frame = new FlightID();
				      CM frame = new CM();
				      frame.setVisible(true);*/
			   } 
				   
				   
				
			
        try{
			FileWriter file = new FileWriter("FlightId.txt",true); 		
		    file.write (fnameTxtFld.getText() +  "" + lnameTxtFld.getText() +  "\t" +  sourceTxtFld.getText() + "\t" +  departureTxtFld.getText() + "\t" +  dateTxtFld.getText() + "\t" +  arrivalTimeTxtFld.getText() + "\t" +  departureTimeTxtFld.getText() + "\t" +  flightChargesTxtFld.getText() + "\n"  );
			file.close();  
			JFrame fr = new JFrame();	
	
           }
		

		catch(Exception io)
		{
		}	
		   
		  
      
	
				
}
    public static void main(String args[]){
		
		new FlightID();
		 //frame.setVisible(true);
	}	
    }