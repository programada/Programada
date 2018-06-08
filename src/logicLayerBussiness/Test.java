/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

//import presentationLayer.FirstDesign;
import presentationLayer.Principal;
import java.io.IOException;
import java.util.HashSet;
import javax.swing.JOptionPane;
import presentationLayer.Login;
import presentationLayer.PlayerInscription;
import presentationLayer.SortList;
/**
 *
 * @author LAUREN VEGA
 */
public class Test {
    public static Principal principal = new Principal();
    
    public static Login login = new Login(principal, true);
    public static PlayerInscription inscription = new PlayerInscription(principal, true);
    public static SortList sList = new SortList(principal, true);
    
    
    public static TeamList teamList = new TeamList();
    public static Director director = new Director();
    public static TeamListFile teamListFile = new TeamListFile();
    public static HashSet teamList2 = new HashSet<Team>();
       
    public static void main(String[] args) {
        
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

        try {
             
        HashSet list1 = teamListFile.readTeamListFile("studentFile.ser");
        teamList2 = list1;
        teamList.setTeamList(teamList2);

        } catch(IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        //listEmployee.setOrder(new OrderByDate());
//          FirstDesign f = new FirstDesign(frame, false);
//          f.setVisible(true);
//          f.setLocationRelativeTo(null);
        

                //listEmployee.setOrder(new OrderByDate());

//          FirstDesign f = new FirstDesign(frame, false);
//          f.setVisible(true);
//          f.setLocationRelativeTo(null);
          
    }
}
