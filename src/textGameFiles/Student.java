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

    public class Student {
    private String studentId;
    private String fullName;
    private char gender;
    private byte scholarship;

    public Student() {
    }
    
    public Student(String studentId, String fullName, char gender, byte scholarship) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gender = gender;
        this.scholarship = scholarship;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public byte getScholarship() {
        return scholarship;
    }

    public void setScholarship(byte scholarship) {
        this.scholarship = scholarship;
    }
    
        public String toFileString() {
            return studentId + "-" + fullName + "-" + gender + "-" + scholarship;
        }

    @Override
    public String toString() {
        return "CarnÃ©: " + studentId + ", Nombre: " + fullName + ", Genero: " + gender + ", Beca: " + scholarship;
    }
        
}


