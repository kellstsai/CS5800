package main.com.three;

public class AggregationDriver {
    public static void main(String[] args) {
        Instructor instructorOne = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbookOne = new Textbook("Clean Code", "Robert C Martin", "Prentice Hall");
        Course courseOne = new Course("CS 5800 Advanced Software Engineering", instructorOne, textbookOne);
        
        Instructor instructorTwo = new Instructor("Dave", "Johannsen", "3-302");
        Textbook textbookTwo = new Textbook("Computer Architecture, A Quantitative Approach", "John Hennessy", "Morgan Kaufmann");
        Course courseTwo = new Course("CS 5250 Advanced Computer Architecture", instructorTwo, textbookTwo);


        courseOne.printCourseInfo();
        System.out.println(""); 
        courseTwo.printCourseInfo();

}
}
