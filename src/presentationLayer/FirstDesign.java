/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import logicLayerBussiness.Test;
import logicLayerBussiness.Timer;

/**
 *
 * @author USER-PC
 */
public class FirstDesign extends javax.swing.JDialog {
    private ArrayList<JLabel> firstLock = new ArrayList();
    /**
     * Creates new form FirstDesign
     */
    public FirstDesign(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(1109, 661);
        ImageIcon icon1 = new ImageIcon("imagenes progra/FirstDesign.png");
        //ImageIcon icon2 = new ImageIcon("imagenes progra/EscapeRoom.png");
        lbClueMouseClikedEvent(lbFirstLock, "FIRST LOCK");
        lbClueMouseClikedEvent(lbClue1, "PIEZA REDONDA DE PAISES");
        lbClueMouseClikedEvent(lbFirstQ, null);
        lbBackground.setIcon(icon1);
        firstLock.add(lbClue1);
        Thread1 t = new Thread1();
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbClock = new javax.swing.JLabel();
        lbFirstLock = new javax.swing.JLabel();
        lbSecondLock = new javax.swing.JLabel();
        lbThirdLock = new javax.swing.JLabel();
        lbFourLock = new javax.swing.JLabel();
        lbClue1 = new javax.swing.JLabel();
        lbFirstQ = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1109, 661));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbClock.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lbClock.setForeground(new java.awt.Color(255, 255, 255));
        lbClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClock.setText("00:00");
        getContentPane().add(lbClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 100, 40));

        lbFirstLock.setIcon(new javax.swing.ImageIcon("C:\\Users\\AxMCa\\Desktop\\Programada\\imagenes progra\\candadoCerrado.jpg")); // NOI18N
        getContentPane().add(lbFirstLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 90, 90));
        getContentPane().add(lbSecondLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 90, 90));
        getContentPane().add(lbThirdLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, 90, 90));
        getContentPane().add(lbFourLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, 90, 90));
        getContentPane().add(lbClue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 10, 20));
        getContentPane().add(lbFirstQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 10, 10));

        lbBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAUREN VEGA\\Documents\\NetBeansProjects\\ProgramadaI\\imagenes progra\\FirstDesign.png")); // NOI18N
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -5, 1110, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMouseClicked(java.awt.event.MouseEvent evt, String msj) {//Eventos
        if(msj != null) {
            JOptionPane.showMessageDialog(null, msj);
        } else {
            InputWindow input = new InputWindow(Test.principal, true);
            input.showMessage("¿Cual es la capital de USA?");
        }
    }
    private void lbClueMouseClikedEvent(JLabel label, String msj) {
        label.addMouseListener(new java.awt.event.MouseAdapter() {
           @Override
           public void mouseClicked(java.awt.event.MouseEvent evt) {
               lbMouseClicked(evt, msj);
           }
});
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbClock;
    private javax.swing.JLabel lbClue1;
    private javax.swing.JLabel lbFirstLock;
    private javax.swing.JLabel lbFirstQ;
    private javax.swing.JLabel lbFourLock;
    private javax.swing.JLabel lbSecondLock;
    private javax.swing.JLabel lbThirdLock;
    // End of variables declaration//GEN-END:variables

    private class Thread1 extends Thread {

        Timer t = new Timer();

        @Override
        public void run() {
            t.start();
            while (true) {
                lbClock.setText(t.getTime());
            }
        }
    }

}
