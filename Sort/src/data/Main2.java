package data;

public class Main2 {
	
	public static void main(String[] args) {
		
		Employee JaneJones = new Employee("Jane", "Jones", 123);
		Employee SatyakiNan =new Employee("Satyaki", "Nan", 4567);
		Employee AbhiSingala = new Employee("Abhi", "Singala", 22);
		Employee HiteshItilaya = new Employee("Hitesh", "Itilaya", 3245);
		
		EmployeeDoublyLinkedList list =  new EmployeeDoublyLinkedList();
		
		list.addToFront(JaneJones);
		list.addToFront(SatyakiNan);
		list.addToFront(AbhiSingala);
		list.addToFront(HiteshItilaya);
		
		list.printList();
		System.out.println(list.getSize());
		
		Employee billEnd = new Employee("Bill", "End", 78);
		list.addToEnd(billEnd);
		
		list.printList();
		System.out.println(list.getSize());
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
		list.removeFromEnd();
		list.printList();
		System.out.println(list.getSize());
		
		
		
	}
}