/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

import java.util.HashSet;

/**
 *
 * @author USER-PC
 */
public class Team {

    private HashSet<Player> teamList;//Lista de jugadores

    public Team() {
        this.teamList = new HashSet();
    }

    public void addToList(Player player) {
        teamList.add(player);
    }

    public void removePlayer(Player player) {
        teamList.remove(player);
    }

}
