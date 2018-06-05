package builder;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER-PC
 */
public class Project {

    private String name;
    private Employee inCharge;
    private int timeWeek;
    private ArrayList<Date> dates;

    public Project(String name, Employee inCharge, int timeWeek, ArrayList<Date> dates) {
        this.name = name;
        this.inCharge = inCharge;
        this.timeWeek = timeWeek;
        this.dates = dates;
    }

    Project() {
        this.name = "";
        this.inCharge = null;
        this.timeWeek = 0;
        this.dates = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getInCharge() {
        return inCharge;
    }

    public void setInCharge(Employee inCharge) {
        this.inCharge = inCharge;
    }

    public int getTimeWeek() {
        return timeWeek;
    }

    public void setTimeWeek(int timeWeek) {
        this.timeWeek = timeWeek;
    }

    public ArrayList<Date> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Proyecto:" + " Nombre:" + name + ", Encargado: " + inCharge + ", Tiempo en semanas" + timeWeek + ", Fechas: " + dates;
    }

}
