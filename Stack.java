import java.util.*;
public class Stack{
	
	private List<String> tasks;
	
	public Stack()
	{
		tasks = new ArrayList<String>();
	}
	
	public void push(String task)
	{
		tasks.add(0, task);
	}
	
	public String pop()
	{
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't pop from an empty stack.");
		return tasks.remove(0);
	}
	
	public String peek()
	{	
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't peek at an empty stack.");
		return tasks.get(0);
	}
}
