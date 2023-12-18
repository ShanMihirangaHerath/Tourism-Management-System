package tourism_management_system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class AddCustomer extends JFrame implements ActionListener {

    JLabel labelemail, labelfirstname, labellastname;
    JComboBox<String> comboid;
    JTextField textfieldnumber, textfieldcountry, textfieldaddress, textfieldusername;
    JRadioButton rmale, rfemale;
    JButton add, back;

    String addemmailtext;

    AddCustomer(String emaemailtext) {
        this.addemmailtext = emaemailtext;
        setBounds(350, 150, 850, 550);
        setTitle("Add New Customer");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblemail = new JLabel("Email Address:");
        lblemail.setBounds(50, 50, 200, 25);
        add(lblemail);

        labelemail = new JLabel();
        labelemail.setBounds(220, 50, 250, 25);
        add(labelemail);

        JLabel lblid = new JLabel("ID:");
        lblid.setBounds(50, 90, 200, 25);
        add(lblid);

        comboid = new JComboBox<>(new String[]{"Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        comboid.setBounds(220, 90, 250, 25);
        comboid.setBackground(Color.WHITE);
        add(comboid);

        JLabel lblnumber = new JLabel("Number:");
        lblnumber.setBounds(50, 130, 200, 25);
        add(lblnumber);

        textfieldnumber = new JTextField();
        textfieldnumber.setBounds(220, 130, 250, 25);
        add(textfieldnumber);

        JLabel lblfname = new JLabel("First Name:");
        lblfname.setBounds(50, 170, 200, 25);
        add(lblfname);

        labelfirstname = new JLabel();
        labelfirstname.setBounds(220, 170, 250, 25);
        add(labelfirstname);

        JLabel lbllname = new JLabel("Last Name:");
        lbllname.setBounds(50, 210, 200, 25);
        add(lbllname);

        labellastname = new JLabel();
        labellastname.setBounds(220, 210, 250, 25);
        add(labellastname);

        JLabel lblgender = new JLabel("Gender:");
        lblgender.setBounds(50, 250, 200, 25);
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 250, 100, 25);
        rmale.setBackground(Color.WHITE);
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(340, 250, 100, 25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(rmale);
        buttongroup.add(rfemale);

        JLabel lblcountry = new JLabel("Country:");
        lblcountry.setBounds(50, 290, 200, 25);
        add(lblcountry);

        textfieldcountry = new JTextField();
        textfieldcountry.setBounds(220, 290, 250, 25);
        add(textfieldcountry);

        JLabel lbladdress = new JLabel("Address:");
        lbladdress.setBounds(50, 330, 200, 25);
        add(lbladdress);

        textfieldaddress = new JTextField();
        textfieldaddress.setBounds(220, 330, 250, 25);
        add(textfieldaddress);

        JLabel username = new JLabel("Username:");
        username.setBounds(50, 370, 200, 25);
        add(username);

        textfieldusername = new JTextField();
        textfieldusername.setBounds(220, 370, 250, 25);
        add(textfieldusername);

        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(220, 430, 100, 30);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setBounds(370, 430, 100, 30);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/AddCustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 0, 500, 550);
        add(image);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM `tourism_management_system`.`user` WHERE email='" + addemmailtext + "'");
            while (rs.next()) {
                labelemail.setText(rs.getString("email"));
                labelfirstname.setText(rs.getString("fname"));
                labellastname.setText(rs.getString("lname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String f_name = labelfirstname.getText();
            String l_name = labellastname.getText();
            String emil = labelemail.getText();
            String id = (String) comboid.getSelectedItem();
            String number = textfieldnumber.getText();
            String gender = rmale.isSelected() ? "Male" : "Female";
            String country = textfieldcountry.getText();
            String address = textfieldaddress.getText();
            String username = textfieldusername.getText();

            String query = "INSERT INTO `tourism_management_system`.`customer` (fname, lname, email, id, number, gender, country, address, user_name) VALUES ('" + f_name + "', '" + l_name + "', '" + emil + "', '" + id + "', '" + number + "', '" + gender + "', '" + country + "', '" + address + "', '" + username + "')";

            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Successfully");

                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddCustomer("");
    }
}
