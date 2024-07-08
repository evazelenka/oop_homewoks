package ex05.service;

import java.util.List;

import ex05.model.StudentGroup;
import ex05.model.Db.DataBase;
import ex05.model.impl.Student;

public class StudentService {

    private Student student;
    
    public Student createStudent(int groupId, String name, String lastName){
        int id;
        int size = DataBase.studentsDB.size();

        if(size == 0){
            id = 1;
        }else id = size + 1;

        student = new Student(id, name, lastName, groupId);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception{
        // return DataBase.studentsDB.get(id - 1);

        Student student = DataBase.studentsDB // список студентов
                .stream() // запускаем поток для вычислений
                .filter(s -> s.getId() == id) // вызываем метод фильтер, фильтруя по условию
                .findFirst() // возвращем первого подходящего по условию
                .orElse(null); // если не нашли - вернуть null

        if (student == null){
            throw new Exception("Student is not found");
        }

        return student;
    }

    public StudentGroup getByGroupId(int groupId) {
        
        StudentGroup group = new StudentGroup(groupId);
        DataBase.studentsDB
                .stream()
                .filter(s -> s.groupId == groupId)
                .forEach(s -> group.students.add(s));

        return group;
    }

    public List<Student> getStudents(){
        return DataBase.studentsDB;
    }

    public Student changeStudentGroup(int studentId, int newGroupId) throws Exception{
        Student student = DataBase.studentsDB
                .stream()
                .filter(s -> s.getId() == studentId)
                .findFirst()
                .orElse(null);
        if(student == null){
            throw new Exception("student is not found");
        }else{
            student.groupId = newGroupId;
        }

        return student;
        
    }
}
