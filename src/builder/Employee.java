package builder;

/**
 *
 * @author USER-PC
 */
public class Employee {

    private String fullName;
    private String idNumber;

    public Employee(String fullName, String idNumber) {
        this.fullName = fullName;
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Empleado: " + "Nombre Completo:" + fullName + ", Identificación: " + idNumber;
    }

}
