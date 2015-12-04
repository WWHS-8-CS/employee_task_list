public class Task{

	private String description;
	private int priority;
	
	public Task(String description, int priority)
	{
		this.description = description;
		this.priority = priority;
	}
	
	public String returnTask()
	{
		return description;
	}
	
	public int returnPriority()
	{
		return priority;
	}
	
}
