package builder;

import logicLayerBussiness.Team;

/**
 *
 * @author USER-PC
 */
public class Director {

    private static final Director director = new Director();
    private static final BuilderTeam team = new BuilderTeam();
    

    public static Director getInstance() {
        return director;
    }

    public BuilderTeam getBuilder() {
        return team;
    }

    public Team createTeam() {
        //Builder por parametro cuando es por interfaz para recibir
        team.builderTeam();
        team.createName();
        //team.validatePlayerList();

        return team.getTeam();
    }
}
