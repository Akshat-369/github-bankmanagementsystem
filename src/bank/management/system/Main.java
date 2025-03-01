package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7;

    Main(String pin){

        this.pin = pin;

        //added the ATM image to the Main Frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,650);
        add(image);

        //label for selecting the transaction
        JLabel label =  new JLabel("PLEASE SELECT YOUR TRANSACTION ");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,16));
        label.setBounds(450,150,400,35);
        image.add(label);

        //Button for deposit
        b1 = new JButton("DEPOSIT");
        b1.setBounds(400,210,160,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        //Button for cash deposit
        b2 = new JButton("CASH DEPOSIT");
        b2.setBounds(660,210,160,30);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);


        //Button for Fast Cash
        b3 = new JButton("FAST CASH");
        b3.setBounds(400,248,160,30);
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        image.add(b3);

        //Button for mini statement
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(660,248,160,30);
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        image.add(b4);

        //Button for PIN CHANGE
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(400,286,160,30);
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        image.add(b5);


        //Button for balance enquiry
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(660,286,160,30);
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        image.add(b6);

        //Button for EXIT
        b7 = new JButton("EXIT");
        b7.setBounds(660,324,160,30);
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        image.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource() == b7) {
            System.exit(0);
        } else if (e.getSource() == b2) {
            new Withdrawal(pin);
            setVisible(false);
        }else if (e.getSource() == b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if (e.getSource() == b3) {
            new FastCash(pin);
            setVisible(false);
        }else if (e.getSource() == b4) {
            new mini(pin);
        } else if (e.getSource() == b5) {
            new pin(pin);
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new Main("");
    }

}
