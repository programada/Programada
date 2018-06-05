package builder;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER-PC
 */
public class BuilderProject implements BuilderInterface {

    private String informationRequired;

    private Project project;

    @Override
    public void builderProject() {
        project = new Project();
    }

    @Override
    public void createName(String name) {
        if (name != null && !name.equals("")) {
            project.setName(name);
        }
    }

    @Override
    public void validateInCharge(Employee inCharge) {
        if (inCharge != null && !inCharge.getIdNumber().equals("") && inCharge.getIdNumber() != null) {
            project.setInCharge(inCharge);
        }
    }

    @Override
    public void validateTime(int timeWeek) {
        if (timeWeek > 0) {
            project.setTimeWeek(timeWeek);
        }
    }

    @Override
    public void validateArray(ArrayList<Date> dates) {

        project.setDates(dates);
    }

    @Override
    public Project getProject() throws InvalidValidation {
        informationRequired = "El projecto no ha sido creado por estas razones: " + "\n";
        if (project.getName() == null || project.getName().equals("")) {
            informationRequired += "El nombre es invalido" + "\n";
        }
        if (project.getInCharge() == null || project.getInCharge().getIdNumber().equals("") && project.getInCharge().getIdNumber() == null) {
            informationRequired += "El encargado ingresado es invalido" + "\n";
        }
        if (project.getTimeWeek() == 0) {
            informationRequired += "El tiempo es menor o igual a 0" + "\n";
        }
        if (project.getDates() == null) {
            informationRequired += "La fechas ingresadas son invalidas o no han sido ingresadas" + "\n";
        } else {
            for (int i = 0; i < project.getDates().size() - 1; i++) {
                if (project.getDates().get(i).compareTo(project.getDates().get(i + 1)) > 0) {
                    informationRequired += "Las fechas no estan ordenadas de forma ascendente";
                }
            }
        }

        if (!informationRequired.equals("El projecto no ha sido creado por estas razones: " + "\n")) {
            throw new InvalidValidation(informationRequired);
        }
        return project;
    }

}
