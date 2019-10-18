/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milktea;

/**
 *
 * @author minlihe
 */
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TeaMenu extends javax.swing.JFrame 
{

    /**
     * Creates new form TeaOption
     */
    protected ArrayList <Drinks> cart = new ArrayList<Drinks>();
    
    public TeaMenu(ArrayList <Drinks> cart) {
        initComponents();
        this.cart = cart;
        new Welcome().setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        QtyOolong = new javax.swing.JTextField();
        QtyEarlGrey = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        QtyBlack = new javax.swing.JTextField();
        QtyGreen = new javax.swing.JTextField();
        btAddToCart = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btClear = new javax.swing.JButton();
        rbtHot = new javax.swing.JRadioButton();
        rbtCold = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        checkBoxPearl = new javax.swing.JCheckBox();
        comboSugar = new javax.swing.JComboBox<>();
        checkBoxPudding = new javax.swing.JCheckBox();
        checkBoxRainbow = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        rbtOolong = new javax.swing.JRadioButton();
        rbtEarlGrey = new javax.swing.JRadioButton();
        rbtGreen = new javax.swing.JRadioButton();
        rbtBlack = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18)); // NOI18N
        jLabel1.setText("Milk Tea");

        jLabel2.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18)); // NOI18N
        jLabel2.setText("Tea");

        jLabel3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        jLabel3.setText("Qty");

        QtyOolong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyOolongActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18)); // NOI18N
        jLabel4.setText("Qty");

        btAddToCart.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btAddToCart.setText("Add To Cart");
        btAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddToCartActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(155, 50, 50));
        jLabel5.setText("Menu");

        btClear.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtHot);
        rbtHot.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        rbtHot.setText("Hot");
        rbtHot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtHotActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtCold);
        rbtCold.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        rbtCold.setText("Cold");

        jLabel6.setFont(new java.awt.Font("Luminari", 1, 18)); // NOI18N
        jLabel6.setText("Sugar");

        checkBoxPearl.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        checkBoxPearl.setText("Pearl");

        comboSugar.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        comboSugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "25%", "50%", "75%", "100%" }));

        checkBoxPudding.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        checkBoxPudding.setText("Pudding");

        checkBoxRainbow.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        checkBoxRainbow.setText("Rainbow Jelly");

        jLabel7.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel7.setText("Topping");

        buttonGroup2.add(rbtOolong);
        rbtOolong.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        rbtOolong.setText("Oolong");

        buttonGroup2.add(rbtEarlGrey);
        rbtEarlGrey.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        rbtEarlGrey.setText("Earl Grey");

        buttonGroup2.add(rbtGreen);
        rbtGreen.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        rbtGreen.setText("Green");

        buttonGroup2.add(rbtBlack);
        rbtBlack.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        rbtBlack.setText("Black");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(btClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAddToCart)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(rbtGreen)
                                            .addGap(54, 54, 54)
                                            .addComponent(QtyGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rbtBlack)
                                                .addComponent(jLabel2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(QtyBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rbtOolong)
                                                    .addComponent(rbtEarlGrey))
                                                .addGap(35, 35, 35))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(75, 75, 75)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(QtyOolong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(QtyEarlGrey, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtHot, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtCold)
                                    .addComponent(comboSugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel7)
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxPearl)
                                    .addComponent(checkBoxRainbow)
                                    .addComponent(checkBoxPudding)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QtyOolong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtOolong))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QtyEarlGrey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtEarlGrey)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtCold)
                            .addComponent(rbtHot))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboSugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(QtyBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkBoxPudding)
                                            .addComponent(rbtBlack)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QtyGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBoxRainbow)
                                    .addComponent(rbtGreen)))
                            .addComponent(jLabel7)
                            .addComponent(checkBoxPearl))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddToCart)
                    .addComponent(btClear))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddToCartActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Error");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String drinkType = "";
        int drinkQty = 0;
        if (rbtOolong.isSelected() == false && rbtEarlGrey.isSelected() == false && rbtBlack.isSelected() == false && rbtGreen.isSelected() == false )
        {
            JOptionPane.showMessageDialog(frame, "Tea type is needed" );
            new Cart(cart).setVisible(false);
            QtyOolong.setText("");
            QtyEarlGrey.setText("");
            QtyBlack.setText("");
            QtyGreen.setText("");
            checkBoxPearl.setSelected(false);
            checkBoxPudding.setSelected(false);
            checkBoxRainbow.setSelected(false);
            rbtCold.setSelected(false);
            rbtHot.setSelected(false);
            comboSugar.setSelectedIndex(0);
        }
        else
        {
            if(rbtOolong.isSelected())
            {
                drinkType = rbtOolong.getText();
                if (QtyOolong.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame, "Tea Qty is needed" );
                    new Cart(cart).setVisible(false);
                    QtyOolong.setText("");
                    QtyEarlGrey.setText("");
                    QtyBlack.setText("");
                    QtyGreen.setText("");
                    checkBoxPearl.setSelected(false);
                    checkBoxPudding.setSelected(false);
                    checkBoxRainbow.setSelected(false);
                    rbtCold.setSelected(false);
                    rbtHot.setSelected(false);
                    comboSugar.setSelectedIndex(0);
                }
                else
                {   
                    drinkQty = Integer.parseInt(QtyOolong.getText());
                    Drinks drink = new Drinks(drinkType);
                    drink.setDrinkQty(drinkQty);
                    String temp = " ";
                    if(rbtHot.isSelected())
                    {
                        temp = "hot";
                    }
                    if(rbtCold.isSelected())
                    {
                        temp = "cold";
                    }
                    drink.setTemp(temp);

                    int percentSugar = 0;
                    int percentIndex = comboSugar.getSelectedIndex();

                    switch (percentIndex)
                    {
                        case 0:
                            percentSugar = 0;
                            break;
                        case 1:
                            percentSugar = 25;
                            break;
                        case 2:
                            percentSugar = 50;
                            break;
                        case 3:
                            percentSugar = 75;
                            break;
                        case 4:
                            percentSugar = 100;
                            break;
                    }
                    drink.setPercentSugar(percentSugar);

                    String topping = " ";        
                    if(checkBoxPearl.isSelected())
                    {
                        topping = checkBoxPearl.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxPudding.isSelected())
                    {
                        topping = checkBoxPudding.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxRainbow.isSelected())
                    {
                        topping = checkBoxRainbow.getText();
                        drink.addTopping(topping);
                    }

                        cart.add(drink);
                        new Cart(cart).setVisible(true);
                }
            }
            
            if(rbtEarlGrey.isSelected())
            {
                drinkType = rbtEarlGrey.getText();
                if (QtyEarlGrey.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame, "Tea Qty is needed" );
                    new Cart(cart).setVisible(false);
                    QtyOolong.setText("");
                    QtyEarlGrey.setText("");
                    QtyBlack.setText("");
                    QtyGreen.setText("");
                    checkBoxPearl.setSelected(false);
                    checkBoxPudding.setSelected(false);
                    checkBoxRainbow.setSelected(false);
                    rbtCold.setSelected(false);
                    rbtHot.setSelected(false);
                    comboSugar.setSelectedIndex(0);
                }
                else
                {
                    drinkQty = Integer.parseInt(QtyEarlGrey.getText());
                    Drinks drink = new Drinks(drinkType);
                    drink.setDrinkQty(drinkQty);
                    String temp = " ";
                    if(rbtHot.isSelected())
                    {
                        temp = "hot";
                    }
                    if(rbtCold.isSelected())
                    {
                        temp = "cold";
                    }
                    drink.setTemp(temp);

                    int percentSugar = 0;
                    int percentIndex = comboSugar.getSelectedIndex();

                    switch (percentIndex)
                    {
                        case 0:
                            percentSugar = 0;
                            break;
                        case 1:
                            percentSugar = 25;
                            break;
                        case 2:
                            percentSugar = 50;
                            break;
                        case 3:
                            percentSugar = 75;
                            break;
                        case 4:
                            percentSugar = 100;
                            break;
                    }
                    drink.setPercentSugar(percentSugar);

                    String topping = " ";        
                    if(checkBoxPearl.isSelected())
                    {
                        topping = checkBoxPearl.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxPudding.isSelected())
                    {
                        topping = checkBoxPudding.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxRainbow.isSelected())
                    {
                        topping = checkBoxRainbow.getText();
                        drink.addTopping(topping);
                    }

                        cart.add(drink);
                        new Cart(cart).setVisible(true);
                }
            }
            
            if(rbtBlack.isSelected())
            {
                drinkType = rbtBlack.getText();
                if (QtyBlack.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame, "Tea Qty is needed" );
                    new Cart(cart).setVisible(false);
                    QtyOolong.setText("");
                    QtyEarlGrey.setText("");
                    QtyBlack.setText("");
                    QtyGreen.setText("");
                    checkBoxPearl.setSelected(false);
                    checkBoxPudding.setSelected(false);
                    checkBoxRainbow.setSelected(false);
                    rbtCold.setSelected(false);
                    rbtHot.setSelected(false);
                    comboSugar.setSelectedIndex(0);
                }
                else
                {
                    drinkQty = Integer.parseInt(QtyBlack.getText());
                    Drinks drink = new Drinks(drinkType);
                    drink.setDrinkQty(drinkQty);
                    String temp = " ";
                    if(rbtHot.isSelected())
                    {
                        temp = "hot";
                    }
                    if(rbtCold.isSelected())
                    {
                        temp = "cold";
                    }
                    drink.setTemp(temp);

                    int percentSugar = 0;
                    int percentIndex = comboSugar.getSelectedIndex();

                    switch (percentIndex)
                    {
                        case 0:
                            percentSugar = 0;
                            break;
                        case 1:
                            percentSugar = 25;
                            break;
                        case 2:
                            percentSugar = 50;
                            break;
                        case 3:
                            percentSugar = 75;
                            break;
                        case 4:
                            percentSugar = 100;
                            break;
                    }
                    drink.setPercentSugar(percentSugar);

                    String topping = "";        
                    if(checkBoxPearl.isSelected())
                    {
                        topping = checkBoxPearl.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxPudding.isSelected())
                    {
                        topping = checkBoxPudding.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxRainbow.isSelected())
                    {
                        topping = checkBoxRainbow.getText();
                        drink.addTopping(topping);
                    }

                        cart.add(drink);
                        new Cart(cart).setVisible(true);
                }
            }
            
            if(rbtGreen.isSelected())
            {
                drinkType = rbtGreen.getText();
                if (QtyGreen.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame, "Tea Qty is needed" );
                    new Cart(cart).setVisible(false);
                    QtyOolong.setText("");
                    QtyEarlGrey.setText("");
                    QtyBlack.setText("");
                    QtyGreen.setText("");
                    checkBoxPearl.setSelected(false);
                    checkBoxPudding.setSelected(false);
                    checkBoxRainbow.setSelected(false);
                    rbtCold.setSelected(false);
                    rbtHot.setSelected(false);
                    comboSugar.setSelectedIndex(0);
                }
                else
                {
                    drinkQty = Integer.parseInt(QtyGreen.getText());
                    Drinks drink = new Drinks(drinkType);
                    drink.setDrinkQty(drinkQty);
                    String temp = " ";
                    if(rbtHot.isSelected())
                    {
                        temp = "hot";
                    }
                    if(rbtCold.isSelected())
                    {
                        temp = "cold";
                    }
                    drink.setTemp(temp);

                    int percentSugar = 0;
                    int percentIndex = comboSugar.getSelectedIndex();

                    switch (percentIndex)
                    {
                        case 0:
                            percentSugar = 0;
                            break;
                        case 1:
                            percentSugar = 25;
                            break;
                        case 2:
                            percentSugar = 50;
                            break;
                        case 3:
                            percentSugar = 75;
                            break;
                        case 4:
                            percentSugar = 100;
                            break;
                    }
                    drink.setPercentSugar(percentSugar);

                    String topping = " ";        
                    if(checkBoxPearl.isSelected())
                    {
                        topping = checkBoxPearl.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxPudding.isSelected())
                    {
                        topping = checkBoxPudding.getText();
                        drink.addTopping(topping);
                    }
                    if(checkBoxRainbow.isSelected())
                    {
                        topping = checkBoxRainbow.getText();
                        drink.addTopping(topping);
                    }

                        cart.add(drink);
                        new Cart(cart).setVisible(true);

                }
            }
        }
    }//GEN-LAST:event_btAddToCartActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        QtyOolong.setText("");
        QtyEarlGrey.setText("");
        QtyBlack.setText("");
        QtyGreen.setText("");
        checkBoxPearl.setSelected(false);
        checkBoxPudding.setSelected(false);
        checkBoxRainbow.setSelected(false);
        rbtCold.setSelected(false);
        rbtHot.setSelected(false);
        comboSugar.setSelectedIndex(0);        
    }//GEN-LAST:event_btClearActionPerformed

    private void QtyOolongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyOolongActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_QtyOolongActionPerformed

    private void rbtHotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtHotActionPerformed
        // TODO add your handling code here:
        rbtHot.getText();
        System.out.println(rbtHot.getText());
    }//GEN-LAST:event_rbtHotActionPerformed

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
            java.util.logging.Logger.getLogger(TeaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    //            new TeaMenu(cart).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QtyBlack;
    private javax.swing.JTextField QtyEarlGrey;
    private javax.swing.JTextField QtyGreen;
    private javax.swing.JTextField QtyOolong;
    private javax.swing.JButton btAddToCart;
    private javax.swing.JButton btClear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkBoxPearl;
    private javax.swing.JCheckBox checkBoxPudding;
    private javax.swing.JCheckBox checkBoxRainbow;
    private javax.swing.JComboBox<String> comboSugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbtBlack;
    private javax.swing.JRadioButton rbtCold;
    private javax.swing.JRadioButton rbtEarlGrey;
    private javax.swing.JRadioButton rbtGreen;
    private javax.swing.JRadioButton rbtHot;
    private javax.swing.JRadioButton rbtOolong;
    // End of variables declaration//GEN-END:variables
}