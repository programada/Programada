package observer;

import java.time.LocalTime;

/**
 *
 * @author USER-PC
 */
public class Flights {

    private String flightsNumber;
    private boolean departure;
    private String country;
    private String airline;
    private String gateNumber;
    private LocalTime hourFlight;

    public Flights(String flightsNumber, boolean departure, String country, String airline, String gateNumber, LocalTime hourFlight) {
        this.flightsNumber = flightsNumber;
        this.departure = departure;
        this.country = country;
        this.airline = airline;
        this.gateNumber = gateNumber;
        this.hourFlight = hourFlight;
    }

    public String getFlightsNumber() {
        return flightsNumber;
    }

    public void setFlightsNumber(String flightsNumber) {
        this.flightsNumber = flightsNumber;
    }

    public boolean isDeparture() {
        return departure;
    }

    public void setDeparture(boolean departure) {
        this.departure = departure;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public LocalTime getHourFlight() {
        return hourFlight;
    }

    public void setHourFlight(LocalTime hourFlight) {
        this.hourFlight = hourFlight;
    }

    @Override
    public String toString() {
        if (departure == true) {
            return "Vuelo:" + "Numero de Vuelo: " + flightsNumber + " Tipo: Vuelo de Salidad " + ", Pais : " + country + ", Aerolinea: " + airline + ", Número de Puerta: " + gateNumber + ", Hora de Despegue: " + hourFlight.toString();

        }
        return "Vuelo:" + "Numero de Vuelo: " + flightsNumber + ", Tipo: Vuelo de Llegada" + ", Pais de Origen=" + country + ", Aerolínea=" + airline + ", Numero de Puerta: " + gateNumber + ", Hora de Llegada: " + hourFlight.toString();
    }

}
