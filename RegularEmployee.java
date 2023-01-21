public class RegularEmployee extends Employee{ // Regular employee extends Employee

    private String projectName; // encapsulated attribute for project name of Regular Employee
    private boolean state = true; // encapsulated attribute for state of Regular Employee
    private String projectStatus; // added field that was required in task

    public RegularEmployee(){

    } // default constructor to make it possible creating object without sending parameters

    public RegularEmployee(String firstName, String lastName, int yearOfBirth, int salary, int bonus, String department, String projectName){
        super(firstName, lastName, yearOfBirth, salary, bonus, department); // also super addressing to parent class parametrised constructor
        setProjectName(projectName); // setter for project name
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    } // setter for project name

    public String getProjectName() {
        return projectName;
    } // setter for get project name

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    } // setter for Project Status

    public String getProjectStatus() {
        return projectStatus;
    } // getter for Project Status

    public String convertState(boolean state){
        if (state == false){
            return "closed";
        }
        else {
            return "open";
        }
    } // checker and overrider of output from boolean to string

    public String getState(){
        return convertState(state);
    }  // returning state according to bool


    public void closeProject(){
        state = false;
    } // just a method to close this project

    @Override
    public String toString() {
        return getEmployeeInfo() + " " + projectName + " " + getState();
    } // also overriding to make code more beautiful and precise
}
