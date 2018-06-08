package presentationLayer;

import javax.swing.ImageIcon;

public class InputWindow extends javax.swing.JDialog {
    private String answer;
    /**
     * Creates new form Messages
     */
    public InputWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTransparentButton();
        ImageIcon icon2 = new ImageIcon("Images/background.jpg");
        jlBackground.setIcon(icon2);
    }

//    public static PrincipalPage page = new PrincipalPage();
//    public static Messages mesagge = new Messages(page, true);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMessage = new javax.swing.JLabel();
        jbOk = new javax.swing.JButton();
        txtAnswer = new javax.swing.JTextField();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMessage.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jlMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMessage.setText("msj");
        getContentPane().add(jlMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 380, 70));

        jbOk.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jbOk.setForeground(new java.awt.Color(255, 255, 255));
        jbOk.setText("OK");
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });
        getContentPane().add(jbOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        txtAnswer.setFont(new java.awt.Font("SimSun-ExtB", 0, 11)); // NOI18N
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 350, -1));
        getContentPane().add(jlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jbOkActionPerformed

    public void showMessage(String text) {
        jlMessage.setText(text);
        answer = txtAnswer.getText();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setTransparentButton() {
        jbOk.setOpaque(false);
        jbOk.setContentAreaFilled(false);
        jbOk.setBorderPainted(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbOk;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlMessage;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}
