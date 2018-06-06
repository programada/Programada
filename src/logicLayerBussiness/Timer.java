/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER-PC
 */
public class Timer extends Thread {

    String timeE;
    String minutesS;
    String secondsS;
    int minutes;
    int seconds;

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 60; j++) {
                try {
                    minutes = i;
                    seconds = j;
                    if (minutes < 10) {
                        minutesS = "0" + minutes;
                    } else {
                       minutesS = String.valueOf(minutes); 
                    }
                    if (seconds < 10) {
                        secondsS = "0" + seconds;
                    } else {
                       secondsS = String.valueOf(seconds); 
                    }
                    timeE = minutesS + ":" + secondsS;
                    System.out.println(timeE);
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
