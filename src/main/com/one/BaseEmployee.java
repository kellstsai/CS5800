class BaseEmployee extends SalariedEmployee {

    private int baseSalary; 

    class BaseEmployee(String firstName, String lastName, String SSN, int weeklySalary, int baseSalary) {
        super(firstName, lastName, SSN); 
        this.baseSalary = baseSalary; 
    }

    public int getbaseSalary() {
        return baseSalary; 
    }
}