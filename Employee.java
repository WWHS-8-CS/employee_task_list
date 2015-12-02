public class Employee{
	private String name;
	private Queue lowTaskList;
	private Queue highTaskList;
	private Stack completedTasks;

	public Employee(String name)
	{
		this.name = name;
		lowTaskList = new Queue();
		highTaskList = new Queue();
		completedTasks = new Stack();
	}
	
	public void addTask(String task, int priority)
	{
		if(priority == 1)
			lowTaskList.enqueue(task);
		if(priority == 2)
			highTaskList.enqueue(task);
	}
}
