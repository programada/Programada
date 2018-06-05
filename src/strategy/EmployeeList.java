package strategy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class EmployeeList {

    private TreeSet<Employee> listEmployee;
    private SortEmployee sort;

    public EmployeeList() {
        this.listEmployee = new TreeSet<>();
    }

    public TreeSet<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(TreeSet<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public SortEmployee getSort() {
        return sort;
    }

    public void setSort(SortEmployee sort) {
        this.sort = sort;
    }

    public String order() {
        LinkedList listToShow = new LinkedList(listEmployee);
        sort.sort(listToShow);
        String txt = "";
        Iterator<Employee> iterador = listToShow.iterator();
        while (iterador.hasNext()) {
            txt += iterador.next().toString() + "\n";
        }
        return txt;

    }

}
