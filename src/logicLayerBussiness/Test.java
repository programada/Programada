/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import presentationLayer.FirstDesign;
import presentationLayer.Principal;
/**
 *
 * @author LAUREN VEGA
 */
public class Test {

    public static void main(String[] args) {
        Principal frame = Principal.getInstance();
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//        Timer t = new Timer();
//        t.start();
          FirstDesign f = new FirstDesign(frame, false);
          f.setVisible(true);
          f.setLocationRelativeTo(null);
          
    }
}
