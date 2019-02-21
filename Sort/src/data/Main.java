package data;
public class Main {
	
	public static void main(String[] args) {
		
		Employee JaneJones = new Employee("Jane", "Jones", 123);
		Employee SatyakiNan =new Employee("Satyaki", "Nan", 4567);
		Employee AbhiSingala = new Employee("Abhi", "Singala", 22);
		Employee HiteshItilaya = new Employee("Hitesh", "Itilaya", 3245);
				 
		 EmployeeLinkedList list = new EmployeeLinkedList();
		 
		 System.out.println(list.isEmpty());
		 
		 list.addToFront(JaneJones);
		 list.addToFront(SatyakiNan);
		 list.addToFront(AbhiSingala);
		 list.addToFront(HiteshItilaya);
		 
		 System.out.println(list.getSize());
		 
		 list.printList();
		 
		 list.removeFromFront();
		 System.out.println(list.getSize());
		 list.printList();
		 
		 
	}
	

}
