/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import logicLayerBussiness.Lock;

/**
 *
 * @author AxMCa
 */
public class secondRoom extends javax.swing.JDialog {

    /**
     * Creates new form secondRoom
     */
    public secondRoom(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lock1 = new Lock(principalLock1);
        lock1.addClue(clueLock1_1);
        lock1.addClue(clueLock1_2);
        lock1.addClue(clueLock1_3);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalLock1 = new javax.swing.JLabel();
        clueLock1_1 = new javax.swing.JLabel();
        clueLock1_2 = new javax.swing.JLabel();
        clueLock1_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        principalLock1.setText("principal");
        principalLock1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalLock1MouseClicked(evt);
            }
        });

        clueLock1_1.setText("jLabel1");

        clueLock1_2.setText("jLabel2");

        clueLock1_3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clueLock1_3)
                    .addComponent(clueLock1_2)
                    .addComponent(clueLock1_1)
                    .addComponent(principalLock1))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(principalLock1)
                .addGap(37, 37, 37)
                .addComponent(clueLock1_1)
                .addGap(18, 18, 18)
                .addComponent(clueLock1_2)
                .addGap(18, 18, 18)
                .addComponent(clueLock1_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void principalLock1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalLock1MouseClicked
        lock1.openLock("holahola");
    }//GEN-LAST:event_principalLock1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clueLock1_1;
    private javax.swing.JLabel clueLock1_2;
    private javax.swing.JLabel clueLock1_3;
    private javax.swing.JLabel principalLock1;
    // End of variables declaration//GEN-END:variables
    private Lock lock1;
    private Lock lock2;
    private Lock lock3;
    private Lock lock4;
    

}

