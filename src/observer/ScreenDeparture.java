package observer;

/**
 *
 * @author USER-PC
 */
public class ScreenDeparture implements Observer {

    private String textFlights;

    public ScreenDeparture(FlightsList fList) {
        fList.addObserver(this);
        this.textFlights = "";
    }

    @Override
    public void addNotifyFlight(Flights newFlight) {

        if (newFlight.isDeparture()) {
            textFlights += newFlight.toString();
        }
    }

    @Override
    public String notification() {
        return textFlights;
    }

}
