/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeemanage;

import database.clsConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Create extends javax.swing.JFrame {

    /**
     * Creates new form Create
     */ 
    public Create() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCreate = new javax.swing.JTextField();
        txtCreateUsername = new javax.swing.JTextField();
        passCreate = new javax.swing.JPasswordField();
        passCreateConfirm = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCreateLogIn = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Create an Account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 183, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 60, 60, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 100, 60, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 140, 57, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Confirm Password:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 180, 105, 16);
        jPanel1.add(txtIdCreate);
        txtIdCreate.setBounds(180, 60, 167, 30);
        jPanel1.add(txtCreateUsername);
        txtCreateUsername.setBounds(180, 100, 167, 30);
        jPanel1.add(passCreate);
        passCreate.setBounds(180, 140, 167, 30);

        passCreateConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passCreateConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(passCreateConfirm);
        passCreateConfirm.setBounds(180, 180, 167, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circled-user-icon-user-pro-icon-11553397069rpnu1bqqup (4).png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 100, 28, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kisspng-scalable-vector-graphics-logo-password-computer-ic-key-password-login-signin-svg-png-icon-free-downlo-5beb38753afe96.7032844215421420692417 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 140, 28, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pngtree-keyhole-icon-png-image_5091661.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 180, 28, 25);

        btnCreateLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        btnCreateLogIn.setText("Log In");
        btnCreateLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLogInActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateLogIn);
        btnCreateLogIn.setBounds(40, 240, 94, 23);

        btnCreate.setBackground(new java.awt.Color(102, 255, 255));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate);
        btnCreate.setBounds(240, 240, 96, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroud (3).png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(-87, -4, 470, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
            if (JOptionPane.showConfirmDialog(this, "Do you want create an account?") == JOptionPane.NO_OPTION) {
                return;
            }
            if (txtIdCreate.getText().equals("")|| txtCreateUsername.getText().equals("")|| passCreate.getPassword().equals("")||passCreateConfirm.getPassword().equals("")){
                JOptionPane.showMessageDialog(this, "Can't be left blank.");
                return;
            }
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "sa";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);
            String sql = "insert into Account(ID, Username, PassWord) values (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            String pass = String.valueOf(passCreate.getPassword());
            String passConfirm = String.valueOf(passCreateConfirm.getPassword());
            if (!pass.equals(passConfirm)) {
                JOptionPane.showMessageDialog(this, "Confirm Password is in correct.");
                return;
            }
            pstmt.setString(1, txtIdCreate.getText());
            pstmt.setString(2, txtCreateUsername.getText());
            pstmt.setString(3, String.valueOf(passCreateConfirm.getPassword()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Accout saved.");
            pstmt.close();
            conn.close();
            //String id= txtIdCreate.getText();
            //String username= txtCreateUsername.getText();
            //String pass= String.valueOf(passCreate.getPassword());
            //String passConfirm= String.valueOf(passCreateConfirm.getPassword());
            //if (!pass.equals(passConfirm)){
            //    JOptionPane.showMessageDialog(this, "Confirm Password is in correct.");
            //    return;
            //          }
            //String sql= "insert into Account(ID, Username, PassWord) values( "+id+" , "+ username+" , "+pass+")";
            //connect.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCreateLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLogInActionPerformed
        // TODO add your handling code here:
        Login lg= new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreateLogInActionPerformed

    private void passCreateConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passCreateConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passCreateConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passCreate;
    private javax.swing.JPasswordField passCreateConfirm;
    private javax.swing.JTextField txtCreateUsername;
    private javax.swing.JTextField txtIdCreate;
    // End of variables declaration//GEN-END:variables
}
