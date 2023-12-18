package tourism_management_system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ViewCustomer extends JFrame implements ActionListener{

    JLabel labelfirstnamme, labellastnamme, labelemail, labelid, labelnumber, labelgender, labelcountry, labeladdress, labelusername;
    JButton back;
    
    String viewemailtext;
    
    ViewCustomer(String emaemailtext){
        this.viewemailtext = emaemailtext;
        setBounds(350, 100, 870, 625);
        getContentPane().setBackground(Color.WHITE);
        setTitle("View Deteils");
        setLayout(null);
        
        JLabel lblfname = new JLabel("First Name:");
        lblfname.setBounds(30, 50, 150, 25);
        add(lblfname);
        
        labelfirstnamme  = new JLabel();
        labelfirstnamme.setBounds(120, 50, 200, 25);
        add(labelfirstnamme);
        
        JLabel lbllname = new JLabel("Last Name:");
        lbllname.setBounds(30, 100, 150, 25);
        add(lbllname);
        
        labellastnamme  = new JLabel();
        labellastnamme.setBounds(120, 100, 200, 25);
        add(labellastnamme);
        
        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(30, 150, 150, 25);
        add(lblemail);
        
        labelemail  = new JLabel();
        labelemail.setBounds(120, 150, 200, 25);
        add(labelemail);
        
        JLabel lblid = new JLabel("ID:");
        lblid.setBounds(30, 200, 150, 25);
        add(lblid);
        
        labelid  = new JLabel();
        labelid.setBounds(120, 200, 200, 25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number:");
        lblnumber.setBounds(30, 250, 150, 25);
        add(lblnumber);
        
        labelnumber  = new JLabel();
        labelnumber.setBounds(120, 250, 200, 25);
        add(labelnumber);
        
        JLabel lblgender = new JLabel("Gender:");
        lblgender.setBounds(500, 50, 150, 25);
        add(lblgender);
        
        labelgender  = new JLabel();
        labelgender.setBounds(650, 50, 200, 25);
        add(labelgender);
        
        JLabel lblcountry = new JLabel("Country:");
        lblcountry.setBounds(500, 100, 150, 25);
        add(lblcountry);
        
        labelcountry  = new JLabel();
        labelcountry.setBounds(650, 100, 200, 25);
        add(labelcountry);
        
        JLabel lbladdress = new JLabel("Address:");
        lbladdress.setBounds(500, 150, 150, 25);
        add(lbladdress);
        
        labeladdress  = new JLabel();
        labeladdress.setBounds(650, 150, 200, 25);
        add(labeladdress);
        
        JLabel lblusername = new JLabel("User Name:");
        lblusername.setBounds(500, 200, 150, 25);
        add(lblusername);
        
        labelusername  = new JLabel();
        labelusername.setBounds(650, 200, 200, 25);
        add(labelusername);
        
        back =  new JButton("Back");
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setBounds(350, 350, 100, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/ViewCustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 400, 600, 200);
        add(image);
        
        try {
            Conn c = new Conn();
            String query = "SELECT * FROM `tourism_management_system`.`customer` WHERE email = '"+viewemailtext+"'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {                
                labelfirstnamme.setText(rs.getString("fname"));
                labellastnamme.setText(rs.getString("lname"));
                labelemail.setText(rs.getString("email"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelusername.setText(rs.getString("user_name"));
                
                
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new ViewCustomer("");
    }

}
