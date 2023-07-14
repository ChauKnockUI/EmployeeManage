/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 * @file: Processing.java
 * @date May 28, 2023
 * @version 1.0
 */
public class Processing extends Thread {

    Chatter chatter;

    public Processing(Chatter chatter) {
        this.chatter = chatter;
    }

    @Override
    public void run() {
        String action;
        while (true) {
            try {
                action = chatter.getIn().readUTF();
                if (action.equals("Cancel")) {
                    chatter.getSocket().close();
                    Server.list.remove(chatter);
                    for (Chatter c : Server.list) {
                        c.getOut().writeUTF("remove");
                        c.getOut().writeUTF(chatter.getName());
                    }
                    break;
                } else {
                    switch (action) {
                        case "Send":
                            String mess = chatter.getIn().readUTF();

                            String name = chatter.getIn().readUTF();

                            for (Chatter c : Server.list) {
                                c.getOut().writeUTF("Send");
                                c.getOut().writeUTF("[" + name + "]: " + mess);
                            }
                            break;
                        case "SendPM":
                            String mess1 = chatter.getIn().readUTF();
                            int j = chatter.getIn().readInt();
                            String name1 = chatter.getIn().readUTF();

                            Server.list.get(j).getOut().writeUTF("SendPM");
                            Server.list.get(j).getOut().writeUTF("[PM from " + name1 + "] " + mess1);

                            break;
                        case "SendFile":
    try {
                            // Đọc tên file từ client
                            String fileName = chatter.getIn().readUTF();

                            // Đọc kích thước file từ client
                            long fileSize = chatter.getIn().readLong();

                            // Tạo đối tượng FileOutputStream để ghi nội dung file
                            FileOutputStream fileOutputStream = new FileOutputStream(fileName);

                            // Ghi từng phần dữ liệu của file vào file
                            byte[] buffer = new byte[4096];
                            int bytesRead;
                            long totalBytesRead = 0;
                            while (totalBytesRead < fileSize) {
                                bytesRead = chatter.getIn().read(buffer);
                                fileOutputStream.write(buffer, 0, bytesRead);
                                totalBytesRead += bytesRead;
                            }

                            fileOutputStream.close();

                            // Chuyển tiếp yêu cầu gửi file cho các người dùng khác
                            for (Chatter c : Server.list) {
                                if (c != chatter) {
                                    c.getOut().writeUTF("ReceiveFile");
                                    c.getOut().writeUTF(chatter.getName());
                                    c.getOut().writeUTF(fileName);
                                    c.getOut().writeLong(fileSize);
                                    // Thêm tin nhắn vào khung chat của các người dùng khác
                                    c.getOut().writeUTF("Send");
                                    c.getOut().writeUTF("[" + chatter.getName() + "] sent a file: " + fileName);
                                }
                            }
                            break;
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            break;
                        }
                        case "ReceiveFile":
    try {
                            // Đọc thông tin về người gửi file
                            String senderName = chatter.getIn().readUTF();
                            String fileName = chatter.getIn().readUTF();
                            long fileSize = chatter.getIn().readLong();

                            // Yêu cầu người dùng chọn vị trí để lưu file
                            JFileChooser fileChooser = new JFileChooser();
                            fileChooser.setDialogTitle("Save File");
                            int result = fileChooser.showSaveDialog(null);
                            if (result == JFileChooser.APPROVE_OPTION) {
                                File saveFile = fileChooser.getSelectedFile();

                                // Tạo đối tượng FileOutputStream để ghi nội dung file
                                FileOutputStream fileOutputStream = new FileOutputStream(saveFile);

                                // Nhận và ghi từng phần dữ liệu của file vào file
                                byte[] buffer = new byte[4096];
                                int bytesRead;
                                long totalBytesRead = 0;
                                while (totalBytesRead < fileSize) {
                                    bytesRead = chatter.getIn().read(buffer);
                                    fileOutputStream.write(buffer, 0, bytesRead);
                                    totalBytesRead += bytesRead;
                                }

                                fileOutputStream.close();

                                JOptionPane.showMessageDialog(null, "File received successfully from " + senderName, "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            break;
                        }

                        default:
                            throw new AssertionError();
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
