package tourism_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JFrame implements ActionListener {

    JButton addPersonalDetails;

    String emaemailtext;

    Dashboard(String emailtext) {
        this.emaemailtext = emailtext;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Dashboard");
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 114));
        p1.setBounds(0, 0, 1540, 70);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel logo = new JLabel(i3);
        logo.setBounds(5, 0, 70, 70);
        p1.add(logo);

        JLabel heading = new JLabel("Tourism Management Syastem | Dashboard");
        heading.setBounds(80, 10, 400, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 78, 161));
        p2.setBounds(0, 70, 400, 1000);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 400, 40);
        addPersonalDetails.setBackground(new Color(0, 78, 161));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
        addPersonalDetails.addActionListener(this);
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        p2.add(addPersonalDetails);

        JButton updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 40, 400, 40);
        updatePersonalDetails.setBackground(new Color(0, 78, 161));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatePersonalDetails);

        JButton viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 80, 400, 40);
        viewPersonalDetails.setBackground(new Color(0, 78, 161));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        p2.add(viewPersonalDetails);

        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 120, 400, 40);
        deletePersonalDetails.setBackground(new Color(0, 78, 161));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(deletePersonalDetails);

        JButton checkPackage = new JButton("Check Packages");
        checkPackage.setBounds(0, 160, 400, 40);
        checkPackage.setBackground(new Color(0, 78, 161));
        checkPackage.setForeground(Color.WHITE);
        checkPackage.setFont(new Font("Times New Roman", Font.BOLD, 20));
        checkPackage.setMargin(new Insets(0, 0, 0, 110));
        p2.add(checkPackage);

        JButton bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 200, 400, 40);
        bookpackage.setBackground(new Color(0, 78, 161));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bookpackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(bookpackage);

        JButton viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 240, 400, 40);
        viewPackage.setBackground(new Color(0, 78, 161));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setFont(new Font("Times New Roman", Font.BOLD, 20));
        viewPackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(viewPackage);

        JButton viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 280, 400, 40);
        viewHotels.setBackground(new Color(0, 78, 161));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Times New Roman", Font.BOLD, 20));
        viewHotels.setMargin(new Insets(0, 0, 0, 130));
        p2.add(viewHotels);

        JButton bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0, 320, 400, 40);
        bookHotel.setBackground(new Color(0, 78, 161));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bookHotel.setMargin(new Insets(0, 0, 0, 140));
        p2.add(bookHotel);

        JButton viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0, 360, 400, 40);
        viewBookedHotel.setBackground(new Color(0, 78, 161));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        viewBookedHotel.setMargin(new Insets(0, 0, 0, 70));
        p2.add(viewBookedHotel);

        JButton destinations = new JButton("Destinations");
        destinations.setBounds(0, 400, 400, 40);
        destinations.setBackground(new Color(0, 78, 161));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Times New Roman", Font.BOLD, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        p2.add(destinations);

        JButton payments = new JButton("Payments");
        payments.setBounds(0, 440, 400, 40);
        payments.setBackground(new Color(0, 78, 161));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Times New Roman", Font.BOLD, 20));
        payments.setMargin(new Insets(0, 0, 0, 155));
        p2.add(payments);

        JButton calculator = new JButton("Calculator");
        calculator.setBounds(0, 480, 400, 40);
        calculator.setBackground(new Color(0, 78, 161));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Times New Roman", Font.BOLD, 20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        p2.add(calculator);

        JButton notepad = new JButton("Notepad");
        notepad.setBounds(0, 520, 400, 40);
        notepad.setBackground(new Color(0, 78, 161));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Times New Roman", Font.BOLD, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        p2.add(notepad);

        JButton about = new JButton("About");
        about.setBounds(0, 560, 400, 40);
        about.setBackground(new Color(0, 78, 161));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Times New Roman", Font.BOLD, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        p2.add(about);

        JButton exit = new JButton("Exit");
        exit.setBounds(0, 600, 400, 40);
        exit.setBackground(new Color(0, 78, 161));
        exit.setForeground(Color.RED);
        exit.setFont(new Font("Times New Roman", Font.BOLD, 20));
        exit.setMargin(new Insets(0, 0, 0, 190));
        p2.add(exit);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/HomeBg.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Plan Your Tour From Here...");
        text.setBounds(800, 80, 500, 50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        image.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(emaemailtext);
        }
    }

    public static void main(String[] args) {
        new Dashboard("");
    }

}
