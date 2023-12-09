package tourism_management_system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Loading extends JFrame implements Runnable {

    Thread t;
    JProgressBar bar;

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int max = bar.getMaximum(); //100%
                int value = bar.getValue();
                if (value < max) {
                    bar.setValue(bar.getValue() + 1);
                } else {
                    setVisible(false);
                    //new Class object
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Loading() {
        t = new Thread(this);

        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Tourism Management System");
        text.setBounds(50, 20, 600, 40);
        text.setFont(new Font("Times New Roman", Font.BOLD, 20));
        text.setForeground(Color.BLUE);
        add(text);

        bar = new JProgressBar();
        bar.setBounds(50, 100, 525, 35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading...");
        loading.setBounds(260, 150, 250, 30);
        loading.setFont(new Font("Times New Roman", Font.BOLD, 18));
        loading.setForeground(Color.GREEN);
        add(loading);

        JLabel name = new JLabel("Please Wait!");
        name.setBounds(250, 300, 300, 20);
        name.setFont(new Font("Times New Roman", Font.BOLD, 18));
        name.setForeground(Color.RED);
        add(name);

        t.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Loading();
    }

    
}
