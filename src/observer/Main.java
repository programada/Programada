package observer;

import java.time.LocalTime;

/**
 *
 * @author USER-PC
 */
public class Main {

    public static void main(String[] args) {
        FlightsList fList = new FlightsList();
        Flights f1 = new Flights("122", false, "Panama", "Taca", "7956", LocalTime.now());//Arrive
        Flights f2 = new Flights("122", true, "Nicaragua", "Taca", "7956", LocalTime.now());//Departure

        ScreenArrive sArrive = new ScreenArrive(fList);
        ScreenBoth sBoth = new ScreenBoth(fList);
        ScreenDeparture sDeparture = new ScreenDeparture(fList);

        fList.addFlight(f1);
        fList.addFlight(f2);
        
        System.out.println(sArrive.notification());//Arrive
        System.out.println("\n");
        System.out.println(sDeparture.notification());//Departure
        
        System.out.println("\n");
        System.out.println(sBoth.notification());
        

    }
}
