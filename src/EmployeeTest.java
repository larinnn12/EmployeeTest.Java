public class EmployeeTest {
    public static void main(String[] args) {
       
        System.out.println("NAME \t        YEARLY SALARY \n______________ \t_______________");
        employee emp1 = new employee("Yusra Mohammed", "Peshang Mohammed", 1666.67);
        employee emp2 = new employee("Yusra Mohammed", "Peshang Mohammed", 4166.67);

        System.out.println(emp1.getFirstName()+"    $"+emp1.getYearlySalary());
         System.out.println(emp2.getLastName()+"    $"+emp2.getYearlySalary());
        

        
        emp1.applyRaise(10);
        emp2.applyRaise(10);
        System.out.println("\n 10 precent raised yoohooooo! \n\n NAME \t        YEARLY SALARY \n______________ \t_______________");
        
        System.out.println(emp1.getFirstName()+"    $"+emp1.getYearlySalary());
         System.out.println(emp2.getLastName()+"    $"+emp2.getYearlySalary());
    }
}

