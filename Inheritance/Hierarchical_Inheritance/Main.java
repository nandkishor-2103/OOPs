
// Parent --> super class
class School {
    private String name;

    School() {
        name = "DPS";
    }

    void printSchoolName() {
        System.out.println("School name : " + name);
    }
}

// Child --> subclass
class Student extends School{
    private String name;

    Student(String name) {
        this.name = name;
    }

    void printStudentName() {
        System.out.println("Student name : " + name);
    }
}

// Hierarchical level Inheritance
class Teacher extends School {
    private String name;
    private String subjectName;

    Teacher(String name, String subjectName) {
        this.name = name;
        this.subjectName = subjectName;
    }

    void printTacherInfo() {
        System.out.println("Teacher name : " +name);
        System.out.println("Subject name : " +subjectName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Radha");
        Teacher teacher = new Teacher("Rohit", "Maths");

        student.printStudentName();;
        teacher.printTacherInfo();
        teacher.printSchoolName();
    }
}
