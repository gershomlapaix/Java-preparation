import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public String cardId;
    private List<Subject> subjects;

    public Student(String name, String id){
        this.name = name;
        this.cardId = id;
        subjects = new ArrayList<>();
    }

//    add subjects
    public void addSubject(Subject subject){
        subjects.add(subject);
    }

//   getters and setters
    public List<Subject> getSubjects(){
        return subjects;
    }

// get names
    public String getName(){
        return name;
    }

    public String getCardId(){
        return cardId;
    }
}
