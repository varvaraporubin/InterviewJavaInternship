package Exercise2.input;

import Exercise2.userData.User;

import java.util.ArrayList;
import java.util.List;

public class CreateUsersInput {


    public static User createNewUser(int numberOfTask) throws NullPointerException {
        ValidationInput validationInput = new ValidationInput();
        User newUser = null;
        List<User> newUsers = new ArrayList<>();
        String firstName;
        String lastName;
        String userName;
        System.out.println("--- Create a new user---");

        System.out.println("Enter the First Name: ");
        firstName = validationInput.inputString();

        System.out.println("Enter the Last Name: ");
        lastName = validationInput.inputString();

        System.out.println("Enter the User Name: ");
        userName = validationInput.inputString();

        newUsers.add(new User(firstName, lastName, userName, numberOfTask));
        return newUser;
    }
}
