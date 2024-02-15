package main.com.one;

public class Driver {
    public static void main(String[] args) {
        SalariedEmployee Jones = new SalariedEmployee("Joe", "Jones", "111-11-111", 2500); 
        HourlyEmployee Smith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee Quinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47); 
        CommissionEmployee Dior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000); 
        SalariedEmployee Chanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700); 
        BaseEmployee Davenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000); 
        CommissionEmployee Vaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000); 

 
        System.out.println("Name: " + Jones.getfirstName() + " " + Jones.getlastName() + " SSN: " + Jones.getSSN() + ": Weekly Salary - $" + Jones.getweeklySalary()); 
        System.out.println("Name: " + Smith.getfirstName() + " " + Smith.getlastName() + " SSN: " + Smith.getSSN() + " Wage: " + Smith.getwage() + "Hours Worked: " + Smith.getnumberOfHoursWorked());
        System.out.println("Name: " + Quinn.getfirstName() + " " + Quinn.getlastName() + " SSN: " + Quinn.getSSN() + " Wage: " + Quinn.getwage() + "Hours Worked: " + Quinn.getnumberOfHoursWorked());
        System.out.println("Name: " + Dior.getfirstName() + " " + Dior.getlastName() + " SSN: " + Dior.getSSN() + " Commission rate: " + Dior.gecommissionRate() + " % Gross sales: " + Dior.getgrossSales());
        System.out.println("Name: " + Chanel.getfirstName() + " " + Chanel.getlastName() + " SSN: " + Chanel.getSSN() + ": Weekly Salary - $" + Chanel.getweeklySalary()); 
        System.out.println("Name: " + Davenport.getfirstName() + " " + Davenport.getlastName() + " SSN: " + Davenport.getSSN() + "Base Salary: " + Davenport.getbaseSalary());
        System.out.println("Name: " + Vaziri.getfirstName() + " " + Vaziri.getlastName() + " SSN: " + Vaziri.getSSN() + " Commission rate: " + Vaziri.gecommissionRate() + " % Gross sales: " + Vaziri.getgrossSales());



    }
}
