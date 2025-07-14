
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

// Multilevel Inheritance
class Parent extends Student {
    private String name;

    Parent(String name, String studentName) {
        super(studentName);
        this.name = name;
    }

    void printParentName() {
        System.out.println("Parent name : " +name);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Dad", "Radha");
        parent.printParentName();
        parent.printStudentName();
        parent.printSchoolName();
    }
}
