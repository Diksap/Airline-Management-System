/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline.system;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.*;
import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
/**
 *
 * @author BHAVESH
 */
public class CheckFlightDetails extends javax.swing.JFrame {
      
      Connection con;
      Statement s;
      ResultSet rs;
      PreparedStatement pst;
                
    /**
     * Creates new form CheckFlightDetails
     */
    public CheckFlightDetails() {
       initComponents();
      FillcomboSource();
      FillcomboDestination();

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDestination = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFare = new javax.swing.JTextField();
        jTextFieldNo = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldSource = new javax.swing.JTextField();
        jTextFieldDestination = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jComboBoxSource = new javax.swing.JComboBox<>();
        jButtonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Check Flight Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 30, 450, 60);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Select Destination          :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 200, 290, 40);

        jComboBoxDestination.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBoxDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinationActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDestination);
        jComboBoxDestination.setBounds(380, 210, 170, 30);

        jButtonSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Documents\\NetBeansProjects\\Airline System\\Icon\\Search-removebg-preview (3).png")); // NOI18N
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSearch);
        jButtonSearch.setBounds(620, 270, 50, 50);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Select Source                  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 130, 290, 40);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Flight No           :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(840, 130, 190, 40);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Flight Name      :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(840, 200, 190, 40);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Source               :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(840, 270, 190, 40);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Destination       :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(840, 340, 190, 40);

        jTextFieldFare.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldFare.setFocusCycleRoot(true);
        getContentPane().add(jTextFieldFare);
        jTextFieldFare.setBounds(1090, 410, 190, 30);

        jTextFieldNo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldNo);
        jTextFieldNo.setBounds(1090, 130, 190, 30);

        jTextFieldName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldName);
        jTextFieldName.setBounds(1090, 200, 190, 30);

        jTextFieldSource.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldSource);
        jTextFieldSource.setBounds(1090, 270, 190, 30);

        jTextFieldDestination.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldDestination);
        jTextFieldDestination.setBounds(1090, 340, 190, 30);

        jButtonAdd.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jButtonAdd.setText("CUSTOMER WANT TO BOOK TICKET");
        jButtonAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jButtonAdd.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButtonAddPropertyChange(evt);
            }
        });
        getContentPane().add(jButtonAdd);
        jButtonAdd.setBounds(60, 530, 810, 60);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setText("Fare                   :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(840, 410, 190, 40);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setText("Enter Journey Date        :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 270, 270, 40);

        jTextFieldDate.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDateFocusLost(evt);
            }
        });
        getContentPane().add(jTextFieldDate);
        jTextFieldDate.setBounds(380, 280, 200, 30);

        jComboBoxSource.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jComboBoxSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSourceActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxSource);
        jComboBoxSource.setBounds(380, 140, 170, 30);

        jButtonCancel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jButtonCancel.setText("CANCEL");
        jButtonCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jButtonCancel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButtonCancelPropertyChange(evt);
            }
        });
        getContentPane().add(jButtonCancel);
        jButtonCancel.setBounds(920, 530, 310, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Desktop\\Airline-Management-System\\Icons\\mainpage.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -70, 1590, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     //JComboBox jComboBoxSource=new JComboBox();


    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
              
       try
       {
              Connection con = DriverManager.getConnection("jdbc:mysql:///ams","root",""); 
              String S=(String)jComboBoxSource.getSelectedItem();
              String sql="select Flight_No,Flight_Name,Source,Destination,Fare from flight where Source=?";
              pst=con.prepareStatement(sql);
              pst.setString(1,S);
              
              rs=pst.executeQuery();
              if(rs.next())
              {
                     String add1=rs.getString("Flight_No");
                     jTextFieldNo.setText(add1);

                     String add2=rs.getString("Flight_Name");
                     jTextFieldName.setText(add2);

                     String add3=rs.getString("Source");
                     jTextFieldSource.setText(add3);
                    
                     String add4=rs.getString("Destination");
                     jTextFieldDestination.setText(add4);

                     String add5=rs.getString("Fare");
                     jTextFieldFare.setText(add5);
              }
              
              
                 
                 
              
       }
       catch(Exception e)
       {
             JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        AddCustomer a=new AddCustomer();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonAddPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonAddPropertyChange
        jButtonAdd.setOpaque(false);
        jButtonAdd.setContentAreaFilled(false);
        
    }//GEN-LAST:event_jButtonAddPropertyChange

    private void jTextFieldDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDateFocusGained
      
    }//GEN-LAST:event_jTextFieldDateFocusGained

    private void jTextFieldDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDateFocusLost
      
    }//GEN-LAST:event_jTextFieldDateFocusLost

    private void jComboBoxSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSourceActionPerformed

    private void jComboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDestinationActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        //System.exit(0);
        EmployeeMenu1 a= new EmployeeMenu1();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCancelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonCancelPropertyChange
        jButtonCancel.setOpaque(false);
        jButtonCancel.setContentAreaFilled(false);
        
    }//GEN-LAST:event_jButtonCancelPropertyChange
/**/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckFlightDetails().setVisible(true);
            }
        });
    }
 private void FillcomboSource()
{
        try
       {
                Connection con = DriverManager.getConnection("jdbc:mysql:///ams","root",""); 
                String sql="Select * from flight";
                PreparedStatement pst=con.prepareStatement(sql);
                rs=pst.executeQuery();
 
               while(rs.next())
               {    
                      String source=rs.getString("Source");
                      jComboBoxSource.addItem(source);
                }           
       }
       catch(Exception e)
       {
                  JOptionPane.showMessageDialog(null,e);
      }
}
private void FillcomboDestination()
{
        try
       {
                Connection con = DriverManager.getConnection("jdbc:mysql:///ams","root",""); 
                String sql="Select * from flight";
                PreparedStatement pst=con.prepareStatement(sql);
                rs=pst.executeQuery();
 
               while(rs.next())
               {    
                      String des=rs.getString("Destination");
                      jComboBoxDestination.addItem(des);
                }           
       }
       catch(Exception e)
       {
                  JOptionPane.showMessageDialog(null,e);
      }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxDestination;
    private javax.swing.JComboBox<String> jComboBoxSource;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField jTextFieldDate;
    public static javax.swing.JTextField jTextFieldDestination;
    public static javax.swing.JTextField jTextFieldFare;
    public static javax.swing.JTextField jTextFieldName;
    public static javax.swing.JTextField jTextFieldNo;
    public static javax.swing.JTextField jTextFieldSource;
    // End of variables declaration//GEN-END:variables
}
