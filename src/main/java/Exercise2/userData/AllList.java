package Exercise2.userData;

import Exercise2.enumT.TasksEnum;

import java.util.ArrayList;
import java.util.List;

public class AllList extends RuntimeException{
    public List<Tasks> taskList() {
        List<Tasks> tasksList = new ArrayList<>();
        tasksList.add(new Tasks(1, TasksEnum.READ, "Read the conditions of project"));
        tasksList.add(new Tasks(2, TasksEnum.CALCULATE, "Calculate sum and average of the numbers"));
        tasksList.add(new Tasks(3, TasksEnum.ANALYSE, "Analyse of the obtained results"));
        tasksList.add(new Tasks(4, TasksEnum.WRITE, "Write a project"));

        return tasksList;
    }
    private List<Tasks> findAllTask() {
        return taskList();
    }

    public static List<User> usersList() {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Arron", "Jason", "Arny23", 1));
        usersList.add(new User("Kim", "Huge", "Kim", 4));
        usersList.add(new User("Joy", "Andrew", "J.A", 3));
        usersList.add(new User("Amelia", "Cat", "Kitty", 2));

        return usersList;
    }
    private List<User> findAll() {
        return usersList();
    }
}
