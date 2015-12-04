import java.util.*;
public class Mainframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Aeron");
		Scanner scan = new Scanner(System.in);		
		String priority;
		
		System.out.println("1: Add a task");
		System.out.println("2: Get a task");
		System.out.println("3: Mark task complete");
		System.out.println("4: Display last task completed");
		System.out.println("5: Return last task completed");
		System.out.println("6: Display employee info");
		System.out.println("7: Exit");
		System.out.print("What's your choice? ");
		int choice = scan.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.print("Please enter task: ");
			String task = scan.nextLine();
			System.out.print("Is it high priority?(y/n) ");
			priority = scan.next();
			if(priority.equalsIgnoreCase("y"))
				e.addTask(task, 2);
			if(priority.equalsIgnoreCase("n"))
				e.addTask(task, 1);
		}
		case 2:
			System.out.println(e.peekTask());
		case 3:
			System.out.println(e.dequeueTask());
		case 4:
			System.out.println(e.peekDoneTask());
		case 5:
			return e.popDoneTask();
		case 6:
			System,out.println(e);
		case 7:
			System.exit(0);
		}
	}

}
