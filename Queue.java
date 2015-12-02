import java.util.*;
public class Queue{

	private List<String> tasks;
	
	public Queue()
	{
		tasks = new ArrayList<String>();
	}
	
	public void enqueue(String task)
	{
		tasks.add(task);
	}
	
	public String dequeue()
	{	
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't dequeue from an empty queue.");
		return tasks.remove(0);
	}
	
	public String peek()
	{	
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't peek at an empty queue.");
		return tasks.get(0);
	}
	
	public boolean isEmpty() {
        return tasks.size() == 0;
    }
	
}
