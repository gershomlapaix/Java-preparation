import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Subject> subjects;
    private int minStudents;
    private int maxStudents;
    private List<Student> students;

    public Group(List<Subject> subjects, int minStudents, int maxStudents){
        this.subjects = subjects;
        this.minStudents = minStudents;
        this.maxStudents = maxStudents;
        students = new ArrayList<>();
    }

//    canAddStudent method
    public boolean canAddStudent(){
        return students.size() < maxStudents;
    }

//    add a student to the group
    public void addStudent(Student student){
        students.add(student);
    }

//    get all students in a group

    public List<Student> getStudents() {
        return students;
    }
}
