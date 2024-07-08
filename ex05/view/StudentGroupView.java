package ex05.view;

import java.util.Scanner;

import ex05.controller.StudentGroupController;
import ex05.model.StudentGroup;
import ex05.model.Db.DataBase;

public class StudentGroupView {
    
    private StudentGroupController studentGroupController = new StudentGroupController();
    private StudentView studentView = new StudentView();
    private TeacherView teacherView = new TeacherView();

    public void start(){
        DataBase.fillDB();
        Scanner scanner = new Scanner (System.in);

        while(true){
            System.out.println("1 - create student");
            System.out.println("2 - find student by id");
            System.out.println("3 - change student group for student");
            System.out.println("4 - show info about all students");
            System.out.println("--------------------------------");
            System.out.println("5 - create teacher");
            System.out.println("6 - find teacher by group id");
            System.out.println("7 - add group id");
            System.out.println("8 - get group by id");
            System.out.println("9 - show info about all teachers");
            System.out.println("--------------------------------");
            System.out.println("10 - exit");
                       
            switch(scanner.nextInt()){
                case 1 -> studentView.createStudent();
                case 2 -> studentView.getById();
                case 3 -> studentView.changeStudentGroup();
                case 4 -> studentView.getAllStudents();

                case 5 -> teacherView.createTeacher();
                case 6 -> teacherView.getTeacherByGroupId();
                case 7 -> teacherView.addGroupId();
                case 8 -> getGroupById();
                case 9 -> teacherView.getTeachers();

                case 10 -> System.exit(0);
            }
        }
    }

    public StudentGroup getGroupById(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input group id: ");
        int groupId = scanner.nextInt();
        System.out.println(studentGroupController.getGroupById(groupId));
        return studentGroupController.getGroupById(groupId);
    }
}
