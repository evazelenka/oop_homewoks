package ex03;

import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;
import ex03.Stream.StreamService;
import ex03.Stream.StudentStream;
import ex03.Student.Student;
import ex03.StudentGroup.StudentGroup;

// import java.util.Iterator;

public class Program {
    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup("himiki");
        StudentGroup studentGroup2 = new StudentGroup("biologi");
        StudentGroup studentGroup3 = new StudentGroup("matematiki");
        StudentGroup studentGroup4 = new StudentGroup("philosophy");

        Student ivan = new Student("Ivan", 12345);
        Student eva = new Student("Eva", 184610);
        Student vika = new Student("Viktoria", 34159);
        Student vlad = new Student("vladislav", 1230945);
        Student vanya = new Student("ivan", 654610);
        Student katya = new Student("Ekaterina", 34159879);
        Student yana = new Student("Yana", 7012345);
        Student mitya = new Student("Dmitriy", 18654610);
        Student masha = new Student("Maria", 834159);
        Student nata = new Student("Natasha", 92345);
        Student kiri4 = new Student("Kirill", 100610);
        Student olya = new Student("Olga", 77159);

        studentGroup1.addStudent(vika);
        studentGroup1.addStudent(eva);
        studentGroup1.addStudent(ivan);

        studentGroup2.addStudent(vlad);

        studentGroup3.addStudent(vanya);
        studentGroup3.addStudent(katya);

        studentGroup4.addStudent(yana);
        studentGroup4.addStudent(mitya);
        studentGroup4.addStudent(masha);
        studentGroup4.addStudent(nata);
        studentGroup4.addStudent(kiri4);
        studentGroup4.addStudent(olya);

        StudentStream firstCourse = new StudentStream("first");
        StudentStream secondCourse = new StudentStream("second");
        StudentStream funCourse = new StudentStream("fun");

        firstCourse.addGroups(studentGroup4);
        firstCourse.addGroups(studentGroup2);
        firstCourse.addGroups(studentGroup3);
        secondCourse.addGroups(studentGroup3);
        funCourse.addGroups(studentGroup1);
        funCourse.addGroups(studentGroup4);
        funCourse.addGroups(studentGroup3);
        funCourse.addGroups(studentGroup2);

        System.out.println(List.of(firstCourse, funCourse, secondCourse, funCourse));

        StreamService service = new StreamService(new ArrayList<>(List.of(firstCourse, secondCourse, funCourse)));
        service.addStream(funCourse);
        service.streamSort();

        // ArrayList<Student> arrayList = new ArrayList<>(List.of(eva, vika, ivan));
        // System.out.println(arrayList);
        // // Collections.sort(arrayList, new StudentComparator());
        // Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id);

        // System.out.println(arrayList);

    }
}
