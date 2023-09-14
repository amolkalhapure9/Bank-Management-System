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


public class TransactionHistory implements ActionListener  {
    String card=null;
    JLabel[] jl=new JLabel[100];
    JLabel jl1;
    JFrame jf;
    JButton jb;
    JTextField jt;
    TransactionHistory(String card){
        this.card=card;
    }
    public void displayHistory() {
        jf=new JFrame("Transactions");
       jf.setLayout(null);
       
        jf.setDefaultCloseOperation(3);
        jf.setSize(800,800);
        
        jl1=new JLabel("Transaction History");
        jl1.setBounds(50,20,300,30);
        jl1.setBackground(Color.BLACK);
        jl1.setForeground(Color.WHITE);
        jl1.setOpaque(true);
        jf.add(jl1);
        
        jt=new JTextField();
        jt.setBounds(370,20,50,30);
        jf.add(jt);
        
        jb=new JButton("Rows");
        jb.setBounds(430,20,80,30);
        jb.addActionListener(this);
        jf.add(jb);
        
       
        
        
        
        
        
        
        
        
        jf.setVisible(true);
        
        
        
         
        
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb){
            try{
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","amol@1234");
//               Statement smt=con.createStatement();

               String str="select * from "+card;
               PreparedStatement pr=con.prepareStatement(str);
              ResultSet res2 = pr.executeQuery();
             int i=0;
             int y=55;
              while(res2.next()){
                  String account=res2.getString(1);
                  int amount=res2.getInt(2);
                  jl[i]=new JLabel("       "+account+"                                       |                 "+amount+"");
                  jl[i].setBounds(50,y,300,30);
                  jl[i].setBackground(Color.gray);
                  jl[i].setForeground(Color.WHITE);
                  jl[i].setOpaque(true);
                  
                  jf.add(jl[i]);
                  i++;
                  y=y+30;

                  
                  
                  
              }
               
                
                
                
                
            }
                
            
            catch(Exception exc){
                System.out.print("Exception occured" +exc);
        }
        
    }
    }
    
    
}
