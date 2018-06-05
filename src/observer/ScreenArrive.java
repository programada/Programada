package observer;

/**
 *
 * @author USER-PC
 */
public class ScreenArrive implements Observer {

    private String textFlights;

    public ScreenArrive(FlightsList fList) {
        fList.addObserver(this);
        this.textFlights = "";
    }

    @Override
    public void addNotifyFlight(Flights newFlight) {//Notificacion or handle
        if (newFlight.isDeparture() == false) {
            textFlights += newFlight.toString();
        }
    }

    @Override
    public String notification() {//Tipo String
        return textFlights;
    }

}
