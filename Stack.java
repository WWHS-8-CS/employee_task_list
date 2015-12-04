import java.util.*;
public class Stack{
	
	private List<Task> tasks;
	
	public Stack()
	{
		tasks = new ArrayList<Task>();
	}
	
	public void push(Task t)
	{
		tasks.add(0, t);
	}
	
	public Task pop()
	{
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't pop from an empty stack.");
		return tasks.remove(0);
	}
	
	public Task peek()
	{	
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't peek at an empty stack.");
		return tasks.get(0);
	}
}
