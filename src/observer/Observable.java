package observer;

/**
 *
 * @author USER-PC
 */
public interface Observable {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(Flights flight);
}
