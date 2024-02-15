package main.com.three;

public class Instructor {
    private String firstName; 
    private String lastName;
    private String officeNumber; 

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName; 
        this.officeNumber = officeNumber; 
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }

    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber; 
    }

    public String getFirstname() {
        return firstName; 
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber; 
    }
}
