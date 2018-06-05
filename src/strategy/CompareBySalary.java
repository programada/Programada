package strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author USER-PC
 */
public class CompareBySalary implements SortEmployee, Comparator<Employee> {

    @Override
    public void sort(LinkedList employeeList) {
        Collections.sort(employeeList, this);
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }

}
