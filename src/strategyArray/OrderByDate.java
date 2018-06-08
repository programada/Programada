/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyArray;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import logicLayerBussiness.Team;


/**
 *
 * @author LAUREN VEGA
 */
public class OrderByDate implements OrderInterface, Comparator<Team>{

    @Override
    public void sort(List list) {
        Collections.sort(list, this);
    }

    @Override
    public int compare(Team t, Team t1) {
        return Integer.compare(t.getDate(), t1.getDate());

    }
}
