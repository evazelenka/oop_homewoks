package ex05.model.Db;

import java.util.ArrayList;
import java.util.List;

import ex05.model.impl.Student;
import ex05.model.impl.Teacher;

public class DataBase {
    
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
// симуляция реальной базы данных
    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Eva", "Zelenova");
        teacher.groups.add(1);
        teachersDB.add(teacher);

        Student s1 = new Student(1, "Maria", "Ivanova", 1);
        Student s2 = new Student(2, "Viktoria", "Petrova", 1);

        studentsDB.add(s2);
        studentsDB.add(s1);
    }
    
}
