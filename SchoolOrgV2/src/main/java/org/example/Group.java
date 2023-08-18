package org.example;// A class representing the structure of a group in the class

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Subject> subjects;    // group's specific subjects
    private int minStudents;
    private int maxStudents;
    private List<Student> students;

//    constructor
    public Group(List<Subject> subjects, int minStudents, int maxStudents){
        this.subjects = subjects;
        this.minStudents = minStudents;
        this.maxStudents = maxStudents;
        students = new ArrayList<>();
    }

//    A method to check if it is still possible to add students in a group
    public boolean canAddStudent(){
        return students.size() < maxStudents;
    }

//    A method to add students in a group
    public void addStudent(Student student){
        students.add(student);
    }

//    A getter method to get all students in a group
    public List<Student> getStudents() {
        return students;
    }

//    A getter method to get all subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

//    getter for maximum students

    public int getMaxStudents() {
        return maxStudents;
    }

//    getter for minimum students

    public int getMinStudents() {
        return minStudents;
    }
}
