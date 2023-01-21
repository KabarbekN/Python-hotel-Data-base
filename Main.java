public class Main {
    public static void main(String[] args) {


        Person person = new Person("Bill", "Gates", 2003);
        person.checkAge(); // age checker
        System.out.println(person); // output of object Person

        Employee employee = new Employee("Abay", "Kunanbayev", 1967 , 5000, 4000, "p");
        System.out.println(employee);
        Employee employee1 = new Employee("Bill", "Kunanbayev", 1967 , 5000, 4000, "A");
        System.out.println(employee1);
        Employee employee2 = new Employee("Buffet", "Kunanbayev", 1967 , 5000, 4000, "S");
        System.out.println(employee2); // output of object Employee

        RegularEmployee regularEmployee = new RegularEmployee("Buffet", "Kunanbayev", 1967 , 5000, 4000, "S", "Manhattan");
        System.out.println(regularEmployee);
        regularEmployee.closeProject(); // project closer
        System.out.println(regularEmployee.getSalary()); // output of getSalary

        regularEmployee.setProjectStatus("MVP");
        System.out.println(regularEmployee.getProjectStatus());

    }
}