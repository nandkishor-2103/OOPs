package Single_Inheritance_Lec;

// Parent --> super class
class School {
    private String name;

    School(String name) {
        this.name = name;
    }

    void printSchoolName() {
        System.out.println("School name : " + name);
    }

    void demo() {
        System.out.println("demo by school");
    }
}

// Child --> subclass
class Student extends School{
    private String name;

    Student(String name) {
        super("DPS"); // parent constructor invoked/ called
        this.name = name;
    }

    void printStudentName() {
        System.out.println("Student name : " + name);
    }

    @Override
    void demo() {
        super.demo();
        System.out.println("demo by student");
    }
}

public class Main {
    public static void main(String[] args) {
        // School school = new School();
        Student student = new Student("Radha");

        student.printSchoolName();
        student.printStudentName();
        student.demo();
    }
}
