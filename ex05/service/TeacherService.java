package ex05.service;

import java.util.List;

import ex05.model.Db.DataBase;
import ex05.model.impl.Teacher;

public class TeacherService {
    
    private Teacher teacher;

    public Teacher createTeacher(String name, String lastName){
        int id;
        int size = DataBase.teachersDB.size();

        if(size == 0){
            id = 1;
        }else id = size + 1;

        teacher = new Teacher(id, name, lastName);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public void addGroupId(int teacherId, int groupId){

        try{
            teacher = getTeacherById(teacherId);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        teacher.groups.add(groupId);
    }

    public Teacher getTeacherById(int id) throws Exception{
        Teacher teacher = DataBase.teachersDB // список студентов
                .stream() // запускаем поток для вычислений
                .filter(s -> s.getId() == id) // вызываем метод фильтер, фильтруя по условию
                .findFirst() // возвращем первого подходящего по условию
                .orElse(null); // если не нашли - вернуть null

        if (teacher == null){
            throw new Exception("teacher is not found");
        }

        return teacher;
    }

    public Teacher getTeacherByGroupId(int groupId) throws Exception{
        
        Teacher teacher = DataBase.teachersDB
                .stream()
                .filter(t -> t.groups.contains(groupId))
                .findFirst()
                .orElse(null);

        if (teacher == null){
            throw new Exception("teacher is not found");
        }

        return teacher;
    }

    public List<Teacher> getTeachers(){
        return DataBase.teachersDB;
    }
}
