import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class NagadInfo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JFrame f;
	Font font;

	JButton b1;
	Bkash b;

	public NagadInfo(String amount, String phnNum, String pin, Nagad nag)
    {
    	this.b=b;
		
    	f=new JFrame();

    	l1 = new JLabel("Amount = "+amount);
        l1.setBounds(300, 300, 300, 40);
        font = new Font("Calibri", Font.BOLD, 14);
        l1.setFont(font);
        l1.setForeground(Color.white);
        l1.setBackground(Color.black);
        l1.setOpaque(true);
        f.add(l1);

        l2 = new JLabel("Bikash Account Number = "+phnNum);
        l2.setBounds(300, 340, 300, 40);
        font = new Font("Calibri", Font.BOLD, 14);
        l2.setFont(font);
        l2.setForeground(Color.white);
        l2.setBackground(Color.black);
        l2.setOpaque(true);
        f.add(l2);

        l3 = new JLabel("PIN = "+pin);
        l3.setBounds(300, 380, 300, 20);
        font = new Font("Calibri", Font.BOLD, 14);
        l3.setFont(font);
        l3.setForeground(Color.white);
        l3.setBackground(Color.black);
        l3.setOpaque(true);
        f.add(l3);

        b1 = new JButton("Previous Page");
        b1.setBounds(600, 500, 200, 25);
        font = new Font("Monaco", Font.BOLD, 12);
		b1.setFont(font);
        b1.setForeground(Color.blue);
        b1.addActionListener(this);
        f.add(b1);

        
        
        
        

        setVisible(true);

        f.setTitle("Payment Information");
        f.setSize(1280, 720);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
      {  
        if (e.getSource() == b1){
            f.setVisible(false);
            new Nagad();}
        }
    }

