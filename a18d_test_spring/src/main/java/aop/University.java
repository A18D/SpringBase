package aop;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student std1 = new Student("a18d", 6, 4.6);
        Student std2 = new Student("Evin", 6, 4.2);
        Student std3 = new Student("Zina", 2, 4.8);
        
        students.add(std1);
        students.add(std2);
        students.add(std3);
    }

    public List<Student> gEtStudents() {
        //System.out.println("Count students: " + students.get(3));
        System.out.println("students: " + students);
        return students;
    }
}
