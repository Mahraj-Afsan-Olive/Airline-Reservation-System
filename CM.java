import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

class CM extends JFrame implements ActionListener {

    private JButton add, search, flight, ticket, report, signout;
    private JLabel customer, imgLabel;
    private Container c;
    private ImageIcon img;

    CM() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.setTitle("Customer Management");

        img = new ImageIcon("CM.png");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, 1280, 720);
        c.add(imgLabel);

        customer = new JLabel("CUSTOMER MANAGEMENT");
        customer.setFont(new Font("Serif", Font.BOLD, 30));
        customer.setForeground(Color.blue);
        customer.setBounds(430, 0, 500, 100);
        imgLabel.add(customer);

        add = new JButton("Add Customer");
        add.setFont(new Font("Serif", Font.BOLD, 20));
        add.setBackground(Color.white);
        add.setBounds(250, 200, 200, 50);
        add.addActionListener(this);
        imgLabel.add(add);

        search = new JButton("Search Customer");
        search.setFont(new Font("Serif", Font.BOLD, 20));
        search.setBackground(Color.white);
        search.setBounds(250, 300, 200, 50);
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        imgLabel.add(search);

        flight = new JButton("Add Flight");
        flight.setFont(new Font("Serif", Font.BOLD, 20));
        flight.setBackground(Color.white);
        flight.setBounds(550, 250, 200, 50);
		flight.addActionListener(this);
        imgLabel.add(flight);

        ticket = new JButton("Ticket Booking");
        ticket.setFont(new Font("Serif", Font.BOLD, 20));
        ticket.setBackground(Color.white);
        ticket.setBounds(850, 200, 200, 50);
		ticket.addActionListener(this);
        imgLabel.add(ticket);

        report = new JButton("Ticket Report");
        report.setFont(new Font("Serif", Font.BOLD, 20));
        report.setBackground(Color.white);
        report.setBounds(850, 300, 200, 50);
		report.addActionListener(this);
        imgLabel.add(report);

        signout = new JButton("Sign out");
        signout.setFont(new Font("Serif", Font.BOLD, 12));
        signout.setBackground(Color.white);
		 signout.addActionListener(this);
        signout.setBounds(610, 470, 80, 30);
        imgLabel.add(signout);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            dispose();
            AC frame = new AC();
            frame.setVisible(true);

        }
		
		if(e.getSource()==flight){
		  dispose();
		  FlightID frame = new FlightID();
		  frame.setVisible(true);
	
	     }
		 
	    if(e.getSource()==ticket){
		  dispose();
		  TicketNo frame = new TicketNo();
		  frame.setVisible(true);
		}
		
		if(e.getSource()==report){
		  dispose();
		  ShowReport frame = new ShowReport();
		  frame.setVisible(true);
		}
		  
		else if (e.getSource() == signout) {
             dispose();
            LoginFrame frame = new LoginFrame();
            frame.setVisible(true);

        }

    }

    private void SearchActionPerformed(ActionEvent evt) {

        AC ac = new AC();
        ac.SearchPageLogics();
        ac.setVisible(true);

    }

    public static void main(String[] args) {
        CM frame = new CM();
        frame.setVisible(true);

    }

}