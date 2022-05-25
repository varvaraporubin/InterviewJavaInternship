package Exercise2.userData;

import Exercise2.enumT.TasksEnum;

public class Tasks extends UserName {
    private int numberOfTask;
    private TasksEnum titleTask;
    private String descriptionTask;

    public Tasks( int numberOfTask, TasksEnum titleTask, String descriptionTask) {
        this.numberOfTask = numberOfTask;
        this.titleTask = titleTask;
        this.descriptionTask = descriptionTask;
    }

    public Tasks(String userName, TasksEnum titleTask, String descriptionTask) {
        super (userName);
        this.titleTask = titleTask;
        this.descriptionTask = descriptionTask;

    }
    @Override
    public String toString() {
        return "Tasks{" +
                " userName" + userName + '\''+
                " titleTask=" + titleTask + '\'' +
                ", descriptionTask='" + descriptionTask + '\'' +
                '}';
    }
}
