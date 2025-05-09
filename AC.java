import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.awt.Container;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

class AC extends JFrame implements ActionListener {
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    private JRadioButton checkBox1, checkBox2;
    private JButton add, cancel, btn;
    private Container c;
    private JLabel l, imgLabel;
    private ImageIcon img;
    File customerFile = new File(System.getProperty("user.dir") + "\\files\\customers.txt");
    private JButton searchBtn;
    private ButtonGroup bg;
    private JComboBox<String> cb;
	int Id = 0;

    AC() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);

        this.setTitle("Add Customer");

        img = new ImageIcon("AC.png");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, 1280, 720);
        c.add(imgLabel);

        l1 = new JLabel("First Name:");
        l1.setForeground(Color.white);
        l1.setBounds(50, 150, 100, 30);
        t1 = new JTextField();
        t1.setBounds(150, 150, 300, 30);
        imgLabel.add(l1);
        imgLabel.add(t1);

        l2 = new JLabel("Last Name:");
        l2.setForeground(Color.white);
        l2.setBounds(50, 200, 100, 30);
        t2 = new JTextField();
        t2.setBounds(150, 200, 300, 30);
        imgLabel.add(l2);
        imgLabel.add(t2);

        l3 = new JLabel("NID No:");
        l3.setForeground(Color.white);
        l3.setBounds(50, 250, 100, 30);
        t3 = new JTextField();
        t3.setBounds(150, 250, 300, 30);
        imgLabel.add(l3);
        imgLabel.add(t3);

        l4 = new JLabel("Passport No:");
        l4.setForeground(Color.white);
        l4.setBounds(50, 300, 100, 30);
        t4 = new JTextField();
        t4.setBounds(150, 300, 300, 30);
        imgLabel.add(l4);
        imgLabel.add(t4);

        l5 = new JLabel("Gender:");
        l5.setForeground(Color.white);
        l5.setBounds(50, 450, 100, 30);
        imgLabel.add(l5);

        checkBox1 = new JRadioButton("Male");
        checkBox1.setBounds(150, 450, 70, 30);
        checkBox2 = new JRadioButton("Female");
        checkBox2.setBounds(300, 450, 70, 30);
        imgLabel.add(checkBox1);
        imgLabel.add(checkBox2);

        bg = new ButtonGroup();
        bg.add(checkBox1);
        bg.add(checkBox2);
        checkBox1.setActionCommand(checkBox1.getText());
        checkBox2.setActionCommand(checkBox2.getText());

        l6 = new JLabel("Blood Group:");
        l6.setForeground(Color.white);
        l6.setBounds(50, 400, 100, 30);
        imgLabel.add(l6);

        String group[] = { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" };
        cb = new JComboBox<String>(group);
        cb.setBounds(150, 400, 50, 30);
        imgLabel.add(cb);

        l7 = new JLabel("Date of Birh:");
        l7.setForeground(Color.white);
        l7.setBounds(50, 350, 100, 30);
        t5 = new JTextField();
        t5.setBounds(150, 350, 150, 30);
        imgLabel.add(l7);
        imgLabel.add(t5);

        l8 = new JLabel("Address:");
        l8.setForeground(Color.white);
        l8.setBounds(700, 150, 100, 30);
        t6 = new JTextField();
        t6.setBounds(800, 150, 300, 30);
        imgLabel.add(l8);
        imgLabel.add(t6);

        l9 = new JLabel("Contact No:");
        l9.setForeground(Color.white);
        l9.setBounds(700, 200, 100, 30);
        t7 = new JTextField();
        t7.setBounds(800, 200, 300, 30);
        imgLabel.add(l9);
        imgLabel.add(t7);

        l10 = new JLabel("Image");
        l10.setForeground(Color.white);
        l10.setBounds(970, 510, 100, 30);
        imgLabel.add(l10);

        l11 = new JLabel("CUSTOMER ID:");
        l11.setForeground(Color.white);
        l11.setBounds(50, 0, 400, 100);
        l11.setFont(new Font("Serif", Font.BOLD, 20));
        t8 = new JTextField("");
        t8.setBounds(250, 30, 150, 50);
        imgLabel.add(l11);
        imgLabel.add(t8);
        l11.setVisible(false);
        t8.setVisible(false);

        // customer search button

        searchBtn = new JButton("Search");
        searchBtn.setBounds(450, 40, 100, 30);
        searchBtn.setVisible(false);
        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        imgLabel.add(searchBtn);

        add = new JButton("Add");
        add.setBounds(500, 600, 95, 30);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        imgLabel.add(add);

        cancel = new JButton("Cancel");
        cancel.setBounds(650, 600, 95, 30);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        imgLabel.add(cancel);

        btn = new JButton("Browse");
        btn.setBounds(950, 550, 100, 40);
        l = new JLabel();
        l.setBounds(900, 300, 200, 200);
        imgLabel.add(btn);
        imgLabel.add(l);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                // filtering files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png");
                file.addChoosableFileFilter(filter);
                int res = file.showSaveDialog(null);
                // if the user clicks on save in Jfilechooser
                if (res == JFileChooser.APPROVE_OPTION) {
                    File selFile = file.getSelectedFile();
                    String path = selFile.getAbsolutePath();
                    l.setIcon(resize(path));
                }
            }
        });

    }

    public ImageIcon resize(String imgPath) {
        ImageIcon path = new ImageIcon(imgPath);
        Image img = path.getImage();
        Image newImg = img.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void CancelActionPerformed(ActionEvent e) {

        dispose();
        CM frame = new CM();
        frame.setVisible(true);
    }

    private void SearchActionPerformed(ActionEvent evt) {
        try {
            boolean err = true;
            Scanner inputBuffer = new Scanner(customerFile);
            while (inputBuffer.hasNext()) {
                String line = inputBuffer.nextLine();
                String vals[] = line.split(",");
                if (t8.getText().trim().equals(vals[0].trim())) {
                    t1.setText(vals[1]);
                    t2.setText(vals[2]);
                    t3.setText(vals[3]);
                    t4.setText(vals[4]);
                    cb.setEnabled(false);
                    cb.setSelectedIndex(Integer.parseInt(vals[6]));
                    checkBox1.setEnabled(false);
                    checkBox2.setEnabled(false);
                    if (vals[5].trim().equals("Male")) {
                        checkBox1.setSelected(true);
                    } else {
                        checkBox2.setSelected(true);
                    }
                    t5.setText(vals[7]);
                    t6.setText(vals[8]);
                    t7.setText(vals[9]);
                    err = false;
                    break;
                }
                if (!inputBuffer.hasNext() && err) {
                    JOptionPane.showMessageDialog(this, "No data found", "try searching again",
                            JOptionPane.ERROR_MESSAGE);
                }

            }

            inputBuffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void SubmitActionPerformed(ActionEvent e) {
        try {
            if (customerFile.exists()) {
                String gender = bg.getSelection().getActionCommand();
                System.out.println(gender);

                BufferedWriter BW = new BufferedWriter(new FileWriter(customerFile, true));
                BW.append(getLatestID() + "," + t1.getText() + "," + t2.getText() + "," + t3.getText() + ","
                        + t4.getText() + "," + gender + "," + cb.getSelectedIndex() + "," + t5.getText() + ","
                        + t6.getText() + "," + t7.getText() + "," + cb.getSelectedItem() + "\n");
                BW.close();
                JOptionPane.showMessageDialog(this, "Customer Added Succefully. CUSTOMER ID- "+Id, "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                customerFile.createNewFile();
            }
        } catch (Exception err) {
            System.out.print(err);
        }
    }

    private int getLatestID() {
        
        try {
            Scanner inputBuffer = new Scanner(customerFile);
            while (inputBuffer.hasNext()) {
                String line = inputBuffer.nextLine();
                String vals[] = line.split(",");
                Id = Integer.parseInt(vals[0]);
            }
            Id++;
            inputBuffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Id;
    }

    public void SearchPageLogics() {
        add.setVisible(false);
        btn.setVisible(false);
        this.setTitle("Search Customer!");
        searchBtn.setVisible(true);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        cb.setEnabled(false);
        checkBox1.setEnabled(false);
        checkBox2.setEnabled(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        l11.setVisible(true);
        t8.setVisible(true);
    }

    public static void main(String[] args) {
        AC frame = new AC();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}