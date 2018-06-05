package builder;

import java.util.HashSet;
import logicLayerBussiness.Player;
import logicLayerBussiness.Team;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER-PC
 */
public class BuilderTeam implements BuilderInterface {

    private String informationRequired;
    private int counter;
    private final String LETTERS = "[a-zA-Z]{2,10}";//Encuentra un elemento que no este entre A-Z ni a-z
    private Pattern patron;
    private Matcher match;
    private boolean results;
    private HashSet<Player> listPlayers = new HashSet();

    private Team team;

    @Override
    public void builderProject() {
        team = new Team();
    }

    @Override
    public void createName(String name) {
        patron = Pattern.compile(LETTERS);
        match = patron.matcher(name);
        results = match.matches(); //Preguntar sí se puede usar JOption
            //retornar mensaje de verificacion
         

        
    }

    @Override
    public void validatePlayer(Player player) {
        
    }

    @Override
    public Team getTeam() {
        return team;
    }

    //    @Override
//    public Project getProject() throws InvalidValidation {
//        informationRequired = "El projecto no ha sido creado por estas razones: " + "\n";
//        if (project.getName() == null || project.getName().equals("")) {
//            informationRequired += "El nombre es invalido" + "\n";
//        }
//        if (project.getInCharge() == null || project.getInCharge().getIdNumber().equals("") && project.getInCharge().getIdNumber() == null) {
//            informationRequired += "El encargado ingresado es invalido" + "\n";
//        }
//        if (project.getTimeWeek() == 0) {
//            informationRequired += "El tiempo es menor o igual a 0" + "\n";
//        }
//        if (project.getDates() == null) {
//            informationRequired += "La fechas ingresadas son invalidas o no han sido ingresadas" + "\n";
//        } else {
//            for (int i = 0; i < project.getDates().size() - 1; i++) {
//                if (project.getDates().get(i).compareTo(project.getDates().get(i + 1)) > 0) {
//                    informationRequired += "Las fechas no estan ordenadas de forma ascendente";
//                }
//            }
//        }
//
//        if (!informationRequired.equals("El projecto no ha sido creado por estas razones: " + "\n")) {
//            throw new InvalidValidation(informationRequired);
//        }
//        return project;
//    }
}
