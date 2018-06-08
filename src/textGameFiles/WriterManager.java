package textGameFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterManager {

    private BufferedWriter writer;

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(Student student) throws IOException {
        writer.write(student.toFileString() + "\n");
    }

    public void close() throws IOException {
        writer.close();
    }
    
    public void writeStudentList() throws IOException {
        for (int i = 0; i < Test.list.getSize(); i++) {
            write(Test.list.getPerson(i));
        }
    }
}
