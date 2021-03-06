/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import logicLayerBussiness.Test;

/**
 *
 * @author USER-PC
 */
public class SortTeamList extends javax.swing.JDialog {
    
    public SortTeamList(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon icon1 = new ImageIcon("imagenes progra/white.jpg");
        ImageIcon icon2 = new ImageIcon("imagenes progra/EscapeRoom.png");
        lbBackground.setIcon(icon1);
        jlImageIcon.setIcon(icon2);
        setTransparentButton(btDateList);
        setTransparentButton(btListName);
        setTransparentButton(btRanking);
        this.setSize(400,460);
        setLocationRelativeTo(null);
        Test.principal.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbList = new javax.swing.JLabel();
        btDateList = new javax.swing.JButton();
        btRanking = new javax.swing.JButton();
        btListName = new javax.swing.JButton();
        jlImageIcon = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 376));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbList.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        lbList.setForeground(new java.awt.Color(149, 17, 29));
        lbList.setText("LISTADO DE EQUIPOS");
        getContentPane().add(lbList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, 23));

        btDateList.setBackground(new java.awt.Color(255, 255, 255));
        btDateList.setFont(new java.awt.Font("SimSun-ExtB", 1, 16)); // NOI18N
        btDateList.setText("FECHA INSCRIPCION");
        btDateList.setBorder(null);
        btDateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDateListActionPerformed(evt);
            }
        });
        getContentPane().add(btDateList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 190, 40));

        btRanking.setBackground(new java.awt.Color(255, 255, 255));
        btRanking.setFont(new java.awt.Font("SimSun-ExtB", 1, 16)); // NOI18N
        btRanking.setText("RANKING");
        btRanking.setBorder(null);
        btRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRankingActionPerformed(evt);
            }
        });
        getContentPane().add(btRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 190, 40));

        btListName.setBackground(new java.awt.Color(255, 255, 255));
        btListName.setFont(new java.awt.Font("SimSun-ExtB", 1, 16)); // NOI18N
        btListName.setText("NOMBRE");
        btListName.setBorder(null);
        btListName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListNameActionPerformed(evt);
            }
        });
        getContentPane().add(btListName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, 40));

        jlImageIcon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlImageIcon.setForeground(new java.awt.Color(255, 255, 255));
        jlImageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 260, 90));

        lbBackground.setPreferredSize(new java.awt.Dimension(400, 460));
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDateListActionPerformed
        Test.sList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btDateListActionPerformed

    private void btRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRankingActionPerformed
        Test.sList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btRankingActionPerformed

    private void btListNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListNameActionPerformed
        Test.sList.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btListNameActionPerformed

    private void setTransparentButton(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDateList;
    private javax.swing.JButton btListName;
    private javax.swing.JButton btRanking;
    private javax.swing.JLabel jlImageIcon;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbList;
    // End of variables declaration//GEN-END:variables
}
