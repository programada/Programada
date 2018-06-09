/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataLayer;

/**
 *
 * @author AxMCa
 */
public class Question {
    private String question;
    private String answer;
    private String thematic;
    
    public Question() {
    
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getThematic() {
        return thematic;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setThematic(String thematic) {
        this.thematic = thematic;
    }
    
    
    
    
    public String toFileString() {
            return question + "-" + answer + "-" + thematic;
        }

    
    
    
   
}
