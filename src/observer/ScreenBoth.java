package observer;

/**
 *
 * @author USER-PC
 */
public class ScreenBoth implements Observer {

    private String textFlights;

    public ScreenBoth(FlightsList fList) {
        fList.addObserver(this);
        this.textFlights = "";
    }

    @Override
    public void addNotifyFlight(Flights newFlight) {

        if (newFlight.isDeparture() || !newFlight.isDeparture()) {
            textFlights += newFlight.toString() + "\n";
        }
    }

    @Override
    public String notification() {
        return textFlights;
    }

}
