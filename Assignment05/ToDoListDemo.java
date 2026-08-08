import java.util.ArrayList;

public class ToDoListDemo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete DBMS assignment");
        tasks.add("Revise OS Unit 2");
        tasks.add("Submit Java lab file");

        // Using StringBuffer to build and display the task list
        StringBuffer taskList = new StringBuffer();
        taskList.append("To-Do List:\n");

        for (int i = 0; i < tasks.size(); i++) {
            taskList.append((i + 1)).append(". ").append(tasks.get(i)).append("\n");
        }

        System.out.print(taskList);
    }
}
