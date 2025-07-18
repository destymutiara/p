/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


/**
 *
 * @author desty
 */
public class history extends javax.swing.JFrame {
Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    
    public history() {
        initComponents();
        DoConnect();
    }
    
    public void DoConnect() {
    try {
        //CONNECT TO THE DATABASE
        
        String url = "jdbc:derby://localhost:1527/pizza";
        String user = "pizza";
        String password = "pizza123";
        con = DriverManager.getConnection( url, user, password );

        //EXECUTE SOME SQL AND LOAD THE RECORDS INTO THE RESULTSET
        stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
        String SQL = "SELECT * FROM \"user\"";
        rs = stmt.executeQuery( SQL );

        //MOVE THE CURSOR TO THE FIRST RECORD AND GET THE DATA
        rs.next();
        int id_col = rs.getInt("user_id");
        String id = Integer.toString( id_col );
        String name = rs.getString("name");
        String phone = rs.getString("phone");
        String address = rs.getString("address");

        //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
        Id.setText(id);
        Name.setText(name);
        Phone.setText(phone);
        Address.setText(address);

    } catch ( SQLException err ) {
        JOptionPane.showMessageDialog(this, err.getMessage());
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
        jPanel1 = new javax.swing.JPanel();
        Id = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSaveRecord = new javax.swing.JButton();
        btnUpdateRecord = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNewRecord = new javax.swing.JButton();
        btnCancelNewRecord = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("HISTORY");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        jLabel2.setText("Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Phone))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSaveRecord.setText("Save New Record");
        btnSaveRecord.setEnabled(false);
        btnSaveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRecordActionPerformed(evt);
            }
        });

        btnUpdateRecord.setText("Update Record");
        btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecordActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNewRecord.setText("New Record");
        btnNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRecordActionPerformed(evt);
            }
        });

        btnCancelNewRecord.setText("Cancel New Record");
        btnCancelNewRecord.setEnabled(false);
        btnCancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnSaveRecord)
                        .addGap(32, 32, 32)
                        .addComponent(btnCancelNewRecord))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnUpdateRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewRecord)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateRecord)
                    .addComponent(btnDelete)
                    .addComponent(btnNewRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveRecord)
                    .addComponent(btnCancelNewRecord))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnFirst)
                .addGap(18, 18, 18)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLast)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnFirst)
                    .addComponent(btnLast))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (rs.next()) {
                int id_col = rs.getInt("user_id");
                String id = Integer.toString( id_col );
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                Id.setText(id);
                Name.setText(name);
                Phone.setText(phone);
                Address.setText(address);

            } else {
                rs.previous(); // Mengembalikan kursor ke posisi sebelumnya
                JOptionPane.showMessageDialog(history.this, "End of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(history.this, err.getMessage());
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try {
            if (rs.previous()) {
                int id_col = rs.getInt("user_id");
                String id = Integer.toString( id_col );
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                Id.setText(id);
                Name.setText(name);
                Phone.setText(phone);
                Address.setText(address);

            } else {
                rs.next();
                JOptionPane.showMessageDialog(this, "Start of File");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            rs.first();
            int id_col = rs.getInt("user_id");
            String id = Integer.toString( id_col );
            String name = rs.getString("name");
            String phone = rs.getString("phone");
            String address = rs.getString("address");

            Id.setText(id);
            Name.setText(name);
            Phone.setText(phone);
            Address.setText(address);

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            rs.last();
            int id_col = rs.getInt("user_id");
            String id = Integer.toString( id_col );
            String name = rs.getString("name");
            String phone = rs.getString("phone");
            String address = rs.getString("address");

            Id.setText(id);
            Name.setText(name);
            Phone.setText(phone);
            Address.setText(address);

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnSaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRecordActionPerformed
        // TODO add your handling code here:
        String first = Name.getText();
        String last = Phone.getText();
        String job = Address.getText();
        String ID = Id.getText();

        int newID = Integer.parseInt(ID);
        try {
            rs.moveToInsertRow();

            rs.updateInt("user_Id", newID);
            rs.updateString("name", first);
            rs.updateString("phone", last);
            rs.updateString("address", job);

            rs.insertRow();

            stmt.close();
            rs.close();

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

            String SQL = "SELECT * FROM \"user\"";
            rs = stmt.executeQuery(SQL);

            rs.next();

            int id_col = rs.getInt("user_id");
            String id = Integer.toString(id_col);
            String name2 = rs.getString("name");
            String phone2 = rs.getString("phone");
            String address2 = rs.getString("address");

            Id.setText(id);
            Name.setText(name2);
            Phone.setText(phone2);
            Address.setText(address2);

            btnFirst.setEnabled(false);
            btnPrevious.setEnabled(false);
            btnNext.setEnabled(false);
            btnLast.setEnabled(false);
            btnUpdateRecord.setEnabled(false);
            btnDelete.setEnabled(false);
            btnNewRecord.setEnabled(false);

            btnSaveRecord.setEnabled(true);
            btnCancelNewRecord.setEnabled(true);

            JOptionPane.showMessageDialog(this, "Record Saved");
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_btnSaveRecordActionPerformed

    private void btnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecordActionPerformed
        // TODO add your handling code here:
        String name = Name.getText();
String phone = Phone.getText();
String address = Address.getText();
String id = Id.getText();

int newID = Integer.parseInt(id);

try {
    Statement stmt = con.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_UPDATABLE
    );

    ResultSet rs = stmt.executeQuery("SELECT * FROM \"user\" WHERE user_id = " + newID);

    if (rs.next()) { 
        rs.updateString("name", name);
        rs.updateString("phone", phone);
        rs.updateString("address", address);
        rs.updateRow();
        JOptionPane.showMessageDialog(this, "Updated Successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "User ID not found.");
    }
}
catch (SQLException err) {
    err.printStackTrace();
}

    }//GEN-LAST:event_btnUpdateRecordActionPerformed
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            int userId = Integer.parseInt(Id.getText());

            // Hapus langsung dari tabel user saja, karena ON DELETE CASCADE akan menghapus di pesanan juga
            PreparedStatement deleteUser = con.prepareStatement("DELETE FROM \"user\" WHERE user_id = ?");
            deleteUser.setInt(1, userId);
            deleteUser.executeUpdate();

            // Refresh data
            stmt.close();
            rs.close();

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String SQL = "SELECT * FROM \"user\"";
            rs = stmt.executeQuery(SQL);

            if (rs.next()) {
                int id_col = rs.getInt("user_id");
                String id = Integer.toString(id_col);
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                Id.setText(id);
                Name.setText(name);
                Phone.setText(phone);
                Address.setText(address);
            } else {
                JOptionPane.showMessageDialog(this, "Deleted Successfully");
                Id.setText("");
                Name.setText("");
                Phone.setText("");
                Address.setText("");
            }

            JOptionPane.showMessageDialog(this, "Ordered Deleted!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRecordActionPerformed
        try {
            // Simpan posisi baris sekarang sebelum membuat entri baru
            curRow = rs.getRow(); // ← Tambahan penting!
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan posisi record: " + ex.getMessage());
        }

        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnUpdateRecord.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNewRecord.setEnabled(false);
        btnSaveRecord.setEnabled(true);
        btnCancelNewRecord.setEnabled(true);

        Id.setText("");
        Name.setText("");
        Phone.setText("");
        Address.setText("");
    }//GEN-LAST:event_btnNewRecordActionPerformed

    private void btnCancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewRecordActionPerformed
        // TODO add your handling code here:
        String name = Name.getText();
        String phone = Phone.getText();
        String address = Address.getText();
        String id = Id.getText();

        int newID = Integer.parseInt(id);
        try{
            rs.absolute( curRow);

            Name.setText( rs.getString("name"));
            Phone.setText( rs.getString("phone"));
            Address.setText( rs.getString("address"));
            Id.setText( rs.getString("user_id"));

            btnFirst.setEnabled(true);
            btnPrevious.setEnabled(true);
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
            btnUpdateRecord.setEnabled(true);
            btnDelete.setEnabled(true);
            btnNewRecord.setEnabled(true);

            btnSaveRecord.setEnabled(false);
            btnCancelNewRecord.setEnabled(false);
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }//GEN-LAST:event_btnCancelNewRecordActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int pilihan = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Do you want to go back?",
            "Konfirmasi",
            javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (pilihan == JOptionPane.YES_OPTION) {
            dispose();
        }
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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton btnCancelNewRecord;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNewRecord;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSaveRecord;
    private javax.swing.JButton btnUpdateRecord;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
