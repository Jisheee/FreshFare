package grocery;

import java.awt.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.List;
import javax.swing.*;

public class Receipt extends javax.swing.JFrame {

    public Receipt() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        parseTextFile();
        customerName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalAmount = new javax.swing.JPanel();
        thankyou = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        telephone = new javax.swing.JLabel();
        seperator1 = new javax.swing.JLabel();
        cashier = new javax.swing.JLabel();
        manager = new javax.swing.JLabel();
        cashierNum = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        seperator2 = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        productQty = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();
        seperator3 = new javax.swing.JLabel();
        shopName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        cashAmount = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        changeAmount = new javax.swing.JLabel();
        seperator4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        productName1 = new javax.swing.JLabel();
        productName2 = new javax.swing.JLabel();
        productName3 = new javax.swing.JLabel();
        productName4 = new javax.swing.JLabel();
        productName5 = new javax.swing.JLabel();
        productName6 = new javax.swing.JLabel();
        productName7 = new javax.swing.JLabel();
        productName8 = new javax.swing.JLabel();
        productName9 = new javax.swing.JLabel();
        productName10 = new javax.swing.JLabel();
        productQty1 = new javax.swing.JLabel();
        productQty2 = new javax.swing.JLabel();
        productQty3 = new javax.swing.JLabel();
        productQty4 = new javax.swing.JLabel();
        productQty5 = new javax.swing.JLabel();
        productQty6 = new javax.swing.JLabel();
        productQty7 = new javax.swing.JLabel();
        productQty8 = new javax.swing.JLabel();
        productQty9 = new javax.swing.JLabel();
        productQty10 = new javax.swing.JLabel();
        productPrice1 = new javax.swing.JLabel();
        productPrice2 = new javax.swing.JLabel();
        productPrice3 = new javax.swing.JLabel();
        productPrice4 = new javax.swing.JLabel();
        productPrice5 = new javax.swing.JLabel();
        productPrice6 = new javax.swing.JLabel();
        productPrice7 = new javax.swing.JLabel();
        productPrice8 = new javax.swing.JLabel();
        productPrice9 = new javax.swing.JLabel();
        productPrice10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        totalAmount.setBackground(new java.awt.Color(255, 255, 255));
        totalAmount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thankyou.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        thankyou.setForeground(new java.awt.Color(0, 0, 0));
        thankyou.setText("Thank you for shopping!!");
        totalAmount.add(thankyou, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 619, -1, 32));

        address.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setText("University of");
        totalAmount.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 56, -1, -1));

        city.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        city.setForeground(new java.awt.Color(0, 0, 0));
        city.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        city.setText("Perpetual Help");
        totalAmount.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 77, 132, -1));

        telephone.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        telephone.setForeground(new java.awt.Color(0, 0, 0));
        telephone.setText("Group 3");
        totalAmount.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 98, -1, -1));

        seperator1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        seperator1.setForeground(new java.awt.Color(0, 0, 0));
        seperator1.setText("::::::::::::::::::::::::::::::::::::::");
        totalAmount.add(seperator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, -1, -1));

        cashier.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cashier.setForeground(new java.awt.Color(0, 0, 0));
        cashier.setText("Cashier:");
        totalAmount.add(cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));

        manager.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        manager.setForeground(new java.awt.Color(0, 0, 0));
        manager.setText("Customer:");
        totalAmount.add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 161, -1, -1));

        cashierNum.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cashierNum.setForeground(new java.awt.Color(0, 0, 0));
        cashierNum.setText("#1");
        totalAmount.add(cashierNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 140, -1, -1));

        customerName.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        customerName.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 161, -1, -1));

        seperator2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        seperator2.setForeground(new java.awt.Color(0, 0, 0));
        seperator2.setText("::::::::::::::::::::::::::::::::::::::");
        totalAmount.add(seperator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 182, -1, -1));

        productName.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName.setForeground(new java.awt.Color(0, 0, 0));
        productName.setText("Name");
        totalAmount.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, -1, -1));

        productQty.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty.setForeground(new java.awt.Color(0, 0, 0));
        productQty.setText("Qty");
        totalAmount.add(productQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 203, -1, -1));

        productPrice.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice.setForeground(new java.awt.Color(0, 0, 0));
        productPrice.setText("Price");
        totalAmount.add(productPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 203, -1, -1));

        seperator3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        seperator3.setForeground(new java.awt.Color(0, 0, 0));
        seperator3.setText("::::::::::::::::::::::::::::::::::::::");
        totalAmount.add(seperator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 491, -1, -1));

        shopName.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        shopName.setForeground(new java.awt.Color(0, 0, 0));
        shopName.setText("FreshFare");
        totalAmount.add(shopName, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 16, -1, 44));

        jLabel16.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("$");
        totalAmount.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 512, 33, 32));

        cash.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cash.setForeground(new java.awt.Color(0, 0, 0));
        cash.setText("Cash:");
        totalAmount.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 550, -1, -1));

        cashAmount.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cashAmount.setForeground(new java.awt.Color(0, 0, 0));
        cashAmount.setText("$    ");
        totalAmount.add(cashAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 550, -1, -1));

        change.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        change.setForeground(new java.awt.Color(0, 0, 0));
        change.setText("Change:");
        totalAmount.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 577, -1, -1));

        changeAmount.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        changeAmount.setForeground(new java.awt.Color(0, 0, 0));
        changeAmount.setText("$    ");
        totalAmount.add(changeAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 577, -1, -1));

        seperator4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        seperator4.setForeground(new java.awt.Color(0, 0, 0));
        seperator4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seperator4.setText(".................");
        totalAmount.add(seperator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 598, 325, -1));

        total.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setText("Total:");
        totalAmount.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 512, -1, 32));

        productName1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName1.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 230, 168, -1));

        productName2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName2.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 257, 168, -1));

        productName3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName3.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 284, 168, -1));

        productName4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName4.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 311, 168, -1));

        productName5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName5.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 338, 168, -1));

        productName6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName6.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 365, 168, -1));

        productName7.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName7.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 392, 168, -1));

        productName8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName8.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 419, 168, -1));

        productName9.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName9.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 446, 168, -1));

        productName10.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productName10.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 473, 168, -1));

        productQty1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty1.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 230, -1, -1));

        productQty2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty2.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 257, -1, -1));

        productQty3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty3.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 284, -1, -1));

        productQty4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty4.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 311, -1, -1));

        productQty5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty5.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 338, -1, -1));

        productQty6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty6.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 365, -1, -1));

        productQty7.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty7.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty7, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 392, -1, -1));

        productQty8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty8.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty8, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 419, -1, -1));

        productQty9.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty9.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty9, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 446, -1, -1));

        productQty10.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productQty10.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productQty10, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 473, -1, -1));

        productPrice1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice1.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 230, -1, -1));

        productPrice2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice2.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 257, -1, -1));

        productPrice3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice3.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 284, -1, -1));

        productPrice4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice4.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 311, -1, -1));

        productPrice5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice5.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 338, -1, -1));

        productPrice6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice6.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 365, -1, -1));

        productPrice7.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice7.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 392, -1, -1));

        productPrice8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice8.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice8, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 419, -1, -1));

        productPrice9.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice9.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice9, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 446, -1, -1));

        productPrice10.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        productPrice10.setForeground(new java.awt.Color(0, 0, 0));
        totalAmount.add(productPrice10, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 473, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void customerName(){
        try (BufferedReader cxReader = new BufferedReader(new FileReader("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\Temporary Container.txt"))) {
            
            String line;
            while((line = cxReader.readLine())!= null){
                customerName.setText(line);
            }
            cxReader.close();
        } catch (IOException e) {
            
        }
    }
    
    private void parseTextFile() {
    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\Cart.txt"))) {
        String line;
        int lineNumber = 1;
        while ((line = reader.readLine()) != null) {
            System.out.println("Line " + lineNumber + ": " + line);
            String[] parts = line.split("\\s+");

            if (parts.length == 3) {
                String productName = parts[0].trim();
                int productQty = Integer.parseInt(parts[1].trim());
                double productPrice = Double.parseDouble(parts[2].trim());
                
                setProductLabelValues(getProductLabel(lineNumber), getProductQtyLabel(lineNumber), getProductPriceLabel(lineNumber), productName, productQty, productPrice);
            
            lineNumber++;
            }
        }
    } catch (IOException e) {
        
    }
}

    private JLabel getProductLabel(int index) {
        switch (index) {
            case 1:
                return productName1;
            case 2:
                return productName2;
            case 3:
                return productName3;
            case 4:
                return productName4;
            case 5:
                return productName5;
            case 6:
                return productName6;
            case 7:
                return productName7;
            case 8:
                return productName8;
            case 9:
                return productName9;
            case 10:
                return productName10;
            default:
                return null;
        }
    }

    private JLabel getProductQtyLabel(int index) {
        switch (index) {
            case 1:
                return productQty1;
            case 2:
                return productQty2;
            case 3:
                return productQty3;
            case 4:
                return productQty4;
            case 5:
                return productQty5;
            case 6:
                return productQty6;
            case 7:
                return productQty7;
            case 8:
                return productQty8;
            case 9:
                return productQty9;
            case 10:
                return productQty10;
            default:
                return null;
        }
    }

    private JLabel getProductPriceLabel(int index) {
        switch (index) {
            case 1:
                return productPrice1;
            case 2:
                return productPrice2;
            case 3:
                return productPrice3;
            case 4:
                return productPrice4;
            case 5:
                return productPrice5;
            case 6:
                return productPrice6;
            case 7:
                return productPrice7;
            case 8:
                return productPrice8;
            case 9:
                return productPrice9;
            case 10:
                return productPrice10;
            default:
                return null;
        }
    }

    private void setProductLabelValues(JLabel nameLabel, JLabel qtyLabel, JLabel priceLabel, String name, int qty, double price) {
        nameLabel.setText(name);
        qtyLabel.setText("" + qty);
        priceLabel.setText("$" + price);
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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            Receipt frame = new Receipt();
            frame.parseTextFile();
            frame.setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel cash;
    private javax.swing.JLabel cashAmount;
    private javax.swing.JLabel cashier;
    private javax.swing.JLabel cashierNum;
    private javax.swing.JLabel change;
    private javax.swing.JLabel changeAmount;
    private javax.swing.JLabel city;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel manager;
    private javax.swing.JLabel productName;
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
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel productPrice1;
    private javax.swing.JLabel productPrice10;
    private javax.swing.JLabel productPrice2;
    private javax.swing.JLabel productPrice3;
    private javax.swing.JLabel productPrice4;
    private javax.swing.JLabel productPrice5;
    private javax.swing.JLabel productPrice6;
    private javax.swing.JLabel productPrice7;
    private javax.swing.JLabel productPrice8;
    private javax.swing.JLabel productPrice9;
    private javax.swing.JLabel productQty;
    private javax.swing.JLabel productQty1;
    private javax.swing.JLabel productQty10;
    private javax.swing.JLabel productQty2;
    private javax.swing.JLabel productQty3;
    private javax.swing.JLabel productQty4;
    private javax.swing.JLabel productQty5;
    private javax.swing.JLabel productQty6;
    private javax.swing.JLabel productQty7;
    private javax.swing.JLabel productQty8;
    private javax.swing.JLabel productQty9;
    private javax.swing.JLabel seperator1;
    private javax.swing.JLabel seperator2;
    private javax.swing.JLabel seperator3;
    private javax.swing.JLabel seperator4;
    private javax.swing.JLabel shopName;
    private javax.swing.JLabel telephone;
    private javax.swing.JLabel thankyou;
    private javax.swing.JLabel total;
    private javax.swing.JPanel totalAmount;
    // End of variables declaration//GEN-END:variables
}
