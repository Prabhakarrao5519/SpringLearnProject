package com.example.GalgotiasApp.prabhakar;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    // @Value("1")
    private int id;
    // @Value("Hy I am Prabhakar kumar Yadav")
    private String name;
    // @Value("90")
    private int marks;

    // Getter and Setter for id


    // public Student(){
    //     System.out.println("Constructor is created....");
    // }

    // public Student(int id,String name, int marks){
    //     this.id=id;
    //     this.name=name;
    //     this.marks=marks;
    // }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
