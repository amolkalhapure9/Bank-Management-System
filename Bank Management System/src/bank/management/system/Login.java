/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank.management.system;

/**
 *
// * @author DELL
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login implements ActionListener  {
      static JFrame jf;
      static JLabel l1,l2,l3,l4;
      static JTextField jt1,jt2;
      static JButton jb1,jb2,jb3;
    public Login(){
          jf=new JFrame("Bank Management System");
        jf.setSize(600,500);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/logo.jpg"));
        jf.setLayout(null);
        Image img1=img.getImage().getScaledInstance(100,100 , Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img1);
        l1=new JLabel(img3);
        l1.setBounds(50,10,100,100);
        jf.add(l1);
        
      l2=new JLabel("Welcome to ATM") ;
      l2.setBounds(170,30,400,40);
      l2.setFont(new Font("",Font.BOLD,38));
      l2.setForeground(Color.red);
      jf.add(l2);
      
      l3=new JLabel("Card No: ");
      l3.setBounds(80,120,170,100);
      l3.setFont(new Font("",Font.BOLD,28));
      jf.add(l3);
      
      jt1=new JTextField();
      jt1.setBounds(200,155,300,28);
      jf.add(jt1);
      
      l3=new JLabel("Pin: ");
      l3.setBounds(80,175,170,100);
      l3.setFont(new Font("",Font.BOLD,28));
      jf.add(l3);
      
      jt2=new JTextField();
      jt2.setBounds(200,215,300,28);
      jf.add(jt2);
      
      jb1=new JButton("Login");
      jb1.setBounds(200,275,100,30);
      jb1.addActionListener(this);
      jb1.setBackground(Color.black);
      jb1.setForeground(Color.white);
      jf.add(jb1);
      
      jb2=new JButton("New User");
      jb2.addActionListener(this);
      jb2.setBounds(310,275,100,30);
      jb2.setBackground(Color.black);
      jb2.setForeground(Color.white);
      jf.add(jb2);
      
      jb3=new JButton("Clear");
      jb3.addActionListener(this);
      jb3.setBounds(260,315,100,30);
      jb3.setBackground(Color.black);
      jb3.setForeground(Color.white);
      jf.add(jb3);
      
      
      
    
      
      
      
      
      
      
      
      
      
        jf.setDefaultCloseOperation(3);
        jf.setLocation(350,200);
      jf.getContentPane().setBackground(Color.white);
        jf.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb2){
        Register r=new Register();
        r.newUser();
        }
        else if(e.getSource()==jb3){
            jt1.setText("");
            jt2.setText("");
            
            
        }
        else if(e.getSource()==jb1){
            String cardno=null;
            String pinno=null;
            String Aadhar=null;
            String Type=null;
            try{
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","amol@1234");
           Statement smt=con.createStatement();
           String card=jt1.getText();
           String pin=jt2.getText();
              String sql = "select * from account where accountno="+"'"+card+"'"+"and pinno="+"'"+pin+"'";
              
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet res1 = pst.executeQuery();
           while(res1.next()){
               Aadhar=res1.getString(1);
               cardno=res1.getString(2);
               pinno=res1.getString(3);
               Type=res1.getString(4);
               
               
           }
           if(Aadhar==null && cardno==null ){
               JOptionPane jp=new JOptionPane();
              jp.showMessageDialog(null,"User not exists");
           }
           else {
               User_Account user=new User_Account(cardno,pinno,Aadhar,Type);
               user.user();
               
              
               
           }
               
            }
            catch(Exception exc){
                
                System.out.println("Exception occured"+exc);
        }
        }
        
    }
    public static void main(String[] args) {
     
        Login l=new Login();
    }
    
}
