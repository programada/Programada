/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author USER-PC
 */
public class Login extends javax.swing.JDialog {
    Principal principal = Principal.getInstance();

    /**
     * Creates new form Login
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTransparentButton(btAddPlayers);
        ImageIcon icon1 = new ImageIcon("imagenes progra/white.jpg");
        ImageIcon icon2 = new ImageIcon("imagenes progra/EscapeRoom.png");
        jlImage.setIcon(icon2);
        lbBack.setIcon(icon1);
        setLocationRelativeTo(null);
        principal.dispose();
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
        jlInscription = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jlPlayer = new javax.swing.JLabel();
        jlWarningDate = new javax.swing.JLabel();
        btAddPlayers = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlImage.setPreferredSize(new java.awt.Dimension(260, 90));
        getContentPane().add(jlImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 11, -1, -1));

        jlInscription.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jlInscription.setForeground(new java.awt.Color(149, 17, 29));
        jlInscription.setText("INSCRIPCION");
        getContentPane().add(jlInscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 139, 119, 23));

        jlName.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jlName.setText("NOMBRE DE EQUIPO:");
        getContentPane().add(jlName, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 201, -1, -1));

        jtName.setFont(new java.awt.Font("SimSun-ExtB", 0, 14)); // NOI18N
        jtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNameActionPerformed(evt);
            }
        });
        getContentPane().add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 198, 226, -1));

        jlPlayer.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jlPlayer.setText("JUGADORES:");
        getContentPane().add(jlPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 261, 126, -1));

        jlWarningDate.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jlWarningDate.setForeground(new java.awt.Color(149, 29, 17));
        jlWarningDate.setText("LA FECHA CORRESPONDE A LA ACTUAL");
        getContentPane().add(jlWarningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 319, 268, -1));

        btAddPlayers.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        btAddPlayers.setForeground(new java.awt.Color(102, 102, 102));
        btAddPlayers.setText("AGREGAR");
        getContentPane().add(btAddPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 250, 132, 30));
        getContentPane().add(lbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 400, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNameActionPerformed
        
        
    }//GEN-LAST:event_jtNameActionPerformed

    
        public void setTransparentButton(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddPlayers;
    private javax.swing.JLabel jlImage;
    private javax.swing.JLabel jlInscription;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPlayer;
    private javax.swing.JLabel jlWarningDate;
    private javax.swing.JTextField jtName;
    private javax.swing.JLabel lbBack;
    // End of variables declaration//GEN-END:variables
}
