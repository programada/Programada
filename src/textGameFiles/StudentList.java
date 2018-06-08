/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textGameFiles;

/**
 *
 * @author Lauren Vega
 */
public class StudentList {
    

    private Student[] list;
    private int count;
    private final int INITIAL_SIZE = 20;

    public StudentList() {
        list = new Student[INITIAL_SIZE];
    }
    
    public void add(Student student) throws NullPointerException {
        if (student == null) {
            throw new NullPointerException("La persona a insertar no puede ser null");
        }
        if (count == list.length) {
            increase();
        }
        list[count++] = student;
    } 
    
    public Student getPerson(int index) throws ArrayIndexOutOfBoundsException {
        return list[index];
    }
    
    public int getSize() {
        return count;
    }

    private void increase() {
        Student[] newList = new Student[list.length * 2];
        System.arraycopy(list, 0, newList, 0, list.length);
        list = newList;
    }
    
    public String getListText() {
        String txt = "Lista de estudiantes:\n\n";
        for (int i = 0; i < count; i++) {
            txt += list[i] + "\n";
        }
        return txt;
    }
 

}
