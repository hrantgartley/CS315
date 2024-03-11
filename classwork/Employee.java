/*
 * Employee class that consiss of name, department, number of years, and salary
* toString method to print out the information
 */

public class Employee {
    private String name;
    private String department;
    private int years;
    private double salary;

    public Employee(String name, String department, int years, double salary) {
        this.name = name;
        this.department = department;
        this.years = years;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "Name: " + this.getEmployeeName() + "\nDepartment: " + this.getDepartment() + "\nYears: "
                + this.getYears()
                + "\nSalary: $"
                + String.format("%.2f", this.getSalary());

    }

}
