package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JLabel label1,label2,label3 ;
    JButton button1, button2, button3;

    JTextField textField2;
    JPasswordField passwordField2;

    login(){
        super("Banks Management System");

        //importing images to the screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));//loading from memory to variable i1
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//accessing image and making changes
        ImageIcon i3 = new ImageIcon(i2);//loading the changes in to variable i3
        JLabel image = new JLabel(i3);//creating label and loading the final image (i3) into variable image
        image.setBounds(350,10,100,100);//positioning of the picture
        add(image);//adding/showing/display image on the screen

        //importing images to the screen
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        //creating label
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230,125,450,40);
        add(label1);

        //creating label
        label2 = new JLabel("CARD NO: ");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(190,190,375,30);
        add(label2);

        //text field to add card number
        textField2 = new JTextField(15);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        textField2.setBounds(350,190, 230, 30);
        add(textField2);

        //creating label
        label3 = new JLabel("PIN NO: ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(190,250,375,30);
        add(label3);

        //text field to add PIN number
        passwordField2 = new JPasswordField(15);
        passwordField2.setFont(new Font("Arial",Font.BOLD,14));
        passwordField2.setBounds(350,250,230,30);
        add(passwordField2);

        //created a button to SIGN IN
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        //created button to clear
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14 ));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        //created button to SIGN UP
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14 ));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);


        //importing images to the screen
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,450,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,450);
        add(iiimage);


        setLayout(null);
        setSize(850,480);
        setLocation(300,100);
        //setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                System.out.println("Sign In button clicked."); // Debugging line

                con c = new con();
                String card_no = textField2.getText();
                String pin = passwordField2.getText();

                // Check if fields are empty
                if (card_no.isEmpty() || pin.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Card number and PIN must not be empty!");
                    System.out.println("Empty fields detected. Login aborted.");
                    return;
                }

                String Q = "SELECT * FROM login WHERE card_number = '" + card_no + "' AND pin = '" + pin + "'";
                System.out.println("Executing query: " + Q); // Debugging line

                ResultSet resultSet = c.statement.executeQuery(Q);

                if (resultSet.next()) {
//                    System.out.println("Login successful! Redirecting to Main...");
//                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    new Main(pin); // Check if Main class exists
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN. Please try again.");
                    System.out.println("Login failed. Invalid credentials.");
                }

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField2.setText("");
                System.out.println("Clear button clicked. Fields reset.");
            } else if (e.getSource() == button3) {
                System.out.println("Sign Up button clicked.");
                new signup(); // Ensure signup class exists
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error in actionPerformed: " + ex.getMessage());
        }
    }





    public static void main(String[] args) {
        new login();
    }




   /* @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1){
                con c1 = new con();
                String cardno = textField2.getText();
                String pin;
                pin = passwordField2.getText();
                String q = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c1.statement.executeQuery(q);

                if (resultSet.next()){
                    setVisible(false);
                    new Main(pin);
                    }else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN. Please try again.");
                }

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField2.setText("");

            }else if (e.getSource() == button3){
             new signup();
             setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }*/


}
