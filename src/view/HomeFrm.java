
package view;

import dao.CauThuDAO;
import dao.PhanCongDAO;
import dao.ViTriDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CauThu;
import model.PhanCong;
import model.PhanCong.PhanCongPK;
import model.ViTri;

 
public class HomeFrm extends javax.swing.JFrame {

    private CauThuDAO cauThuDAO = new CauThuDAO();
    private ViTriDAO viTriDAO = new ViTriDAO();
    private PhanCongDAO phanCongDAO = new PhanCongDAO();

    DefaultTableModel modelCt;


    DefaultTableModel modelVt;

    DefaultTableModel modelPc;

  
    public HomeFrm() {
        initComponents();
        this.setLocationRelativeTo(null);

        modelCt = (DefaultTableModel) tblCt.getModel();
        modelVt = (DefaultTableModel) tblVt.getModel();
        modelPc = (DefaultTableModel) tblPc.getModel();

        hienThiCt();
        hienThiVt();
        hienThiPc();
    }

    public DefaultTableModel getModelCt() {
        return modelCt;
    }

    public DefaultTableModel getModelVt() {
        return modelVt;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVt = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtXoa = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPc = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma cau thu", "Ho ten", "Tuoi", "Muc luong"
            }
        ));
        jScrollPane1.setViewportView(tblCt);
        if (tblCt.getColumnModel().getColumnCount() > 0) {
            tblCt.getColumnModel().getColumn(3).setHeaderValue("Muc luong");
        }

        jButton1.setText("Them");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Chinh sua");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Cau thu", jPanel1);

        tblVt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma vi tri", "Ten vi tri", "Thuong"
            }
        ));
        jScrollPane2.setViewportView(tblVt);

        jButton2.setText("Them");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nhap ma vi tri can xoa:");

        txtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXoaActionPerformed(evt);
            }
        });

        jButton6.setText("Xoa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Vi tri thi dau", jPanel2);

        tblPc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma cau thu", "Ten cau thu", "Tuoi", "Luong", "Ma vi tri", "Ten vi tri", "Thuong", "So tran"
            }
        ));
        jScrollPane3.setViewportView(tblPc);

        jButton3.setText("Them");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sap xep theo:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Ten cau thu");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("So tran choi");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Phan cong", jPanel3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("TIEN THUONG CAU THU");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane4.setViewportView(area);

        jButton4.setText("Thong ke");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addComponent(jScrollPane4)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thong ke", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ThemCt(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ThemVt(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ThemPc(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        ArrayList<PhanCong> listPc = phanCongDAO.getPhanCongs();
        Collections.sort(listPc, new Comparator<PhanCong>() {
            @Override
            public int compare(PhanCong pc1, PhanCong pc2) {
                CauThu ct1 = cauThuDAO.getCauThuByMa(pc1.getMaCauThu());
                CauThu ct2 = cauThuDAO.getCauThuByMa(pc2.getMaCauThu());
                String ten1 = ct1.getHoten();
                String ten2 = ct2.getHoten();

                ten1 = ten1.substring(ten1.lastIndexOf(" ") + 1) + ten1;
                ten2 = ten2.substring(ten2.lastIndexOf(" ") + 1) + ten2;

                return ten1.compareToIgnoreCase(ten2);
            }
        });

        hienThi(listPc, modelPc);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ArrayList<PhanCong> listPc = phanCongDAO.getPhanCongs();
        Collections.sort(listPc, new Comparator<PhanCong>() {
            @Override
            public int compare(PhanCong pc1, PhanCong pc2) {
                return pc2.getSoTran() - pc1.getSoTran();
            }
        });

        hienThi(listPc, modelPc);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String ht = "";

        for (CauThu i : cauThuDAO.getCauThus()) {
            ht += i.getMa() + " | " + i.getHoten() + "\n";

            int thuong = 0;
            for (PhanCong j : phanCongDAO.getPhanCongs()) {
                CauThu ct = cauThuDAO.getCauThuByMa(j.getMaCauThu());
                ViTri vt = viTriDAO.getViTriByMa(j.getMaViTri());
                if (ct.getMa() == i.getMa()) {
                    thuong += vt.getThuong();
                }
            }

            thuong += i.getLuong() * 10 / 100;

            ht += "Tong tien: " + thuong + "\n";
        }

        area.setText(ht);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new SuaCt(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXoaActionPerformed
     
    }//GEN-LAST:event_txtXoaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String ma = txtXoa.getText();

        if (ma.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ma khong duoc de trong!");
        } else if (ma.matches("\\d+") == false) {
            JOptionPane.showMessageDialog(rootPane, "Ma sai dinh dang!");
        } else {
            int maInt = Integer.parseInt(ma);
            boolean check = false;
            ViTri viTri = viTriDAO.getViTriByMa(maInt);
            if (viTri != null) {
                check = true;
                viTriDAO.deleteViTri(maInt);
                JOptionPane.showMessageDialog(rootPane, "Xoa thanh cong!");
                hienThiVt();
                hienThiPc();
            }
            if (check == false) {
                JOptionPane.showMessageDialog(rootPane, "Khong tim thay ma vi tri!");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public void themCt(CauThu ct) {
        cauThuDAO.insertCauThu(ct);
        hienThi(cauThuDAO.getCauThus(), modelCt);
    }

    public void hienThiCt() {
        hienThi(cauThuDAO.getCauThus(), modelCt);
    }

    public void themVt(ViTri vt) {
        viTriDAO.insertViTri(vt);
        hienThi(viTriDAO.getViTris(), modelVt);
    }

    public void hienThiVt() {
        hienThi(viTriDAO.getViTris(), modelVt);
    }

    public void themPc(int maCt, int maVt, int soTran) {
        boolean checkCt = false;
        boolean checkVt = false;
        PhanCongPK pk = new PhanCongPK(maCt, maVt);
        PhanCong phanCong = phanCongDAO.getPhanCong(pk);
        if (phanCong != null) {
            JOptionPane.showMessageDialog(rootPane, "Cau thu nay da duoc them truoc do o vi tri nay!");

        } else {
            PhanCong newPhanCong = new PhanCong(maCt, maVt, soTran);
            phanCongDAO.insertPhanCong(newPhanCong);
            JOptionPane.showMessageDialog(rootPane, "Them phan cong thanh cong!");
        }
        hienThi(phanCongDAO.getPhanCongs(), modelPc);
    }

    public void hienThiPc() {
        hienThi(phanCongDAO.getPhanCongs(), modelPc);
    }

    public <T> void hienThi(ArrayList<T> bang, DefaultTableModel noiHienThi) {
        noiHienThi.setRowCount(0);

        for (T i : bang) {
            if (i instanceof CauThu) {
                CauThu tmp = (CauThu) i;

                noiHienThi.addRow(new Object[]{
                    tmp.getMa(), tmp.getHoten(), tmp.getTuoi(), tmp.getLuong()
                });
            }

            if (i instanceof ViTri) {
                ViTri tmp = (ViTri) i;
                if (tmp.getStatus() == 1) {
                    noiHienThi.addRow(new Object[]{
                        tmp.getMa(), tmp.getHoten(), tmp.getThuong()
                    });
                }

            }

            if (i instanceof PhanCong) {
                PhanCong tmp = (PhanCong) i;
                CauThu ct = cauThuDAO.getCauThuByMa(tmp.getMaCauThu());
                ViTri vt = viTriDAO.getViTriByMa(tmp.getMaViTri());
                if (vt.getStatus() == 1) {
                    noiHienThi.addRow(new Object[]{
                        ct.getMa(), ct.getHoten(), ct.getTuoi(),
                        ct.getLuong(), vt.getMa(), vt.getHoten(),
                        vt.getThuong(), tmp.getSoTran()
                    });
                } else {
                    noiHienThi.addRow(new Object[]{
                        ct.getMa(), ct.getHoten(), ct.getTuoi(),
                        ct.getLuong(), vt.getMa() + "(mã cũ đã bị xóa)", vt.getHoten(),
                        vt.getThuong(), tmp.getSoTran()
                    });
                }

            }
        }
    }

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCt;
    private javax.swing.JTable tblPc;
    private javax.swing.JTable tblVt;
    private javax.swing.JTextField txtXoa;
    // End of variables declaration//GEN-END:variables

}
