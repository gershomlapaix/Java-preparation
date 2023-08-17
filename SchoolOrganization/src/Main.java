import java.util.List;

public class Main {
    public static void main(String[] args) {

        TheClass theClass = new TheClass();

//        make subjects
        Subject math = new Subject("Math");
        Subject geography = new Subject("Geography");
        Subject foreignLanguage = new Subject("Foreign Language");

//        make students and assign subjects to the student
        Student student1 = new Student("Alice", "ESG1239");
        student1.addSubject(math);
        student1.addSubject(geography);

        Student student2 = new Student("Bob", "ESG93874");
        student2.addSubject(math);
        student2.addSubject(foreignLanguage);

        Student student3 = new Student("Kareem", "ESG96474");
        student3.addSubject(math);
        student3.addSubject(foreignLanguage);

//        make groups
        Group group1 = new Group(List.of(math,geography), 2,4);
        Group group2 = new Group(List.of(math, foreignLanguage), 2, 3);

//        add students in the class
        theClass.addStudent(student1);
        theClass.addStudent(student2);
        theClass.addStudent(student3);

//        add groups in the class
        theClass.addGroup(group1);
        theClass.addGroup(group2);

//        populate the groups with the students
        theClass.organizeGroups();

//        check the result
        List<Student> unplacedStudents = theClass.getUnplacedStudents();
        System.out.println("Unplaced students: ");
        for (Student student : unplacedStudents) {
            System.out.println( student.getName());
        }
    }
}