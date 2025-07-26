package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,800,920);
        add(image);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/time.jpg"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(180,2,400,400);
        add(image2);
        
        JLabel heading = new JLabel("Brain Teaser");
        heading.setBounds(800,90,800,300);
        heading.setFont(new Font("Viner Hang ITC",Font.BOLD, 45));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(870,120,800,400);
        name.setFont(new Font("Mongolian Baiti",Font.PLAIN, 20));
        name.setForeground(Color.BLACK);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(800,350,300,30);
        tfname.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(tfname);
        
        rules = new JButton("Instructions");
        rules.setBounds(800,400,120,25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(980,400,120,25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1300,700);
        setLocation(0,0);            
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if(ae.getSource() == back) {
            setVisible(false);
        }
        
    }


    public static void main(String[] args){
        new Login();
        
    }
    }


