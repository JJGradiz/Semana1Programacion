package ni.edu.uam.sesion3.dao;

import ni.edu.uam.sesion3.models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDAO {
    private List<Student> students;


    public StudentDAO() {
        students = new ArrayList<>();
    }

    public List<Student> getAll() {
        return students;
    }

    public void add (Student student) {
        students.add(student);
    }

    public double getAverage(){
       return students.stream().mapToDouble(Student::getGrade).sum();
    }
}
