package logicLayerBussiness;
/**
 *
 * @author USER-PC
 */
public class Director {
    private static BuilderTeam builder;
    
    public Director() {
        this.builder = new BuilderTeam();
    }
    
    public BuilderTeam getBuider() {
        return builder;
    }

 
    public Team createTeam() {
        //Builder por parametro cuando es por interfaz para recibir
        
        //builder.builderTeam();
        builder.createName();
        builder.setList();
        return builder.getTeam();
    }
}
