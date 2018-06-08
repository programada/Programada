/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author USER-PC
 */
public class Team implements Serializable{

    private HashSet<Player> playerList;
    private String teamName;
    private Date date;
    private int individualRanking;
    private int rankingByTeam;

    public Team() {
        date = new Date();
    }

    public int getIndividualRanking() {
        return individualRanking;
    }

    public void setIndividualRanking(int individualRanking) {
        this.individualRanking = individualRanking;
    }

    public int getRankingByTeam() {
        return rankingByTeam;
    }

    public void setRankingByTeam(int rankingByTeam) {
        this.rankingByTeam = rankingByTeam;
    }

    public void setPlayerList(ArrayList<Player> playerList1) {
          playerList = new HashSet(playerList1);
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
        playerList.add(player);
    }  

    public void removePlayer(Player player) {
        playerList.remove(player);
    }
    
    public String printPlayerList() {
        String text = "";
        for (Iterator<Player> iterator = playerList.iterator(); iterator.hasNext();) {
            Player next = iterator.next();
            if (next != null) {
            text += next + " ";
            }
        }
        return text;
    }

    @Override
    public String toString() {
        return "Equipo: \n" + " Lista de jugadores: " + playerList.toString() + " \n Nombre del Equipo: " + teamName +
                " \nFecha de Inscripción: " + date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.teamName);
        return hash;
    }

    /****************no pueden haber equipos con los mismos nombres******************/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        return Objects.equals(this.teamName, other.teamName);
    }
    
}
