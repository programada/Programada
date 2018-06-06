package builder;

import logicLayerBussiness.Player;
import logicLayerBussiness.Team;

/**
 *
 * @author USER-PC
 */
public interface BuilderInterface {

    public void builderTeam();

    public void createName();

    public void validatePlayerList(Player PlayerR);

    public Team getTeam();

}
