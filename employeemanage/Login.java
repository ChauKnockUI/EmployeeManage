/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeemanage;


import database.clsConnectDB;
import employeemanage.EmployeeLogin;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLoginCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login in System"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 77, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 77, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Log in");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 108, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 191, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 191, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Do not have an account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 168, 26));

        btnLoginCreate.setBackground(new java.awt.Color(153, 255, 204));
        btnLoginCreate.setText("Create");
        btnLoginCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 97, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circled-user-icon-user-pro-icon-11553397069rpnu1bqqup (4).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 29, 28));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kisspng-scalable-vector-graphics-logo-password-computer-ic-key-password-login-signin-svg-png-icon-free-downlo-5beb38753afe96.7032844215421420692417 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 145, 29, 29));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 80, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sign-in (1).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 110, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroud (3).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 510, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
   
    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        String passWord = new String(txtPassword.getPassword());
        StringBuilder errol = new StringBuilder();
        if (userName.equals("")) {
            errol.append("Username must be entered!\n");
        }
        if (passWord.equals("")) {
            errol.append("The password must be entered!");
        }
        if (errol.length() > 0) {
            JOptionPane.showMessageDialog(this, errol.toString(), "Errol", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "sa";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);
            String sql = "select * from Account where Username=? and PassWord=?";
            PreparedStatement pstm = conn.prepareCall(sql);
            pstm.setString(1, userName);
            pstm.setString(2, passWord);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String sql1 = "SELECT NV.Department FROM Account AS AC, NhanVien AS NV WHERE AC.ID=NV.ID AND AC.Username=? AND NV.Department='Administration'";
                PreparedStatement pstm1 = conn.prepareCall(sql1);

                pstm1.setString(1, userName);
                ResultSet flag = pstm1.executeQuery();
                if (flag.next()) {
                    AdminLogin ad= new AdminLogin();
                    ad.setVisible(true);
                } else {
                    new EmployeeLogin("Hello").setVisible(true);
                    
                }

                this.dispose();
                JOptionPane.showMessageDialog(this, "Logged in successfully.");

            } else {
                JOptionPane.showMessageDialog(this, "Login failed.");
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        txtUserName.setText("");
        txtPassword.setText("");
      
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLoginCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginCreateActionPerformed
        // TODO add your handling code here:
        Create cr = new Create();
        cr.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnLoginCreateActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         String userName = txtUserName.getText();
        String passWord = new String(txtPassword.getPassword());
        StringBuilder errol = new StringBuilder();
        if (userName.equals("")) {
            errol.append("Username must be entered!\n");
        }
        if (passWord.equals("")) {
            errol.append("The password must be entered!");
        }
        if (errol.length() > 0) {
            JOptionPane.showMessageDialog(this, errol.toString(), "Errol", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "sa";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);
            String sql = "select * from Account where Username=? and PassWord=?";
            PreparedStatement pstm = conn.prepareCall(sql);
            pstm.setString(1, userName);
            pstm.setString(2, passWord);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                String sql1 = "SELECT NV.Department FROM Account AS AC, NhanVien AS NV WHERE AC.ID=NV.ID AND AC.Username=? AND NV.Department='Administration'";
                PreparedStatement pstm1 = conn.prepareCall(sql1);

                pstm1.setString(1, userName);
                ResultSet flag = pstm1.executeQuery();
                if (flag.next()) {
                    AdminLogin ad= new AdminLogin();
                    ad.setVisible(true);
                } else {
                    String sql2="Select ID from Account Where Username=?";
                    PreparedStatement pstm2= conn.prepareCall(sql2);
                    pstm2.setString(1, userName);
                    ResultSet getID= pstm2.executeQuery();
                    String ID= String.valueOf(rs.getString("ID"));
                    EmployeeLogin emLg = new EmployeeLogin(ID);
                    emLg.setVisible(true);
                }

                this.dispose();
                JOptionPane.showMessageDialog(this, "Logged in successfully.");

            } else {
                JOptionPane.showMessageDialog(this, "Login failed.");
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoginCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}