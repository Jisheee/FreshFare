package grocery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class AdminPortal extends javax.swing.JFrame {
    
        JButton[] buttonArrayAdd,buttonArraySub;
        JLabel[] phArray, quantityArray;
        int labelCounter1, labelCounter2, labelCounter3, labelCounter4, labelCounter5, labelCounter6, labelCounter7, labelCounter8, labelCounter9, labelCounter10;
        
    public AdminPortal() {
        
        initComponents();
        
        this.buttonArrayAdd = new JButton[]{addButton1, addButton2, addButton3, addButton4, addButton5, addButton6, addButton7, addButton8, addButton9, addButton10};
        this.buttonArraySub = new JButton[]{reduceButton1, reduceButton2, reduceButton3, reduceButton4, reduceButton5, reduceButton6, reduceButton7, reduceButton8, reduceButton9, reduceButton10};
        
        this.phArray = new JLabel[]{ph1, ph2, ph3, ph4, ph5, ph6, ph7, ph8, ph9, ph10};
        this.quantityArray = new JLabel[]{quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7, quantity8, quantity9, quantity10};
        
        this.setTitle("FreshFare - ADMIN");
        this.setResizable(false);
        
        setSubButtonsVisible(false);
        setAddButtonsVisible(false);
        setPhVisible(false);
        setQuantityVisible(false);
    }
    // <editor-fold defaultstate="collapsed" desc="BUTTONS VISIBILITY"> 
    private void setSubButtonsVisible(boolean visible) {
        for (JButton button : buttonArraySub) {
            button.setVisible(visible);
        }
    }
    private void setAddButtonsVisible(boolean visible) {
        for (JButton button : buttonArrayAdd) {
            button.setVisible(visible);
        }
    }
    private void setPhVisible(boolean visible) {
        for (JLabel label : phArray) {
            label.setVisible(visible);
        }
    }
    private void setQuantityVisible(boolean visible) {
        for (JLabel label : quantityArray) {
            label.setVisible(visible);
        }
    }
    // </editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        menupanel = new javax.swing.JPanel();
        dairies = new javax.swing.JButton();
        beverage = new javax.swing.JButton();
        produce = new javax.swing.JButton();
        houseSupplies = new javax.swing.JButton();
        meats = new javax.swing.JButton();
        update = new javax.swing.JButton();
        displaypanel = new javax.swing.JPanel();
        quantity1 = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        reduceButton1 = new javax.swing.JButton();
        ph1 = new javax.swing.JLabel();
        ph2 = new javax.swing.JLabel();
        reduceButton2 = new javax.swing.JButton();
        quantity2 = new javax.swing.JLabel();
        addButton2 = new javax.swing.JButton();
        ph3 = new javax.swing.JLabel();
        reduceButton3 = new javax.swing.JButton();
        quantity3 = new javax.swing.JLabel();
        addButton3 = new javax.swing.JButton();
        ph4 = new javax.swing.JLabel();
        reduceButton4 = new javax.swing.JButton();
        quantity4 = new javax.swing.JLabel();
        addButton4 = new javax.swing.JButton();
        ph5 = new javax.swing.JLabel();
        reduceButton5 = new javax.swing.JButton();
        quantity5 = new javax.swing.JLabel();
        addButton5 = new javax.swing.JButton();
        ph6 = new javax.swing.JLabel();
        reduceButton6 = new javax.swing.JButton();
        quantity6 = new javax.swing.JLabel();
        addButton6 = new javax.swing.JButton();
        ph7 = new javax.swing.JLabel();
        reduceButton7 = new javax.swing.JButton();
        quantity7 = new javax.swing.JLabel();
        addButton7 = new javax.swing.JButton();
        ph8 = new javax.swing.JLabel();
        reduceButton8 = new javax.swing.JButton();
        quantity8 = new javax.swing.JLabel();
        addButton8 = new javax.swing.JButton();
        ph9 = new javax.swing.JLabel();
        reduceButton9 = new javax.swing.JButton();
        quantity9 = new javax.swing.JLabel();
        addButton9 = new javax.swing.JButton();
        ph10 = new javax.swing.JLabel();
        reduceButton10 = new javax.swing.JButton();
        quantity10 = new javax.swing.JLabel();
        addButton10 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FreshFare - Admin");

        login.setBackground(new java.awt.Color(255, 255, 100));
        login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Log In");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(login)
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menupanel.setBackground(new java.awt.Color(255, 255, 153));

        dairies.setBackground(new java.awt.Color(255, 255, 100));
        dairies.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        dairies.setForeground(new java.awt.Color(0, 0, 0));
        dairies.setText("Dairies");
        dairies.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dairies.setFocusable(false);
        dairies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairiesActionPerformed(evt);
            }
        });

        beverage.setBackground(new java.awt.Color(255, 255, 100));
        beverage.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        beverage.setForeground(new java.awt.Color(0, 0, 0));
        beverage.setText("Beverage");
        beverage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        beverage.setFocusable(false);
        beverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beverageActionPerformed(evt);
            }
        });

        produce.setBackground(new java.awt.Color(255, 255, 100));
        produce.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        produce.setForeground(new java.awt.Color(0, 0, 0));
        produce.setText("Produce");
        produce.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        produce.setFocusable(false);
        produce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produceActionPerformed(evt);
            }
        });

        houseSupplies.setBackground(new java.awt.Color(255, 255, 100));
        houseSupplies.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        houseSupplies.setForeground(new java.awt.Color(0, 0, 0));
        houseSupplies.setText("House Supplies");
        houseSupplies.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        houseSupplies.setFocusable(false);
        houseSupplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseSuppliesActionPerformed(evt);
            }
        });

        meats.setBackground(new java.awt.Color(255, 255, 100));
        meats.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        meats.setForeground(new java.awt.Color(0, 0, 0));
        meats.setText("Meat");
        meats.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        meats.setFocusable(false);
        meats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatsActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 100));
        update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("Update");
        update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setFocusable(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dairies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beverage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(houseSupplies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dairies, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(beverage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produce, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(houseSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meats, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        displaypanel.setBackground(new java.awt.Color(255, 255, 204));

        quantity1.setBackground(new java.awt.Color(255, 255, 255));
        quantity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity1.setText("0");
        quantity1.setOpaque(true);

        addButton1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton1.setText("+");
        addButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton1.setFocusable(false);
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        reduceButton1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton1.setText("-");
        reduceButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton1.setFocusable(false);
        reduceButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton1ActionPerformed(evt);
            }
        });

        ph1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph1.setText("jLabel2");

        ph2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph2.setText("jLabel2");

        reduceButton2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton2.setText("-");
        reduceButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton2.setFocusable(false);
        reduceButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton2ActionPerformed(evt);
            }
        });

        quantity2.setBackground(new java.awt.Color(255, 255, 255));
        quantity2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity2.setText("0");
        quantity2.setOpaque(true);

        addButton2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton2.setText("+");
        addButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton2.setFocusable(false);
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });

        ph3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph3.setText("jLabel2");

        reduceButton3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton3.setText("-");
        reduceButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton3.setFocusable(false);
        reduceButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton3ActionPerformed(evt);
            }
        });

        quantity3.setBackground(new java.awt.Color(255, 255, 255));
        quantity3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity3.setText("0");
        quantity3.setOpaque(true);

        addButton3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton3.setText("+");
        addButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton3.setFocusable(false);
        addButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton3ActionPerformed(evt);
            }
        });

        ph4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph4.setText("jLabel2");

        reduceButton4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton4.setText("-");
        reduceButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton4.setFocusable(false);
        reduceButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton4ActionPerformed(evt);
            }
        });

        quantity4.setBackground(new java.awt.Color(255, 255, 255));
        quantity4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity4.setText("0");
        quantity4.setOpaque(true);

        addButton4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton4.setText("+");
        addButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton4.setFocusable(false);
        addButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton4ActionPerformed(evt);
            }
        });

        ph5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph5.setText("jLabel2");

        reduceButton5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton5.setText("-");
        reduceButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton5.setFocusable(false);
        reduceButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton5ActionPerformed(evt);
            }
        });

        quantity5.setBackground(new java.awt.Color(255, 255, 255));
        quantity5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity5.setText("0");
        quantity5.setOpaque(true);

        addButton5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton5.setText("+");
        addButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton5.setFocusable(false);
        addButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton5ActionPerformed(evt);
            }
        });

        ph6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph6.setText("jLabel2");

        reduceButton6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton6.setText("-");
        reduceButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton6.setFocusable(false);
        reduceButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton6ActionPerformed(evt);
            }
        });

        quantity6.setBackground(new java.awt.Color(255, 255, 255));
        quantity6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity6.setText("0");
        quantity6.setOpaque(true);

        addButton6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton6.setText("+");
        addButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton6.setFocusable(false);
        addButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton6ActionPerformed(evt);
            }
        });

        ph7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph7.setText("jLabel2");

        reduceButton7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton7.setText("-");
        reduceButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton7.setFocusable(false);
        reduceButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton7ActionPerformed(evt);
            }
        });

        quantity7.setBackground(new java.awt.Color(255, 255, 255));
        quantity7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity7.setText("0");
        quantity7.setOpaque(true);

        addButton7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton7.setText("+");
        addButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton7.setFocusable(false);
        addButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton7ActionPerformed(evt);
            }
        });

        ph8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph8.setText("jLabel2");

        reduceButton8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton8.setText("-");
        reduceButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton8.setFocusable(false);
        reduceButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton8ActionPerformed(evt);
            }
        });

        quantity8.setBackground(new java.awt.Color(255, 255, 255));
        quantity8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity8.setText("0");
        quantity8.setOpaque(true);

        addButton8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton8.setText("+");
        addButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton8.setFocusable(false);
        addButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton8ActionPerformed(evt);
            }
        });

        ph9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph9.setText("jLabel2");

        reduceButton9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton9.setText("-");
        reduceButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton9.setFocusable(false);
        reduceButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton9ActionPerformed(evt);
            }
        });

        quantity9.setBackground(new java.awt.Color(255, 255, 255));
        quantity9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity9.setText("0");
        quantity9.setOpaque(true);

        addButton9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton9.setText("+");
        addButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton9.setFocusable(false);
        addButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton9ActionPerformed(evt);
            }
        });

        ph10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ph10.setText("jLabel2");

        reduceButton10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        reduceButton10.setText("-");
        reduceButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reduceButton10.setFocusable(false);
        reduceButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceButton10ActionPerformed(evt);
            }
        });

        quantity10.setBackground(new java.awt.Color(255, 255, 255));
        quantity10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantity10.setText("0");
        quantity10.setOpaque(true);

        addButton10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addButton10.setText("+");
        addButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addButton10.setFocusable(false);
        addButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displaypanelLayout = new javax.swing.GroupLayout(displaypanel);
        displaypanel.setLayout(displaypanelLayout);
        displaypanelLayout.setHorizontalGroup(
            displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph10, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createSequentialGroup()
                        .addComponent(reduceButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(displaypanelLayout.createSequentialGroup()
                            .addComponent(reduceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(displaypanelLayout.createSequentialGroup()
                            .addComponent(reduceButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        displaypanelLayout.setVerticalGroup(
            displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaypanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaypanelLayout.createSequentialGroup()
                        .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(displaypanelLayout.createSequentialGroup()
                                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reduceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displaypanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reduceButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(displaypanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(displaypanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displaypanelLayout.createSequentialGroup()
                        .addComponent(ph1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ph2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduceButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduceButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(quantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduceButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(quantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduceButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(quantity6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduceButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(quantity7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduceButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(quantity8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduceButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(quantity9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reduceButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addComponent(quantity10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ph10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displaypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displaypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dairiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dairiesActionPerformed
        dairies();
        // <editor-fold defaultstate="collapsed" desc="FILE READER : Dairy">
        try (Scanner scannerButter =        new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Butter.txt"));
            Scanner scannerButtermilk =     new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Buttermilk.txt"));
            Scanner scannerCheese =         new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Cheese.txt"));
            Scanner scannerCottageCheese =  new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\CottageCheese.txt"));
            Scanner scannerCream =          new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Cream.txt"));
            Scanner scannerIceCream =       new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\IceCream.txt"));
            Scanner scannerMilk =           new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Milk.txt"));
            Scanner scannerParmesanCheese = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\ParmesanCheese.txt"));
            Scanner scannerSourCream =      new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\SourCream.txt"));
            Scanner scannerYogurt =         new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Yogurt.txt"))) {
            
            int quantityButter = scannerButter.nextInt();
            quantity1.setText(Integer.toString(quantityButter));

            int quantityButtermilk = scannerButtermilk.nextInt();
            quantity2.setText(Integer.toString(quantityButtermilk));

            int quantityCheese = scannerCheese.nextInt();
            quantity3.setText(Integer.toString(quantityCheese));

            int quantityCottageCheese = scannerCottageCheese.nextInt();
            quantity4.setText(Integer.toString(quantityCottageCheese));

            int quantityCream = scannerCream.nextInt();
            quantity5.setText(Integer.toString(quantityCream));

            int quantityIceCream = scannerIceCream.nextInt();
            quantity6.setText(Integer.toString(quantityIceCream));

            int quantityMilk = scannerMilk.nextInt();
            quantity7.setText(Integer.toString(quantityMilk));

            int quantityParmesanCheese = scannerParmesanCheese.nextInt();
            quantity8.setText(Integer.toString(quantityParmesanCheese));

            int quantitySourCream = scannerSourCream.nextInt();
            quantity9.setText(Integer.toString(quantitySourCream));

            int quantityYogurt = scannerYogurt.nextInt();
            quantity10.setText(Integer.toString(quantityYogurt));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // </editor-fold>
    }//GEN-LAST:event_dairiesActionPerformed

    private void produceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produceActionPerformed
        produce();
        // <editor-fold defaultstate="collapsed" desc="FILE READER : Produce">
        try (Scanner scannerApples = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Apples.txt"))) {
            int quantityApples = scannerApples.nextInt();
            quantity1.setText(Integer.toString(quantityApples));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerCarrots = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Carrots.txt"))) {
            int quantityCarrots = scannerCarrots.nextInt();
            quantity2.setText(Integer.toString(quantityCarrots));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerGarlic = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Garlic.txt"))) {
            int quantityGarlic = scannerGarlic.nextInt();
            quantity3.setText(Integer.toString(quantityGarlic));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerGrapes = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Grapes.txt"))) {
            int quantityGrapes = scannerGrapes.nextInt();
            quantity4.setText(Integer.toString(quantityGrapes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerLettuce = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Lettuce.txt"))) {
            int quantityLettuce = scannerLettuce.nextInt();
            quantity5.setText(Integer.toString(quantityLettuce));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerOranges = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Oranges.txt"))) {
            int quantityOranges = scannerOranges.nextInt();
            quantity6.setText(Integer.toString(quantityOranges));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerPotatoes = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Potatoes.txt"))) {
            int quantityPotatoes = scannerPotatoes.nextInt();
            quantity7.setText(Integer.toString(quantityPotatoes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerSpinach = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Spinach.txt"))) {
            int quantitySpinach = scannerSpinach.nextInt();
            quantity8.setText(Integer.toString(quantitySpinach));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerTomatoes = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Tomatoes.txt"))) {
            int quantityTomatoes = scannerTomatoes.nextInt();
            quantity9.setText(Integer.toString(quantityTomatoes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerWatermelons = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Watermelons.txt"))) {
            int quantityWatermelons = scannerWatermelons.nextInt();
            quantity10.setText(Integer.toString(quantityWatermelons));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
}
        // </editor-fold>
    }//GEN-LAST:event_produceActionPerformed

    private void beverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beverageActionPerformed
        beverages();
        // <editor-fold defaultstate="collapsed" desc="FILE READER : Beverage"> 
        try (Scanner scannerAppleJuice = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\AppleJuice.txt"))) {
            int quantityAppleJuice = scannerAppleJuice.nextInt();
            quantity1.setText(Integer.toString(quantityAppleJuice));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerCoffee = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Coffee.txt"))) {
            int quantityCoffee = scannerCoffee.nextInt();
            quantity2.setText(Integer.toString(quantityCoffee));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerChardonnay = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Chardonnay.txt"))) {
            int quantityChardonnay = scannerChardonnay.nextInt();
            quantity3.setText(Integer.toString(quantityChardonnay));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerHotChocolate = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\HotChocolate.txt"))) {
            int quantityHotChocolate = scannerHotChocolate.nextInt();
            quantity4.setText(Integer.toString(quantityHotChocolate));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerIcedTea = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\IcedTea.txt"))) {
            int quantityIcedTea = scannerIcedTea.nextInt();
            quantity5.setText(Integer.toString(quantityIcedTea));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerLemonade = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Lemonade.txt"))) {
            int quantityLemonade = scannerLemonade.nextInt();
            quantity6.setText(Integer.toString(quantityLemonade));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerMerlot = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Merlot.txt"))) {
            int quantityMerlot = scannerMerlot.nextInt();
            quantity7.setText(Integer.toString(quantityMerlot));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerOrangeJuice = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\OrangeJuice.txt"))) {
            int quantityOrangeJuice = scannerOrangeJuice.nextInt();
            quantity8.setText(Integer.toString(quantityOrangeJuice));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerPinotNoir = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\PinotNoir.txt"))) {
            int quantityPinotNoir = scannerPinotNoir.nextInt();
            quantity9.setText(Integer.toString(quantityPinotNoir));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerWater = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Water.txt"))) {
            int quantityWater = scannerWater.nextInt();
            quantity10.setText(Integer.toString(quantityWater));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // </editor-fold>
    }//GEN-LAST:event_beverageActionPerformed
    // <editor-fold defaultstate="collapsed" desc="BUTTONS GRRAAA"> 
    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed
        labelCounter2 = Integer.parseInt(quantity2.getText());
        labelCounter2++;
        quantity2.setText(Integer.toString(labelCounter2));
        
        updateFile(ph2.getText(), labelCounter2);
    }//GEN-LAST:event_addButton2ActionPerformed

    private void reduceButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton2ActionPerformed
        labelCounter2 = Integer.parseInt(quantity2.getText());
        labelCounter2--;
        quantity2.setText(Integer.toString(labelCounter2));
    }//GEN-LAST:event_reduceButton2ActionPerformed

    private void reduceButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton1ActionPerformed
        labelCounter1 = Integer.parseInt(quantity1.getText());
        labelCounter1--;
        quantity1.setText(Integer.toString(labelCounter1));
    }//GEN-LAST:event_reduceButton1ActionPerformed
        
    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        labelCounter1 = Integer.parseInt(quantity1.getText());
        labelCounter1++;
        quantity1.setText(Integer.toString(labelCounter1));
    
        updateFile(ph1.getText(), labelCounter1); 
    }//GEN-LAST:event_addButton1ActionPerformed

    private void reduceButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton3ActionPerformed
        labelCounter3 = Integer.parseInt(quantity3.getText());
        labelCounter3--;
        quantity3.setText(Integer.toString(labelCounter3));
    }//GEN-LAST:event_reduceButton3ActionPerformed

    private void addButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton3ActionPerformed
        labelCounter3 = Integer.parseInt(quantity3.getText());
        labelCounter3++;
        quantity3.setText(Integer.toString(labelCounter3));
        
        updateFile(ph3.getText(), labelCounter3);
    }//GEN-LAST:event_addButton3ActionPerformed

    private void reduceButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton4ActionPerformed
        labelCounter4 = Integer.parseInt(quantity4.getText());
        labelCounter4--;
        quantity4.setText(Integer.toString(labelCounter4));
    }//GEN-LAST:event_reduceButton4ActionPerformed

    private void addButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton4ActionPerformed
        labelCounter4 = Integer.parseInt(quantity4.getText());
        labelCounter4++;
        quantity4.setText(Integer.toString(labelCounter4));
        
        updateFile(ph4.getText(), labelCounter4);
    }//GEN-LAST:event_addButton4ActionPerformed

    private void reduceButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton5ActionPerformed
        labelCounter5 = Integer.parseInt(quantity5.getText());
        labelCounter5--;
        quantity5.setText(Integer.toString(labelCounter5));
    }//GEN-LAST:event_reduceButton5ActionPerformed

    private void addButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton5ActionPerformed
        labelCounter5 = Integer.parseInt(quantity5.getText());
        labelCounter5++;
        quantity5.setText(Integer.toString(labelCounter5));
        
        updateFile(ph5.getText(), labelCounter5);
    }//GEN-LAST:event_addButton5ActionPerformed

    private void reduceButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton6ActionPerformed
        labelCounter6 = Integer.parseInt(quantity6.getText());
        labelCounter6--;
        quantity6.setText(Integer.toString(labelCounter6));
    }//GEN-LAST:event_reduceButton6ActionPerformed

    private void addButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton6ActionPerformed
        labelCounter6 = Integer.parseInt(quantity6.getText());
        labelCounter6++;
        quantity6.setText(Integer.toString(labelCounter6));
        
        updateFile(ph6.getText(), labelCounter6);
    }//GEN-LAST:event_addButton6ActionPerformed

    private void reduceButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton7ActionPerformed
        labelCounter7 = Integer.parseInt(quantity7.getText());
        labelCounter7--;
        quantity7.setText(Integer.toString(labelCounter7));
    }//GEN-LAST:event_reduceButton7ActionPerformed

    private void addButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton7ActionPerformed
        labelCounter7 = Integer.parseInt(quantity7.getText());
        labelCounter7++;
        quantity7.setText(Integer.toString(labelCounter7));
        
        updateFile(ph7.getText(), labelCounter7);
    }//GEN-LAST:event_addButton7ActionPerformed

    private void reduceButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton8ActionPerformed
        labelCounter8 = Integer.parseInt(quantity8.getText());
        labelCounter8--;
        quantity8.setText(Integer.toString(labelCounter8));
    }//GEN-LAST:event_reduceButton8ActionPerformed

    private void addButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton8ActionPerformed
        labelCounter8 = Integer.parseInt(quantity8.getText());
        labelCounter8++;
        quantity8.setText(Integer.toString(labelCounter8));
        
        updateFile(ph8.getText(), labelCounter8);
    }//GEN-LAST:event_addButton8ActionPerformed

    private void reduceButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton9ActionPerformed
        labelCounter9 = Integer.parseInt(quantity9.getText());
        labelCounter9--;
        quantity9.setText(Integer.toString(labelCounter9));
    }//GEN-LAST:event_reduceButton9ActionPerformed

    private void addButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton9ActionPerformed
        labelCounter9 = Integer.parseInt(quantity9.getText());
        labelCounter9++;
        quantity9.setText(Integer.toString(labelCounter9));
        
        updateFile(ph9.getText(), labelCounter9);
    }//GEN-LAST:event_addButton9ActionPerformed

    private void reduceButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceButton10ActionPerformed
        labelCounter10 = Integer.parseInt(quantity10.getText());
        labelCounter10--;
        quantity10.setText(Integer.toString(labelCounter10));
    }//GEN-LAST:event_reduceButton10ActionPerformed

    private void addButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton10ActionPerformed
        labelCounter10 = Integer.parseInt(quantity10.getText());
        labelCounter10++;
        quantity10.setText(Integer.toString(labelCounter10));
        
        updateFile(ph10.getText(), labelCounter10);
    }//GEN-LAST:event_addButton10ActionPerformed
    // </editor-fold>
    private void houseSuppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseSuppliesActionPerformed
        housesupplies();
        // <editor-fold defaultstate="collapsed" desc="FILE READER : Household Products"> 
        try (Scanner scannerBleach = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\Bleach.txt"))) {
            int quantityBleach = scannerBleach.nextInt();
            quantity1.setText(Integer.toString(quantityBleach));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerDishSoap = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\DishSoap.txt"))) {
            int quantityDishSoap = scannerDishSoap.nextInt();
            quantity2.setText(Integer.toString(quantityDishSoap));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerLaundryDetergent = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\LaundryDetergent.txt"))) {
            int quantityLaundryDetergent = scannerLaundryDetergent.nextInt();
            quantity3.setText(Integer.toString(quantityLaundryDetergent));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerPaperTowels = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\PaperTowels.txt"))) {
            int quantityPaperTowels = scannerPaperTowels.nextInt();
            quantity4.setText(Integer.toString(quantityPaperTowels));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerRubbingAlcohol = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\RubbingAlcohol.txt"))) {
            int quantityRubbingAlcohol = scannerRubbingAlcohol.nextInt();
            quantity5.setText(Integer.toString(quantityRubbingAlcohol));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerSponges = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\Sponges.txt"))) {
            int quantitySponges = scannerSponges.nextInt();
            quantity6.setText(Integer.toString(quantitySponges));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerSoftener = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\Softener.txt"))) {
            int quantitySoftener = scannerSoftener.nextInt();
            quantity7.setText(Integer.toString(quantitySoftener));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerToiletPaper = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\ToiletPaper.txt"))) {
            int quantityToiletPaper = scannerToiletPaper.nextInt();
            quantity8.setText(Integer.toString(quantityToiletPaper));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerTrashBags = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\TrashBags.txt"))) {
            int quantityTrashBags = scannerTrashBags.nextInt();
            quantity9.setText(Integer.toString(quantityTrashBags));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerVinegar = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\Vinegar.txt"))) {
            int quantityVinegar = scannerVinegar.nextInt();
            quantity10.setText(Integer.toString(quantityVinegar));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // </editor-fold>
    }//GEN-LAST:event_houseSuppliesActionPerformed

    private void meatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatsActionPerformed
        meats();
        // <editor-fold defaultstate="collapsed" desc="FILE READER : Meat"> 
        try (Scanner scannerBacon = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Bacon.txt"))) {
            int quantityBacon = scannerBacon.nextInt();
            quantity1.setText(Integer.toString(quantityBacon));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerBeef = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Beef.txt"))) {
            int quantityBeef = scannerBeef.nextInt();
            quantity2.setText(Integer.toString(quantityBeef));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerChicken = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Chicken.txt"))) {
            int quantityChicken = scannerChicken.nextInt();
            quantity3.setText(Integer.toString(quantityChicken));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerDuck = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Duck.txt"))) {
            int quantityDuck = scannerDuck.nextInt();
            quantity4.setText(Integer.toString(quantityDuck));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerLamb = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Lamb.txt"))) {
            int quantityLamb = scannerLamb.nextInt();
            quantity5.setText(Integer.toString(quantityLamb));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerPork = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Pork.txt"))) {
            int quantityPork = scannerPork.nextInt();
            quantity6.setText(Integer.toString(quantityPork));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerSalmon = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Salmon.txt"))) {
            int quantitySalmon = scannerSalmon.nextInt();
            quantity7.setText(Integer.toString(quantitySalmon));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerShrimp = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Shrimp.txt"))) {
            int quantityShrimp = scannerShrimp.nextInt();
            quantity8.setText(Integer.toString(quantityShrimp));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerTurkey = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Turkey.txt"))) {
            int quantityTurkey = scannerTurkey.nextInt();
            quantity9.setText(Integer.toString(quantityTurkey));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner scannerTuna = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Tuna.txt"))) {
            int quantityTuna = scannerTuna.nextInt();
            quantity10.setText(Integer.toString(quantityTuna));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //</editor-fold>
    }//GEN-LAST:event_meatsActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateActionPerformed(e);
            }
        });
    }//GEN-LAST:event_updateActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        this.setVisible(false);
        Credentials credentials = new Credentials();
        credentials.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed
    
    // <editor-fold defaultstate="collapsed" desc="NAME TAGS AAAAAAAAAAAA"> 
    public void dairies(){ 
        setSubButtonsVisible(true);
        setAddButtonsVisible(true);
        setQuantityVisible(true);
        setPhVisible(true);
        
        //DAIRY PRODUCTS NAME TAGS
        ph1.setText("Butter");
        ph2.setText("Buttermilk");
        ph3.setText("Cheese");
        ph4.setText("Cottage Cheese");
        ph5.setText("Cream");
        ph6.setText("Ice Cream");
        ph7.setText("Milk");
        ph8.setText("Parmesan Cheese");
        ph9.setText("Sour Cream");
        ph10.setText("Yogurt");
    }
    
    public void beverages(){
        setSubButtonsVisible(true);
        setAddButtonsVisible(true);
        setQuantityVisible(true);
        setPhVisible(true);
        
        //BEVERAGE NAME TAGS
        ph1.setText("Apple Juice");
        ph2.setText("Coffee");
        ph3.setText("Chardonnay");
        ph4.setText("Hot Chocolate");
        ph5.setText("Iced Tea");
        ph6.setText("Lemonade");
        ph7.setText("Merlot");
        ph8.setText("Orange Juice");
        ph9.setText("Pinot Noir");
        ph10.setText("Water");
    }
    
    public void produce(){
        setSubButtonsVisible(true);
        setAddButtonsVisible(true);
        setQuantityVisible(true);
        setPhVisible(true);
        
        //PRODUCE NAME TAGS
        ph1.setText("Apples");
        ph2.setText("Carrots");
        ph3.setText("Garlic");
        ph4.setText("Grapes");
        ph5.setText("Lettuce");
        ph6.setText("Oranges");
        ph7.setText("Potatoes");
        ph8.setText("Spinach");
        ph9.setText("Tomstoes");
        ph10.setText("Watermelons");
    }
    
    public void housesupplies(){
        setSubButtonsVisible(true);
        setAddButtonsVisible(true);
        setQuantityVisible(true);
        setPhVisible(true);
        
        //SUPPLIES NAME TAGS
        ph1.setText("Bleach");
        ph2.setText("Dish Soap");
        ph3.setText("Laundry Detergent");
        ph4.setText("Paper Towels");
        ph5.setText("Rubbing Alcohol");
        ph6.setText("Sponges");
        ph7.setText("Softener");
        ph8.setText("Toilet Paper");
        ph9.setText("Trash Bags");
        ph10.setText("Vinegar");
    }
    
    public void meats(){
        setSubButtonsVisible(true);
        setAddButtonsVisible(true);
        setQuantityVisible(true);
        setPhVisible(true);
        
        //MEAT NAME TAGS
        ph1.setText("Bacon");
        ph2.setText("Beef");
        ph3.setText("Chicken");
        ph4.setText("Duck");
        ph5.setText("Lamb");
        ph6.setText("Pork");
        ph7.setText("Salmon");
        ph8.setText("Shrimp");
        ph9.setText("Turkey");
        ph10.setText("Tuna");
    }
    //</editor-fold>
    
    public void updateFile(String productName, int productQuantity){
        
    // <editor-fold defaultstate="collapsed" desc="FILE PATHS">
        String filePath = "";
        switch (productName) {
            case "Butter":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\Butter.txt";
                break;
            case "Buttermilk":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\Buttermilk.txt";
                break;
            case "Cheese":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\Cheese.txt";
                break;
            case "Cottage Cheese":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\CottageCheese.txt";
                break;
            case "Cream":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\Cream.txt";
                break;
            case "Ice Cream":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\IceCream.txt";
                break;
            case "Milk":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\Milk.txt";
                break;
            case "Parmesan Cheese":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\ParmesanCheese.txt";
                break;
            case "Sour Cream":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\SourCream.txt";
                break;
            case "Yogurt":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Dairy\\Yogurt.txt";
                break;
            case "Apple Juice":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\AppleJuice.txt";
                break;
            case "Coffee":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Coffee.txt";
                break;
            case "Chardonnay":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Chardonnay.txt";
                break;
            case "Hot Chocolate":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\HotChocolate.txt";
                break;
            case "Iced Tea":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\IcedTea.txt";
                break;
            case "Lemonade":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Lemonade.txt";
                break;
            case "Merlot":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Merlot.txt";
                break;
            case "Orange Juice":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\OrangeJuice.txt";
                break;
            case "Pinot Noir":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\PinotNoir.txt";
                break;
            case "Water":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Water.txt";
                break;
            case "Apples":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Apples.txt";
                break;
            case "Carrots":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Carrots.txt";
                break;
            case "Garlic":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Garlic.txt";
                break;
            case "Grapes":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Grapes.txt";
                break;
            case "Lettuce":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Lettuce.txt";
                break;
            case "Oranges":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Oranges.txt";
                break;
            case "Potatoes":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Potatoes.txt";
                break;
            case "Spinach":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Spinach.txt";
                break;
            case "Tomstoes":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Tomstoes.txt";
                break;
            case "Watermelons":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Watermelons.txt";
                break;
            case "Bleach":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\Bleach.txt";
                break;
            case "Dish Soap":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\DishSoap.txt";
                break;
            case "Laundry Detergent":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\LaundryDetergent.txt";
                break;
            case "Paper Towels":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\PaperTowels.txt";
                break;
            case "Rubbing Alcohol":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\RubbingAlcohol.txt";
                break;
            case "Sponges":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\Sponges.txt";
                break;
            case "Softener":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\Softener.txt";
                break;
            case "Toilet Paper":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\ToiletPaper.txt";
                break;
            case "Trash Bags":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\TrashBags.txt";
                break;
            case "Vinegar":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\House Supplies\\Vinegar.txt";
                break;
            case "Bacon":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Bacon.txt";
                break;
            case "Beef":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Beef.txt";
                break;
            case "Chicken":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Chicken.txt";
                break;
            case "Duck":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Duck.txt";
                break;
            case "Lamb":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Lamb.txt";
                break;
            case "Pork":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Pork.txt";
                break;
            case "Salmon":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Salmon.txt";
                break;
            case "Shrimp":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Shrimp.txt";
                break;
            case "Turkey":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Turkey.txt";
                break;
            case "Tuna":
                filePath = "C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Tuna.txt";
                break;
        }
        //</editor-fold>
        
        if (!filePath.isEmpty()) {
            try (PrintWriter out = new PrintWriter(new FileWriter(filePath, false))) {
                out.println(productQuantity);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton beverage;
    private javax.swing.JButton dairies;
    private javax.swing.JPanel displaypanel;
    private javax.swing.JButton houseSupplies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JButton meats;
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel ph1;
    private javax.swing.JLabel ph10;
    private javax.swing.JLabel ph2;
    private javax.swing.JLabel ph3;
    private javax.swing.JLabel ph4;
    private javax.swing.JLabel ph5;
    private javax.swing.JLabel ph6;
    private javax.swing.JLabel ph7;
    private javax.swing.JLabel ph8;
    private javax.swing.JLabel ph9;
    private javax.swing.JButton produce;
    private javax.swing.JLabel quantity1;
    private javax.swing.JLabel quantity10;
    private javax.swing.JLabel quantity2;
    private javax.swing.JLabel quantity3;
    private javax.swing.JLabel quantity4;
    private javax.swing.JLabel quantity5;
    private javax.swing.JLabel quantity6;
    private javax.swing.JLabel quantity7;
    private javax.swing.JLabel quantity8;
    private javax.swing.JLabel quantity9;
    private javax.swing.JButton reduceButton1;
    private javax.swing.JButton reduceButton10;
    private javax.swing.JButton reduceButton2;
    private javax.swing.JButton reduceButton3;
    private javax.swing.JButton reduceButton4;
    private javax.swing.JButton reduceButton5;
    private javax.swing.JButton reduceButton6;
    private javax.swing.JButton reduceButton7;
    private javax.swing.JButton reduceButton8;
    private javax.swing.JButton reduceButton9;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}