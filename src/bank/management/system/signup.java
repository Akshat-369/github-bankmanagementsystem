    package bank.management.system;

    import com.toedter.calendar.JDateChooser;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.sql.Statement;
    import java.util.Random;
    import java.util.regex.Pattern;


    public class signup extends JFrame implements ActionListener {

        JTextField textFieldName , textFieldfName,textFieldemail,textFieldaddress,textFieldcity,textFieldpin ,textFieldstate;
        JDateChooser datechooser;
        JRadioButton r1,r2,m1,m2,m3;
        JButton next;

        //randomly generating application number of 4 digit of data-type long
        Random ran = new Random();
        long first4 = (ran.nextLong() % 9000L) + 1000L;
        String first = " " + Math.abs(first4);

        signup(){
            super("APPLICATION FORM");
            //image of bank
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
            Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(25,10,100,100);
            add(image);

            //application no label
            JLabel label1 = new JLabel("APPLICATION FORM NO " + first);
            label1.setBounds(160,20,600,40);
            label1.setForeground(Color.WHITE);
            label1.setFont(new Font("Ralway",Font.BOLD,38));
            add(label1);

            //page 1 label
            JLabel label2 = new JLabel("PAGE 1");
            label2.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            label2.setForeground(Color.WHITE);
           // label2.setBackground(Color.BLACK);
            label2.setBounds(335,60,800,30);
            add(label2);

            //personal details label
            JLabel label3 = new JLabel("PERSONAL DETAILS");
            label3.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            label3.setForeground(Color.WHITE);
            //label3.setBackground(Color.BLACK);
            label3.setBounds(270,90,800,20);
            add(label3);

            //Name label
            JLabel label4 = new JLabel("Name : ");
            label4.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            label4.setForeground(Color.WHITE);
            //label4.setBackground(Color.BLACK);
            label4.setBounds(100,130,200,25);
            add(label4);
            //text field for label name
            textFieldName = new JTextField();
            textFieldName.setFont(new Font("Ralway",Font.BOLD,14));
            textFieldName.setBounds(300,130,400,25);
            add(textFieldName);

            // father Name label
            JLabel label5 = new JLabel("Father Name : ");
            label5.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            label5.setForeground(Color.WHITE);
            //label5.setBackground(Color.BLACK);
            label5.setBounds(100,170,200,25);
            add(label5);
            //text field for label father name
            textFieldfName = new JTextField();
            textFieldfName.setFont(new Font("Ralway",Font.BOLD,14));
            textFieldfName.setBounds(300,170,400,25);
            add(textFieldfName);

            //label for gender
            JLabel labelG = new JLabel("Gender :");
            labelG.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            labelG.setBounds(100,210,300,25);
            labelG.setForeground(Color.WHITE);
            add(labelG);

            r1 = new JRadioButton("Male");
            r1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,14));
            r1.setForeground(Color.WHITE);
            r1.setBackground(new Color(49,68,212));
            r1.setBounds(300, 210,100,25);
            add(r1);

            r2 = new JRadioButton("Female");
            r2.setFont(new Font("Ralway",Font.ROMAN_BASELINE,14));
            r2.setForeground(Color.WHITE);
            r2.setBackground(new Color(49,68,212));
            r2.setBounds(400, 210,100,25);
            add(r2);

            //grouping the radio button
            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(r1);
            buttonGroup.add(r2);

            //date label
            JLabel DOB = new JLabel("Date Of birth :");
            DOB.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            DOB.setForeground(Color.WHITE);
            DOB.setBounds(100,250,200,25);
            add(DOB);
            //choose the date
            datechooser = new JDateChooser();
            datechooser.setForeground(new Color(105,105,105));
            datechooser.setBounds(300,250,400,25);
            add(datechooser);

            //label for email
            JLabel Email = new JLabel("Email Address :");
            Email.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            Email.setForeground(Color.WHITE);
            Email.setBounds(100,290,200,25);
            add(Email);

            //text field for label email address
            textFieldemail = new JTextField();
            textFieldemail.setFont(new Font("Ralway",Font.BOLD,14));
            textFieldemail.setBounds(300,290,400,25);
            add(textFieldemail);



            //label for marital status
            JLabel maritalstatus = new JLabel("Marital Status :");
            maritalstatus.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            maritalstatus.setForeground(Color.WHITE);
            maritalstatus.setBounds(100,330,200,25);
            add(maritalstatus);

            m1 = new JRadioButton("Married");
            m1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,14));
            m1.setForeground(Color.WHITE);
            m1.setBackground(new Color(49,68,212));
            m1.setBounds(300, 330,100,25);
            add(m1);

            m2 = new JRadioButton("Unmarried");
            m2.setForeground(Color.WHITE);
            m2.setBackground(new Color(49,68,212));
            m2.setBounds(450, 330,100,25);
            add(m2);

            m3 = new JRadioButton("others");
            m3.setForeground(Color.WHITE);
            m3.setBackground(new Color(49,68,212));
            m3.setBounds(600, 330,100,25);
            add(m3);

            //grouping the radio button
            ButtonGroup buttonGroup1 = new ButtonGroup();
            buttonGroup1.add(m1);
            buttonGroup1.add(m2);
            buttonGroup1.add(m3);

            //label for Address
            JLabel address = new JLabel("Address :");
            address.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            address.setForeground(Color.WHITE);
            address.setBounds(100,370,200,25);
            add(address);

            //text field for label address
            textFieldaddress = new JTextField();
            textFieldaddress.setFont(new Font("Ralway",Font.BOLD,14));
            textFieldaddress.setBounds(300,370,400,25);
            add(textFieldaddress);

            //label for city
            JLabel city = new JLabel("City :");
            city.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            city.setForeground(Color.WHITE);
            city.setBounds(100,410,200,25);
            add(city);
            //text field for label city
            textFieldcity = new JTextField();
            textFieldcity.setFont(new Font("Ralway",Font.BOLD,14));
            textFieldcity.setBounds(300,410,400,25);
            add(textFieldcity);

            //label for Pin code
            JLabel pincode = new JLabel("Pin Code :");
            pincode.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            pincode.setForeground(Color.WHITE);
            pincode.setBounds(100,450,200,25);
            add(pincode);
            //text field for label pin code
            textFieldpin = new JTextField();
            textFieldpin.setFont(new Font("Ralway",Font.BOLD,14));
            textFieldpin.setBounds(300,450,400,25);
            add(textFieldpin);

            //label for state
            JLabel state = new JLabel("State :");
            state.setFont(new Font("Ralway",Font.ROMAN_BASELINE,20));
            state.setForeground(Color.WHITE);
            state.setBounds(100,490,200,25);
            add(state);
            //text field for label state
            textFieldstate = new JTextField();
            textFieldstate.setFont(new Font("Ralway",Font.BOLD,14));
            textFieldstate.setBounds(300,490,400,25);
            add(textFieldstate);

            next = new JButton("Next");
            next.setFont(new Font("Ralway",Font.BOLD,14));
            next.setForeground(Color.WHITE);
            next.setBackground(Color.BLACK);
            next.setBounds(600,550,80,30);
            next.addActionListener(this);
            add(next);

            getContentPane().setBackground(new Color(49,68,212));
            setLayout(null);
            setSize(850,800);
            setLocation(250,40);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            String formno = first;
            String name = textFieldName.getText();
            String fname = textFieldfName.getText();
            String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();

            String gender = null;
            if (r1.isSelected()){
                gender = "Male";
            }else if (r2.isSelected()){
                gender = "Female";
            }
            String email = textFieldemail.getText();

            String marital = null;
            if (m1.isSelected()){
                marital = "Married";
            }else if (m2.isSelected()){
                marital = "Unmarried";
            }else if (m3.isSelected()){
                marital = "Others";
            }

            String address = textFieldaddress.getText();
            String city = textFieldcity.getText();
            String pin = textFieldpin.getText();
            String state = textFieldstate.getText();

            try {
                 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

                if (name.isEmpty() || fname.isEmpty() || dob.isEmpty() || email.isEmpty() || address.isEmpty() || city.isEmpty() || pin.isEmpty() || state.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Fill all the details");
                }else if (!Pattern.matches(emailRegex, email)) {
                    JOptionPane.showMessageDialog(null, "Incorrect Email ID! Please enter a valid email.", "Invalid Email", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    con con1 = new con();
                    String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                    con1.statement.executeUpdate(q);
                    new signup2(first);
                    setVisible(false);
                }


            }catch (Exception E){
                E.printStackTrace();
            }

        }
        public static void main(String[] args) {
            new signup();
        }
    }
