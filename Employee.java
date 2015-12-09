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
	
	public void enqueueTask(String t, int p)
	{
		Task task = new Task(t, p);
		if(task.getPriority() == 1)
			lowTaskList.enqueue(task);
		if(task.getPriority() == 2)
			highTaskList.enqueue(task);
	}
	
	public void enqueueTask(Task task)
	{
		if(task.getPriority() == 1)
			lowTaskList.enqueue(task);
		if(task.getPriority() == 2)
			highTaskList.enqueue(task);
	}
	
	public Task dequeueTask()
	{
		if(!highTaskList.isEmpty()) 
			return highTaskList.dequeue();
		return lowTaskList.dequeue();
	}

	public void pushDoneTask(Task t)
	{
		completedTasks.push(t);
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
