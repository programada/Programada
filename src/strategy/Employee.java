package strategy;

/**
 *
 * @author USER-PC
 */
public class Employee implements Comparable<Employee> {

    private String idNumber;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private int salary;

    public Employee(String idNumber, String firstName, String secondName, String firstLastName, String secondLastName, int salary) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.salary = salary;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "idNumber=" + idNumber + ", firstName=" + firstName + ", secondName=" + secondName + ", firstLastName=" + firstLastName + ", secondLastName=" + secondLastName + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return idNumber.compareTo(o.idNumber);
    }

}
