package main.com.three;

import org.w3c.dom.Text;

public class Course {
    
    private String courseName; 
    private Instructor instructor;
    private Textbook textbook; 

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName; 
        this.instructor = instructor;
        this.textbook = textbook; 
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName; 
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor; 
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook; 
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor; 
    }

    public Textbook getTextbook() {
        return textbook; 
    }

    public void printCourseInfo() {
        System.out.println("The name of the course is: " + getCourseName());
        System.out.println("The first and last name of the instructor is: " + instructor.getFirstname() + " " + instructor.getLastName());
        System.out.println("The office number of the instructor is: " + instructor.getOfficeNumber());
        System.out.println("The textbook is called: " + textbook.getTitle());
        System.out.println("The textbook publisher is: " + textbook.getPublisher());
    }
}
