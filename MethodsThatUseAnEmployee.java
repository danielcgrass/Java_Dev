import java.util.Scanner;

public class MethodsThatUseAnEmployee {
    public static void main(String[] args) {
        Employee myEmployee; // Employee is declared.
        myEmployee = getEmployeeData(); // Value returned from getEmployeeData() method is assigned to myEmployee object
        displayEmployee(myEmployee); // myEmployee object is passed to displayEmployee() method
    }

    public static Employee getEmployeeData() {
        // Return type is Employee
        Employee tempEmp = new Employee();
        int id;
        double sal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee ID >> ");
        id = input.nextInt();
        tempEmp.setEmpNum(id);
        System.out.print("Enter employee salary >> ");
        sal = input.nextDouble();
        tempEmp.setEmpSalary(sal);
        return tempEmp; // Employee object is returned
    }

    public static void displayEmployee(Employee anEmp) {
        // Parameter is Employee Type
        System.out.println("\nEmployee #" + anEmp.getEmpNum() + " Salary is " + anEmp.getEmpSalary());
    }
}