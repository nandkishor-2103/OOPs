import java.util.*;

class Student {
    private String name;
    private List<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public void displayAllCourse() {
        for(int i = 0; i < courses.size(); i++) {
            System.out.println("Name : " + courses.get(i).getName());
        }
    }
}

class Course {
    private String name;
    private List<Student> students;

    Course(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void displayAllStudent() {
        for(int i = 0; i < students.size(); i++) {
            System.out.println("Name : " + students.get(i).getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math");
        Course cs = new Course("CS");

        Student radha = new Student("Radha");
        Student balaram = new Student("Balaram");
        Student krishn = new Student("Krishn");

        radha.addCourse((cs));
        radha.addCourse((math));
        cs.addStudent((radha));
        math.addStudent((radha));

        balaram.addCourse((cs));
        cs.addStudent((balaram));

        krishn.addCourse((math));
        krishn.addCourse(cs);
        math.addStudent((krishn));
        cs.addStudent((krishn));

        math.displayAllStudent();
        System.out.println();
        radha.displayAllCourse();
        krishn.displayAllCourse();
    }
}
