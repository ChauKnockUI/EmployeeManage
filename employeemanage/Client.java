/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeemanage;

import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Client extends javax.swing.JFrame implements Runnable {

    Socket socket;
    DataInputStream in;
    DataOutputStream out;
    static DefaultListModel listModel;
    String name = "";

    /**
     * Creates new form Client
     */
    public Client(String name) throws IOException {
        this.name = name;
        socket = new Socket("localhost", 1309);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF(this.name);
        this.setTitle(name);
        System.out.println("Client:" + this.name);

        initComponents();

        setLocationRelativeTo(null);
        listModel = new DefaultListModel<String>();
        listModel.addElement("(mọi người)");

        jList.setModel(listModel);
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (socket != null) {
                    String tt = in.readUTF();
                    switch (tt) {
                        case "add":
//                            Nhan ten
                            String name = in.readUTF();
                            txtArea.append("\n[" + name + "] is connected");
                            listModel.addElement(name);
                            break;
                        case "insert":
                            int size = in.readInt();
                            if (size > 0) {
                                for (int i = 0; i < size; i++) {
                                    listModel.addElement(in.readUTF());
                                }
                            }
                            break;
                        case "ReceiveFile":
                            String senderName = in.readUTF();
                            String fileName = in.readUTF();
                            long fileSize = in.readLong();
                            if (JOptionPane.showConfirmDialog(this, "From: "+senderName+"\n"+"Bạn có muốn tải file \"" + fileName + "\" không?", "Xác nhận tải file", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                                // Hiển thị hộp thoại chọn vị trí lưu file
                                JFileChooser fileChooser = new JFileChooser();
                                fileChooser.setSelectedFile(new File(fileName));
                                int result = fileChooser.showSaveDialog(this);

                                if (result == JFileChooser.APPROVE_OPTION) {
                                    File saveFile = fileChooser.getSelectedFile();

                                    // Nhận dữ liệu file từ máy chủ và lưu file
                                    FileOutputStream fos = new FileOutputStream(saveFile);
                                    byte[] buffer = new byte[1024];
                                    int bytesRead;
                                    long totalBytesRead = 0;
                                    while (totalBytesRead < fileSize && (bytesRead = in.read(buffer, 0, (int) Math.min(buffer.length, fileSize - totalBytesRead))) != -1) {
                                        fos.write(buffer, 0, bytesRead);
                                        totalBytesRead += bytesRead;
                                    }
                                    fos.close();

                                    JOptionPane.showMessageDialog(null, "File received successfully from " + senderName, "Success", JOptionPane.INFORMATION_MESSAGE);

                                    // Thêm tin nhắn vào khung chat để thông báo
                                    txtArea.append("\n[" + senderName + "] sent a file: " + fileName);
                                }
                            }
                            break;

                        case "remove":
                            String name1 = in.readUTF();
                            listModel.removeElement(name1);
                            txtArea.append("\n[" + name1 + "] has left the room");
                            break;
                        case "Send":
                            String m = in.readUTF();
                            txtArea.append("\n" + m);
                            break;
                        case "SendPM":
                            String m1 = in.readUTF();
                            txtArea.append("\n" + m1);
                            break;
                    }
                }

            } catch (IOException ex) {
//                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        txtText = new javax.swing.JTextField();
        btnSendFile = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtArea.setRows(5);
        txtArea.setText("Welcome!");
        txtArea.setEnabled(false);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 17, 448, 290));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("List Chatter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 14, -1, -1));

        jScrollPane2.setViewportView(jList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 45, 208, 262));

        txtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTextKeyPressed(evt);
            }
        });
        getContentPane().add(txtText, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 319, 448, 62));

        btnSendFile.setBackground(new java.awt.Color(204, 255, 255));
        btnSendFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/google-docs.png"))); // NOI18N
        btnSendFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSendFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSendFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFileActionPerformed(evt);
            }
        });
        getContentPane().add(btnSendFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 60, 40));

        btnSend.setBackground(new java.awt.Color(255, 255, 51));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/send.png"))); // NOI18N
        btnSend.setText("Send");
        btnSend.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 326, 118, 46));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Downloads\\log-out.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 7, 40, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backgroud.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 403));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // TODO add your handling code here:
            out.writeUTF("Cancel");
            socket.close();
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (name.equals("")) {
//                btnStart.doClick();
//            } else {
//                btnSend.doClick();
//            }
//        }
    }//GEN-LAST:event_txtTextKeyPressed

    private void btnSendFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            sendFile(selectedFile);
            // Hiển thị thông báo trên khung chat của client gửi
            String message = "You sent a file: " + selectedFile.getName();
            txtArea.append("\n" + message);
        }
    }//GEN-LAST:event_btnSendFileActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.dispose();
        try {
            // TODO add your handling code here:
            out.writeUTF("Cancel");
            socket.close();
     
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String mess = txtText.getText();
        int i = jList.getSelectedIndex() - 1;

        if (i < 0) {
            try {
                txtText.setText("");
                out.writeUTF("Send");
                out.writeUTF(mess);
                out.writeUTF(name);
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                txtText.setText("");
                out.writeUTF("SendPM");
                out.writeUTF(mess);
                out.writeInt(i);
                out.writeUTF(name);
                txtArea.append("\n[PM to " + jList.getSelectedValue() + "] " + mess);
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    static javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtText;
    // End of variables declaration//GEN-END:variables

    private void sendFile(File file) {
        try {

            out.writeUTF("SendFile"); // Gửi yêu cầu gửi file đến máy chủ
            out.writeUTF(file.getName()); // Gửi tên file đến máy chủ
            out.writeLong(file.length()); // Gửi kích thước file đến máy chủ

            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead); // Gửi từng phần dữ liệu của file đến máy chủ
            }
            fileInputStream.close();
            JOptionPane.showMessageDialog(this, "File sent successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to send file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
