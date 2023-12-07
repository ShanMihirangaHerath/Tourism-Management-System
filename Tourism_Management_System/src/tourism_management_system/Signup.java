package tourism_management_system;

import java.awt.Choice;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Signup extends JFrame {

    Signup() {
        setBounds(250, 150, 1200, 600);
        setTitle("Create Account");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 500, 600);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Signup.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(500, 0, 700, 600);
        add(p2);

        // First name
        JLabel lblfname = new JLabel("First Name:");
        lblfname.setBounds(60, 20, 200, 25);
        lblfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lblfname);

        JTextField firstname = new JTextField();
        firstname.setBounds(60, 60, 230, 30);
        firstname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(firstname);

        // Last name
        JLabel lbllname = new JLabel("Last Name:");
        lbllname.setBounds(325, 20, 200, 25);
        lbllname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lbllname);

        JTextField lastname = new JTextField();
        lastname.setBounds(330, 60, 230, 30);
        lastname.setBorder(BorderFactory.createEmptyBorder());
        p2.add(lastname);

        // Email
        JLabel lbluseremail = new JLabel("Email Address:");
        lbluseremail.setBounds(60, 100, 200, 25);
        lbluseremail.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lbluseremail);

        JTextField email = new JTextField();
        email.setBounds(60, 130, 500, 30);
        email.setBorder(BorderFactory.createEmptyBorder());
        p2.add(email);

        // Password
        JLabel textpassword = new JLabel("Password:");
        textpassword.setBounds(60, 180, 200, 25);
        textpassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(textpassword);

        JTextField password = new JTextField();
        password.setBounds(60, 210, 500, 30);
        password.setBorder(BorderFactory.createEmptyBorder());
        p2.add(password);
        
        // Contact Number
        JLabel textcontactno = new JLabel("Contact Number:");
        textcontactno.setBounds(60, 260, 200, 25);
        textcontactno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(textcontactno);

        JTextField contact = new JTextField();
        contact.setBounds(60, 290, 500, 30);
        contact.setBorder(BorderFactory.createEmptyBorder());
        p2.add(contact);
        
        // S Question
        JLabel squestion = new JLabel("Security Question:");
        squestion.setBounds(60, 340, 200, 25);
        squestion.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(squestion);

        Choice security = new Choice();
        security.add("Your Fav Character Name");
        security.add("Your Fav Color");
        security.add("Your Lucky Number");
        security.add("What is your Fav place to Visit?");
        security.setBounds(60, 370, 200, 30);
        p2.add(security);
        
        // Answer
        JLabel answer = new JLabel("Contact Number:");
        answer.setBounds(300, 340, 200, 25);
        answer.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(answer);

        JTextField answertext = new JTextField();
        answertext.setBounds(300, 370, 265, 30);
        answertext.setBorder(BorderFactory.createEmptyBorder());
        p2.add(answertext);
        
        //Button Create Account 
        JButton create = new JButton("Create An Account");
        create.setBackground(new Color(0,134,0));
        create.setForeground(Color.WHITE);
        create.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        create.setBounds(200, 420,250,30);
        p2.add(create);
        
        //Button Back
        JButton back = new JButton("Back");
        back.setBackground(new Color(205,0,0));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        back.setBounds(275, 480,100,30);
        p2.add(back);
        
        

        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }

}
