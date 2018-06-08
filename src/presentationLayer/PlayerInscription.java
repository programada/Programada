/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import logicLayerBussiness.Player;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import logicLayerBussiness.Test;

/**
 *
 * @author LAUREN VEGA
 */
public class PlayerInscription extends javax.swing.JDialog {

    /**
     * Creates new form PlayerInscription
     */
    public PlayerInscription(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTransparentButton(btAccept);
        setTransparentButton(btExit);
        ImageIcon icon1 = new ImageIcon("imagenes progra/white.jpg");
        ImageIcon icon2 = new ImageIcon("imagenes progra/EscapeRoom.png");
        jlImage.setIcon(icon2);
        lbBackground.setIcon(icon1);
        this.setSize(400, 330);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlImage = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        jtIdPlayer = new javax.swing.JTextField();
        btExit = new javax.swing.JButton();
        btAccept = new javax.swing.JButton();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlImage.setPreferredSize(new java.awt.Dimension(260, 90));
        getContentPane().add(jlImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        lbTitle.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(149, 17, 29));
        lbTitle.setText("INGRESE EL INDENTIFICADOR:");
        getContentPane().add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 23));

        jtIdPlayer.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        getContentPane().add(jtIdPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, -1));

        btExit.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btExit.setText("REGRESAR");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 30));

        btAccept.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btAccept.setText("ACEPTAR");
        btAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, 30));

        lbBackground.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcceptActionPerformed
        Test.login.getDirector().getBuider().addPlayer(new Player(jtIdPlayer.getText()));
        jtIdPlayer.setText("");
        dispose();

    }//GEN-LAST:event_btAcceptActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void setTransparentButton(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAccept;
    private javax.swing.JButton btExit;
    private javax.swing.JLabel jlImage;
    private javax.swing.JTextField jtIdPlayer;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
