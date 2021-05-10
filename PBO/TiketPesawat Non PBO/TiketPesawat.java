import javax.swing.*;
import java.awt.*;

public class TiketPesawat extends JFrame {

    public TiketPesawat() {
        initComponents();
        rdgCaraBayar.add(rdouangtunai);
        rdgCaraBayar.add(rdobca);
        rdgCaraBayar.add(rdobni);
        rdgCaraBayar.add(rdomandiri);
        rdgCaraBayar.add(rdobri);
        rdgCaraBayar.add(rdobtn);
    }
                          
    private void initComponents() {
 
        rdgCaraBayar = new ButtonGroup();
        jLabel3 = new JLabel();
        pswt1 = new JCheckBox();
        pswt2 = new JCheckBox();
        pswt3 = new JCheckBox();
        pswt4 = new JCheckBox();
        txtpswt1 = new JTextField();
        txtpswt2 = new JTextField();
        txtpswt3 = new JTextField();
        txtpswt4 = new JTextField();
        jLabel4 = new JLabel();
        jPanel1 = new JPanel();
        jLabel5 = new JLabel();
        rdouangtunai = new JRadioButton();
        rdobca = new JRadioButton();
        rdobni = new JRadioButton();
        rdomandiri = new JRadioButton();
        rdobri = new JRadioButton();
        rdobtn = new JRadioButton();
        btnHitung = new JButton();
        btnKosong = new JButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        lblTotal = new JLabel();
        lblCaraBayar = new JLabel();
        jPanel2 = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        jRadioButton20 = new JRadioButton();
        jRadioButton21 = new JRadioButton();
        jRadioButton22 = new JRadioButton();
        jRadioButton23 = new JRadioButton();
        jRadioButton24 = new JRadioButton();
        jRadioButton25 = new JRadioButton();
        jRadioButton26 = new JRadioButton();
        jRadioButton27 = new JRadioButton();
        jRadioButton28 = new JRadioButton();
        jRadioButton29 = new JRadioButton();
        jRadioButton30 = new JRadioButton();
        jRadioButton31 = new JRadioButton();
 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        jLabel3.setFont(new Font("Tahoma", 1, 24));
        jLabel3.setText("Jadwal Penerbangan");
 
        pswt1.setFont(new Font("Tahoma", 1, 18));
        pswt1.setForeground(new Color(0, 0, 153));
        pswt1.setText("Garuda Indonesia");
        pswt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswt1ActionPerformed(evt);
            }
        });
 
        pswt2.setFont(new Font("Tahoma", 1, 18));
        pswt2.setForeground(new Color(0, 0, 153));
        pswt2.setText("Lion Air");
        pswt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswt2ActionPerformed(evt);
            }
        });
 
        pswt3.setFont(new Font("Tahoma", 1, 18));
        pswt3.setForeground(new Color(0, 0, 153));
        pswt3.setText("Sriwijaya Air");
        pswt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswt3ActionPerformed(evt);
            }
        });
 
        pswt4.setFont(new Font("Tahoma", 1, 18));
        pswt4.setForeground(new Color(0, 0, 153));
        pswt4.setText("Air Asia");
        pswt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswt4ActionPerformed(evt);
            }
        });
 
        txtpswt1.setEditable(false);
        txtpswt1.setFont(new Font("Tahoma", 1, 14));
        txtpswt1.setText("0");
        txtpswt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpswt1ActionPerformed(evt);
            }
        });
 
        txtpswt2.setEditable(false);
        txtpswt2.setFont(new Font("Tahoma", 1, 14));
        txtpswt2.setText("0");
        txtpswt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpswt2ActionPerformed(evt);
            }
        });
 
        txtpswt3.setEditable(false);
        txtpswt3.setFont(new Font("Tahoma", 1, 14));
        txtpswt3.setText("0");
 
        txtpswt4.setEditable(false);
        txtpswt4.setFont(new Font("Tahoma", 1, 14));
        txtpswt4.setText("0");
 
        jLabel4.setFont(new Font("Tahoma", 1, 24));
        jLabel4.setText("TIKET");
 
        jLabel5.setFont(new Font("Tahoma", 1, 18));
        jLabel5.setText("METODE PEMBAYARAN");
 
        rdgCaraBayar.add(rdouangtunai);
        rdouangtunai.setFont(new Font("Tahoma", 1, 14));
        rdouangtunai.setText("Uang Tunai");
        rdouangtunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdouangtunaiActionPerformed(evt);
            }
        });
 
        rdgCaraBayar.add(rdobca);
        rdobca.setFont(new java.awt.Font("Tahoma", 1, 14));
        rdobca.setText("Debit BCA");
 
        rdgCaraBayar.add(rdobni);
        rdobni.setFont(new java.awt.Font("Tahoma", 1, 14));
        rdobni.setText("Debit BNI");
 
        rdgCaraBayar.add(rdomandiri);
        rdomandiri.setFont(new java.awt.Font("Tahoma", 1, 12));
        rdomandiri.setText("Debit MANDIRI");
        rdomandiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdomandiriActionPerformed(evt);
            }
        });
 
        rdgCaraBayar.add(rdobri);
        rdobri.setFont(new java.awt.Font("Tahoma", 1, 14));
        rdobri.setText("Debit BRI");
 
        rdgCaraBayar.add(rdobtn);
        rdobtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        rdobtn.setText("LinkAja");
        rdobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdobtnActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdomandiri)
                            .addComponent(rdouangtunai))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdobca)
                            .addComponent(rdobri))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdobni)
                            .addComponent(rdobtn))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdouangtunai)
                    .addComponent(rdobca)
                    .addComponent(rdobni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdomandiri)
                    .addComponent(rdobri)
                    .addComponent(rdobtn))
                .addContainerGap())
        );
 
        btnHitung.setFont(new Font("Tahoma", 1, 14));
        btnHitung.setMnemonic('H');
        btnHitung.setText("TOTAL");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
 
        btnKosong.setFont(new Font("Tahoma", 1, 14));
        btnKosong.setMnemonic('K');
        btnKosong.setText("ULANGI");
        btnKosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKosongActionPerformed(evt);
            }
        });
 
        jRadioButton4.setFont(new Font("Tahoma", 1, 14));
        jRadioButton4.setText("12:00");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
 
        jRadioButton5.setFont(new Font("Tahoma", 1, 14));
        jRadioButton5.setText("18:00");
 
        jRadioButton6.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton6.setText("15:00");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
 
        jRadioButton7.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton7.setText("21:00");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
 
        lblTotal.setFont(new Font("Tahoma", 1, 14));
        lblTotal.setForeground(new Color(255, 0, 0));
        lblTotal.setText("Rp. 0");
 
        lblCaraBayar.setFont(new Font("Tahoma", 1, 14)); 
        lblCaraBayar.setForeground(new Color(255, 0, 0));
        lblCaraBayar.setText("METODE PEMBAYARAN");
 
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)))
        );
 
        jPanel4.setBackground(new Color(102, 255, 255));
 
        jLabel1.setFont(new Font("Franklin Gothic Demi", 1, 24));
        jLabel1.setText("TRAVELOKA - TIKET PESAWAT");
 
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
 
        jRadioButton20.setFont(new Font("Tahoma", 1, 14));
        jRadioButton20.setText("12:00");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
 
        jRadioButton21.setFont(new Font("Tahoma", 1, 14));
        jRadioButton21.setText("18:00");
 
        jRadioButton22.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton22.setText("15:00");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });
 
        jRadioButton23.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton23.setText("21:00");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });
 
        jRadioButton24.setFont(new Font("Tahoma", 1, 14));
        jRadioButton24.setText("12:00");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });
 
        jRadioButton25.setFont(new Font("Tahoma", 1, 14));
        jRadioButton25.setText("18:00");
 
        jRadioButton26.setFont(new Font("Tahoma", 1, 14));
        jRadioButton26.setText("15:00");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });
 
        jRadioButton27.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton27.setText("21:00");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });
 
        jRadioButton28.setFont(new Font("Tahoma", 1, 14));
        jRadioButton28.setText("15:00");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });
 
        jRadioButton29.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton29.setText("21:00");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });
 
        jRadioButton30.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton30.setText("12:00");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });
 
        jRadioButton31.setFont(new Font("Tahoma", 1, 14)); 
        jRadioButton31.setText("18:00");
 
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pswt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pswt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pswt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jRadioButton4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton7))
                                        .addComponent(pswt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton23))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton27))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton29))))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHitung)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKosong))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtpswt1)
                                    .addComponent(txtpswt2)
                                    .addComponent(txtpswt3)
                                    .addComponent(txtpswt4))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCaraBayar)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addComponent(pswt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtpswt2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pswt2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton20)
                                    .addComponent(jRadioButton21)
                                    .addComponent(jRadioButton22)
                                    .addComponent(jRadioButton23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtpswt3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pswt3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton24)
                                    .addComponent(jRadioButton25)
                                    .addComponent(jRadioButton26)
                                    .addComponent(jRadioButton27))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pswt4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton30)
                            .addComponent(jRadioButton31)
                            .addComponent(jRadioButton28)
                            .addComponent(jRadioButton29)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(txtpswt1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(138, 138, 138)
                            .addComponent(txtpswt4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHitung)
                            .addComponent(btnKosong))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCaraBayar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
 
        pack();
    }                      
 
    private void pswt3ActionPerformed(java.awt.event.ActionEvent evt) {   
    if (pswt3.isSelected()) {
        txtpswt3.setEditable(true);
        txtpswt3.setText("1");
    } else {
        txtpswt3.setEditable(false);
        txtpswt3.setText("0");
        }
    }                                        
 
    private void pswt1ActionPerformed(java.awt.event.ActionEvent evt) {   
    if (pswt1.isSelected()) {
        txtpswt1.setEditable(true);
        txtpswt1.setText("1");
    } else {
        txtpswt1.setEditable(false);
        txtpswt1.setText("0");
        }
    }                                        
 
    private void pswt2ActionPerformed(java.awt.event.ActionEvent evt) {        
    if (pswt2.isSelected()) {
        txtpswt2.setEditable(true);
        txtpswt2.setText("1");
    } else {
        txtpswt2.setEditable(false);
        txtpswt2.setText("0");
        }
    }                                        
 
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {  
    }                                            
 
    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {  
    }                                            
 
    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {   
    }                                            
 
    private void txtpswt1ActionPerformed(java.awt.event.ActionEvent evt) {    
    }                                        
 
    private void pswt4ActionPerformed(java.awt.event.ActionEvent evt) {   
    if (pswt4.isSelected()) {
        txtpswt4.setEditable(true);
        txtpswt4.setText("1");
    } else {
        txtpswt4.setEditable(false);
        txtpswt4.setText("0");
        }
    }                                        
 
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {  
    boolean lDataOke = true;
    if (pswt1.isSelected() && txtpswt1.getText() == " ")
        lDataOke = false;
    if (pswt2.isSelected() && txtpswt2.getText() == " ")
        lDataOke = false;
    if (pswt3.isSelected() && txtpswt3.getText() == " ")
        lDataOke = false;
    if (pswt4.isSelected() && txtpswt4.getText() == " ")
        lDataOke = false;
    if (!lDataOke) {
        JOptionPane.showMessageDialog(this,
        "Data Dilengkapi dahulu");
    } else {
    int npswt1 = Integer.parseInt(txtpswt1.getText());
    int npswt2 = Integer.parseInt(txtpswt2.getText());
    int npswt3 = Integer.parseInt(txtpswt3.getText());
    int npswt4 = Integer.parseInt(txtpswt4.getText());
    int nTotal = (30000 * npswt1)+
        (35000 * npswt2)+(35000 * npswt3)+(35000 * npswt4);
        lblTotal.setText("Rp. "+nTotal);
    if (rdouangtunai.isSelected())
        lblCaraBayar.setText(rdouangtunai.getActionCommand());
    if (rdobca.isSelected())
        lblCaraBayar.setText(rdobca.getActionCommand());
    if (rdobni.isSelected())
        lblCaraBayar.setText(rdobni.getActionCommand());
    if (rdomandiri.isSelected())
        lblCaraBayar.setText(rdomandiri.getActionCommand());
    if (rdobri.isSelected())
        lblCaraBayar.setText(rdobri.getActionCommand());
    if (rdobtn.isSelected())
        lblCaraBayar.setText(rdobtn.getActionCommand());
}
    }                                        
 
    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {  
    }                                              
 
    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {    
    }                                              
 
    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {  
    }                                              
 
    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {   
    }                                              
 
    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {  
    }                                              
 
    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {   
    }                                              
 
    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {  
    }                                              
 
    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {    
    }                                              
 
    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {   
    }                                              
 
    private void btnKosongActionPerformed(java.awt.event.ActionEvent evt) {     
        pswt1.setSelected(false);
        pswt2.setSelected(false);
        pswt3.setSelected(false);
        pswt4.setSelected(false);
        txtpswt1.setText("0");
        txtpswt2.setText("0");
        txtpswt3.setText("0");
        txtpswt4.setText("0");
        txtpswt1.setEditable(false);
        txtpswt2.setEditable(false);
        txtpswt3.setEditable(false);
        txtpswt4.setEditable(false);
        rdouangtunai.setSelected(true);
        lblTotal.setText("Rp. 0");
        lblCaraBayar.setText("Cara Bayar");
    }                                        
 
    private void rdomandiriActionPerformed(java.awt.event.ActionEvent evt) {      
    }                                          
 
    private void rdobtnActionPerformed(java.awt.event.ActionEvent evt) {        
    }                                      
 
    private void rdouangtunaiActionPerformed(java.awt.event.ActionEvent evt) {   
    }                                            
 
    private void txtpswt2ActionPerformed(java.awt.event.ActionEvent evt) {   
    }                                        
 
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiketPesawat().setVisible(true);
            }
        });
    }
                  
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKosong;
    private javax.swing.JCheckBox pswt1;
    private javax.swing.JCheckBox pswt2;
    private javax.swing.JCheckBox pswt3;
    private javax.swing.JCheckBox pswt4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JLabel lblCaraBayar;
    private javax.swing.JLabel lblTotal;
    private javax.swing.ButtonGroup rdgCaraBayar;
    private javax.swing.JRadioButton rdobca;
    private javax.swing.JRadioButton rdobni;
    private javax.swing.JRadioButton rdobri;
    private javax.swing.JRadioButton rdomandiri;
    private javax.swing.JRadioButton rdobtn;
    private javax.swing.JRadioButton rdouangtunai;
    private javax.swing.JTextField txtpswt1;
    private javax.swing.JTextField txtpswt2;
    private javax.swing.JTextField txtpswt3;
    private javax.swing.JTextField txtpswt4;  
}
