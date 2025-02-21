package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    String pin;

    JTextField textField;
    JButton b1,b2;

    Withdrawal(String pin){

        this.pin = pin;

        //added the ATM image to the Frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,650);
        add(image);

        //label for withdrawal money
        JLabel label =  new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,20));
        label.setBounds(430,130,700,35);
        image.add(label);

        //label for withdrawal money
        JLabel label2 =  new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(450,180,400,35);
        image.add(label2);

        //text area for entering the WITHDRAWING money
        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        textField.setBounds(450,210,320,25);
        image.add(textField);

        //BUTTON for deposit
        b1 = new JButton("WITHDRAW");
        b1.setBounds(680,285,140,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);


        //BUTTON for back
        b2 = new JButton("BACK");
        b2.setBounds(680,320,140,30);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
        try {
            String amount = textField.getText();
            Date date = new Date();

            if (textField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER THE AMOUNT YOU WANT TO WITHDRAW");
            } else {
                con c = new con();
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                int balance = 0;

                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                    //checking if the balance in ACCOUNT is sufficient or insufficient
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "', 'Withdrawal','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " debited successfully");
                    setVisible(false);
                    new Main(pin);
                }
            }
        } catch (Exception E) {

        }

    } else if (e.getSource() == b2) {
            setVisible(false);
            new Main(pin);
        }

    }

    public static void main(String[] args) {
        new Withdrawal("");
    }

}
