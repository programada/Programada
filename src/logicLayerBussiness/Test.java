/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import java.io.IOException;
import presentationLayer.FirstDesign;
import presentationLayer.Principal;
import dataLayer.ReadFirstClue;
/**
 *
 * @author LAUREN VEGA
 */
public class Test {
    private static ReadFirstClue read = ReadFirstClue.getInstance();

    public static void main(String[] args) {
        try {
            read.open("wordList.txt");
            read.read();
            read.close();

        } catch (IOException e) {
            System.err.println("No se leyó el archivo de texto de palabras");
        }
        
//        Principal frame = Principal.getInstance();
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//            
////        frame.setVisible(true);
////        frame.setLocationRelativeTo(null);
////        Timer t = new Timer();
////        t.start();
//          FirstDesign f = new FirstDesign(frame, false);
//          f.setVisible(true);
//          f.setLocationRelativeTo(null);
          
    }
}
