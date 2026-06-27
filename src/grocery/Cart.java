package grocery;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

public class Cart extends javax.swing.JFrame {

    public Cart() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        populateCart("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\Cart.txt");
    }
    
    private void populateCart(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1; // Keep track of the line number

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    JLabel productLabel = findProductLabel(lineNumber);
                    JLabel quantityLabel = findQuantityLabel(lineNumber);
                    JLabel priceLabel = findPriceLabel(lineNumber);

                    if (productLabel != null && quantityLabel != null && priceLabel != null) {
                        productLabel.setText(parts[0]); 
                        quantityLabel.setText(parts[1]); 
                        priceLabel.setText(parts[2]); 
                    }
                } else {
                    break;
                }
                lineNumber++;
            }
            updateRemoveButtonVisibility();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void updateRemoveButtonVisibility() {
    List<JLabel> productLabels = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    List<JButton> removeButtons = Arrays.asList(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButton10);

        for (int i = 0; i < productLabels.size(); i++) {
            JLabel productLabel = productLabels.get(i);
            JButton removeButton = removeButtons.get(i);
            if (productLabel.getText().isEmpty()) {
                removeButton.setVisible(false);
            } else {
                removeButton.setVisible(true);
            }
        }
    }
    
    private JLabel findProductLabel(int lineNumber) {
        switch (lineNumber) {
            case 1: return p1;
            case 2: return p2;
            case 3: return p3;
            case 4: return p4;
            case 5: return p5;
            case 6: return p6;
            case 7: return p7;
            case 8: return p8;
            case 9: return p9;
            case 10: return p10;
            default: return null;
        }
    }
    private JLabel findQuantityLabel(int lineNumber) {
        switch (lineNumber) {
            case 1: return q1;
            case 2: return q2;
            case 3: return q3;
            case 4: return q4;
            case 5: return q5;
            case 6: return q6;
            case 7: return q7;
            case 8: return q8;
            case 9: return q9;
            case 10: return q10;
            default: return null;
        }
    }
    private JLabel findPriceLabel(int lineNumber) {
        switch (lineNumber) {
            case 1: return pr1;
            case 2: return pr2;
            case 3: return pr3;
            case 4: return pr4;
            case 5: return pr5;
            case 6: return pr6;
            case 7: return pr7;
            case 8: return pr8;
            case 9: return pr9;
            case 10: return pr10;
            
            default: return null;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        pr1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        pr2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        pr3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        pr4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        p5 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        pr5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        p6 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        pr6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        p7 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        pr7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        p8 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        pr8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        p9 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        pr9 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        p10 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        pr10 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 231, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkOut.setBackground(new java.awt.Color(234, 195, 140));
        checkOut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        checkOut.setForeground(new java.awt.Color(0, 0, 0));
        checkOut.setText("Check Out");
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });
        jPanel1.add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 458, 377, 45));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Product");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 114, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Quantity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 6, -1, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 6, 64, 32));
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 114, 30));

        jButton1.setBackground(new java.awt.Color(234, 195, 140));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 48, 80, -1));
        jPanel1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 44, 75, 30));
        jPanel1.add(pr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 44, 82, 30));
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, 114, 30));
        jPanel1.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 86, 75, 30));
        jPanel1.add(pr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 86, 82, 30));

        jButton2.setBackground(new java.awt.Color(234, 195, 140));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 90, -1, -1));
        jPanel1.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 128, 75, 30));
        jPanel1.add(pr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 128, 82, 30));

        jButton3.setBackground(new java.awt.Color(234, 195, 140));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 132, -1, -1));
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, 114, 30));
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, 114, 30));
        jPanel1.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 170, 75, 30));
        jPanel1.add(pr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 170, 82, 30));

        jButton4.setBackground(new java.awt.Color(234, 195, 140));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 174, -1, -1));
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 212, 114, 30));
        jPanel1.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 212, 75, 30));
        jPanel1.add(pr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 212, 82, 30));

        jButton5.setBackground(new java.awt.Color(234, 195, 140));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 216, -1, -1));
        jPanel1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 254, 114, 30));
        jPanel1.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 254, 75, 30));
        jPanel1.add(pr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 254, 82, 30));

        jButton6.setBackground(new java.awt.Color(234, 195, 140));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Remove");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 258, -1, -1));
        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 296, 114, 30));
        jPanel1.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 296, 75, 30));
        jPanel1.add(pr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 296, 82, 30));

        jButton7.setBackground(new java.awt.Color(234, 195, 140));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 300, -1, -1));
        jPanel1.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 338, 114, 30));
        jPanel1.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 338, 75, 30));
        jPanel1.add(pr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 338, 82, 30));

        jButton8.setBackground(new java.awt.Color(234, 195, 140));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 342, -1, -1));
        jPanel1.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 380, 114, 30));
        jPanel1.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 380, 75, 30));
        jPanel1.add(pr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 380, 82, 30));

        jButton9.setBackground(new java.awt.Color(234, 195, 140));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Remove");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 384, -1, -1));
        jPanel1.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 422, 114, 30));
        jPanel1.add(q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 422, 75, 30));
        jPanel1.add(pr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 422, 82, 30));

        jButton10.setBackground(new java.awt.Color(234, 195, 140));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Remove");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 426, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        removeProduct(p1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        removeProduct(p2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        removeProduct(p3.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        removeProduct(p4.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        removeProduct(p5.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        removeProduct(p6.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        removeProduct(p7.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        removeProduct(p8.getText());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        removeProduct(p9.getText());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        removeProduct(p10.getText());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        Receipt receipt = new Receipt();
        receipt.setVisible(true);
    }//GEN-LAST:event_checkOutActionPerformed

    private void removeProduct(String productName) {
    String cartFilePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\Cart.txt";
    File cartFile = new File(cartFilePath);
    
    try {
        List<String> lines = Files.readAllLines(cartFile.toPath());
        Iterator<String> iterator = lines.iterator();
            while (iterator.hasNext()) {
                String line = iterator.next();
                String[] parts = line.split(" ");
                if (parts.length == 3 && parts[0].equals(productName)) {
                    iterator.remove();
                    break; 
                }
            }
            Files.write(cartFile.toPath(), lines);
            populateCart(cartFilePath); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JLabel pr1;
    private javax.swing.JLabel pr10;
    private javax.swing.JLabel pr2;
    private javax.swing.JLabel pr3;
    private javax.swing.JLabel pr4;
    private javax.swing.JLabel pr5;
    private javax.swing.JLabel pr6;
    private javax.swing.JLabel pr7;
    private javax.swing.JLabel pr8;
    private javax.swing.JLabel pr9;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    // End of variables declaration//GEN-END:variables
}
