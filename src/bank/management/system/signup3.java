package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formno;
    JButton submit, cancel;
    JCheckBox C7;


    signup3(String formno){

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        //label for page 3
        JLabel l1 = new JLabel("PAGE 3");
        l1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,22));
        // l1.setForeground(Color.WHITE);
        // l1.setBackground(Color.BLACK);
        l1.setBounds(335,40,800,30);
        add(l1);

        //label for account details
        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.ROMAN_BASELINE,22));
        //l2.setForeground(Color.WHITE);
        l2.setBounds(300,70,800,30);
        add(l2);

        //label for account type
        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,200,30);
        add(l3);

        //label for saving account radiobutton
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,160,200,30);
        add(r1);

        //label for Fixed deposit account radiobutton
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,160,200,30);
        add(r2);

        //label for current account radiobutton
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,200,200,30);
        add(r3);

        //label for recurring deposit account radiobutton
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,200,250,30);
        add(r4);

        //grouping the radiobutton to select only one option out of multiple options
        ButtonGroup button = new ButtonGroup();
        button.add(r1);
        button.add(r2);
        button.add(r3);
        button.add(r4);

        //label for card number
        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,250,200,30);
        add(l4);
        //label for card number
        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,275,200,30);
        add(l5);

        //label for card number
        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(350,250,250,30);
        add(l6);
        //label for card number
        JLabel l7 = new JLabel("it would appear in ATM Card/Cheque Book and Statement");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(350,275,300,30);
        add(l7);


        //label for PIN Number
        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,325,200,30);
        add(l8);
        //label for PIN number
        JLabel l9 = new JLabel("(4-digit Password)");
        l9.setFont(new Font("Raleway",Font.BOLD,12));
        l9.setBounds(100,345,200,30);
        add(l9);

        //password
        JLabel l10 = new JLabel("XXXX");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(350,325,100,30);
        add(l10);

        //label for service required
        JLabel service = new JLabel("Service Required :");
        service.setFont(new Font("Raleway",Font.BOLD,18));
        service.setBounds(100,380,200,30);
        add(service);

        //ATM Card check box for service required
        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,410,200,30);
        add(c1);

        //internet banking check box for service required
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(300,410,250,30);
        add(c2);

        //Mobile banking check box for service required
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(550,410,200,30);
        add(c3);

        //email alerts check box for service required
        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(100,450,200,30);
        add(c4);

        //cheque book check box for service required
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(300,450,200,30);
        add(c5);

        //E-statement check box for service required
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(550,450,200,30);
        add(c6);

        C7 = new JCheckBox("I here by declare that the above entered details correct to the best of my knowledge");
        C7.setFont(new Font("Raleway",Font.BOLD,12));
        C7.setBackground(new Color(215,252,252));
        C7.setBounds(120,510,600,20);
        add(C7);

        //label for Form no
        JLabel form = new JLabel("Form No :");
        form.setFont(new Font("Raleway",Font.BOLD,14));
        form.setBounds(590,10,100,30);
        add(form);

        JLabel form1 = new JLabel();
        form1.setFont(new Font("Raleway",Font.BOLD,14   ));
        form1.setBounds(680,10,60,30);
        add(form1);


        //submit button
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,550,100,30);
        submit.addActionListener(this);
        add(submit);

        //cancel button
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,550,100,30);
        cancel.addActionListener(this);
        add(cancel);


        setLayout(null);
        getContentPane().setBackground(new Color(215,252,252));
        setLocation(250,40);
        setSize(800,750);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        }else if (r2.isSelected()){
            atype = "Fixed Deposit Account";
        }else if (r3.isSelected()){
            atype = "Current Account";
        }else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 =  (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = String.valueOf(Math.abs(first7)).trim();

        long first3 = (ran.nextLong() % 9000L)+1000L;
        String pin = String.valueOf(Math.abs(first3)).trim();

        String fac = "";
        if (c1.isSelected()){
            fac += "ATM Card";
        }else if (c2.isSelected()){
            fac += "Internet Banking";
        }else if (c3.isSelected()){
            fac += "Mobile Banking";
        }else  if (c4.isSelected()){
            fac += "Email Alerts";
        } else  if (c5.isSelected()){
            fac += "Cheque Book";
        } else  if (c6.isSelected()){
            fac += "E-Statement";
        }

        try{
            if (e.getSource()==submit){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the details");
                }else if (C7.isSelected()){
                        con c1 = new con();
                        String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                        String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                        c1.statement.executeUpdate(q1);
                        c1.statement.executeUpdate(q2);

                        JOptionPane.showMessageDialog(null, "Card number : "+cardno+"\n PIN : "+pin);
                        new Deposit(pin);
                        setVisible(false);
                    }
            }else if (e.getSource()==cancel){
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new signup3("");
    }

}
