package FirstProject;
import java.util.Scanner;
import java.util.ArrayList;
/*
This program is a to-do list where you can add, remove and view the list
What the Program Does
- Displays a menu to the user - Allows adding tasks
- Allows viewing tasks
- Allows removing tasks
- Exits when the user chooses
*/

public class ToDoList {
	//Class variables
	static ArrayList <String> task = new ArrayList();
	static int taskCount;
	public static void main (String [] args) {
		//Input variable
		int userInput;
		
		System.out.println("Welcome to my to-do list!");	//Welcome message
		
		//Display menu options
		System.out.println("What would you like to do?\n");
		System.out.println("1.Add task \n2.View tasks \n3.Remove task\n4.Exit program");
		
		//Ask for user input
		System.out.println("\nEnter your number here:");
		
		
		//Perform action 
		//Continue until the user exits program 
		
	}
	
	//This method adds task to the to-do list and increments the task count.
	public static void addTask(String toDo) {
		task.add(toDo);
		taskCount ++;
	}
	/*
Remove Task Logic
- Display all tasks with numbers
- User selects which task to remove
- Shift remaining tasks left in the array - Decrease taskCount
*/
	public static void removeTask() {
		
	}
	/*View Tasks Logic
- Loop from 0 to taskCount - 1 
- Print each task with a number
*/
	public static void viewTask() {
		
	}
	/*
Exit Logic
- Print goodbye message - Break out of the loop*/
	
	public static void exit() {
		
	}
}
