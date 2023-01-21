public class Person {
    private static int id_gen = 1; // static id for every new object that is inherited from Person attributes
    private int id; // unique id for every person this attributes
    private String firstName; // encapsulated firstName to prevent changing this variable without getters this attributes
    private String lastName; // encapsulated lastName to prevent changing this variable without getters this attributes
    private int yearOfBirth; // encapsulated yearOfBirth to prevent changing this variable without getters this attributes

    private int currentYear = 2023; // this year to use it in project and changing every year without searching this variable in whole code

    public Person(){
        id = id_gen++;
    } // Generator of id when Person object is created

    public Person(String firstName, String lastName, int yearOfBirth){ // arguments for constructor
        this(); // address to non parametrised constructor
        setFirstName(firstName); // using setter to set firstName
        setLastName(lastName); // using setter to set Last Name
        setYearOfBirth(yearOfBirth); // using setter to set year of birth
    }


    public int getId() {
        return id;
    } // just getter to take id

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } // just setter to set first name

    public String getFirstName() {
        return firstName;
    } // just getter to get first Name

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }  // just setter to set first name

    public String getLastName() {
        return lastName;
    }  // just getter to get last Name

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }  // just setter to set first name

    public int getYearOfBirth() {
        return yearOfBirth;
    } // just getter to get Year of Birth
    public String checkAge(){
        if (currentYear - getYearOfBirth() > 18){
            return "Adult";
        }
        else{
            return "Underage";
        }
    } // method that checks age of person if he is older than 18 it will return Adult else Underage

    @Override
    public String toString() {
        return getPersonInfo();
    } // Overriding output method to output information that we need when we are printing this class object

    public String getPersonInfo() {
        return id + ". " + firstName + " " + lastName + " " + yearOfBirth + " " + checkAge();
    } // special method to use this in overriding and also sending to subclasses to use this there without duplicating code
}
