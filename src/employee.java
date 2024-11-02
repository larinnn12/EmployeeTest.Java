

public class employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

  
    public employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        setMonthlySalary(monthlySalary); 
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    
    public void applyRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }
}


