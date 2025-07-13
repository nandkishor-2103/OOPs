package Single_Inheritance_Lec;

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

public class Main {
    public static void main(String[] args) {
        // School school = new School();
        Student student = new Student("Radha");

        student.printSchoolName();
        student.printStudentName();
    }
}
