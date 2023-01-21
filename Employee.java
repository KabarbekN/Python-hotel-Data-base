public class Employee extends Person{ // Employee extends a person
    private int salary; // encapsulated attribute for salary of Employee
    private int bonus; // encapsulated attribute for bonus of Employee
    private String department;  // encapsulated attribute for department of Employee

    public Employee(){

    } // default constructor to make it possible creating object without sending parameters

    public Employee(String firstName, String lastName, int yearOfBirth, int salary, int bonus, String department){
        super(firstName, lastName, yearOfBirth); // super method that is addressing to super class parametrised constructor
        setSalary(salary); // setting salary
        setBonus(bonus); // setting bonus
        setDepartment(departmentCheck(department)); // setting and checking department method is written above
    }

    public String departmentCheck(String department){
        String departmentLowerCase = department.toLowerCase();
        switch (departmentLowerCase){
            case "p":
                departmentLowerCase = "Production";
                break;
            case "m":
                departmentLowerCase = "Marketing";
                break;
            case "a":
                departmentLowerCase = "Accounting";
                break;
            case "s":
                departmentLowerCase = "Sales";
        }
        return departmentLowerCase; // it is a switch case condition just to make default departments by input only one symbol
    }

    public void setSalary(int salary) {
        this.salary = salary;
    } // setter for salary


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }  // setter for bonus

    public int getBonus() {
        return bonus;
    }  // getter for bonus

    public void setDepartment(String department) {
        this.department = department;
    }  //setter for department

    public String getDepartment() {
        return department;
    } // getter for department

    public int getSalary() {
        return salary + bonus;
    } // getter for salary

    @Override
    public String toString() {
        return getEmployeeInfo();
    }  // override output method to output detailed information

    public String getEmployeeInfo(){
        return getPersonInfo() + " Total salary is " + getSalary() + " Department " + getDepartment();
    }  // special method to make code more beautiful
}
