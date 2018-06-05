package builder;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER-PC
 */
public class Director {

    public Director() {

    }

    public Project createProject(BuilderProject project, String name, Employee inCharge, int timeWeek, ArrayList<Date> dates) throws InvalidValidation {
        //Builder por parametro cuando es por interfaz para recibir
        if (project == null) {
            project = new BuilderProject();
            project.builderProject();
        }
        project.createName(name);
        project.validateInCharge(inCharge);
        project.validateTime(timeWeek);
        project.validateArray(dates);

        return project.getProject();
    }
}
