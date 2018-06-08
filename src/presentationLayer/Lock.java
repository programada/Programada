/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentationLayer;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author AxMCa
 */
public class Lock {
    private JLabel principal;
    private ArrayList<JLabel> imagesClues;
    private final String CODE = "holahola";

    public Lock(JLabel principal) {
        this.principal = principal;
        imagesClues = new ArrayList<>();
    }
    
    public boolean openLock(String code) { 
        if (code.compareTo(CODE) == 0) {
        principal.setIcon(new ImageIcon("C:\\Users\\AxMCa\\Desktop\\Programada\\imagenes progra\\candadoAbierto.jpg")); // se pone la imagen del cantado abierto
        disableClues();
        return true;
        } else {
            return false; 
        }
    }
    // desabilita las pistas del candado
    private void disableClues() {
        for (JLabel imagesClues : imagesClues) {
            imagesClues.setEnabled(false);
        } 
    
    }
    
    // habilita las pistas del candado
    private void enableClues() {
        for (JLabel imagesClues : imagesClues) {
            imagesClues.setEnabled(true);
        } 
    
    }

    public void addClue(JLabel clue) {
        imagesClues.add(clue);
    }
    
    
    
    
    

    
    
}
