package main.com.one;

public class Driver {
    public static void main(String[] args) {
        SalariedEmployee Joe = new SalariedEmployee("Joe", "Jones", "111-11-111", 2500); 

        System.out.println(Joe.getfirstName() + " " + Joe.getlastName() + ": Weekly Salary - $" + Joe.getweeklySalary()); 
        System.out.println("hello"); 
    }
}