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
	
	public String toString()
	{
		return "Name: " + this.name;
	}
	
	public void addTask(String t, int p)
	{
		Task task = new Task(t, p);
		if(task.getPriority() == 1)
			lowTaskList.enqueue(task);
		if(task.getPriority() == 2)
			highTaskList.enqueue(task);
	}
	
	public void addTask(Task task)
	{
		if(task.getPriority() == 1)
			lowTaskList.enqueue(task);
		if(task.getPriority() == 2)
			highTaskList.enqueue(task);
	}
	
	public String dequeueTask()
	{
		if(!highTaskList.isEmpty()) 
			return highTaskList.dequeue().getTask();
		return lowTaskList.dequeue().getTask();
	}
	
	public Task popDoneTask()
	{
		return completedTasks.pop();
	}
	
	public String peekDoneTask()
	{
		return completedTasks.peek().getTask();
	}
	
	public String peekTask()
	{
		if(!highTaskList.isEmpty()) 
			return highTaskList.peek().getTask();
		return lowTaskList.peek().getTask();
	}
}
