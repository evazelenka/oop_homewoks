package ex05.view;

import java.util.List;
import java.util.Scanner;

import ex05.controller.TeacherController;
import ex05.model.impl.Teacher;

public class TeacherView {
    
    private TeacherController teacherController = new TeacherController();

    public Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input teacher name: ");
        String name = scanner.nextLine();
        System.out.println("Input teacher last name: ");
        String lastName = scanner.nextLine();

        Teacher teacher = teacherController.createTeacher(name, lastName);
        System.out.println(teacher);
        return teacher;
    }

    public void addGroupId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input teacher id: ");
        int teacherId = scanner.nextInt();
        System.out.println("Input Group id: ");
        int groupId = scanner.nextInt();
        teacherController.addGroupId(teacherId, groupId);
    }

    public Teacher getTeacherById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id: ");
        int id = scanner.nextInt();
        System.out.println(teacherController.getTeacherById(id));
        return teacherController.getTeacherById(id);
    }

    public Teacher getTeacherByGroupId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input group id: ");
        int groupId = scanner.nextInt();
        System.out.println(teacherController.getTeacherByGroupId(groupId));
        return teacherController.getTeacherByGroupId(groupId);
    }

    public List<Teacher> getTeachers(){
        System.out.println(teacherController.getTeachers());
        return teacherController.getTeachers();
    }
}
