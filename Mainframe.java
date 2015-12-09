import java.util.*;
public class Mainframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Aeron");
		Scanner scan = new Scanner(System.in);		
		String priority;
		
		while(true){
		System.out.println("1: Add a task");
		System.out.println("2: Get a task");
		System.out.println("3: Mark task complete");
		System.out.println("4: Display last task completed");
		System.out.println("5: Return last task completed to uncompleted list");
		System.out.println("6: Display employee info");
		System.out.println("7: Exit");
		System.out.print("What's your choice? ");
		int choice = scan.nextInt();
		System.out.println();
		System.out.println();
		System.out.println();
		switch(choice)
		{
		case 1:
		
			System.out.print("Please enter task: ");
			String task = scan.next();
			System.out.print("Is it high priority?(y/n) ");
			priority = scan.next();
			if(priority.equalsIgnoreCase("y"))
				e.enqueueTask(task, 2);
			if(priority.equalsIgnoreCase("n"))
				e.enqueueTask(task, 1);
			break;
		
		case 2:
			System.out.println(e.peekTask());
			break;
		case 3:
			e.pushDoneTask(e.dequeueTask());
			break;
		case 4:
			System.out.println(e.peekDoneTask());
			break;
		case 5:
			e.enqueueTask(e.popDoneTask());
			break;
		case 6:
			System.out.println(e);
			break;
		case 7:
			System.exit(0);
			break;
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
}
