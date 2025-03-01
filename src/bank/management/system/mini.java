package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {

    String pin;
    mini(String pin){
        this.pin = pin;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(20,140,400,200);
        add(label);

        JLabel label2 = new JLabel();
        label.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(20,140,400,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);



        try{
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()) {
                label3.setText("Card Number: " + resultSet.getString("card_number").substring(0, 4) + "xxxxxxxx" + resultSet.getString("card_number").substring(12));
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }

        try{
            int balance = 0;
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select *from bank where pin = '"+pin+"'");
            while (resultSet.next()){


                label.setText(label.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount")+"<br><br><html>");


                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
                label4.setText("Your Total Balance is "+ balance);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        JButton button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
