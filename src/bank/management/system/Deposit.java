package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;

    JTextField textField;
    JButton b1,b2;

    Deposit(String pin){
        this.pin = pin;

        //added the ATM image to the Frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,650);
        add(image);

        //label for deposit money
        JLabel label =  new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,16));
        label.setBounds(450,150,400,35);
        image.add(label);

        //text area for entering the despositing money
        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        textField.setBounds(450,200,320,25);
        image.add(textField);

        //BUTTON for deposit
        b1 = new JButton("DEPOSIT");
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

    public static void main(String[] args) {
        new Deposit(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            String amount = textField.getText();
            Date date = new Date();

            if (e.getSource() == b1){
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"please enter the amount you want to deposit");
                }
                else {
                    con c1 = new con();
                    c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs "+amount+" is deposited successfully");
                    setVisible(false);
                }

            } else if (e.getSource() == b2) {
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
