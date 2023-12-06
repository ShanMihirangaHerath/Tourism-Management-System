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
import javax.swing.border.LineBorder;

public class Login extends JFrame {

    Login() {
        setSize(1000, 500);
        setLocation(250, 150);
        setTitle("Login");
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 500);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Login.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 600, 400);
        add(p2);

        // Email
        JLabel lbluseremail = new JLabel("Email Address:");
        lbluseremail.setBounds(60, 20, 200, 25);
        lbluseremail.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(lbluseremail);

        JTextField email = new JTextField();
        email.setBounds(60, 60, 500, 30);
        email.setBorder(BorderFactory.createEmptyBorder());
        p2.add(email);

        // Password
        JLabel textpassword = new JLabel("Password:");
        textpassword.setBounds(60, 100, 200, 25);
        textpassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p2.add(textpassword);

        JTextField password = new JTextField();
        password.setBounds(60, 150, 500, 30);
        password.setBorder(BorderFactory.createEmptyBorder());
        p2.add(password);

        // Button Login
        JButton login = new JButton("Login");
        login.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        login.setBounds(200, 230, 200, 50);
        login.setBackground(new Color(0, 0, 109));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(62, 64, 214)));
        p2.add(login);

        // Sign Up
        JButton signup = new JButton("Sign Up");
        signup.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        signup.setBounds(200, 300, 200, 50);
        signup.setBackground(new Color(0, 171, 48));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(0, 236, 8)));
        p2.add(signup);

        // Forgot Password
        JButton forgotPassword = new JButton("Forgot Password");
        forgotPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        forgotPassword.setBounds(50, 180, 150, 30);
        forgotPassword.setForeground(new Color(255, 0, 0));
        forgotPassword.setBorderPainted(false);
        forgotPassword.setContentAreaFilled(false);
        p2.add(forgotPassword);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
