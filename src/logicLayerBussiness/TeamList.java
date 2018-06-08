/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import strategyArray.OrderInterface;

/**
 *
 * @author LAUREN VEGA
 */
public class TeamList implements Serializable {

    private HashSet<Team> teamList;
    private OrderInterface order;

    public void setOrder(OrderInterface order1) {
        this.order = order1;
    }

    public TeamList() {
        teamList = new HashSet<>();
    }

    public HashSet<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(HashSet<Team> teamList) {
        this.teamList = teamList;
    }
    
    public void addTeamList(Team team) {
        if (team != null) {
            teamList.add(team);
        }
    }

    public void deleteTeamList(Team team) {
        teamList.remove(team);
    }

//    public Team getTeam(String name) {
//        for (Iterator<Team> iterator = teamList.iterator(); iterator.hasNext();) {
//            Team next = iterator.next();
//            if (name.compareTo(next.getTeamName()) == 0) {
//                return next;
//            }
//        }
//        return null; //si retorna null es que el equipo no existe
//    }
    
    @Override
    public String toString() {
        String text = "";
        for (Iterator<Team> iterator = teamList.iterator(); iterator.hasNext();) {
            Team next = iterator.next();
            text += next.toString() + " \n";
        }
        return text;
    }

    public String orderPrint() {
        ArrayList<Team> list = new ArrayList<>(teamList);
        order.sort(list); //este sería el perform del patrón ya que lo que se necesita es imprimir los datos ordenados de 
        //formas diferentes
        return "Lista Equipos: \n" + teamList.toString().substring(1,
                teamList.toString().length() - 1).replace(",", "\n");
    }
}
