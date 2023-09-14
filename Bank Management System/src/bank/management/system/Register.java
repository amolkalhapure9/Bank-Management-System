/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class Register implements ActionListener {
    JFrame jf,jf2,jf3;
    JLabel l0, l1,l2,l3,l4,l5,l6,l22,l7,l8,ll1,ll2,ll3,label1,label2,label3,label21,label31;
    JTextField jt2,jt3,jt4,jt5,jt6,jt22,jt8,jj2,jj3,jj4,jd1,jd2;
    JComboBox jt7;
    JRadioButton jr1,jr2,jr3,jr4,jr5 ,rb1,rb2,rb3,rb4;
    JButton jb1,jb2,jb3,jb4,jb5,cardgen,pingen;
    JCheckBox jc1,jc2,jc3,cb1,cb2,cb3,cb4,cb5;
    public void newUser(){
        jf=new JFrame("New User Registration");
        jf.setSize(600,800);
        l0=new JLabel("Note*: Please Enter Valid Details");
        l0.setBounds(4,5,250,40);
        l0.setForeground(Color.red);
        jf.add(l0);
        l1=new JLabel("Registration Form");
        l1.setFont(new Font("",Font.BOLD,38));
        l1.setBounds(60,50,500,100);
        jf.add(l1);
        
        l22=new JLabel("Name: ");
        l22.setBounds(40,140,300,70);
      
        l22.setFont(new Font("",Font.BOLD,16));
        jf.add(l22);
        jt22=new JTextField();
        jt22.setBounds(195,160,260,27);
        jf.add(jt22);
        
         l2=new JLabel("Father's Name: ");
        l2.setBounds(40,190,300,70);
        l2.setFont(new Font("",Font.BOLD,16));
        jf.add(l2);
        jt2=new JTextField();
      
        jt2.setBounds(195,210,260,27);
        jf.add(jt2);
        
         l3=new JLabel("Email Address: ");
        l3.setBounds(40,240,300,70);
        l3.setFont(new Font("",Font.BOLD,16));
        jf.add(l3);
        jt3=new JTextField();
        jt3.setBounds(195,260,260,27);
        jf.add(jt3);
        
        l4=new JLabel("Aadhar no: ");
        l4.setBounds(40,290,300,70);
        l4.setFont(new Font("",Font.BOLD,16));
        jf.add(l4);
        jt4=new JTextField();
        jt4.setBounds(195,310,260,27);
        jf.add(jt4);
        
        l5=new JLabel("Address: ");
        l5.setBounds(40,340,300,70);
        l5.setFont(new Font("",Font.BOLD,16));
        jf.add(l5);
        jt5=new JTextField();
        jt5.setBounds(195,360,260,27);
        jf.add(jt5);
        
        l6=new JLabel("Gender: ");
        l6.setBounds(40,390,300,70);
        l6.setFont(new Font("",Font.BOLD,16));
        jf.add(l6);
        
        jr1=new JRadioButton("Male");
        jr1.setBounds(195,410,80,40);
        jf.add(jr1);
        jr2=new JRadioButton("Female");
        jr2.setBounds(275,410,80,40);
        jf.add(jr2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        
        l7=new JLabel("State: ");
        l7.setBounds(40,440,300,70);
        l7.setFont(new Font("",Font.BOLD,16));
        jf.add(l7);
        jt7=new JComboBox();
        jt7.setBounds(195,470,260,27);
        jt7.addItem("Enter your state");
        jt7.addItem("Maharashtra");
        jt7.addItem("Hariyana");
        jt7.addItem("Punjab");
        jt7.addItem("Rajasthan");
        jt7.addItem("Goa");
        jt7.addItem("Keral");
        jf.add(jt7);
        
        l8=new JLabel("Pin Code: ");
        l8.setBounds(40,490,300,70);
        l8.setFont(new Font("",Font.BOLD,16));
        jf.add(l8);
        jt8=new JTextField();
        jt8.setBounds(195,520,260,27);
        jf.add(jt8);
        

        
        
        jb1=new JButton("Next");
        jb1.setBounds(350,580,90,30); 
        jb1.addActionListener(this);
        jb1.setBackground(Color.black);
        jb1.setForeground(Color.white);
        jf.add(jb1);
        
          jt2.addActionListener(this);
          jt22.addActionListener(this);
          jt3.addActionListener(this);
          jt4.addActionListener(this);
          jt5.addActionListener(this);
                  
          jt7.addActionListener(this);
         jt8.addActionListener(this);
         
         
         jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
        jf.setVisible(true);
        
        
       //-------------------------------------------------------------------------
         
//         
        jf2=new JFrame("Additional Information");
        jf2.setSize(600, 800);
        jf2.setLayout(null);
        ll1=new JLabel("Registration Form");
        ll1.setFont(new Font("",Font.BOLD,38));
        ll1.setBounds(60,50,500,100);
           jf2.add(ll1);
        
        ll2=new JLabel("Pan no: ");
        ll2.setBounds(40,140,300,70);
        ll2.setFont(new Font("",Font.BOLD,16));
        jf2.add(ll2);
        jj2=new JTextField();
        jj2.setBounds(195,160,260,27);
        jf2.add(jj2);
        
        ll3=new JLabel("Type: ");
        ll3.setBounds(40,200,300,70);
        ll3.setFont(new Font("",Font.BOLD,16));
        jf2.add(ll3);
        
        jr4=new JRadioButton("Existing User");
        jr4.setBounds(195,220,80,40);
        jf2.add(jr4);
        jr5=new JRadioButton("New user");
        jr5.setBounds(285,220,80,40);
        jf2.add(jr5);
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(jr4);
        bg1.add(jr5);
        
        jc1=new JCheckBox("I promise that information given by me is correct ");
        jc1.setBounds(40,280,500,40);
        jc1.setForeground(Color.red);
        jf2.add(jc1);
        jc2=new JCheckBox("I will recognize all the conditions of Banks");
        jc2.setBounds(40,320,500,40);
         jc2.setForeground(Color.red);
        jf2.add(jc2);
        jc3=new JCheckBox("If any illegal activity found then bank will close my account by applying specific charge");
        jc3.setBounds(40,360,500,40);
         jc3.setForeground(Color.red);
        jf2.add(jc3);
        
        jb3=new JButton("Previous");
        jb3.setBounds(240,400,90,30); 
        jb3.addActionListener(this);
        jb3.setBackground(Color.black);
        jb3.setForeground(Color.white);
        jf2.add(jb3);
        
        
        
     
         jb2=new JButton("Next");
        jb2.setBounds(350,400,90,30); 
        jb2.addActionListener(this);
        jb2.setBackground(Color.black);
        jb2.setForeground(Color.white);
        jf2.add(jb2);
        
         
        
        jf2.setVisible(false);
        
                        
              
        //-------------------------------------------------------------------------
       
      jf3=new JFrame("Account Information");
      jf3.setSize(600,800);
      jf3.setLayout(null);
     label3=new JLabel("Account Information");
     label3.setBounds(60,50,300,50);
     label3.setFont(new Font("",Font.BOLD,30));
     jf3.add(label3);
     
     label1=new JLabel("Account type");
     label1.setBounds(50,100,200,60);
     label1.setFont(new Font("",Font.BOLD,20));
     jf3.add(label1);
     rb1=new JRadioButton("Saving Account");
     rb1.setBounds(50,190,140,60);
     jf3.add(rb1);
     rb2=new JRadioButton("Current Account");
     rb2.setBounds(190,190,200,60);
     jf3.add(rb2);
     
     rb3=new JRadioButton("Fixed Deposit Account");
     rb3.setBounds(50,260,200,60);
     jf3.add(rb3);
     ButtonGroup bg3=new ButtonGroup();
     bg3.add(rb1);
     bg3.add(rb2);
     bg3.add(rb3);
     
     label2=new JLabel("card no:");
     label2.setBounds(50,330,150,60);
      label2.setFont(new Font("",Font.BOLD,20));
     jf3.add(label2);
 
     label21=new JLabel("XXXX XXXX XXXX 4567");
     label21.setBounds(180,330,300,60);
     label21.setFont(new Font("",Font.BOLD,20));
     jf3.add(label21);
     
     cardgen=new JButton("Generate");
     cardgen.setBounds(420,350,100,20);
     cardgen.addActionListener(this);
     jf3.add(cardgen);
     
     label3=new JLabel("pin no:");
     label3.setBounds(50,420,300,60);
     label3.setFont(new Font("",Font.BOLD,20));
     jf3.add(label3);
     
     
     label31=new JLabel("XXXX");
     label31.setBounds(180,420,300,60);
     label31.setFont(new Font("",Font.BOLD,20));
     jf3.add(label31);
     
     pingen=new JButton("Generate");
     pingen.setBounds(420,440,100,20);
     pingen.addActionListener(this);
     jf3.add(pingen);
     
      cb5=new JCheckBox("I heare by that information given to me is correct and if any illegal activity happened by me then bank has right to close my account");
     cb5.setBounds(50,480,500,60);
     cb5.setForeground(Color.red);
     jf3.add(cb5);
     
     jb4=new JButton("Submit");
     jb4.setBounds(350,550,90,30);
     jb4.addActionListener(this);
     jf3.add(jb4);
     
     jb5=new JButton("Previous");
     jb5.setBounds(100,550,90,30);
      jb5.addActionListener(this);
     jf3.add(jb5);
     
    
     
     
     
     
     
     
     
     
     
      
      
      
      jf3.setVisible(false);
           
        
        
       
        
        jf.setLocation(350,5);
        jf2.setLocation(350,5);
        jf3.setLocation(350,5);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
//    public void actionPerformed(ActionEvent e) {
//        
       
//        
//    }
    
    public void actionPerformed(ActionEvent e){
        JOptionPane jp=new JOptionPane();
         Random r=new Random();
        String name=jt22.getText();
        String Father=jt2.getText();
        String email=jt3.getText();
        String Aadhar=jt4.getText();
        String Address=jt5.getText();
        String State=(String)jt7.getSelectedItem();
        String pin=jt8.getText();
        String pan=jj2.getText();
        String gender=null;
        if(jr1.isSelected()){
            gender="male";
        }
        else if(jr2.isSelected()){
            gender="female";
        }
        String Type=null;
        if(jr4.isSelected()){
            Type="new user";
        }
        else{
            Type="Exsting";
        }
        
       
        
        String acc_type=null;
        if(rb1.isSelected()){
            acc_type="Saving Account";
        }
        else if(rb2.isSelected()){
            acc_type="Current Account";
        }
        else{
            acc_type="Fixed Deposit Account";
        }
        
        
        if(e.getSource()==jb3){
            jf2.setVisible(false);
            jf.setVisible(true);
        }
        if(e.getSource()==jb1){
            if(name.equals("") || Father.equals("")|| email.equals("")|| Aadhar.equals("")|| State.equals("")|| pin.equals("")){
            
               jp.showMessageDialog(null,"All fields are required to filled");
           }
            else{
            jf.setVisible(false);
            jf2.setVisible(true);
            }
    }
        //-------------------------------------------------------------------
       
         if(e.getSource()==cardgen){
         
          int max=9999;
          int min=1000;
          int num=(int)(Math.abs(Math.random()*(max-min+1)+min));
          String statef=State.substring(0,2);
          String accountno=statef+"BOB"+num;
          label21.setText(accountno);
        
         
         
          cardgen.setEnabled(false);
          
   
    }
         
           
          if(e.getSource()==pingen ){
              int max=9999;
          int min=1000;
          int num2=(int)(Math.abs(Math.random()*(max-min)+min));
          String pinno=""+num2;
          label31.setText(pinno);
         
          pingen.setEnabled(false);
          }
    
        
        
        
        
        
        
        
        
        
        //-------------------------------------------------------------------
        
        if(e.getSource()==jb4){
        
      
          
        try{
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","amol@1234");
      
           Statement smt=con.createStatement();
           
         if(pan.equals("")|| Type.equals("")){
             jp.showMessageDialog(null,"All fields are required to filled");
             
         }
           else{
               String aadhar="select name from user where Aadhar = '"+Aadhar+"'";
               smt.execute(aadhar);
               ResultSet name1= smt.executeQuery(aadhar);
               
//               String mail="select email from user where email='"+email+"'";
//               smt.execute(mail);
//               ResultSet mail1=smt.executeQuery(mail);
         if( !jc1.isSelected()&& !jc2.isSelected()&& !jc3.isSelected() &&!cb5.isSelected()){
             jp.showMessageDialog(null,"Please accept conditions ");
         }
          else if(!name1.next() ){
          String str="insert into user(name,Father,email,Aadhar,Address,State,pin,gender,pan,Type) values( '"+name+"','"+Father+"','"+email+"','"+Aadhar+"','"+Address+"','"+State+"','"+pin+"','"+gender+"','"+pan+"','"+Type+"')";
          smt.execute(str);
          
          
          //---------------------------------------------------
          String accountno=label21.getText();
          String pinno=label31.getText();
          System.out.print(accountno);
          
          String accountstr="insert into account (Aadhar,accountno,pinno,acc_type) values('"+Aadhar+"','"+accountno+"','"+pinno+"','"+acc_type+"')";
          smt.execute(accountstr);
          String TransactionHistory="create table "+accountno+"(receiveraccount char(45),moneytransfered int)";
          smt.execute(TransactionHistory);
         
          
          //-------------------------------------------------------
           smt.close();
           con.close();
           jf3.setVisible(false);
           jp.showMessageDialog(null,"Congradulations You have Successfully submitted Application form\nPlease Note your Credientials:\n1.Card no:"+accountno+"\n2.pin no"+pinno);
               }
               else{
                   jp.showMessageDialog(null,"Aadhar number is already taken ");
               }
           }
           
//         
           
           
       
       
        }
        catch(Exception exception){
            System.out.print("Exception Occurs"+exception);
            
        }
           
        }
        if(e.getSource()==jb2){
            jf2.setVisible(false);
            jf3.setVisible(true);
        }
    }
    
    
}
