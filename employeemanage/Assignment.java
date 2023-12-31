/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeemanage;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class Assignment extends javax.swing.JFrame {

    /**
     * Creates new form Assignment
     */
    public Assignment() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtMissionID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCbbIDEMployAssignment = new javax.swing.JComboBox<>();
        jCbbDepartmentAssignment = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jBtnSendAssignment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTxtNameEmAssign = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtMissionName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/identify (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 30, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, 20));
        jPanel1.add(jTxtMissionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 230, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("ASSIGNMENT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 240, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/down-right.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 30, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mission ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Department :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/portfolio (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 30, 30));

        jCbbIDEMployAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbbIDEMployAssignmentActionPerformed(evt);
            }
        });
        jPanel1.add(jCbbIDEMployAssignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 230, -1));

        jCbbDepartmentAssignment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounting", "Financial", "Administration", "Sales", " " }));
        jPanel1.add(jCbbDepartmentAssignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 230, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log-out.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 37, 30));

        jBtnSendAssignment.setBackground(new java.awt.Color(255, 204, 255));
        jBtnSendAssignment.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnSendAssignment.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSendAssignment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/send.png"))); // NOI18N
        jBtnSendAssignment.setText("Send");
        jBtnSendAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSendAssignmentActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSendAssignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Mission Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, 20));

        jTxtNameEmAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNameEmAssignActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtNameEmAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("ID Employee:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, 20));
        jPanel1.add(jTxtMissionName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 230, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hierarchical-structure.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 30, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\backgroud (3).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 620, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        AdminLogin adLogin= new AdminLogin();
        adLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jCbbIDEMployAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbbIDEMployAssignmentActionPerformed
        // TODO add your handling code here:
        try {
            
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jCbbIDEMployAssignmentActionPerformed
    

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "sa";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "SELECT NV.ID from NhanVien AS NV, Khoa AS K Where K.Department=NV.Department AND K.Department=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(jCbbDepartmentAssignment.getSelectedItem()));
            ResultSet rs= pstmt.executeQuery();
            ArrayList <String> list= new ArrayList<String>();
            jCbbIDEMployAssignment.removeAllItems();
            while(rs.next()){
                list.add(rs.getString("ID"));
            }
            
            for(String item: list){
                jCbbIDEMployAssignment.addItem(item.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jBtnSendAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSendAssignmentActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "sa";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "INSERT INTO CongViec(MaCV,TenCV,ID,NguoiPhuTrach) VALUES (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(jTxtMissionID.getText()));
            pstmt.setString(2, jTxtMissionName.getText());
            pstmt.setInt(3, Integer.parseInt(String.valueOf(jCbbIDEMployAssignment.getSelectedItem())));
            pstmt.setString(4, jTxtNameEmAssign.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Successful Assignment");
            pstmt.close();
            conn.close();
           
           
            

        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jBtnSendAssignmentActionPerformed

    private void jTxtNameEmAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNameEmAssignActionPerformed
        // TODO add your handling code here:
        jTxtNameEmAssign.setText("9,5 diem");
    }//GEN-LAST:event_jTxtNameEmAssignActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "sa";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "SELECT NV.Name from NhanVien AS NV Where NV.ID=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(jCbbIDEMployAssignment.getSelectedItem()));
            ResultSet rs= pstmt.executeQuery();
            
           
            while(rs.next()){
                jTxtNameEmAssign.setText(String.valueOf(rs.getString("Name")));
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSendAssignment;
    private javax.swing.JComboBox<String> jCbbDepartmentAssignment;
    private javax.swing.JComboBox<String> jCbbIDEMployAssignment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtMissionID;
    private javax.swing.JTextField jTxtMissionName;
    private javax.swing.JTextField jTxtNameEmAssign;
    // End of variables declaration//GEN-END:variables
}
