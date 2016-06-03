package at.fhj.itm;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueue implements Queue
{
	List<String>	queue	= new ArrayList<String>();
	private int		max;
	
	public StringQueue(int max)
	{
		this.max = max;
	}

	public boolean offer(String obj)
	{
		if (queue.size() == max)
			return false;

		queue.add(obj);
		return true;
	}

	public String poll()
	{
		if (queue.size() == 0)
			return null;

		String tmp = queue.get(0);
		queue.remove(0);
		return tmp;
	}

	public String remove()
	{
		if (queue.size() == 0)
			throw new NoSuchElementException();

		String tmp = queue.get(0);
		queue.remove(0);
		return tmp;
	}

	public String peek()
	{
		if (queue.size() == 0)
			return null;

		return queue.get(0);
	}

	public String element()
	{

		if (queue.size() == 0)
			throw new NoSuchElementException();

		return queue.get(0);
	}

}
