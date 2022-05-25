package Exercise2.input;

import Exercise2.userData.Tasks;
import Exercise2.enumT.TasksEnum;

public class CreateTasksInput {

    public static Tasks addTaskUser() {
        int numberOfTask =0;
        ValidationInput validationInput = new ValidationInput();
        String userName;
        TasksEnum tasksEnum;
        String descriptionTask;

        System.out.println("Enter the user name: ");
        userName=validationInput.inputString();
        System.out.println("Enter the title task: ");
        tasksEnum=getInputTitleTask(validationInput);
        System.out.println("Enter the description of task: ");
        descriptionTask = validationInput.inputString();

        return new Tasks(userName,tasksEnum,descriptionTask);

    }
    private static TasksEnum getInputTitleTask(ValidationInput validationInput) {
        TasksEnum tasksEnum = null;
        boolean valid = true;
        while (valid) {
            System.out.println("Choose one of the title task:");
            System.out.println("1. " + TasksEnum.READ + "\n" + "2. " + TasksEnum.CALCULATE + "\n" + "3. " + TasksEnum.ANALYSE +
                    "\n" + "4. " + TasksEnum.WRITE);

            int titleTasks = validationInput.inputInt();
            switch (titleTasks) {
                case 1:
                    tasksEnum = TasksEnum.READ;
                    valid = false;
                    break;
                case 2:
                    tasksEnum = TasksEnum.CALCULATE;
                    valid = false;
                    break;
                case 3:
                    tasksEnum = TasksEnum.ANALYSE;
                    valid = false;
                    break;
                case 4:
                    tasksEnum = TasksEnum.WRITE;
                    valid =false;
                    break;
                default:
                    System.out.println("You have introduced a non-existing category\n");

            }
        }
        return tasksEnum;
    }
}
