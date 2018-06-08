package textGameFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderManager {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public Student read() throws IOException {
        Student student = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            student = new Student();
            datos = line.split("-");
            student.setStudentId(datos[0]); // lee el número de cedula
            student.setFullName(datos[1]); // lee el nombre
            student.setGender(datos[2].charAt(0)); // lee el apellido
            student.setScholarship(Byte.parseByte(datos[3])); // lee la edad
            
        }
        return student;
    }
    
    public void readStudentList() throws IOException {
        Student student = read();
        while (student != null) {

            Test.list.add(student);
            student = read();
            
        } 
    }

    public void close() throws IOException {
        reader.close();
    }
}
