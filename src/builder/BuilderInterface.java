package builder;

import logicLayerBussiness.Player;
import logicLayerBussiness.Team;

/**
 *
 * @author USER-PC
 */
public interface BuilderInterface {

    public void builderProject();

    public void createName(String name);

    public void validatePlayer(Player player);

    public Team getTeam();

}
