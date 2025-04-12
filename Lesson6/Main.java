package G.Lesson6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Александр", "программист java", 22);
        Student student2 = new Student(2, "Роман", "программист java", 29);
        Student student3 = new Student(3, "Алексей", "программист С", 5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student: students){
            System.out.println(student.displayInfo());
        }
    }
}
