/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline.system;

//import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author BHAVESH
 */
public class ViewEmployee extends javax.swing.JFrame {

    /**
     * Creates new form ViewEmployee
     */
    public ViewEmployee() {
        initComponents();

        try
        {
            //Class.forName("com.mysql.jdbc.Driver");  
             Connection con = DriverManager.getConnection("jdbc:mysql:///ams","root","");  
             Statement s =con.createStatement();
             String sql="select * from employee";
             ResultSet rs=s.executeQuery(sql);

             while(rs.next())
             {
                String ID=String.valueOf(rs.getInt("Employee_ID"));
                String Name=rs.getString("Employee_Name");
                String Mob=rs.getString("Mobile_No");
                String Address =rs.getString("Address");
                String Age=rs.getString("Age");
                String Aadhar=rs.getString("Adhar_Card_No");

                  String tbData[]={ID,Name,Mob,Address,Age,Aadhar};
                  DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                 tblModel.addRow(tbData);
             }
        }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setText("View All Employee Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 60, 883, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_ID", "Employee_Name", "Mobile_No", "Address", "Age", "Aadhar_Card_No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 160, 1020, 402);

        jButtonCancel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
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
        jButtonCancel.setBounds(500, 600, 310, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\BHAVESH\\Documents\\NetBeansProjects\\Airline System\\Icon\\FlightMenu.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -180, 1450, 1070);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

        AdminMenu1 a= new AdminMenu1();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonCancelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonCancelPropertyChange
        jButtonCancel.setOpaque(false);
        jButtonCancel.setContentAreaFilled(false);
       
    }//GEN-LAST:event_jButtonCancelPropertyChange

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
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
