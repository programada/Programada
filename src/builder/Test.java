package builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER-PC
 */
public class Test {

    public static void main(String[] args) throws ParseException {//El patron es la clase que haga uso del patron
        BuilderTeam b = new BuilderTeam();
        b.createName("Hola17");
//        try {
//            Director d = new Director();
//
//            Employee e1 = new Employee("Juan Quiros", "206492055");
//            ArrayList<Date> dates = new ArrayList<>();
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//
//            Date date = dateFormat.parse("2018/04/10");
//            //Date date2 = dateFormat.parse("2018/04/29");//Excepcion de orden de fechas
//            Date date3 = dateFormat.parse("2018/04/19");
//
//            dates.add(date);
//            //dates.add(date2);//Excepcion de orden de fechas
//            dates.add(date3);
////            Project project = d.createProject(null, "Encargo de Projecto 1", e1, 1, dates);
////            System.out.println(project.toString());
////        } catch (InvalidValidation exc) {
//            System.out.println(exc.getInformationRequired());
//        }
    }
}
