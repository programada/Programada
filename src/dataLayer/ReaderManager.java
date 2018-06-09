package dataLayer;

import textGameFiles.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import logicLayerBussiness.Test;

public class ReaderManager {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public Question read() throws IOException {
        Question question = null;
        String line = reader.readLine(); 
        String datos[];
        if (line != null) {
            question = new Question();
            datos = line.split("-");
            question.setQuestion(datos[0]); 
            question.setAnswer(datos[1]); 
            question.setThematic(datos[2]); 
            
            
        }
        return question;
    }
    
    public void readQuestionList() throws IOException {
        Question question = read();
        while (question != null) {

            Test.questionList.add(question);
            question = read();
            
        } 
    }

    public void close() throws IOException {
        reader.close();
    }
}
