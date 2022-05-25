package Exercise2;

import Exercise2.input.CreateTasksInput;
import Exercise2.input.ValidationInput;
import Exercise2.userData.AllList;
import Exercise2.userData.UserList;

import static java.awt.SystemColor.menu;

public class main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        ValidationInput validationInput = new ValidationInput();
        UserList userList = new UserList();
        userList.setUsers(AllList.usersList());


        String[] menu = {
                "Create new user", "Show all Users", "Add a task to the user",
                "Show user's tasks", "Exit"
        };
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }


        boolean run = true;
        while (run) {
            int option = validationInput.inputInt();
            switch (option) {
                case 0:
                    userController.addUser(userList);
                    break;
                case 1:
                    UserController.showAllUser();
                    break;
                case 2:
                    CreateTasksInput.addTaskUser();
                    break;
                case 3:
                    UserController.showAllTasks();
                    break;
                case 4: {
                    run = false;
                    System.out.println("Have a nice day!");
                    break;
                }
                default:
                    System.out.println("This option does not exist! Try again!");
            }

        }
        validationInput.closeScanner();

    }

}
