/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import logicLayerBussiness.Proof;
import logicLayerBussiness.Test;

/**
 *
 * @author LAUREN VEGA
 */
public class Principal extends javax.swing.JFrame {


    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setTransparentButton(btPlay);
        setTransparentButton(btInscription);
        setTransparentButton(btModify);
        setTransparentButton(btToList);
        setTransparentButton(btExit);
        this.setSize(450, 480);
        ImageIcon icon1 = new ImageIcon("imagenes progra/white.jpg");
        ImageIcon icon2 = new ImageIcon("imagenes progra/EscapeRoom.png");
        lbBackground.setIcon(icon1);
        jlImageIcon.setIcon(icon2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPlay = new javax.swing.JButton();
        btInscription = new javax.swing.JButton();
        btModify = new javax.swing.JButton();
        btToList = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jlImageIcon = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(410, 440));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(410, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btPlay.setBackground(new java.awt.Color(255, 255, 255));
        btPlay.setFont(new java.awt.Font("SimSun-ExtB", 1, 16)); // NOI18N
        btPlay.setForeground(new java.awt.Color(149, 17, 29));
        btPlay.setText("JUGAR");
        btPlay.setBorder(null);
        btPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 190, 40));

        btInscription.setFont(new java.awt.Font("SimSun-ExtB", 1, 16)); // NOI18N
        btInscription.setForeground(new java.awt.Color(149, 17, 29));
        btInscription.setText("INSCRIPCION");
        btInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscriptionActionPerformed(evt);
            }
        });
        getContentPane().add(btInscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, 40));

        btModify.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btModify.setForeground(new java.awt.Color(149, 17, 29));
        btModify.setText("MODIFICAR EQUIPO");
        getContentPane().add(btModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 190, 40));

        btToList.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btToList.setForeground(new java.awt.Color(149, 17, 29));
        btToList.setText("LISTADO EQUIPOS");
        btToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btToListActionPerformed(evt);
            }
        });
        getContentPane().add(btToList, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 190, 40));

        btExit.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btExit.setForeground(new java.awt.Color(149, 17, 29));
        btExit.setText("SALIR");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, 40));

        jlImageIcon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlImageIcon.setForeground(new java.awt.Color(255, 255, 255));
        jlImageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 260, 90));

        lbBackground.setMinimumSize(new java.awt.Dimension(465, 530));
        lbBackground.setPreferredSize(new java.awt.Dimension(410, 440));
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlayActionPerformed
         new Proof().create();new Proof().create();
         
         
        //        Main.user.setLocationRelativeTo(null);
        //        Main.user.getButtonEnter().setVisible(true);
        //        Main.user.getButtonSave().setVisible(false);
        //        Main.user.getTfNickName().setVisible(false);
        //        Main.user.getLbNickName().setVisible(false);
        //        Main.user.getLbEmail().setText("Usuario");
        //        Main.user.setVisible(true);
    }//GEN-LAST:event_btPlayActionPerformed

    private void btInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscriptionActionPerformed
        Test.login.setVisible(true);
        Test.login.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btInscriptionActionPerformed

    private void btToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btToListActionPerformed
        SortTeamList team = new SortTeamList(this, true);
        team.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btToListActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        try {
            Test.teamListFile.writeTeamListFile("studentFile.ser");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void setTransparentButton(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btInscription;
    private javax.swing.JButton btModify;
    private javax.swing.JButton btPlay;
    private javax.swing.JButton btToList;
    private javax.swing.JLabel jlImageIcon;
    private javax.swing.JLabel lbBackground;
    // End of variables declaration//GEN-END:variables
}
