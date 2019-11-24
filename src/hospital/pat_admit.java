/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Karthik
 */
public class pat_admit extends javax.swing.JFrame {
    SQL sql =new SQL();
    /**
     * Creates new form pat_admit
     */
    public pat_admit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adv_pymt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        room_no = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pat_no = new javax.swing.JComboBox();
        pymt_mode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        adm = new javax.swing.JTextField();
        dept = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        condn = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        no_of_doctors = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        diag = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        treat = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        att = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adv_pymt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adv_pymtActionPerformed(evt);
            }
        });

        jLabel13.setText("Admitted On");

        room_no.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Room Number");

        jButton5.setText("Get Selected Row values");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient No.", "Advance Payment", "Payment Mode", "Room no.", "Deaprtment", "Admitted On", "Initial COndition'", "Number Of Doctors", "Diagnosis", "Treatment", "Attendant Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        pat_no.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pat_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pat_noActionPerformed(evt);
            }
        });

        pymt_mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pymt_modeActionPerformed(evt);
            }
        });

        jLabel12.setText("Patient Number");

        jLabel11.setText("Paymnent Mode");

        jLabel14.setText("Advance Payment");

        adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admActionPerformed(evt);
            }
        });

        dept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Department");

        jLabel16.setText("Initial Condition");

        condn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condnActionPerformed(evt);
            }
        });

        jLabel17.setText("Number of Doctors");

        no_of_doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_of_doctorsActionPerformed(evt);
            }
        });

        jLabel18.setText("Diagnosis");

        diag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagActionPerformed(evt);
            }
        });

        jLabel19.setText("Treatment");

        treat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatActionPerformed(evt);
            }
        });

        jLabel20.setText("Attendant Name");

        att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pat_no, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel14))
                                            .addGap(39, 39, 39)))
                                    .addComponent(pymt_mode, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(adv_pymt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(room_no, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(condn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adm, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(diag, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(no_of_doctors, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(treat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(4, 4, 4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jButton1)
                                .addGap(68, 68, 68)
                                .addComponent(jButton2)
                                .addGap(62, 62, 62)
                                .addComponent(jButton3)
                                .addGap(58, 58, 58)
                                .addComponent(jButton4)))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton5)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pat_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adv_pymt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pymt_mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(room_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(condn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_of_doctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adv_pymtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adv_pymtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adv_pymtActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int column = 0;
        String value[];
        value = new String[20];

        int row = jTable1.getSelectedRow();
        for(int i=0;i<11;i++){
            value[i]=jTable1.getModel().getValueAt(row, i).toString();

        }

        room_no.setSelectedItem(value[8]);
        pymt_mode.setText(value[9]);
        adm.setText(value[10]);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn =sql.getConnection();
            PreparedStatement ps;
            ps = conn.prepareStatement("insert into pat_admit values(?,?,?,?,?,?,?,?,?,?,?)");

            
            ps.setString(1, pat_no.getSelectedItem().toString());
            ps.setString(4, room_no.getSelectedItem().toString());
            ps.setString(2, adv_pymt.getText());
            ps.setString(3, pymt_mode.getText());
            ps.setString(5, dept.getSelectedItem().toString());
            ps.setString(6, adm.getText());
            ps.setString(7, condn.getText());
            ps.setString(8, no_of_doctors.getText());
            ps.setString(9, diag.getText());
            ps.setString(10, treat.getText());
            ps.setString(11, att.getText());

            ResultSet rs;
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Insert successfull");

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn=sql.getConnection();
            PreparedStatement ps = conn.prepareStatement("update PAT_ADMIT set\n" +
"DIAGNOSIS = ?\n" +
",ADV_PAYMENT = ?\n" +
",PAYMENT_MODE = ?\n" +
",NUMBER_OF_DOCTORS = ?\n" +
",TREATMENT = ?\n" +
",INITIAL_COND = ?\n" +
",ADMITTED_ON = ?\n" +
",ROOM_NO = ?\n" +
",D_NAME = ?\n" +
",ATTENDANT_NAME = ?\n" +
"where PAT_NO = ?;");
            ps.setString(11, pat_no.getSelectedItem().toString());
            ps.setString(8, room_no.getSelectedItem().toString());
            ps.setString(2, adv_pymt.getText());
            ps.setString(3, pymt_mode.getText());
            ps.setString(9, dept.getSelectedItem().toString());
            ps.setString(7, adm.getText());
            ps.setString(6, condn.getText());
            ps.setString(4, no_of_doctors.getText());
            ps.setString(1, diag.getText());
            ps.setString(5, treat.getText());
            ps.setString(10, att.getText());
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        try {
            Connection conn = sql.getConnection();
            PreparedStatement ps=conn.prepareStatement("select * from pat_admit");
            ResultSet rs = sql.selectQuery(ps);
            int i=0;
            while(rs.next()){

                DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                model.setValueAt(rs.getString(1), i, 0);
                model.setValueAt(rs.getString(2), i, 1);
                model.setValueAt(rs.getString(3), i, 2);
                model.setValueAt(rs.getString(4), i, 3);
                model.setValueAt(rs.getString(5), i, 4);
                model.setValueAt(rs.getString(6), i, 5);
                model.setValueAt(rs.getString(7), i, 6);
                model.setValueAt(rs.getString(8), i, 7);
                model.setValueAt(rs.getString(9), i, 8);
                model.setValueAt(rs.getString(10), i, 9);
                model.setValueAt(rs.getString(11), i, 10);
            
                i++;
            }
            int count=0;
            ps=conn.prepareStatement("select count(*) from doctors");
            rs=ps.executeQuery();
            rs.next();
            count=rs.getInt(1);
            String values[]=new String[count];
            ps=conn.prepareStatement("select room_no from room_details");
            rs=ps.executeQuery();
            i=0;
            while(rs.next()){
                values[i]=rs.getString(1);
                i++;
            }
            room_no.setModel(new javax.swing.DefaultComboBoxModel(values));

            ps=conn.prepareStatement("select count(*) from pat_entry");
            rs=ps.executeQuery();
            rs.next();
            count=rs.getInt(1);
            values=new String[count];
            ps=conn.prepareStatement("select pat_no from pat_entry");
            rs=ps.executeQuery();
            i=0;
            while(rs.next()){
                values[i]=rs.getString(1);
                i++;
            }
            pat_no.setModel(new javax.swing.DefaultComboBoxModel(values));
            
                        ps=conn.prepareStatement("select count(*) from department");
            rs=ps.executeQuery();
            rs.next();
            count=rs.getInt(1);
            values=new String[count];
            ps=conn.prepareStatement("select d_name from department");
            rs=ps.executeQuery();
            i=0;
            while(rs.next()){
                values[i]=rs.getString(1);
                i++;
            }
            dept.setModel(new javax.swing.DefaultComboBoxModel(values));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void pat_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pat_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pat_noActionPerformed

    private void pymt_modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pymt_modeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pymt_modeActionPerformed

    private void admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admActionPerformed

    private void condnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_condnActionPerformed

    private void no_of_doctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_of_doctorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_of_doctorsActionPerformed

    private void diagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagActionPerformed

    private void treatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatActionPerformed

    private void attActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                                            try {
            // TODO add your handling code here:
                    Connection conn =sql.getConnection();
            PreparedStatement ps;
            ps=conn.prepareStatement("delete from pat_admit where pat_no = ?");
            ps.setString(1, pat_no.getSelectedItem().toString());
            ps.execute();
            JOptionPane.showMessageDialog(rootPane, "Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(dept.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(pat_admit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pat_admit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pat_admit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pat_admit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pat_admit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adm;
    private javax.swing.JTextField adv_pymt;
    private javax.swing.JTextField att;
    private javax.swing.JTextField condn;
    private javax.swing.JComboBox dept;
    private javax.swing.JTextField diag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField no_of_doctors;
    private javax.swing.JComboBox pat_no;
    private javax.swing.JTextField pymt_mode;
    private javax.swing.JComboBox room_no;
    private javax.swing.JTextField treat;
    // End of variables declaration//GEN-END:variables
}
