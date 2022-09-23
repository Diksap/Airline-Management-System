/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package airline.system;


import static airline.system.AddCustomer.jTextFieldId;
import javax.swing.JOptionPane;
import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author BHAVESH
 */
public class AddEmployee extends javax.swing.JFrame {

    /** Creates new form AddEmployee */
    public AddEmployee() {
        initComponents();
        autoId();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldMob = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAadhar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setText("Add Employee Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 620, 80);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Employee Age                 :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 350, 270, 40);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText(" Employee ID                  :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 130, 270, 40);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Employee Name              :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 180, 280, 40);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Employee Mob No           :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 240, 270, 40);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Employee Address          :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 300, 270, 40);

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
        jButtonCancel.setBounds(470, 510, 310, 60);

        jButtonAdd.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jButtonAdd.setText("ADD DETAILS");
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
        jButtonAdd.setBounds(100, 510, 310, 60);

        jTextFieldAge.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextFieldAgeMouseReleased(evt);
            }
        });
        jTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgeActionPerformed(evt);
            }
        });
        jTextFieldAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAgeKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldAge);
        jTextFieldAge.setBounds(460, 360, 210, 30);

        jTextFieldId.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldId.setEnabled(false);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(460, 140, 210, 30);

        jTextFieldName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldName);
        jTextFieldName.setBounds(460, 190, 210, 30);

        jTextFieldMob.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldMob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextFieldMobMouseReleased(evt);
            }
        });
        jTextFieldMob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMobKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldMob);
        jTextFieldMob.setBounds(460, 250, 210, 30);

        jTextFieldAddress.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextFieldAddressMouseReleased(evt);
            }
        });
        jTextFieldAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAddressKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldAddress);
        jTextFieldAddress.setBounds(460, 310, 210, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Employee Aadhar No      :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 400, 270, 40);

        jTextFieldAadhar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextFieldAadhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextFieldAadharMouseReleased(evt);
            }
        });
        jTextFieldAadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAadharActionPerformed(evt);
            }
        });
        jTextFieldAadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAadharKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldAadhar);
        jTextFieldAadhar.setBounds(460, 410, 210, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Documents\\NetBeansProjects\\Airline System\\Icon\\MainPage.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 0, 1450, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

        AdminMenu1 a= new AdminMenu1();
        a.setVisible(true);       
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonAddPropertyChange
        jButtonAdd.setOpaque(false);
        jButtonAdd.setContentAreaFilled(false);
        
    }//GEN-LAST:event_jButtonAddPropertyChange

    private void jButtonCancelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonCancelPropertyChange
        jButtonCancel.setOpaque(false);
        jButtonCancel.setContentAreaFilled(false);
        
    }//GEN-LAST:event_jButtonCancelPropertyChange
                                   
                             
                                          
                                   

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
       if(jTextFieldAadhar.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Aadhar Number","swing Tester",JOptionPane.WARNING_MESSAGE);
        }
       try
      {
               Class.forName("com.mysql.jdbc.Driver");  
               Connection conn = DriverManager.getConnection("jdbc:mysql:///ams","root","");  

               String sql="insert into employee values(?, ?, ?, ?, ?, ?)";
               PreparedStatement pstmt=conn.prepareStatement(sql);
                pstmt.setInt(1,Integer.parseInt(jTextFieldId.getText()));
                pstmt.setString(2,jTextFieldName.getText());
                pstmt.setString(3,jTextFieldMob.getText());
               pstmt.setString(4,jTextFieldAddress.getText());
               pstmt.setString(5,jTextFieldAge.getText());
               pstmt.setString(6,jTextFieldAadhar.getText());

              pstmt.executeUpdate();
              JOptionPane.showMessageDialog(null,"Data Successfully Inserted in Table");
              conn.close();
      }
      catch(Exception e)
     {
           JOptionPane.showMessageDialog(null,e);
      }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeActionPerformed

    private void jTextFieldAadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAadharActionPerformed
//Validation for Age
    private void jTextFieldAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAgeKeyPressed
        String age=jTextFieldAge.getText();
       
        int length=age.length();
        
      

       if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
       {
            if(length<2)
            {
                jTextFieldAge.setEditable(true);
            }
            else
            {
                jTextFieldAge.setEditable(false);
            }
       }
       else
       {    //allow backspace 
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                   jTextFieldAge.setEditable(true);
            }
            else
            {
                   jTextFieldAge.setEditable(false);
            }
       }
    }//GEN-LAST:event_jTextFieldAgeKeyPressed
// Validation for Name
    private void jTextFieldNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyPressed
        char c= evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
               jTextFieldName.setEditable(true);
        }
        else
        {
             jTextFieldName.setEditable(false);
        }
    }//GEN-LAST:event_jTextFieldNameKeyPressed
//Validation for Mobile No
    private void jTextFieldMobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMobKeyPressed
        String mob=jTextFieldMob.getText();
        int length=mob.length();
        char c=evt.getKeyChar();

       if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
       {
            if(length<10)
            {
                jTextFieldMob.setEditable(true);
            }
            else
            {
                jTextFieldMob.setEditable(false);
            }
       }
       else
       {    //allow backspace 
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                   jTextFieldMob.setEditable(true);
            }
            else
            {
                   jTextFieldMob.setEditable(false);
            }
       }
 
    }//GEN-LAST:event_jTextFieldMobKeyPressed
//Validation for Address
    private void jTextFieldAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddressKeyPressed
        char c= evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
               jTextFieldAddress.setEditable(true);
        }
        else
        {
             jTextFieldAddress.setEditable(false);
        }
    }//GEN-LAST:event_jTextFieldAddressKeyPressed
//Validation for Aadhar
    private void jTextFieldAadharKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAadharKeyPressed
       char c=evt.getKeyChar();
        String Aadhar=jTextFieldAadhar.getText();
        int length=Aadhar.length();
        
       if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'|| (Character.isWhitespace(c)))
       {
            if(length<14)//14 = 12 digits for aadhar card no + 2 space
            {
                jTextFieldAadhar.setEditable(true);
            }
            else
            {
                jTextFieldAadhar.setEditable(false);
            }
       }
       else
       {    //allow backspace 
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                   jTextFieldAadhar.setEditable(true);
            }
            else
            {
                   jTextFieldAadhar.setEditable(false);
            }
       }
    }//GEN-LAST:event_jTextFieldAadharKeyPressed

    private void jTextFieldMobMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMobMouseReleased
       if(jTextFieldName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Name","swing Tester",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldMobMouseReleased

    private void jTextFieldAddressMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAddressMouseReleased
       if(jTextFieldMob.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Mobile Number","swing Tester",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldAddressMouseReleased

    private void jTextFieldAgeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAgeMouseReleased
        if(jTextFieldAddress.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Address","swing Tester",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldAgeMouseReleased

    private void jTextFieldAadharMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAadharMouseReleased
        if(jTextFieldAge.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Age","swing Tester",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldAadharMouseReleased

private void autoId() 
{ 
       try 
       {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql:///ams","root",""); 

             String sql="SELECT Employee_ID FROM employee ORDER BY Employee_ID DESC LIMIT 1";
             PreparedStatement pst=con.prepareStatement(sql); 
             ResultSet rs=pst.executeQuery(); 
             if(rs.next()) 
             { 
                 String bid=rs.getString("Employee_ID"); 
                 int n=Integer.parseInt(bid); 
                 n++;
                 String snum=Integer.toString(n);
                 jTextFieldId.setText(snum); 
             }
             else 
            {
                jTextFieldId.setText("1001"); 
            } 
       } 
      catch (Exception e)
       { 
            JOptionPane.showMessageDialog(null, e);
       }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldAadhar;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMob;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

}