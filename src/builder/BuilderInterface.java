package builder;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER-PC
 */
public interface BuilderInterface {

    public void builderProject();

    public void createName(String name);

    public void validateInCharge(Employee employee);

    public void validateTime(int TimeWeek);

    public void validateArray(ArrayList<Date> dates);

    public Project getProject() throws InvalidValidation;

}
