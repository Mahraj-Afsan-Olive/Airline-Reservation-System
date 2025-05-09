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
 
class TicketNo extends JFrame implements ActionListener 
{  

   private JButton backButton,searchButton1, searchButton2, bookTicketButton, resetButton;
   private JLabel   selectCountryL, sourceL,      departureL,        ticketL,      flightIDL,      flightNameL,      dateL,      departureTimeL,      classL,      priceL,      seatsL,      customerIdL,      fnameL,      lnameL, imgLabel;                                        
   private JTextField          sourceTxtFld, departureTxtFld,   ticketTxtFld, flightIDTxtFld, flightNameTxtFld, dateTxtFld, departureTimeTxtFld, classTxtFld, priceTxtFld, seatsTxtFld, customerIdTxtFld, fnameTxtFld, lnameTxtFld;
   private Container c;
   private ImageIcon img;
   
TicketNo()
  
 {  
 
        c=this.getContentPane();
	    c.setLayout(null);
	    c.setVisible(true);
	
	    this.setTitle("Ticket No Form");
	    this.setSize(1280,720);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	//img =new ImageIcon("Flight Booking.jpg");
	img =new ImageIcon("FlightID.jpg");
    imgLabel=new JLabel(" ",img,JLabel.CENTER);
    imgLabel.setBounds(0, 0, 1280, 720);
	//imgLabel1.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
    c.add(imgLabel);
	
    
	selectCountryL = new JLabel("Select Country");
	selectCountryL.setFont(new Font("Courier",Font.BOLD,30)); // Courier, Arial, Helvetica, Castellar
    selectCountryL.setForeground(new Color(172,40,94));
    selectCountryL.setBounds(80,60, 250,40);
	imgLabel.add(selectCountryL);
	
	
	/*JLabel sourceL=new JLabel("Source");  
    sourceL.setBounds(80,80, 100,30);
	imgLabel.add(sourceL);
	String source[]={"Bangladesh","Australia","Canada","England","France","Germany","India","Italy","Japan","Newzealand","Pakistan","Singapore","Russia","Spain","Switzerland","Turkey","USA"};        
    JComboBox<String> se=new JComboBox<String>(source);    
    se.setBounds(80,120, 180,30);    
    imgLabel.add(se);*/
	
	
	sourceL = new JLabel("Source     :");  
    sourceL.setBounds(80,160, 100,30);
	imgLabel.add(sourceL)
	;
	sourceTxtFld=new JTextField();  
    sourceTxtFld.setBounds(80,220, 180,30);    
    imgLabel.add(sourceTxtFld);
	
	
    /*JLabel dpl2=new JLabel("Departure");
    dpl2.setBounds(340,80, 100,30);
	imgLabel.add(dpl2);
	String departure[]={"USA","Australia","Turkey","Switzerland","Spain","Russia","Singapore","Pakistan","Newzealand","Japan","Italy","India","Germany","France","England","Australia","Bangladesh"};        
    JComboBox<String> de=new JComboBox<String>(departure);    
    de.setBounds(340,120, 180,30);    
    imgLabel.add(de);*/
	
	
	departureL=new JLabel("Departure  :");
    departureL.setBounds(340,160, 100,30);
	imgLabel.add(departureL);
	
	departureTxtFld=new JTextField();  
    departureTxtFld.setBounds(340,220, 180,30);    
    imgLabel.add(departureTxtFld);
	
	
	
	backButton=new JButton("🔙");  
	backButton.setFont(new Font("",Font.BOLD,30));
    //backButton.setFont(new Font("Arial",Font.BOLD,12));	
	//backButton.setForeground(Color.WHITE);	
	backButton.setForeground(Color.BLACK);	
	backButton.setBackground(new Color(0, 191, 255));
	backButton.setBounds(200, 550, 65,35);
	backButton.addActionListener(this);	
    imgLabel.add(backButton);
	
	
	/*searchButton1=new JButton("🔍"); 
    searchButton1.setFont(new Font("",Font.BOLD,30));
    //searchButton1.setFont(new Font("Arial",Font.BOLD,12));	
	//searchButton1.setForeground(Color.WHITE);	
	searchButton1.setForeground(Color.BLACK);	
	searchButton1.setBackground(new Color(0, 191, 255));	
    searchButton1.setBounds(430, 170, 90,30);
    searchButton1.addActionListener(this);		
    imgLabel.add(searchButton1);*/
	
	
	
	
	
	
	ticketL=new JLabel("Ticket     T");
    ticketL.setFont(new Font("Courier",Font.BOLD,20)); // Courier, Arial, Helvetica, Castellar
    ticketL.setForeground(new Color(172,40,94));	
    ticketL.setBounds(600,20, 400,50); 
	imgLabel.add(ticketL);
	
	ticketTxtFld=new JTextField();  
    ticketTxtFld.setBounds(710,30, 120,30); 
    ticketTxtFld.setFont(new Font("Courier",Font.BOLD,15)); // Courier, Arial, Helvetica, Castellar
    ticketTxtFld.setForeground(Color.BLACK);	
    imgLabel.add(ticketTxtFld);
	
	
	
	flightIDL=new JLabel("Flight ID   F");
    flightIDL.setFont(new Font("Courier",Font.BOLD,20)); // Courier, Arial, Helvetica, Castellar
    flightIDL.setForeground(new Color(172,40,94));	
    flightIDL.setBounds(600,180, 400,50); 
	imgLabel.add(flightIDL);
	
	flightIDTxtFld=new JTextField();  
    flightIDTxtFld.setBounds(720,190, 150,30); 
    flightIDTxtFld.setFont(new Font("Courier",Font.BOLD,15)); // Courier, Arial, Helvetica, Castellar
    flightIDTxtFld.setForeground(Color.BLACK);	
    imgLabel.add(flightIDTxtFld);
	
	
	
	flightNameL=new JLabel("Flight Name      ");  
    flightNameL.setBounds(600,250, 90,30);  
	imgLabel.add(flightNameL);
	
	flightNameTxtFld=new JTextField();  
    flightNameTxtFld.setBounds(720,250, 150,30); 
	imgLabel.add(flightNameTxtFld);
	
	/*JLabel dl2=new JLabel("Date");  
    dl2.setBounds(930,250, 90,30);  
	imgLabel.add(dl2);
	String dateD[]={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};        
    JComboBox<String> dtD=new JComboBox<String>(dateD);    
    dtD.setBounds(980,250, 40,30);    
    imgLabel.add(dtD);
	String dateM[]={"January","February","March","April","May","June","July","August","September","October","November","December"};        
    JComboBox<String> dtM=new JComboBox<String>(dateM);    
    dtM.setBounds(1020,250, 90,30);    
    imgLabel.add(dtM);
	String dateY[]={"2025","2024","2023","2022","2021","2020","2019","2018","2017"};        
    JComboBox<String> dtY=new JComboBox<String>(dateY);    
    dtY.setBounds(1110,250, 60,30);    
    imgLabel.add(dtY);*/
	
	
	dateL=new JLabel("Date      ");  
    dateL.setBounds(930,250, 90,30);  
	imgLabel.add(dateL);
	
	dateTxtFld=new JTextField();  
    dateTxtFld.setBounds(1020,250, 150,30); 
	imgLabel.add(dateTxtFld);
	
	
	
	departureTimeL=new JLabel("Departure Time");  
    departureTimeL.setBounds(600,300, 100,30);  
	imgLabel.add(departureTimeL);
	
	departureTimeTxtFld=new JTextField();  
    departureTimeTxtFld.setBounds(720,300, 150,30); 
	imgLabel.add(departureTimeTxtFld);
	
	
	//"Economy","Premium Economy","Business","First-Class"
	classL=new JLabel("Class");  
    classL.setBounds(600,350, 100,30);  
	imgLabel.add(classL);
	
	classTxtFld=new JTextField();  
    classTxtFld.setBounds(720,350, 150,30); 
	imgLabel.add(classTxtFld);
	
	/*String fclass[]={"Economy","Premium Economy","Business","First-Class"};        
    JComboBox<String> fc=new JComboBox<String>(fclass);    
    fc.setBounds(720,350, 150,30);    
    imgLabel.add(fc);*/
	
	priceL=new JLabel("Price");  
    priceL.setBounds(600,400, 100,30);  
	imgLabel.add(priceL);
	
	priceTxtFld=new JTextField();  
    priceTxtFld.setBounds(720,400, 150,30); 
	imgLabel.add(priceTxtFld);
	
	
	seatsL=new JLabel("Seats");  
    seatsL.setBounds(600,450, 100,30);  
	imgLabel.add(seatsL);
	
	seatsTxtFld=new JTextField();  
    seatsTxtFld.setBounds(720,450, 150,30); 
	imgLabel.add(seatsTxtFld);
	
	/*String seats[]={"0","1","2","3","4","5","6","7","8","9","10"};        
    JComboBox<String> st=new JComboBox<String>(seats);    
    st.setBounds(720,450, 150,30);    
    imgLabel.add(st);*/
	
	customerIdL=new JLabel("Customer ID :");  
    customerIdL.setBounds(850,10, 100,30);  
	imgLabel.add(customerIdL);
	
	customerIdTxtFld=new JTextField();  
    customerIdTxtFld.setBounds(940,10, 150,30); 
	imgLabel.add(customerIdTxtFld);
	
	/*searchButton2=new JButton("🔍"); 
    searchButton2.setFont(new Font("",Font.BOLD,30));
    //searchButton2.setFont(new Font("Arial",Font.BOLD,12));	
	//searchButton2.setForeground(Color.WHITE);	
	searchButton2.setForeground(Color.BLACK);	
	searchButton2.setBackground(new Color(0, 191, 255));	
    searchButton2.setBounds(1100, 10, 90,30);  
    searchButton2.addActionListener(this);
	imgLabel.add(searchButton2);*/
	
	
    fnameL=new JLabel("First Name :");  
    fnameL.setBounds(850,60, 100,30);  
	imgLabel.add(fnameL);
	
	fnameTxtFld=new JTextField();  
    fnameTxtFld.setBounds(940,60, 250,30); 
	imgLabel.add(fnameTxtFld);
	
	
	lnameL=new JLabel("Last Name:");  
    lnameL.setBounds(850,110, 100,30);  
	imgLabel.add(lnameL);
	
	lnameTxtFld=new JTextField();  
    lnameTxtFld.setBounds(940,110, 250,30); 
	imgLabel.add(lnameTxtFld);
	
	
	bookTicketButton=new JButton("Book Tickets"); 
    bookTicketButton.setFont(new Font("",Font.BOLD,12));
	//bookTicketButton.setFont(new Font("Arial",Font.BOLD,12));
	bookTicketButton.setForeground(Color.BLACK);
	//bookTicketButton.setForeground(new Color(0, 0, 0));
	//bookTicketButton.setBackground(Color.WHITE); 	
	bookTicketButton.setBackground(new Color(0, 191, 255));	
    bookTicketButton.setBounds(1050, 550, 120,40);  
    bookTicketButton.addActionListener(this);
	imgLabel.add(bookTicketButton);
	
	resetButton=new JButton("🔃");;
    resetButton.setFont(new Font("",Font.BOLD,15));
	//resetButton.setFont(new Font("Arial",Font.BOLD,12));
	resetButton.setForeground(Color.BLACK);
	//resetButton.setForeground(new Color(0, 0, 0));
	//resetButton.setBackground(Color.WHITE); 	
	resetButton.setBackground(new Color(0, 191, 255));	
    resetButton.setBounds(640, 550, 50,40);  
    resetButton.addActionListener(this);
	imgLabel.add(resetButton);
	
	 
    
	
    setVisible(true);
   	
    } 
	public void actionPerformed(ActionEvent e) {

	
		   
		   //Coding Part of RESET button
		   
            if (e.getSource() == resetButton) {
			  
               sourceTxtFld.setText("");
               departureTxtFld.setText("");
               ticketTxtFld.setText("");
               flightIDTxtFld.setText("");
               flightNameTxtFld.setText("");
               dateTxtFld.setText("");
               departureTimeTxtFld.setText("");
               classTxtFld.setText("");
               priceTxtFld.setText("");
               seatsTxtFld.setText("");
               customerIdTxtFld.setText("");
               fnameTxtFld.setText("");
               lnameTxtFld.setText("");
              
               }
			   
		   //Coding Part of bookTicketButton button
           if (e.getSource() == bookTicketButton) {
			   
			      JOptionPane.showMessageDialog(null,"Ticket has been booked..........");
                  dispose();
		          Strange frame = new Strange();
				  frame.setVisible(true);
				  
				  
			  String source        = sourceTxtFld.getText();
			  String departure     = departureTxtFld.getText();
			  String ticket        = ticketTxtFld.getText();
			  String flightID      = flightIDTxtFld.getText();
			  String flightName    = flightNameTxtFld.getText();
			  String date          = dateTxtFld.getText();
			  String departureTime = departureTimeTxtFld.getText();
			  String price         = priceTxtFld.getText();
			  String cls           = classTxtFld.getText();
			  String seats         = seatsTxtFld.getText();
			  String customer      = customerIdTxtFld.getText();
			  String fname         = fnameTxtFld.getText();
			  String lname         = lnameTxtFld.getText();
               
			   
			   
			try{
				
			   FileWriter fileT = new FileWriter("TicketNo.txt",true); 
			   fileT.write (sourceTxtFld.getText()+"\t\t\t"+departureTxtFld.getText()+"\t\t\t"+ticketTxtFld.getText()+"\t\t\t"+flightIDTxtFld.getText()+"\t\t\t"+flightNameTxtFld.getText()+"\t\t\t"+dateTxtFld.getText()+"\t\t\t"+departureTimeTxtFld.getText()+"\t\t\t"+priceTxtFld.getText()+classTxtFld.getText()+"\t\t\t"+seatsTxtFld.getText()+"\t\t\t"+customerIdTxtFld.getText()+"\t\t\t"+fnameTxtFld.getText()+"\t\t\t"+lnameTxtFld.getText()+"\t\t\t"+"\n"); //+classTxtFld.getText()+"\t\t\t"+seatsTxtFld.getText()+"\t\t\t"+customerIdTxtFld.getText()+"\t\t\t"+fnameTxtFld.getText()"\t\t\t"+lnameTxtFld.getText()
			   fileT.close();  
			   JFrame fr = new JFrame();
			
			/*if(source.equals("")&&departure.equals("")&&ticket.equals("")&&flightID.equals("")&&flightName.equals("")&&date.equals("")&&departureTime.equals("")&&price.equals("")&&cls.equals("")&&seats.equals("")&&customer.equals("")&&fname.equals("")&&lname.equals(""))
              
		        {
	            JOptionPane.showMessageDialog(null, "Please fill up all the details");
                }
			  }*/
		   }
			 catch(IOException io)
		            {}
			
		    
  
				  
				  
				 
           }
		   
		   //Coding Part of backButton button
           else if (e.getSource() == backButton) {
			   
                  dispose();
		          CM frame = new CM();
				  frame.setVisible(true);
				  
           }
		   
		   
		   
		   
   }
		   
		  
		   
	
				

    public static void main(String args[]){
		new TicketNo();
	}	
    }