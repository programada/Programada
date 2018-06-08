package textGameFiles;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        //Pedir los datos de tres personas y almacenarlas en la lista
        //mostrar la lista  

        WriterManager writer = new WriterManager();
        ReaderManager reader = new ReaderManager();
        
        try {
            reader.open("studentFile.txt");
            reader.readStudentList();
            reader.close(); //importante cerrar el archivo
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        Student student1 = createStudent();
        list.add(student1);
        Student student2 = createStudent();
        list.add(student2);
        Student student3 = createStudent();
        list.add(student3);

        try {
            writer.open("studentFile.txt");
            writer.writeStudentList();
            writer.close(); //importante cerrar el archivo

        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        System.out.println("lista" + list.getListText());
    }
    
   

    /**
     * ************************************************************************
     */
    public static StudentList list = new StudentList();

    public static Student createStudent() {
        return new Student(
                JOptionPane.showInputDialog("Digite el carne:"),
                JOptionPane.showInputDialog("Digite el nombre completo:"),
                JOptionPane.showInputDialog("Digite el genero: ('f' o 'm')").charAt(0),
                Byte.parseByte(JOptionPane.showInputDialog("Digite su categoria de beca:")));

    }
}
