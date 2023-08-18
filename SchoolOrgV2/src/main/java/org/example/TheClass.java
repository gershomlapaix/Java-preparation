package org.example;

import java.util.ArrayList;
import java.util.List;

public class TheClass {

//    properties of the class
    private List<Student> students;
    private List<Group> groups;

//    constructor
    public TheClass(){
        students = new ArrayList<>();
        groups = new ArrayList<>();
    }

//    A method to add student into the class
    public void addStudent(Student student){
        students.add(student);
    }

//    A method to form new groups in class
    public void addGroup(Group group) {
        groups.add(group);
    }

//    A method to populate groups with students from the class
    public void organizeGroups(){
        // go through all the groups
        for(Group group: groups){
            // go through all the students of the class
            for(Student student: students){
                // check if the students' desired subjects match the group's subjects and
                // if the group can still allow more students to join it
                if(student.getSubjects().containsAll(group.getSubjects()) && group.canAddStudent()){
                    // if the condition met, then add a student in a group
                    group.addStudent(student);
                }

            }
        }
    }

    //    A method to get all the unplaced students in the school
    public List<Student> getUnplacedStudents() {
        List<Student> unplacedStudents = new ArrayList<>();
        for (Group group : groups) {
// If the capacity of a group is reached or number of required students isn’t reached, those
//students are unplaced
            if (group.getStudents().size() < group.getMinStudents() ||
                    group.getStudents().size() > group.getMaxStudents()) {
                unplacedStudents.addAll(group.getStudents());
            }
        }
        return unplacedStudents;
    }

}
