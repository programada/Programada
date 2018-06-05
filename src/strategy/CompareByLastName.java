package strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class CompareByLastName implements SortEmployee, Comparator<Employee> {

    @Override
    public void sort(LinkedList employeeList) {
        Collections.sort(employeeList, this);
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (!o1.getFirstLastName().equals(o2.getFirstLastName())) {
            return o1.getFirstLastName().compareTo(o2.getFirstLastName());
        }
        if (!o1.getSecondLastName().equals(o2.getSecondLastName())) {
            return o1.getSecondLastName().compareTo(o2.getSecondLastName());
        }
        if (!o1.getFirstName().equals(o2.getFirstName())) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }

        return o1.getSecondName().compareTo(o2.getSecondName());
    }

}
