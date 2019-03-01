package data;
// nth to last node 
// 1 -> 2 -> 3 -> 4 -> 5 -> null
class LinkedList {
		
		Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			
			data = d;
			next = null;
		}
		
	}
	
	 void NthLast(int n) {
		 
		Node main_ptr = head;
		Node ref_ptr = head;
		
		int count = 0;
		if(head != null) {
			
			while (count < n)
			{
				if(ref_ptr == null) {
					System.out.println( n + "is greater than the no");
					return;
				}
				ref_ptr = ref_ptr.next;
				count++;
				
			}
			
			while(ref_ptr != null) {
				
				main_ptr = main_ptr.next;
				ref_ptr = ref_ptr.next;
	
			}
			
			System.out.println("Node no. " +  n + " from last is " + main_ptr.data);
		}
	 }
	public void push(int new_data) {
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		
		
		list.NthLast(4);
		
		
	}

}
