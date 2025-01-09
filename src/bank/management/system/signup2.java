package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;

    JTextField textFieldpan,textFieldadhar;

    JRadioButton r1,r2,e1,e2;
    String formno;
    signup2(String first){
        super("Application Form");



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = first;


        JLabel l1 = new JLabel("PAGE 2");
        l1.setFont(new Font("Ralway",Font.ROMAN_BASELINE,22));
       // l1.setForeground(Color.WHITE);
        // l1.setBackground(Color.BLACK);
        l1.setBounds(335,40,800,30);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.ROMAN_BASELINE,22));
        //l2.setForeground(Color.WHITE);
        l2.setBounds(295,70,800,30);
        add(l2);

        //label for religion
        JLabel l3 = new JLabel("Religion  :");
        //l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        l3.setBounds(100,120,100,30);
        add(l3);

        //options for religion
        String[] religion = {"Hindu","Sikh","Christian","Muslim"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setBounds(350,120,300,30);
        add(comboBox);

        //label for category
        JLabel l4 = new JLabel("Category :");
        //l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        l4.setBounds(100,160,100,30);
        add(l4);

        //options for Category
        String[] category = {"General","OBC","SC","ST","Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(350,160,300,30);
        add(comboBox2);

        //label for income
        JLabel l5 = new JLabel("Income :");
        //l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        l5.setBounds(100,210,100,30);
        add(l5);

        //options for Category
        String[] income = {"NULL","<50,000","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,210,300,30);
        add(comboBox3);

        //label for income
        JLabel l6 = new JLabel("Qualification :");
        //l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        l6.setBounds(100,260,150,30);
        add(l6);

        //options for qualification
        String[] qualification = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","PhD","Others"};
        comboBox4 = new JComboBox(qualification);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(350,260,300,30);
        add(comboBox4);

        //label for occupation
        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        l7.setBounds(100,310,150,30);
        add(l7);
        //option for occupation
        String[] occupation = {"Salaried","Self-Employeed","Business","Student","Retired"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,310,300,30);
        add(comboBox5);

        //label for pan number
        JLabel panno = new JLabel("PAN Number :");
        panno.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        panno.setBounds(100,360,150,30);
        add(panno);

        //text field for pan number
        textFieldpan = new JTextField();
        textFieldpan.setFont(new Font("Raleway",Font.BOLD,14));
        textFieldpan.setBounds(350,360,300,30);
        add(textFieldpan);

        //label for adhar number
        JLabel adhar = new JLabel("Aadhar Number :");
        adhar.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        adhar.setBounds(100,410,200,30);
        add(adhar);

        //text field for aadhar number
        textFieldadhar = new JTextField();
        textFieldadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textFieldadhar.setBounds(350,410,300,30);
        add(textFieldadhar);

        //label for senior citizen
        JLabel senior = new JLabel("Senior Citizen :");
        senior.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        senior.setBounds(100,460,150,30);
        add(senior);

        //radio button for senior citizen
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,460,100,30);
        add(r1);

        //radio button for senior citizen
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(500,460,100,30);
        add(r2);

        //label for existing account
        JLabel exist = new JLabel("Existing Account :");
        exist.setFont(new Font("Raleway",Font.ROMAN_BASELINE,20));
        exist.setBounds(100,510,200,30);
        add(exist);

        //radio button for existing account
        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,18));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,510,100,30);
        add(e1);

        //radio button for existing account
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,18));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(500,510,100,30);
        add(e2);

        //grouping the radio button
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r1);
        buttonGroup2.add(r2);
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        //label for Form no
        JLabel form = new JLabel("Form No :");
        form.setFont(new Font("Raleway",Font.BOLD,14));
        form.setBounds(590,10,100,30);
        add(form);

        JLabel form1 = new JLabel(formno);
        form1.setFont(new Font("Raleway",Font.BOLD,14));
        form1.setBounds(680,10,60,30);
        add(form1);

        //next button
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(570,550,80,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        getContentPane().setBackground(new Color(252,208,76));
        setLocation(250,40);
        setSize(800,750);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new signup2("");
    }

}
