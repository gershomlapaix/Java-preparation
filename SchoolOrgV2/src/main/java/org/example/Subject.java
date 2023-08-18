package org.example;

//This class identifies the structure of a subject
public class Subject {
    private String name;

    public Subject(String name){
        this.name = name;
    }

//    getters and setters
    public void setName(String newName){
        this.name = newName;
    }

    public String getName() {
        return name;
    }
}
