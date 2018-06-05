package observer;

import java.util.ArrayList;

/**
 *
 * @author USER-PC
 */
public class FlightsList implements Observable {//Como se tiene que observar cuando se agrega un vuelo, este tiene que ser el obvservable

    private final ArrayList<Flights> listOfFlights;
    private ArrayList<Observer> observers;//Lista de objetos que van a notificar los cambios, vease como un grupo de Whats

    public FlightsList() {
        this.listOfFlights = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addFlight(Flights flight) {
        listOfFlights.add(flight);
        notifyObservers(flight);
    }

    public void deleteFlight(Flights flight) {
        listOfFlights.remove(flight);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Flights newFlight) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.addNotifyFlight(newFlight);
        }
    }

}
