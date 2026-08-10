import java.util.ArrayList; 
public class ToDoListApp { 
private ArrayList<String> tasks; 
public ToDoListApp() { 
tasks = new ArrayList<>(); 
} 
public void addTask(String task) { 
tasks.add(task); 
System.out.println("Added task: \"" + task + "\""); 
} 
public void removeTask(int index) { 
if (index >= 0 && index < tasks.size()) { 
String removed = tasks.remove(index); 
System.out.println("Removed task: \"" + removed + "\""); 
} else { 
System.out.println("Invalid task index!"); 
} 
} 
public String displayTasks() { 
if (tasks.isEmpty()) { 
return "Your To-Do List is empty."; 
} 
StringBuffer sb = new StringBuffer(); 
sb.append("--- TO-DO LIST ---\n"); 
for (int i = 0; i < tasks.size(); i++) { 
sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n"); 
} 
sb.append("Total Tasks: ").append(tasks.size()); 
return sb.toString(); 
} 
public static void main(String[] args) { 
ToDoListApp app = new ToDoListApp();  
System.out.println("=== ADDING TASKS ==="); 
app.addTask("Complete Java Assignment 5"); 
app.addTask("Revise ArrayList and StringBuffer concepts"); 
app.addTask("Prepare for mid-term exams");  
System.out.println("\n" + app.displayTasks()); 
System.out.println("\n=== REMOVING A TASK ==="); 
app.removeTask(1); 
System.out.println("\n" + app.displayTasks()); 
} 
}
