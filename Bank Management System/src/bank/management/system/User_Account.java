/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author DELL
 */


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class User_Account implements ActionListener {
    //------------------
    JFrame jf;
    JLabel l1,l2,l3,l4,C,P,A,T,AC,E,R,B;
    JTextField jt1,jt2,jt3,jt4;
    JButton jb1,jb2,jb4,S,AS;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,TH;
    static  int count=0;
       
  

    //-------------------
    
    String card;
    String pin;
    String Aadhar;
    String Type;
   
    
    public User_Account(String card,String pin,String Aadhar,String Type){
        this.card=card;
        this.pin=pin;
        this.Aadhar=Aadhar;
        this.Type=Type;
       
        
    }
    public void user(){
//        System.out.print("Your Identy Card");
//        System.out.println("User Card no"+card);
//        System.out.println("User Pin no"+pin);
//        System.out.println("User Aadhar no"+Aadhar);
//        System.out.print("Account Type"+Type);
jf=new JFrame("User DashBoard");
jf.setSize(850,700);
jf.setLayout(null);
 ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/atm1.jpg"));
        jf.setLayout(null);
//        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/logo.jpg"));
        jf.setLayout(null);
        Image img1=img.getImage().getScaledInstance(850,800 , Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img1);
        l1=new JLabel(img3);
        l1.setBounds(0,0,850,800);
        jf.add(l1);
        
        jt1=new JTextField(20);
        jt1.setBounds(143,270,350,90);
        jt1.setBackground(Color.black);
        Font f=new Font("arial",Font.BOLD,20);
        jt1.setFont(f);
        jt1.setForeground(Color.white);
        jt1.setLayout(null);
        jf.add(jt1);
        
        //For clearing Data in JFrame;
        
        jb1=new JButton("Reset");
        jb1.setBounds(156,460,95,30);
        jb1.addActionListener(this);
        jb1.setBackground(Color.gray);
        jb1.setForeground(Color.white);
        l1.add(jb1);
        
        
        jb2=new JButton("Pay");
        jb2.setBounds(346,460,95,30);
        jb2.addActionListener(this);
        jb2.setBackground(Color.gray);
        jb2.setForeground(Color.white);
        l1.add(jb2);
        
        
        //----------------------------
//        Buttons from 1 to 9
        
        b1=new JButton("1");
        b1.setBounds(156,370,50,30);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
        l1.add(b1);
        
   
         b2=new JButton("2");
        b2.setBounds(216,370,50,30);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
        l1.add(b2);
        
         b3=new JButton("3");
        b3.setBounds(277,370,50,30);
        b3.setBackground(Color.gray);
        b3.setForeground(Color.white);
        l1.add(b3);
        
         b4=new JButton("4");
        b4.setBounds(336,370,50,30);
        b4.setBackground(Color.gray);
        b4.setForeground(Color.white);
        
        l1.add(b4);
        
         b5=new JButton("5");
        b5.setBounds(396,370,50,30);
        b5.setBackground(Color.gray);
        b5.setForeground(Color.white);
        l1.add(b5);
        
         b6=new JButton("6");
        b6.setBounds(156,420,50,30);
        b6.setBackground(Color.gray);
        b6.setForeground(Color.white);
        l1.add(b6);
        
         b7=new JButton("7");
        b7.setBounds(216,420,50,30);
        b7.setBackground(Color.gray);
        b7.setForeground(Color.white);
        l1.add(b7);
        
         b8=new JButton("8");
        b8.setBounds(277,420,50,30);
        b8.setBackground(Color.gray);
        b8.setForeground(Color.white);
        l1.add(b8);
        
         b9=new JButton("9");
        b9.setBounds(336,420,50,30);
        b9.setBackground(Color.gray);
        b9.setForeground(Color.white);
        l1.add(b9);
        
         b0=new JButton("0");
        b0.setBounds(396,420,50,30);
        b0.setBackground(Color.gray);
        b0.setForeground(Color.white);
        l1.add(b0);
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        
        
        
        
        
        
        
        //----------------------------------
        
        //------------------------------------
        
        //Account Details
        
       
        AC=new JLabel("Account Information");
        AC.setBounds(15,5,220,30);
        AC.setBackground(Color.BLACK);
        AC.setForeground(Color.WHITE);
        AC.setOpaque(true);
        AC.setFont(new Font("",Font.BOLD,15));
        l1.add(AC);
        C=new JLabel("Card NO: "+card);
        C.setForeground(Color.WHITE);
         C.setBackground(Color.gray);
        C.setOpaque(true);
        C.setBounds(15,35,220,30);
        l1.add(C);
        
        P=new JLabel("Pin no: "+pin);
        P.setForeground(Color.WHITE);
         P.setBackground(Color.gray);
        P.setOpaque(true);
        P.setBounds(15,65,220,30);
        l1.add(P);
        
        A=new JLabel("Aadhar no: "+Aadhar);
        A.setForeground(Color.WHITE);
         A.setBackground(Color.gray);
        A.setOpaque(true);
        A.setBounds(15,95,220,30);
        l1.add(A);
        
        T=new JLabel("Account: "+Type);
        T.setForeground(Color.WHITE);
         T.setBackground(Color.gray);
        T.setOpaque(true);
        T.setBounds(15,125,220,30);
        l1.add(T);
       
        
        E=new JLabel("");
        E.setBackground(Color.black);
        E.setOpaque(true);
        E.setBounds(15,155,220,5);
        l1.add(E);
       
        
        //-----------------------------------------
        
        S=new JButton("Sign out");
        S.setBounds(700,5,100,30);
        S.setBackground(Color.BLACK);
        S.addActionListener(this);
        S.setForeground(Color.white);
        l1.add(S);
        
        AS=new JButton("Account");
        AS.setBounds(700,40,100,30);
        AS.setBackground(Color.BLACK);
        AS.addActionListener(this);
        AS.setForeground(Color.white);
        l1.add(AS);
        
        TH=new JButton("Transactions");
        TH.setBounds(623,225,175,32);
        TH.setBackground(Color.BLACK);
        TH.addActionListener(this);
        TH.setForeground(Color.white);
        l1.add(TH);
        
        
        
        
        R=new JLabel("Receiver Account ID");
        R.setBounds(90,220,120,30);
        R.setForeground(Color.WHITE);
        l1.add(R);
        
        jt3=new JTextField();
        jt3.setBounds(230,220,200,30);
        jt3.setBackground(Color.GRAY);
        jt3.setForeground(Color.WHITE);
        jt3.setOpaque(true);
        l1.add(jt3);
        
        
        



     jf.setDefaultCloseOperation(3);
     jf.setLocation(300,0);
     jf.setVisible(true);
        
        
    }
    
    
    
    
    
    
    
    
    //-------------------------------------------------------------------------------------
    
    public void actionPerformed(ActionEvent e){
      
//       System.out.print(count);
        //------------------------------
        String MyAccount=null;
        int MyMoney=0;
        String ReceiverAccount=null;
        String ReceiverAccount1=null;
        int ReceiverMoney=0;
        
        
        
        //---------------------------
        JOptionPane jp=new JOptionPane();
        String js=jt1.getText();
        if(e.getSource()==jb1){
            jt1.setText("");
            
        }
        
//        if(e.getSource()==AS){
//             
//   
//           
//            
//            
//            
//        }
        //-------------------------------------
        
        if(e.getSource()==b1){
            jt1.setText(jt1.getText()+"1");
        }
        if(e.getSource()==b2){
            jt1.setText(jt1.getText()+"2");
        }
        if(e.getSource()==b3){
            jt1.setText(jt1.getText()+"3");
        }
        if(e.getSource()==b4){
            jt1.setText(jt1.getText()+"4");
        }
        if(e.getSource()==b5){
            jt1.setText(jt1.getText()+"5");
        }
        if(e.getSource()==b6){
            jt1.setText(jt1.getText()+"6");
        }
        if(e.getSource()==b7){
            jt1.setText(jt1.getText()+"7");
        }
        if(e.getSource()==b8){
            jt1.setText(jt1.getText()+"8");
        }
        if(e.getSource()==b9){
            jt1.setText(jt1.getText()+"9");
        }
        if(e.getSource()==b0){
            jt1.setText(jt1.getText()+"0");
        }
        
        //-------------------------------------
        if(e.getSource()==S){
            jf.setVisible(false);
            Login l=new Login();
            l.jt1.setText("");
            l.jt2.setText("");
        }
        if(e.getSource()==AS){
           count++;
            if(count%2==0){
                AC.setVisible(true);
                A.setVisible(true);
                P.setVisible(true);
                C.setVisible(true);
                T.setVisible(true);
                E.setVisible(true);

                
            }
            else{

                AC.setVisible(false);
                A.setVisible(false);
                P.setVisible(false);
                C.setVisible(false);
               T.setVisible(false);
                E.setVisible(false);
                
                
                
                

            }
                
        }
        if(e.getSource()==TH){
            TransactionHistory t=new TransactionHistory(card);
            t.displayHistory();
            
            
        }
        
        //-----------------------------------
        try{
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","amol@1234");
        Statement smt=con.createStatement();
        
        //-------------------------------------------------------------------------------------
        if(e.getSource()==jb2){
            String str1=jt1.getText();
            Boolean b=true;
            for(int i=0;i<js.length();i++){
                if(Character.isAlphabetic(js.charAt(i))){
                    b=false;
                    break;
                }
                
            }
            if(b==false){
       
                jp.showMessageDialog(null,"Please Enter digits only ");
            }
            else{
                int ammount=Integer.parseInt(str1);
                String me="select * from UserBalance where accountno='"+card+"'";
                PreparedStatement pst = con.prepareStatement(me);
                ResultSet res1 = pst.executeQuery();
                
               while(res1.next()){
                   
                   MyAccount=res1.getString(1);
                   MyMoney=res1.getInt(2);
                    
                    
                }
               System.out.print(MyAccount);
               if(MyAccount==null){
                   jp.showMessageDialog(null,"You haven't added money");
               }
               else{
                   String rec1="select * from UserBalance where accountno='"+card+"'";
                        PreparedStatement pst1 = con.prepareStatement(rec1);
                       ResultSet res2 = pst1.executeQuery();
                       while(res2.next()){
                           MyMoney=res2.getInt(2);
                       }
                   
                   ReceiverAccount1=jt3.getText();
                   if(ReceiverAccount1.equals(card)){
                       jp.showMessageDialog(null,"You have entered your account please enter different");
                       
                   }
                   else{
                       String rec2="select * from UserBalance where accountno='"+ReceiverAccount1+"'";
                        PreparedStatement pst2 = con.prepareStatement(rec2);
                       ResultSet res3 = pst2.executeQuery();
                       while(res3.next()){
                           ReceiverAccount=res3.getString(1);
                           ReceiverMoney=res3.getInt(2);
                           
                           
                       }
                               
                       
                       String trans=jt1.getText();
                       int transfer=Integer.parseInt(trans);
                       if(MyMoney<transfer ){
                          jp.showMessageDialog(null,"Balance is not sufficient to transfer"); 
                       }
                       else if(transfer<=0){
                            jp.showMessageDialog(null,"Please enter valid amount to transfer"); 
                           
                       }
//                       System.out.print(ReceiverAccount);
//                       System.out.print(ReceiverAccount1);
                       
                      
                           else if(ReceiverAccount==null) {
                               
//                         
                           String rec3="select * from account where accountno='"+ReceiverAccount1+"'";
                           PreparedStatement pst3 = con.prepareStatement(rec3);
                          ResultSet res4 = pst3.executeQuery();
                          
                          while(res4.next()){
                              ReceiverAccount=res4.getString(2);
                          }
                          if(ReceiverAccount==null){
                              jp.showMessageDialog(null,"User with account "+ReceiverAccount1+" not exist"); 
                          
                           
                       }
                          else{
                               
                           MyMoney=MyMoney-transfer;
                              
                              String rec4="insert into UserBalance (accountno,ammount) values('"+ReceiverAccount+"','"+transfer+"')";
                              smt.execute(rec4);
                             String forme="update UserBalance set ammount="+MyMoney+" where accountno='"+MyAccount+"'";
                             smt.execute(forme);
                             jp.showMessageDialog(null,"Money is transferred"); 
                             String Transaction="insert into "+card+"(receiveraccount,moneytransfered)"+" values('"+ReceiverAccount+"',"+transfer+")";
                             smt.execute(Transaction);
                             
                             
                             
                              
                          }
                              
                              
                          }
                       else if(ReceiverAccount1.equals(ReceiverAccount)){
                           
                           ReceiverMoney=ReceiverMoney+transfer;
                           MyMoney=MyMoney-transfer;
                           
                           String forme="update UserBalance set ammount="+MyMoney+" where accountno='"+MyAccount+"'";
                           String forrec="update UserBalance set ammount="+ReceiverMoney+" where accountno='"+ReceiverAccount+"'";
                           smt.execute(forme);
                           smt.execute(forrec);
                           jp.showMessageDialog(null,"Money is transferred"); 
                           String Transaction="insert into "+card+"(receiveraccount,moneytransfered)"+" values('"+ReceiverAccount+"',"+transfer+")";
                             smt.execute(Transaction);
                           
                       }
                       
                       
                       
                   }
                   
                   
                    
               }
                
                
                
                
                
                }
                
                
                
                
                
            }
        
        //--------------------------------------------------------------------------------
        
        
        }
            
        
        
        catch(Exception exc){
            System.out.print("Exception");
        
        }
        
        
        
        
        
        
        
        
        
        
        
        //------------------------
        
    }
    
    
    
}
