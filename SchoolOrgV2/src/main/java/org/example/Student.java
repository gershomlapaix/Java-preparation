package org.example;// This class describes the attributes and behaviors of the student

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

//    A method to assign subjects to the student
    public void addSubject(Subject subject){
        subjects.add(subject);
    }

//   Get all subjects of this student
    public List<Subject> getSubjects(){
        return subjects;
    }

// Get the name of student
    public String getName(){
        return name;
    }

//    Get a card id
    public String getCardId(){
        return cardId;
    }
}
