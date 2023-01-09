import java.util.LinkedList;
import java.util.Queue;
import java.util.*;  

public class EgStack
{
	Queue<Integer> q = new LinkedList<Integer>();
	
	void push(int val)
	{
		int size = q.size();
		
		q.add(val);
	}
	
	int pop()
	{
		if (q.isEmpty())
		{
			System.out.println("No elements");
			return -1;
		}
		int x = q.remove();
		return x;
	}
	
	int top()
	{
		if (q.isEmpty())
			return -1;
		return q.peek();
	}
	
	boolean isEmpty()
	{
		return q.isEmpty();
	}
	
	void diplay()
	{
		System.out.println(q);  
	}

	public static void main(String[] args)
	{
		EgStack s = new EgStack();
		s.push(5);
		s.push(10);
		System.out.println("Top element :" + s.top());
		s.pop();
		s.push(15);
		s.push(20);
		s.push(12);
		s.pop();
		System.out.println("Top element :" + s.top());
		s.diplay();
	}
}
