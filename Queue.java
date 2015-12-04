import java.util.*;
public class Queue{

	private List<Task> tasks;
	
	public Queue()
	{
		tasks = new ArrayList<Task>();
	}
	
	public void enqueue(Task t)
	{
		tasks.add(t);
	}
	
	public Task dequeue()
	{	
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't dequeue from an empty queue.");
		return tasks.remove(0);
	}
	
	public Task peek()
	{	
		if(tasks.size() == 0)
			throw new IllegalStateException("Can't peek at an empty queue.");
		return tasks.get(0);
	}
	
	public boolean isEmpty() {
        return tasks.size() == 0;
    }
	
}
