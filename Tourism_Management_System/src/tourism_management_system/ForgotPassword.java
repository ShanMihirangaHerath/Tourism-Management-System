package tourism_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener {

    JTextField emailfield, fnamefield, lnamefield, sqcfield, answerfield, passwordfield;
    JButton search, retrieve, back;

    ForgotPassword() {
        setBounds(250, 150, 1000, 500);
        setTitle("Forgot Password");
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 500);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/ForgotPassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 0, 600, 500);
        add(p2);

//        Email
        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(50, 80, 200, 25);
        lblemail.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lblemail);

        emailfield = new JTextField();
        emailfield.setBounds(50, 120, 350, 30);
        emailfield.setBorder(BorderFactory.createEmptyBorder());
        p2.add(emailfield);

//        Searech Button
        search = new JButton("Search");
        search.setBackground(Color.BLUE);
        search.setForeground(Color.WHITE);
        search.setBounds(420, 120, 100, 30);
        search.addActionListener(this);
        p2.add(search);

//      First  Name
        JLabel lblfname = new JLabel("First Name:");
        lblfname.setBounds(50, 180, 200, 25);
        lblfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lblfname);

        fnamefield = new JTextField();
        fnamefield.setBounds(50, 210, 200, 30);
        fnamefield.setBorder(BorderFactory.createEmptyBorder());
        p2.add(fnamefield);

//      Last Name  
        JLabel lbllname = new JLabel("Last Name:");
        lbllname.setBounds(280, 180, 200, 25);
        lbllname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lbllname);

        lnamefield = new JTextField();
        lnamefield.setBounds(280, 210, 200, 30);
        lnamefield.setBorder(BorderFactory.createEmptyBorder());
        p2.add(lnamefield);

//      S Question
        JLabel lblsqc = new JLabel("Your  Security Question:");
        lblsqc.setBounds(50, 260, 300, 25);
        lblsqc.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        p2.add(lblsqc);

        sqcfield = new JTextField();
        sqcfield.setBounds(50, 290, 430, 30);
        sqcfield.setBorder(BorderFactory.createEmptyBorder());
        p2.add(sqcfield);

//        S Answer
        JLabel lblanswer = new JLabel("Answer:");
        lblanswer.setBounds(50, 330, 300, 25);
        lblanswer.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lblanswer);

        answerfield = new JTextField();
        answerfield.setBounds(50, 360, 350, 30);
        answerfield.setBorder(BorderFactory.createEmptyBorder());
        p2.add(answerfield);

//       Retrieve Button
        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.darkGray);
        retrieve.setForeground(Color.WHITE);
        retrieve.setBounds(420, 360, 100, 30);
        retrieve.addActionListener(this);
        p2.add(retrieve);

//        Password  
        JLabel lblpassword = new JLabel("Password:");
        lblpassword.setBounds(50, 410, 100, 25);
        lblpassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lblpassword);

        passwordfield = new JTextField();
        passwordfield.setBounds(160, 410, 240, 30);
        passwordfield.setBorder(BorderFactory.createEmptyBorder());
        p2.add(passwordfield);

//       Back Button
        back = new JButton("Back");
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setBounds(420, 410, 100, 30);
        back.addActionListener(this);
        p2.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            try {
                String query = "SELECT * FROM `tourism_management_system`.`user` WHERE email = '" + emailfield.getText() + "'";
                Conn c = new Conn();

                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    fnamefield.setText(rs.getString("fname"));
                    lnamefield.setText(rs.getString("lname"));
                    sqcfield.setText(rs.getString("squestion"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == retrieve) {
            try {
                String query = "SELECT * FROM `tourism_management_system`.`user` WHERE answer = '" + answerfield.getText() + "' AND email = '" + emailfield.getText() + "'";
                Conn c = new Conn();

                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    passwordfield.setText(rs.getString("password"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new ForgotPassword();
    }
}
