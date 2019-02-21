package data;
import java.util.NoSuchElementException;

public class CircularQueue {
		
	private Employee[] queue;
	private int front;
	private int back;
	
	public CircularQueue(int capacity) {
		queue = new Employee[capacity];
	}
	// 0 jane
	// 1 Satyaki
	// 2 		- back // back = 2; front= 3
						// back - front+ queue.lenght = 2-3+5=4
	// 3 Abhi	-front
	// 4 Hitesh
	
	
	// 0 Abhi
	// 1 Hitesh
	// 2 jane
	// 3 Satyaki
	// 4 		-back
	// 5
	// 6
	// 7
	
	public void add(Employee employee) {
		if(size() == queue.length-1) {
			int numitems = size();
			Employee[] newArray = new Employee[2*queue.length];
			
			System.arraycopy(queue, front, newArray, 0, queue.length-front);
			System.arraycopy(queue, 0, newArray, queue.length-front, back);
			queue = newArray;
			
			front = 0;
			back = numitems;
		}
		
		queue[back] = employee;
		if(back < queue.length) {
			back++;
		}
		else {
			back = 0;
		}
		
	}
	
		public Employee remove() {
			
			if(size() == 0) {
				throw new NoSuchElementException();
			}
			
			Employee employee = queue[front];
			queue[front] = null;
			front++;
			if(size() == 0) {
				
				front = 0;
				back = 0;
				 
			}
			else if(front == queue.length) {
				front = 0;
			}
			
			return employee;
			
		}
		
		public Employee peek() 
		{
			if(size() == 0) {
				throw new NoSuchElementException();	
		}
			return queue[front];
	}	
		public int size() {
			
			if(front <= back) {
				return back - front;
			}
			else {
				return back - front+ queue.length;
			}
			
		}
		
		public void printQueue() {
			if(front <= back) {
			for(int i = front; i< back; i++) {
				System.out.println(queue[i]);
			}
		}
			else {
					for(int i = front; i < queue.length; i++) {
						System.out.println(queue[i]);
					}
					
					for(int i = 0; i< back; i++) {
						System.out.println(queue[i]);
					}
				 
			}
	}

}
