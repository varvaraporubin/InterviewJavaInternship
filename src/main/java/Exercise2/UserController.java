package Exercise2;

import Exercise2.input.CreateUsersInput;
import Exercise2.userData.*;

import java.util.List;

public class UserController {

    static AllList list =new AllList();
    public static void showAllUser() {
        System.out.println("---Show all users---");
        List<User> userList = list.usersList();
        if (userList.isEmpty()) {
            System.out.println("The store does not contain items yet!");
        } else {
            userList.forEach(System.out::println);
        }
    }

    public static void showAllTasks() {
        System.out.println("---Show user's tasks---");
        List<Tasks> tasks = list.taskList();
        if (tasks.isEmpty()) {
            System.out.println("The store does not contain items yet!");
        } else {
            tasks.forEach(System.out::println);
        }
    }

    public void addUser (UserList userList){
        int size = userList.getUsers().size();
        User users = CreateUsersInput.createNewUser(size +1);
        userList.insertNewUser(users);
    }

}
