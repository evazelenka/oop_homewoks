package ex04;

import java.util.List;

// import ex04.Controller.StudentController;
import ex04.Controller.TeacherController;
// import ex04.Controller.StudentGroupController;
// import ex04.Controller.UserController;
// import ex04.Model_entity.Student;
// import ex04.Model_entity.StudentGroup;
// import ex04.Service.StudentGroupService;
import ex04.Model_entity.Teacher;

public class Main {
    public static void main(String[] args) {

        // new StudentController()
        //     .sendOnCoonsole(List.of(new Student(1, "Sasha" , "Ivanov"),
        //         new Student(2, "Irina", "Petrova")));

        TeacherController control = new TeacherController();
        control.addTeachers(List.of(new Teacher(1, "Ekaterina", "Popova"), 
        new Teacher(2, "Viktor", "Ivanov"), 
        new Teacher(3, "Ivan", "Bashmakov")));
        control.sendOnCoonsole();
        control.editTeacher(2,  "Mihail", "Pavlov");
        control.sendOnCoonsole();
        
    }
}
