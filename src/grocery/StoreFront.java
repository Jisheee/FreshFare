package grocery;

import java.awt.*;
import javax.swing.*;

public class StoreFront extends javax.swing.JFrame {

    JLabel[] productImages, productNames;
    JButton[] addButtons;
    
    public StoreFront() {
        
        initComponents();
        this.addButtons = new JButton[] {addButton1, addButton2, addButton3, addButton4, addButton5, addButton6, addButton7, addButton8, addButton9, addButton10};
        this.productImages = new JLabel[] {productImage1, productImage2, productImage3, productImage4, productImage5, productImage6, productImage7, productImage8, productImage9, productImage10};
        this.productNames = new JLabel[] {productName1, productName2, productName3, productName4, productName5, productName6, productName7, productName8, productName9, productName10};
        
        this.setResizable(false);
        
        buttonVisibility(false);
        labelVisibility(false);
    }
    // <editor-fold defaultstate="collapsed" desc="PLACEHOLDER VISIBILITIES"> 
    private void buttonVisibility (boolean visibility){
        for (JButton button : addButtons){
            button.setVisible(visibility);
        }
    }
    private void labelVisibility (boolean visibility) {
        for (JLabel label: productImages) {
            label.setVisible(visibility);
        }
        for (JLabel label : productNames) {
            label.setVisible(visibility);
        }
    }
    // </editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        blankPanel = new javax.swing.JPanel();
        productImage2 = new javax.swing.JLabel();
        productImage1 = new javax.swing.JLabel();
        productImage5 = new javax.swing.JLabel();
        productImage4 = new javax.swing.JLabel();
        productImage3 = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        productName1 = new javax.swing.JLabel();
        productName2 = new javax.swing.JLabel();
        addButton2 = new javax.swing.JButton();
        productName3 = new javax.swing.JLabel();
        addButton3 = new javax.swing.JButton();
        productName4 = new javax.swing.JLabel();
        addButton4 = new javax.swing.JButton();
        productName5 = new javax.swing.JLabel();
        addButton5 = new javax.swing.JButton();
        productImage10 = new javax.swing.JLabel();
        productImage9 = new javax.swing.JLabel();
        productImage8 = new javax.swing.JLabel();
        productImage7 = new javax.swing.JLabel();
        productImage6 = new javax.swing.JLabel();
        productName6 = new javax.swing.JLabel();
        addButton6 = new javax.swing.JButton();
        productName7 = new javax.swing.JLabel();
        addButton7 = new javax.swing.JButton();
        productName8 = new javax.swing.JLabel();
        addButton8 = new javax.swing.JButton();
        productName9 = new javax.swing.JLabel();
        addButton9 = new javax.swing.JButton();
        productName10 = new javax.swing.JLabel();
        addButton10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        dairiesSF = new javax.swing.JButton();
        meatsSF = new javax.swing.JButton();
        produceSF = new javax.swing.JButton();
        houseSuppliesSF = new javax.swing.JButton();
        beveragesSF = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        account = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.pink);

        blankPanel.setBackground(new java.awt.Color(255, 231, 211));
        blankPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productImage2.setText("jLabel2");
        productImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 27, 150, 150));

        productImage1.setText("jLabel2");
        productImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 27, 150, 150));

        productImage5.setText("jLabel2");
        productImage5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 27, 150, 150));

        productImage4.setText("jLabel2");
        productImage4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 27, 150, 150));

        productImage3.setText("jLabel2");
        productImage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 27, 150, 150));

        addButton1.setBackground(new java.awt.Color(234, 195, 140));
        addButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton1.setForeground(new java.awt.Color(0, 0, 0));
        addButton1.setText("Add");
        addButton1.setFocusable(false);
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 216, -1, -1));

        productName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName1.setText("jLabel12");
        productName1.setFocusable(false);
        productName1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blankPanel.add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 182, 122, 28));

        productName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName2.setText("jLabel12");
        blankPanel.add(productName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 182, 120, 28));

        addButton2.setBackground(new java.awt.Color(234, 195, 140));
        addButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton2.setForeground(new java.awt.Color(0, 0, 0));
        addButton2.setText("Add");
        addButton2.setFocusable(false);
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 216, -1, -1));

        productName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName3.setText("jLabel12");
        blankPanel.add(productName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 182, 120, 28));

        addButton3.setBackground(new java.awt.Color(234, 195, 140));
        addButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton3.setForeground(new java.awt.Color(0, 0, 0));
        addButton3.setText("Add");
        addButton3.setFocusable(false);
        addButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton3ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 216, -1, -1));

        productName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName4.setText("jLabel12");
        blankPanel.add(productName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 182, 120, 28));

        addButton4.setBackground(new java.awt.Color(234, 195, 140));
        addButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton4.setForeground(new java.awt.Color(0, 0, 0));
        addButton4.setText("Add");
        addButton4.setFocusable(false);
        addButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton4ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 216, -1, -1));

        productName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName5.setText("jLabel12");
        blankPanel.add(productName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 182, 120, 28));

        addButton5.setBackground(new java.awt.Color(234, 195, 140));
        addButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton5.setForeground(new java.awt.Color(0, 0, 0));
        addButton5.setText("Add");
        addButton5.setFocusable(false);
        addButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton5ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 216, -1, -1));

        productImage10.setText("jLabel2");
        productImage10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 245, 150, 150));

        productImage9.setText("jLabel2");
        productImage9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 245, 150, 150));

        productImage8.setText("jLabel2");
        productImage8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 245, 150, 150));

        productImage7.setText("jLabel2");
        productImage7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 245, 150, 150));

        productImage6.setText("jLabel2");
        productImage6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        blankPanel.add(productImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 245, 150, 150));

        productName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName6.setText("jLabel12");
        blankPanel.add(productName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 400, 120, 28));

        addButton6.setBackground(new java.awt.Color(234, 195, 140));
        addButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton6.setForeground(new java.awt.Color(0, 0, 0));
        addButton6.setText("Add");
        addButton6.setFocusable(false);
        addButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton6ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 434, -1, -1));

        productName7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName7.setText("jLabel12");
        blankPanel.add(productName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 400, 120, 28));

        addButton7.setBackground(new java.awt.Color(234, 195, 140));
        addButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton7.setForeground(new java.awt.Color(0, 0, 0));
        addButton7.setText("Add");
        addButton7.setFocusable(false);
        addButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton7ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 434, -1, -1));

        productName8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName8.setText("jLabel12");
        blankPanel.add(productName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 400, 120, 28));

        addButton8.setBackground(new java.awt.Color(234, 195, 140));
        addButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton8.setForeground(new java.awt.Color(0, 0, 0));
        addButton8.setText("Add");
        addButton8.setFocusable(false);
        addButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton8ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 434, -1, -1));

        productName9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName9.setText("jLabel12");
        blankPanel.add(productName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 400, 120, 28));

        addButton9.setBackground(new java.awt.Color(234, 195, 140));
        addButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton9.setForeground(new java.awt.Color(0, 0, 0));
        addButton9.setText("Add");
        addButton9.setFocusable(false);
        addButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton9ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 434, -1, -1));

        productName10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName10.setText("jLabel12");
        blankPanel.add(productName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 400, 120, 28));

        addButton10.setBackground(new java.awt.Color(234, 195, 140));
        addButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton10.setForeground(new java.awt.Color(0, 0, 0));
        addButton10.setText("Add");
        addButton10.setFocusable(false);
        addButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton10ActionPerformed(evt);
            }
        });
        blankPanel.add(addButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 434, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 238, 214));

        dairiesSF.setBackground(new java.awt.Color(234, 195, 140));
        dairiesSF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dairiesSF.setForeground(new java.awt.Color(0, 0, 0));
        dairiesSF.setText("Dairies");
        dairiesSF.setFocusable(false);
        dairiesSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairiesSFActionPerformed(evt);
            }
        });

        meatsSF.setBackground(new java.awt.Color(234, 195, 140));
        meatsSF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        meatsSF.setForeground(new java.awt.Color(0, 0, 0));
        meatsSF.setText("Meat");
        meatsSF.setFocusable(false);
        meatsSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatsSFActionPerformed(evt);
            }
        });

        produceSF.setBackground(new java.awt.Color(234, 195, 140));
        produceSF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        produceSF.setForeground(new java.awt.Color(0, 0, 0));
        produceSF.setText("Produce");
        produceSF.setFocusable(false);
        produceSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produceSFActionPerformed(evt);
            }
        });

        houseSuppliesSF.setBackground(new java.awt.Color(234, 195, 140));
        houseSuppliesSF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        houseSuppliesSF.setForeground(new java.awt.Color(0, 0, 0));
        houseSuppliesSF.setText("House Supplies");
        houseSuppliesSF.setFocusable(false);
        houseSuppliesSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseSuppliesSFActionPerformed(evt);
            }
        });

        beveragesSF.setBackground(new java.awt.Color(234, 195, 140));
        beveragesSF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        beveragesSF.setForeground(new java.awt.Color(0, 0, 0));
        beveragesSF.setText("Beverages");
        beveragesSF.setFocusable(false);
        beveragesSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beveragesSFActionPerformed(evt);
            }
        });

        cartButton.setBackground(new java.awt.Color(234, 195, 140));
        cartButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cartButton.setForeground(new java.awt.Color(0, 0, 0));
        cartButton.setText("Cart");
        cartButton.setFocusable(false);
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(meatsSF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dairiesSF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(produceSF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(houseSuppliesSF, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(beveragesSF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(dairiesSF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(beveragesSF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produceSF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(houseSuppliesSF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(meatsSF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        account.setBackground(new java.awt.Color(255, 204, 204));
        account.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        account.setForeground(new java.awt.Color(51, 51, 51));
        account.setText("Account");
        account.setFocusable(false);
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FreshFare ");

        logOut.setBackground(new java.awt.Color(255, 204, 204));
        logOut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logOut.setForeground(new java.awt.Color(51, 51, 51));
        logOut.setText("Log Out");
        logOut.setFocusable(false);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 231, 211));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blankPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(blankPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        Account acc = new Account();
        acc.setVisible(true);
        acc.setLocationRelativeTo(this);
    }//GEN-LAST:event_accountActionPerformed

    private void dairiesSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairiesSFActionPerformed
        dairiesSF();
    }//GEN-LAST:event_dairiesSFActionPerformed
    public void dairiesSF(){
        buttonVisibility(true);
        labelVisibility(true);
        
        // <editor-fold defaultstate="collapsed" desc="DAIRY IMAGE SETTERS"> 
        ImageIcon dairy1 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Butter.jpeg");
        ImageIcon dairy2 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Buttermilk.jpeg");
        ImageIcon dairy3 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Cheese.jpeg");
        ImageIcon dairy4 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Cottage Cheese.jpeg");
        ImageIcon dairy5 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Cream.jpeg");
        ImageIcon dairy6 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Ice Cream.jpeg");
        ImageIcon dairy7 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Milk.jpeg");
        ImageIcon dairy8 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Parmesan Cheese.jpeg");
        ImageIcon dairy9 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Sour Cream.jpeg");
        ImageIcon dairy10 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Product Images\\Yogurt.jpeg");
        
        productImage1.setIcon(dairy1);
        productImage2.setIcon(dairy2);
        productImage3.setIcon(dairy3);
        productImage4.setIcon(dairy4);
        productImage5.setIcon(dairy5);
        productImage6.setIcon(dairy6);
        productImage7.setIcon(dairy7);
        productImage8.setIcon(dairy8);
        productImage9.setIcon(dairy9);
        productImage10.setIcon(dairy10);
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="DAIRY PRODUCT NAMES">
        productName1.setText("Butter");
        productName2.setText("Buttermilk");
        productName3.setText("Cheese");
        productName4.setText("CottageCheese");
        productName5.setText("Cream");
        productName6.setText("Ice Cream");
        productName7.setText("Milk");
        productName8.setText("Parmesan");
        productName9.setText("SourCream");
        productName10.setText("Yogurt");
        // </editor-fold>
    }
    
    private void meatsSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatsSFActionPerformed
        meatSF();
    }//GEN-LAST:event_meatsSFActionPerformed
    public void meatSF(){
        buttonVisibility(true);
        labelVisibility(true);
        
        // <editor-fold defaultstate="collapsed" desc="MEAT IMAGE SETTERS"> 
        ImageIcon meat1 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Bacon.jpeg");
        ImageIcon meat2 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Beef.jpeg");
        ImageIcon meat3 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Chicken.jpeg");
        ImageIcon meat4 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Duck.jpeg");
        ImageIcon meat5 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Lamb.jpeg");
        ImageIcon meat6 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Pork.jpeg");
        ImageIcon meat7 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Salmon.jpeg");
        ImageIcon meat8 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Shrimp.jpeg");
        ImageIcon meat9 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Tuna.jpeg");
        ImageIcon meat10 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Meat\\Product Images\\Turkey.jpeg");
        
        productImage1.setIcon(meat1);
        productImage2.setIcon(meat2);
        productImage3.setIcon(meat3);
        productImage4.setIcon(meat4);
        productImage5.setIcon(meat5);
        productImage6.setIcon(meat6);
        productImage7.setIcon(meat7);
        productImage8.setIcon(meat8);
        productImage9.setIcon(meat9);
        productImage10.setIcon(meat10);
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="MEAT PRODUCT NAMES">
        productName1.setText("Bacon");
        productName2.setText("Beef");
        productName3.setText("Chicken");
        productName4.setText("Duck");
        productName5.setText("Lamb");
        productName6.setText("Pork");
        productName7.setText("Salmon");
        productName8.setText("Shrimp");
        productName9.setText("Tuna");
        productName10.setText("Turkey");
        // </editor-fold>
    }
    
    private void produceSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produceSFActionPerformed
        produceSF();
    }//GEN-LAST:event_produceSFActionPerformed
    public void produceSF(){
        buttonVisibility(true);
        labelVisibility(true);
        
        // <editor-fold defaultstate="collapsed" desc="PRODUCE IMAGE SETTERS"> 
        ImageIcon produce1 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Apples.jpeg");
        ImageIcon produce2 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Carrots.jpeg");
        ImageIcon produce3 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Garlic.jpeg");
        ImageIcon produce4 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Grapes.jpeg");
        ImageIcon produce5 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Lettuce.jpeg");
        ImageIcon produce6 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Orange.jpeg");
        ImageIcon produce7 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Potatoes.jpeg");
        ImageIcon produce8 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Spinach.jpeg");
        ImageIcon produce9 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Tomatoes.jpeg");
        ImageIcon produce10 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Produce\\Product Images\\Watermelons.jpeg");
        
        productImage1.setIcon(produce1);
        productImage2.setIcon(produce2);
        productImage3.setIcon(produce3);
        productImage4.setIcon(produce4);
        productImage5.setIcon(produce5);
        productImage6.setIcon(produce6);
        productImage7.setIcon(produce7);
        productImage8.setIcon(produce8);
        productImage9.setIcon(produce9);
        productImage10.setIcon(produce10);
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="PRODUCE PRODUCT NAMES">
        productName1.setText("Apples");
        productName2.setText("Carrots");
        productName3.setText("Garlic");
        productName4.setText("Grapes");
        productName5.setText("Lettuce");
        productName6.setText("Orange");
        productName7.setText("Potatoes");
        productName8.setText("Spinach");
        productName9.setText("Tomstoes");
        productName10.setText("Watermelons");
        // </editor-fold>
    }
    
    private void houseSuppliesSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseSuppliesSFActionPerformed
        houseSuppliesSF();
    }//GEN-LAST:event_houseSuppliesSFActionPerformed
    public void houseSuppliesSF(){
        buttonVisibility(true);
        labelVisibility(true);
        
        // <editor-fold defaultstate="collapsed" desc="HOUSEHOLD IMAGE SETTERS"> 
        ImageIcon house1 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Bleach.jpeg");
        ImageIcon house2 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Dish Soap.jpeg");
        ImageIcon house3 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Laundry Detergent.jpeg");
        ImageIcon house4 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Paper Towels.jpeg");
        ImageIcon house5 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Rubbing Alcohol.jpeg");
        ImageIcon house6 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Softener.jpeg");
        ImageIcon house7 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Sponges.jpeg");
        ImageIcon house8 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Toilet Paper.jpeg");
        ImageIcon house9 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\TrashBags.jpeg");
        ImageIcon house10 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Product Images\\Vinegar.jpeg");
        
        productImage1.setIcon(house1);
        productImage2.setIcon(house2);
        productImage3.setIcon(house3);
        productImage4.setIcon(house4);
        productImage5.setIcon(house5);
        productImage6.setIcon(house6);
        productImage7.setIcon(house7);
        productImage8.setIcon(house8);
        productImage9.setIcon(house9);
        productImage10.setIcon(house10);
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="HOUSEHOLD PRODUCT NAMES">
        productName1.setText("Bleach");
        productName2.setText("Dish Soap");
        productName3.setText("LaundryDetergent");
        productName4.setText("PaperTowels");
        productName5.setText("RubbingAlcohol");
        productName6.setText("Softener");
        productName7.setText("Sponges");
        productName8.setText("ToiletPaper");
        productName9.setText("TrashBags");
        productName10.setText("Vinegar");
        // </editor-fold>
    }
    
    private void beveragesSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beveragesSFActionPerformed
        beverageSF();
    }//GEN-LAST:event_beveragesSFActionPerformed
    public void beverageSF(){
        buttonVisibility(true);
        labelVisibility(true);
        
        // <editor-fold defaultstate="collapsed" desc="BEVERAGES IMAGE SETTERS"> 
        ImageIcon beverage1 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Apple Juice.jpeg");
        ImageIcon beverage2 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Chardonnay.jpeg");
        ImageIcon beverage3 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Coffee.jpeg");
        ImageIcon beverage4 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Hot Chocolate.jpeg");
        ImageIcon beverage5 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Iced Tea.jpeg");
        ImageIcon beverage6 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Lemonade.jpeg");
        ImageIcon beverage7 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Merlot.jpeg");
        ImageIcon beverage8 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Orange Juice.jpeg");
        ImageIcon beverage9 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Pinot Noir.jpeg");
        ImageIcon beverage10 = new ImageIcon("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Beverage\\Product Images\\Water.jpeg");
        
        productImage1.setIcon(beverage1);
        productImage2.setIcon(beverage2);
        productImage3.setIcon(beverage3);
        productImage4.setIcon(beverage4);
        productImage5.setIcon(beverage5);
        productImage6.setIcon(beverage6);
        productImage7.setIcon(beverage7);
        productImage8.setIcon(beverage8);
        productImage9.setIcon(beverage9);
        productImage10.setIcon(beverage10);
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="BEVERAGE PRODUCT NAMES">
        productName1.setText("AppleJuice");
        productName2.setText("Chardonnay");
        productName3.setText("Coffee");
        productName4.setText("HotChocolate");
        productName5.setText("IcedTea");
        productName6.setText("Lemonade");
        productName7.setText("Merlot");
        productName8.setText("OrangeJuice");
        productName9.setText("PinotNoir");
        productName10.setText("Water");
        // </editor-fold>
    }
    
    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        Cart cart = new Cart();
        cart.setVisible(true);
        cart.setLocationRelativeTo(this);
    }//GEN-LAST:event_cartButtonActionPerformed
    // <editor-fold defaultstate="collapsed" desc="BUTTOOOOONNSSSSSSS">
    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        String content = productName1.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton1ActionPerformed

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed
        String content = productName2.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton2ActionPerformed

    private void addButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton3ActionPerformed
        String content = productName3.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton3ActionPerformed

    private void addButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton4ActionPerformed
        String content = productName4.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton4ActionPerformed

    private void addButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton5ActionPerformed
        String content = productName5.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton5ActionPerformed

    private void addButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton6ActionPerformed
        String content = productName6.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton6ActionPerformed

    private void addButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton7ActionPerformed
        String content = productName7.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton7ActionPerformed

    private void addButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton8ActionPerformed
        String content = productName8.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton8ActionPerformed

    private void addButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton9ActionPerformed
        String content = productName9.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton9ActionPerformed

    private void addButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton10ActionPerformed
        String content = productName10.getText();
        Add addProduct = new Add(content);
        addProduct.setVisible(true);
    }//GEN-LAST:event_addButton10ActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        this.setVisible(false);
        Credentials creds = new Credentials ();
        creds.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed
    // </editor-fold>
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(StoreFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreFront.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreFront().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton addButton10;
    private javax.swing.JButton addButton2;
    private javax.swing.JButton addButton3;
    private javax.swing.JButton addButton4;
    private javax.swing.JButton addButton5;
    private javax.swing.JButton addButton6;
    private javax.swing.JButton addButton7;
    private javax.swing.JButton addButton8;
    private javax.swing.JButton addButton9;
    private javax.swing.JButton beveragesSF;
    private javax.swing.JPanel blankPanel;
    private javax.swing.JButton cartButton;
    private javax.swing.JButton dairiesSF;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton houseSuppliesSF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton logOut;
    private javax.swing.JButton meatsSF;
    private javax.swing.JButton produceSF;
    private javax.swing.JLabel productImage1;
    private javax.swing.JLabel productImage10;
    private javax.swing.JLabel productImage2;
    private javax.swing.JLabel productImage3;
    private javax.swing.JLabel productImage4;
    private javax.swing.JLabel productImage5;
    private javax.swing.JLabel productImage6;
    private javax.swing.JLabel productImage7;
    private javax.swing.JLabel productImage8;
    private javax.swing.JLabel productImage9;
    private javax.swing.JLabel productName1;
    private javax.swing.JLabel productName10;
    private javax.swing.JLabel productName2;
    private javax.swing.JLabel productName3;
    private javax.swing.JLabel productName4;
    private javax.swing.JLabel productName5;
    private javax.swing.JLabel productName6;
    private javax.swing.JLabel productName7;
    private javax.swing.JLabel productName8;
    private javax.swing.JLabel productName9;
    // End of variables declaration//GEN-END:variables
}
