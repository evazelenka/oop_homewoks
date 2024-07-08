package ex05.view;

import java.util.List;
import java.util.Scanner;

import ex05.controller.StudentController;
import ex05.model.impl.Student;

public class StudentView {
    
    private StudentController control = new StudentController();

    protected Student createStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("input name: ");
        String name = scanner.nextLine();
        System.out.println("input lastName: ");
        String lastName = scanner.nextLine();
        System.out.println("input groupId: ");
        int groupId = scanner.nextInt();

        Student student = control.createStudent(name, lastName, groupId);
        System.out.println(student);
        return student;
    }

    protected Student getById(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("input id: ");
        int id = scanner.nextInt();

        System.out.println(control.getById(id));
        return control.getById(id);
    }

    protected List<Student> getAllStudents(){
        System.out.println(control.getAllStudents());
        return control.getAllStudents();
    }

    protected Student changeStudentGroup(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input student id: ");
        int studentId = scanner.nextInt();
        System.out.println("Input new group id: ");
        int newGroupId = scanner.nextInt();

        System.out.println(control.changeStudentGroup(studentId, newGroupId));
        return control.changeStudentGroup(studentId, newGroupId);
    }

}
