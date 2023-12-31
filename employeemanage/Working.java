/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeemanage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Working extends javax.swing.JFrame {
     private DefaultTableModel model;
    private String[] columHeaders = new String[]{"ID", "Tên", "Khoa","Ngày", "Điểm danh"};
    /**
     * Creates new form Payroll
     */
    public Working() {
        initComponents();
         setLocationRelativeTo(null);
         model = new DefaultTableModel();
        model.setColumnIdentifiers(columHeaders);
        
        txtNgay.setText(String.valueOf(java.time.LocalDate.now()));
        tblPayroll.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPayroll = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Assign List"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPayroll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPayroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPayrollMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPayrollMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPayroll);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 18, 862, 510));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 103, 880, 533));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 97, 886, 0));

        jLabel13.setBackground(new java.awt.Color(255, 0, 51));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Working");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 230, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log-out.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 37, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loupe.png"))); // NOI18N
        jButton1.setText("Hiển thị");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/calendar (1).png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ngày:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));
        jPanel4.add(txtNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\backgroud (4).png")); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 940, 780));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 910, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadAssignedWork() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://LAPTOP-4J8B3FBI\\SQLEXPRESS:1433;database=QuanLyNhanVien;;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "sa";
            
            Connection conn = DriverManager.getConnection(connectionUrl, username, password);
            String sql = "SELECT NV.ID, NV.Name, NV.Department, DD.Ngay, DD.CoMat  FROM NhanVien AS NV, DiemDanh AS DD Where NV.ID= DD.ID AND Ngay=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDate(1, Date.valueOf(txtNgay.getText()));
            ResultSet rs = pstmt.executeQuery();
             model.setRowCount(0);
            while (rs.next()) {
               String diemDanh="";
               if(rs.getBoolean("CoMat")){
                   diemDanh="Có mặt";
               }
               else diemDanh="Vắng";
          
               
              
                model.addRow(new Object[]{
                    rs.getInt("ID"),
                    rs.getString("Name"),
                    rs.getString("Department"),
                    rs.getDate("Ngay"),
                    diemDanh
                });
                
            }
            model.fireTableDataChanged();
           
        } catch (Exception e) {
        }
    }
    private void tblPayrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPayrollMouseClicked
        // TODO add your handling code here:
        int selectRow = tblPayroll.getSelectedRow();
        if (selectRow >= 0) {

        }
    }//GEN-LAST:event_tblPayrollMouseClicked
    
    private void tblPayrollMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPayrollMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPayrollMousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        AdminLogin adLogin= new AdminLogin();
        adLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadAssignedWork();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Working.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Working.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Working.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Working.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Working().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblPayroll;
    private javax.swing.JTextField txtNgay;
    // End of variables declaration//GEN-END:variables
}
