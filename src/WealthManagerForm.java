
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brianobioha
 */

import InheritanceDesign.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javafx.scene.layout.Pane;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class WealthManagerForm extends javax.swing.JFrame implements Receiver<Asset, AssetForm>{

    /**
     * Creates new form WealthManagerForm
     */
    public WealthManagerForm() {
        initComponents();
        minusDebt.setBorder(BorderFactory.createLineBorder(Color.red));
        plusAsset.setBorder(BorderFactory.createLineBorder(Color.green));
    }
    
    @Override
    public void receive(Asset s, AssetForm b)
    {
        this.addAsset(s,b);
    }
    @Override
    public void remove(int location){
        this.remove(location);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        assetsList = new javax.swing.JLabel();
        assetDetail = new javax.swing.JLabel();
        plusAsset = new javax.swing.JLabel();
        minusDebt = new javax.swing.JLabel();
        netWorth = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        sampleList = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        newBank = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        newStock = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        newCar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        newHouse = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        details.setColumns(20);
        details.setRows(5);
        jScrollPane1.setViewportView(details);

        assetsList.setText("Assets");

        assetDetail.setText("Assets Detail");

        plusAsset.setText("$0.00");

        minusDebt.setText("$0.00");

        netWorth.setText("Net Worth:");

        sampleList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        sampleList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sampleListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(sampleList);

        menu.setText("New");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        newBank.setText("Bank Account");
        newBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBankActionPerformed(evt);
            }
        });
        menu.add(newBank);
        menu.add(jSeparator2);

        newStock.setText("Stock");
        newStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStockActionPerformed(evt);
            }
        });
        menu.add(newStock);
        menu.add(jSeparator3);

        newCar.setText("Car");
        newCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCarActionPerformed(evt);
            }
        });
        menu.add(newCar);
        menu.add(jSeparator1);

        newHouse.setText("House");
        newHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newHouseActionPerformed(evt);
            }
        });
        menu.add(newHouse);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assetsList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assetDetail)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(netWorth)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(plusAsset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minusDebt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(65, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assetsList)
                    .addComponent(assetDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plusAsset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minusDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(netWorth))
                    .addComponent(jScrollPane4))
                .addGap(187, 187, 187))
        );

        plusAsset.getAccessibleContext().setAccessibleName("");
        plusAsset.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuActionPerformed

    private void newBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBankActionPerformed
        // TODO add your handling code here:
        BankAccountForm bank = new BankAccountForm(this);
        bank.setVisible(true);
    }//GEN-LAST:event_newBankActionPerformed

    private void newStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStockActionPerformed
        // TODO add your handling code here:
        StockForm stock = new StockForm(this);
        stock.setVisible(true);
    }//GEN-LAST:event_newStockActionPerformed

    private void newHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newHouseActionPerformed
        // TODO add your handling code here:
        HouseForm house = new HouseForm(this);
        house.setVisible(true);
    }//GEN-LAST:event_newHouseActionPerformed

    private void newCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCarActionPerformed
        // TODO add your handling code here:
        //System.out.println(assetList.size());
        CarForm car = new CarForm(this);
        car.setVisible(true);
    }//GEN-LAST:event_newCarActionPerformed

    private void sampleListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sampleListMouseClicked
        // TODO add your handling code here:
        sampleList = (JList)evt.getSource();
        details.setText("");
        if(evt.getClickCount() == 1){
            int index = sampleList.locationToIndex(evt.getPoint());
            details.append(assetList.get(index).toString());
        }
        else if(evt.getClickCount() == 2){
            int index = sampleList.locationToIndex(evt.getPoint());
            AssetForm temp = assetListForms.get(index);
            //System.out.println(index);
            //System.out.println(assetList.get(0));
            temp.setVisible(true);
            
        }
    }//GEN-LAST:event_sampleListMouseClicked

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
            java.util.logging.Logger.getLogger(WealthManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WealthManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WealthManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WealthManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WealthManagerForm().setVisible(true);
            }
        });
    }
//    public void fillRect(Graphics g){
//            g.setColor(Color.red);
//            g.drawRect(10, 10, 10, 10); 
//         
//        }
//        @Override
//        public void paint(Graphics g){
//            super.paint(g);
//            fillRect(g);
//        }
    public void addAsset(Asset add, AssetForm addForm){
        System.out.println(add.name);
        assetList.addElement(add);
        assetListForms.addElement(addForm);
        
        list.addElement(add.name);
        sampleList.setModel(list);
        
        System.out.println(assetList.size());
        plusAsset.setText("$" + Double.toString(this.AssetsTotal()));
        minusDebt.setText("$" + Double.toString(this.getDebtTotal()));
        netWorth.setText("$" + Double.toString(this.netWorth()));
    }
    public double AssetsTotal(){
        double total = 0;
        for(int i = 0; i < assetList.size(); i++){
            total += assetList.get(i).getAssetValue();
        }
        return total;
    }
    public double getDebtTotal(){
        double total = 0;
        for(int i = 0 ; i < assetList.size(); i ++){
            if(assetList.get(i) instanceof Property){
                total += ((Property)assetList.get(i)).getDebtAmount();
            }
        }
        return total;
    }
    
    public void removeAsset(int location){
        assetList.removeElementAt(location);
        assetListForms.removeElementAt(location);
    }
    public double netWorth(){
        return (this.AssetsTotal() - this.getDebtTotal());
    }
    
    private DefaultListModel list = new DefaultListModel();
    private Vector<Asset> assetList = new Vector<Asset>();
    private Vector<AssetForm> assetListForms = new Vector<AssetForm>();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assetDetail;
    private javax.swing.JLabel assetsList;
    private javax.swing.JTextArea details;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel minusDebt;
    private javax.swing.JLabel netWorth;
    private javax.swing.JMenuItem newBank;
    private javax.swing.JMenuItem newCar;
    private javax.swing.JMenuItem newHouse;
    private javax.swing.JMenuItem newStock;
    private javax.swing.JLabel plusAsset;
    private javax.swing.JList sampleList;
    // End of variables declaration//GEN-END:variables
}
