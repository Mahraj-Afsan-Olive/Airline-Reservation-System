import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class DelReport extends JFrame implements ActionListener{

    private JButton homeb;
    private JButton backb;
    private JButton logoutb;
    private JButton addb;
    private JButton deleteb;
    private JButton updateb;
    private JButton refreshb;

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;
    private ImageIcon logoutimage;
    private ImageIcon addimage;
    private ImageIcon updateimage;
    private ImageIcon deleteimage;
    private ImageIcon refreshimage;
    private ImageIcon icon;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;
    private JLabel logoutlabel;

    private JLabel addl;
    private JLabel refreshl;
    private JLabel updatel;
    private JLabel deletel;

    private JScrollPane pane;

    private DefaultTableModel model;

    private JTable table;
        
    DelReport(){


        backimage=new ImageIcon("btr.png");
        backlabel=new JLabel(backimage);
        backlabel.setBounds(0,0,1280,720);
       
	   backb=new JButton("Back");
        backb.setBounds(1100,50,100,50);
    
        backb.setFocusable(false);
     
        backb.setBorder(null);
     
        backb.addActionListener(this);

        refreshb=new JButton("Show");
      
        refreshb.setBounds(100,50,100,50);
 
        refreshb.setBorder(null);
      
        refreshb.addActionListener(this);


        updateb=new JButton("Modify");
  
        updateb.setBounds(400,50,100,50);
       
        updateb.setBorder(null);
  
        updateb.addActionListener(this);

        deleteb=new JButton("Delete");

        deleteb.setBounds(700,50,100,50);
      
        deleteb.setBorder(null); 

        deleteb.addActionListener(this);

        table =new JTable();

        pane=new JScrollPane(table);
        pane.setBounds(0,100,1280,450);
		pane.setBackground(Color.PINK);
        table.setBackground(Color.cyan);
        table.setForeground(Color.black);
        table.setRowHeight(50);
        
        this.setTitle("Report");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300,100,1280,720);
        this.setResizable(false);
  
        this.add(pane);
   
        this.add(deleteb);
        this.add(updateb);
        this.add(refreshb);
        this.add(backb);

        this.setVisible(true);
        this.add(backlabel);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==refreshb){
            String filePath = "reportdetails.txt";
            File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split("/");
            model = (DefaultTableModel)table.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();

            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
        } catch (Exception ex) {
            System.out.print("system error");
        }
        refreshb.setEnabled(false);

        }
        
        if(e.getSource()==updateb){
            String filePath = "reportdetails.txt";
            File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            String firstline="FirstName/Lastname/Mobile/Id/gender/From/To/Date/FlightId\n";
            bw.write(firstline);
            
            for(int i = 0; i < table.getRowCount(); i++){
                for(int j = 0; j < table.getColumnCount(); j++){
              bw.write(table.getValueAt(i, j).toString()+",");
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            System.out.print("system error");
        }
        }
        if(e.getSource()==deleteb){
            int i = table.getSelectedRow();
            if(i >= 0){
                model.removeRow(i);
            }
            else{
                System.out.println("Delete Error");
            }
            String filePath = "reportdetails.txt";
            File file = new File(filePath);
            try{
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                String firstline="FirstName/Lastname/Mobile/Id/gender/From/To/Date/FlightId\n";
                bw.write(firstline);
            
                for(int j = 0; j < table.getRowCount(); j++){
                    for(int k = 0; k < table.getColumnCount(); k++){
                        bw.write(table.getValueAt(j, k).toString()+",");
                    }
                    bw.newLine();
                }
            
                bw.close();
                fw.close();
            
            }
            catch (IOException ex) {
                System.out.print("system error");
            }
        }
		
		
		
		if(e.getSource()==backb){
			
		JOptionPane.showMessageDialog(null, "Call Constructor for Back page ");
			
		}
		
		
		
		
        
    }

    public static void main(String [] args){
        DelReport dlr =new DelReport();
    }
}