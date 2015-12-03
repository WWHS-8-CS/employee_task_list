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
	
	public void addTask(String task, int priority)
	{
		if(priority == 1)
			lowTaskList.enqueue(task);
		if(priority == 2)
			highTaskList.enqueue(task);
	}
	
	public String dequeueTask()
	{
		if(!highTaskList.isEmpty()) 
			return highTaskList.dequeue();
		return lowTaskList.dequeue();
	}
	
	public String popDoneTask()
	{
		return completedTasks.pop();
	}
	
	public String peekDoneTask()
	{
		return completedTasks.peek();
	}
	
	public String peekTask()
	{
		if(!highTaskList.isEmpty()) 
			return highTaskList.peek();
		return lowTaskList.peek();
	}
}
