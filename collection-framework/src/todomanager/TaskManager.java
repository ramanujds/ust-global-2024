package todomanager;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class TaskManager {

    private Queue<Task> taskQueue;
    private Stack<Task> completedTask;

    public TaskManager(){
        taskQueue = new LinkedList<>();
        completedTask = new Stack<>();
    }

    public void addTask(Task task){
        taskQueue.offer(task);
        System.out.println("Task Added : "+task);
    }

    public void processTask(){
        while (!taskQueue.isEmpty()) {
            Task todo = taskQueue.poll();
            System.out.println("Processing Task : " + todo.id());
            completedTask.push(todo);
            System.out.println("Task Completed");
            System.out.println(todo);
        }
    }

    public void showCompletedTasks(){
        System.out.println("Completed Tasks : ");
        while (!completedTask.isEmpty()){
            System.out.println(completedTask.pop());
        }
    }


    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task(2, "Learn Java"));
        taskManager.addTask(new Task(5, "Learn Python"));
        taskManager.addTask(new Task(1, "Learn JavaScript"));
        taskManager.addTask(new Task(3, "Learn C++"));
        taskManager.addTask(new Task(4, "Learn C#"));
        taskManager.processTask();
        taskManager.showCompletedTasks();

    }

}
