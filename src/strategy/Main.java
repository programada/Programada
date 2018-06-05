package strategy;

/**
 *
 * @author USER-PC
 */
public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("3026400659", "Juan", "Fernando", "Ocampo", "Gomez", 12000);
        Employee e2 = new Employee("6026400659", "Pedro", "Jose", "Bolaños", "Venegas", 1200);
        Employee e3 = new Employee("1026400659", "Maria", "Auxiliadora", "Castillo", "Alfaro", 20000);
        Employee e4 = new Employee("4026400659", "Laura", "Viviana", "Leiton", "Salas", 6555655);
        Employee e5 = new Employee("9026400659", "Angie", "Patricia", "Gonzalez", "Chavez", 265977);
        Employee e6 = new Employee("2026400659", "Franciso", "Daniel", "Araya", "Vargas", 698888);

        EmployeeList list = new EmployeeList();
        list.getListEmployee().add(e1);
        list.getListEmployee().add(e2);
        list.getListEmployee().add(e3);
        list.getListEmployee().add(e4);
        list.getListEmployee().add(e5);
        list.getListEmployee().add(e6);

        list.setSort(new CompareByID());
        System.out.println(list.order() + "\n");

        list.setSort(new CompareByLastName());
        System.out.println(list.order() + "\n");

        list.setSort(new CompareBySalary());
        System.out.println(list.order());

    }

}
