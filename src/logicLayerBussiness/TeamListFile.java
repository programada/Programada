package logicLayerBussiness;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class TeamListFile {

    private ObjectInputStream reader;
    private ObjectOutputStream writer;

    
    public HashSet  readTeamListFile(String fileName) throws IOException, ClassNotFoundException {
        HashSet auxTeamList;
        reader = new ObjectInputStream(new FileInputStream(fileName));
        auxTeamList = (HashSet) reader.readObject();
        reader.close();
        return auxTeamList;
    }
    
    public void writeTeamListFile(String fileName) throws IOException, ClassNotFoundException {

        if (Test.teamList.getTeamList() != null) {
            writer = new ObjectOutputStream(new FileOutputStream(fileName));
            writer.writeObject(Test.teamList.getTeamList());
            writer.close();
        }
    }    

}
