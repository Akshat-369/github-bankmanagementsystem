package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    pin(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1500,650);
        add(image);

        //label for pin  change
        JLabel label =  new JLabel("CHANGE YOUR PIN");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,16));
        label.setBounds(420,150,400,35);
        image.add(label);


        //label for entering new pin
        JLabel label2 =  new JLabel("New PIN:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(420,180,150,35);
        image.add(label2);

        //text area for entering the new password
        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBounds(590,180,180,25);
        image.add(p1);

        //label for re-entering the pin
        JLabel label3 =  new JLabel("Re-Enter New PIN:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(420,210,400,35);
        image.add(label3);

        //text area for Re-entering the new password
        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBounds(590,215,180,25);
        image.add(p2);

        //BUTTON for Change
        b1 = new JButton("CHANGE");
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

        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not Match");
                return;
            }
            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                } else if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                con c = new con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"' ";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"' ";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"New PIN Changed Successfully");
                setVisible(false);
                new Main(pin);
            } else if (e.getSource()==b2) {
                new Main(pin1);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new pin("");
    }
}
