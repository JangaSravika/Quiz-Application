package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    Score(String name, int score){
        setBounds(0,  0, 1280, 680 );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 950, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(300,200,300,300);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing Brain Teaser" );
        heading.setBounds(100,40,1300,60);
        heading.setFont(new Font("Viner Hang ITC",Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score );
        lblscore.setBounds(835,290,400,40);
        lblscore.setFont(new Font("Viner Hang ITC",Font.BOLD, 20));
        lblscore.setForeground(Color.BLACK);
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(850,340,120,30);
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new Score("User",0);
    }
}
