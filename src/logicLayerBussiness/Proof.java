/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import presentationLayer.FirstDesign;

/**
 *
 * @author LAUREN VEGA
 */
public class Proof {

    public void create() {
        Thread1 t = new Thread1();
        t.start();
    }

    private class Thread1 extends Thread {

        @Override
        public void run() {
            FirstDesign f = new FirstDesign(Test.principal, true);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        }
    }
}
