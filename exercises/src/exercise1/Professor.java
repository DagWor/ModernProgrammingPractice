package exercise1;

import java.util.*;

public class Professor {
    private String name;
    private List<Student> students;
    private List<Grade> grades;

    public Professor(String name) {
        this.name = name;
        students = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setStudentGrade(Student student, Grade grade){
        student.addGrade(grade);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public void addGrades(Grade grades) {
        this.grades.add(grades);
    }
}
