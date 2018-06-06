/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author USER-PC
 */
public class Team {

    private HashSet<Player> teamList;//Lista de jugadores
    private String teamName;
    private Date date;

    public Team() {
        this.teamList = new HashSet();
        date = new Date();
    }

    public HashSet<Player> getTeamList() {
        return teamList;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void addToList(Player player) {
        teamList.add(player);
    }  

    public void removePlayer(Player player) {
        teamList.remove(player);
    }
    
    public String printPlayerList() {
        String text = "";
        for (Iterator<Player> iterator = teamList.iterator(); iterator.hasNext();) {
            Player next = iterator.next();
            text += next.getId() + " ";
        }
        return text;
    }

    @Override
    public String toString() {
        return "Equipo: \n" + " Lista de jugadores: " + printPlayerList() + " \n Nombre del Equipo: " + teamName +
                " \nFecha de Inscripción: " + date;
    }

    
}
