/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;



/**
 *
 * @author LAUREN VEGA
 */
public class OrderByRanking implements OrderInterface, Comparator<Employee>{

    @Override
    public void sort(List list) {
        Collections.sort(list, this);
    }
    
        @Override
    public int compare(Employee t, Employee t1) {
        if (!t.getFirstLastName().equals(t1.getFirstLastName())) {
            return t.getFirstLastName().compareTo(t1.getFirstLastName());
        }
        if (!t.getSecondLastName().equals(t1.getSecondLastName())) {
            return t.getSecondLastName().compareTo(t1.getSecondLastName());
        }
        if (!t.getFirstName().equals(t1.getFirstName())) {
            return t.getFirstName().compareTo(t1.getFirstName());
        }
        
        return t.getSecondName().compareTo(t1.getSecondName());

    }
}
