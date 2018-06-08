package logicLayerBussiness;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author USER-PC
 */
public class Player implements Serializable{
    private String id;

    public Player(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /****************no pueden haber jugadores con los mismos id dentro de un mismo equipo ******************/
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.id);
        return hash;
    }

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
        final Player other = (Player) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Jugador: " + "ID: " + id;
    }
    
    
    
}
