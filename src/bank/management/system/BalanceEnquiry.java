package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel label2;
    JButton b1;
    String pin;

    BalanceEnquiry(String pin){
        this.pin = pin;

        //added the ATM image to the Frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,650);
        add(image);

        //label for withdrawal money
        JLabel label =  new JLabel("your Current Balance is Rs ");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,20));
        label.setBounds(420,150,700,35);
        image.add(label);

        //label for
        label2 =  new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(420,180,400,35);
        image.add(label2);

        //BUTTON for back
        b1 = new JButton("BACK");
        b1.setBounds(680,320,140,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        int balance = 0;

        try{
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select *from bank where pin = '"+pin+"'");

            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
