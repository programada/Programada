package builder;

import java.util.ArrayList;
import java.util.Iterator;
import logicLayerBussiness.Player;
import logicLayerBussiness.Team;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author USER-PC
 */
public class BuilderTeam implements BuilderInterface {

    private String informationRequired = "";
    private int counter;
    private final String VALIDATION_TEAM_NAME = "[a-zA-Z]{2,10}";//Encuentra un elemento que no este entre A-Z ni a-z
    private final String VALIDATION_PLAYER_NAME = "[a-zA-Z0-9]{2,8}";//Permite numeros letras 
    private Pattern patron;
    private Matcher match;
    private boolean results;
    private ArrayList<Player> player;
    private Team team;
    private String name;

    public BuilderTeam() {
        this.player = new ArrayList();
        this.team = new Team();
    }

    @Override
    public void builderTeam() {
        //  team = new Team(); 
    }

    public void addPlayer(Player p) {
        validatePlayerList(p);
    }

    public void setTeamName(String name) {
        this.name = name;
        createName();
    }

    @Override
    public void createName() {
        patron = Pattern.compile(VALIDATION_TEAM_NAME);
        match = patron.matcher(name);
        results = match.matches();
//           if(archivoGetTeamName.equals(name)) {
//               informationRequired += "El nombre del equipo ya existe";
//           } else
        if (results) {
            team.setTeamName(name);
        } else {
            informationRequired = "El nombre del proyecto no debe contener"
                    + " números ni caracteres especiales, además debe contener entre 2-10 caracteres. \n";

            JOptionPane.showMessageDialog(null, informationRequired, "ERROR AL INSCRIBIR EQUIPO", INFORMATION_MESSAGE);
        }
    }

    @Override
    public void validatePlayerList(Player playerR) {
        patron = Pattern.compile(VALIDATION_PLAYER_NAME);
        match = patron.matcher(playerR.getId());
        results = match.matches();
        if (results) {
            player.add(playerR);
        } else {
            informationRequired = "El idenficador de jugador sólo puede contener"
                    + " letras y números, no caracteres especiales. Además, el tamaño de"
                    + " identificador debe contener entre 2-8 caracteres.\n";
            JOptionPane.showMessageDialog(null, informationRequired, "ERROR AL INSCRIBIR EQUIPO", INFORMATION_MESSAGE);
        }
    }

    @Override
    public Team getTeam() {
        if (!"".equals(informationRequired)) {
            JOptionPane.showMessageDialog(null, "Verifique la información ingresada", "ERROR AL INSCRIBIR EQUIPO", INFORMATION_MESSAGE);
        }
        System.out.println("FIX");//QUITAR
        return team;
    }

}
