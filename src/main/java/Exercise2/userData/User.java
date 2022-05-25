package Exercise2.userData;

public class User extends UserName{
    private String firstName;
    private String lastName;
    private int numberOfTask;

    public User(String userName, String firstName, String lastName, int numberOfTask) {
        super(userName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfTask = numberOfTask;

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

    public int getNumberOfTask() {
        return numberOfTask;
    }

    public int setNumberOfTask(int numberOfTask) {
        this.numberOfTask = numberOfTask;
        return numberOfTask;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberOfTask='" + numberOfTask + '\'' +
                '}';
    }
}
