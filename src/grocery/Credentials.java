
package grocery;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Credentials extends javax.swing.JFrame {
    
    private Timer timer;
    
    public Credentials(){
        initComponents();
        
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        blankLabel.setVisible(false);
        blankLabelAdmin.setVisible(false);
        
        addPlaceholder(txCusUN);
        addPlaceholder(txCusPW);
        addPlaceholder(txAdminUN);
        addPlaceholder(txAdminPW);
                
        timer = new Timer(5000, (ActionEvent e) -> {
        blankLabel.setVisible(false); 
        blankLabelAdmin.setVisible(false);
        timer.stop();
        });
    }
    
    public void addPlaceholder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    public void removePlaceholder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tPanel_credentials = new javax.swing.JTabbedPane();
        jPanel_Customer = new javax.swing.JPanel();
        txCusUN = new javax.swing.JTextField();
        btCusLogIn = new javax.swing.JButton();
        btCusRegister = new javax.swing.JButton();
        txCusPW = new javax.swing.JPasswordField();
        blankLabel = new javax.swing.JLabel();
        cxImageLabel = new javax.swing.JLabel();
        jPanel_Admin = new javax.swing.JPanel();
        txAdminUN = new javax.swing.JTextField();
        btAdminLogin = new javax.swing.JButton();
        txAdminPW = new javax.swing.JPasswordField();
        blankLabelAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txCusUN.setText("Username");
        txCusUN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txCusUNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txCusUNFocusLost(evt);
            }
        });

        btCusLogIn.setText("Login");
        btCusLogIn.setFocusable(false);
        btCusLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCusLogInActionPerformed(evt);
            }
        });

        btCusRegister.setText("Sign Up");
        btCusRegister.setFocusable(false);
        btCusRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCusRegisterActionPerformed(evt);
            }
        });

        txCusPW.setText("Password");
        txCusPW.setEchoChar('\u0000');
        txCusPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txCusPWFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txCusPWFocusLost(evt);
            }
        });

        blankLabel.setForeground(new java.awt.Color(0, 0, 0));
        blankLabel.setText("jLabel2");

        cxImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_CustomerLayout = new javax.swing.GroupLayout(jPanel_Customer);
        jPanel_Customer.setLayout(jPanel_CustomerLayout);
        jPanel_CustomerLayout.setHorizontalGroup(
            jPanel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cxImageLabel)
                .addGroup(jPanel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CustomerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(blankLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel_CustomerLayout.createSequentialGroup()
                                .addComponent(btCusLogIn)
                                .addGap(18, 18, 18)
                                .addComponent(btCusRegister))
                            .addComponent(txCusPW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addGroup(jPanel_CustomerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(txCusUN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_CustomerLayout.setVerticalGroup(
            jPanel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CustomerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_CustomerLayout.createSequentialGroup()
                        .addComponent(txCusUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txCusPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCusLogIn)
                            .addComponent(btCusRegister)))
                    .addComponent(cxImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tPanel_credentials.addTab("Customer", jPanel_Customer);

        txAdminUN.setText("Username");
        txAdminUN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txAdminUNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txAdminUNFocusLost(evt);
            }
        });

        btAdminLogin.setText("Login");
        btAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdminLoginActionPerformed(evt);
            }
        });

        txAdminPW.setText("Password");
        txAdminPW.setEchoChar('\u0000');
        txAdminPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txAdminPWFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txAdminPWFocusLost(evt);
            }
        });

        blankLabelAdmin.setText("jLabel1");

        javax.swing.GroupLayout jPanel_AdminLayout = new javax.swing.GroupLayout(jPanel_Admin);
        jPanel_Admin.setLayout(jPanel_AdminLayout);
        jPanel_AdminLayout.setHorizontalGroup(
            jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_AdminLayout.createSequentialGroup()
                        .addComponent(btAdminLogin)
                        .addGap(18, 18, 18)
                        .addComponent(blankLabelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txAdminUN, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txAdminPW))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel_AdminLayout.setVerticalGroup(
            jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txAdminUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txAdminPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blankLabelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tPanel_credentials.addTab("Admin", jPanel_Admin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPanel_credentials)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tPanel_credentials)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txAdminPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txAdminPWFocusGained
        if(txAdminPW.getText().equals("Password")){
            txAdminPW.setText(null);
            txAdminPW.requestFocus();
            txAdminPW.setEchoChar('*');
            removePlaceholder(txAdminPW);
        }
    }//GEN-LAST:event_txAdminPWFocusGained

    private void btAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdminLoginActionPerformed
        try {
            FileReader fr = new FileReader("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\ADMIN.txt");
            BufferedReader br = new BufferedReader(fr);

            String username = txAdminUN.getText();
            String password = txAdminPW.getText();

            String line;
            boolean verification = false;
                while ((line = br.readLine()) != null) {
                    String[] credsAdmin = line.split(" ");
                    if (credsAdmin.length >= 2) {
                        String storedAdminUN = credsAdmin[0];
                        String storedAdminPW = credsAdmin[1];
                        if (username.equals(storedAdminUN) && password.equals(storedAdminPW)) {
                            verification = true;
                            break;
                        }
                    }
                }
            if (verification) {
                AdminPortal adminPortal = new AdminPortal();
                adminPortal.setVisible(true); // ADMIN PORTAL
                adminPortal.setLocationRelativeTo(this);
                this.setVisible(false);
            } else {
                blankLabelAdmin.setText("Admin key not found");
                blankLabelAdmin.setVisible(true);
                timer.start();
            }
            br.close();
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_btAdminLoginActionPerformed

    private void txAdminUNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txAdminUNFocusGained
        if(txAdminUN.getText().equals("Username")){
            txAdminUN.setText(null);
            txAdminUN.requestFocus();
            removePlaceholder(txAdminUN);
        }
    }//GEN-LAST:event_txAdminUNFocusGained

    private void txCusPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCusPWFocusGained
        if(txCusPW.getText().equals("Password")){
            txCusPW.setText(null);
            txCusPW.requestFocus();
            txCusPW.setEchoChar('*');
            removePlaceholder(txCusPW);
        }
    }//GEN-LAST:event_txCusPWFocusGained

    private void btCusLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCusLogInActionPerformed
        try {
            String usernameCus = txCusUN.getText();
            String passwordCus = txCusPW.getText();
            
            FileReader fr = new FileReader("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Customer Credentials\\" + usernameCus + ".txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            boolean verification = false;
                while ((line = br.readLine()) != null) {
                    String[] credsCustomer = line.split(" ");
                    if (credsCustomer.length >= 2) {
                        String storedCustomerUN = credsCustomer[0];
                        String storedCustomerPW = credsCustomer[1];
                        if (usernameCus.equals(storedCustomerUN) && passwordCus.equals(storedCustomerPW)) {
                            verification = true;
                            
                            FileWriter fwClear = new FileWriter("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\Temporary Container.txt");
                            fwClear.close();
                            
                            try (FileWriter fw = new FileWriter("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\Temporary Container.txt", true);
                                 BufferedWriter bw = new BufferedWriter(fw)) {
                                bw.write(usernameCus);
                                bw.newLine();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                            break;
                        }
                    }
                }
            if (verification) {
                StoreFront storeFront = new StoreFront();
                storeFront.setVisible(true); // STORE FRONT
                storeFront.setLocationRelativeTo(this);
                this.setVisible(false);
            } else {
                blankLabel.setText("Account not found");
                blankLabel.setVisible(true);
                timer.start();
            }
            br.close();
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_btCusLogInActionPerformed

    private void txCusUNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCusUNFocusGained
        if(txCusUN.getText().equals("Username")){
            txCusUN.setText(null);
            txCusUN.requestFocus();
            removePlaceholder(txCusUN);
        }
    }//GEN-LAST:event_txCusUNFocusGained

    private void btCusRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCusRegisterActionPerformed
        new Signup_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCusRegisterActionPerformed

    private void txCusUNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCusUNFocusLost
        String unHolder = txCusUN.getText();
        
        if(unHolder.isEmpty()){
            txCusUN.setText("Username");
            addPlaceholder(txCusUN);
        }
    }//GEN-LAST:event_txCusUNFocusLost

    private void txCusPWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCusPWFocusLost
        String pwHolder = txCusPW.getText();
        
        if(pwHolder.isEmpty()){
            txCusPW.setText("Password");
            addPlaceholder(txCusPW);
            txCusPW.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txCusPWFocusLost

    private void txAdminUNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txAdminUNFocusLost
        String unHolder = txAdminUN.getText();
        
        if(unHolder.isEmpty()){
            txAdminUN.setText("Username");
            addPlaceholder(txAdminUN);
        }
    }//GEN-LAST:event_txAdminUNFocusLost

    private void txAdminPWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txAdminPWFocusLost
        String pwHolder = txAdminPW.getText();
        
        if(pwHolder.isEmpty()){
            txAdminPW.setText("Password");
            addPlaceholder(txAdminPW);
            txAdminPW.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txAdminPWFocusLost
    
   
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
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Credentials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blankLabel;
    private javax.swing.JLabel blankLabelAdmin;
    private javax.swing.JButton btAdminLogin;
    private javax.swing.JButton btCusLogIn;
    private javax.swing.JButton btCusRegister;
    private javax.swing.JLabel cxImageLabel;
    private javax.swing.JPanel jPanel_Admin;
    private javax.swing.JPanel jPanel_Customer;
    private javax.swing.JTabbedPane tPanel_credentials;
    private javax.swing.JPasswordField txAdminPW;
    private javax.swing.JTextField txAdminUN;
    private javax.swing.JPasswordField txCusPW;
    private javax.swing.JTextField txCusUN;
    // End of variables declaration//GEN-END:variables
}
