package data;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee JaneJones = new Employee("Jane", "Jones", 123);
		Employee SatyakiNan =new Employee("Satyaki", "Nan", 4567);
		Employee AbhiSingala = new Employee("Abhi", "Singala", 22);
		Employee HiteshItilaya = new Employee("Hitesh", "Itilaya", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		ArrayQueue queue = new ArrayQueue(10);
//		
		queue.add(JaneJones);
		queue.add(SatyakiNan);
		queue.remove();
		queue.add(AbhiSingala);
		queue.remove();
		queue.add(HiteshItilaya);
		queue.remove();
		queue.add(billEnd);
		queue.remove();
		queue.add(JaneJones);
		
		queue.printQueue();
		
//		queue.add(JaneJones);
//		queue.add(SatyakiNan);
//		queue.add(AbhiSingala);
//		queue.add(HiteshItilaya);
//		queue.add(billEnd);
//		
//		queue.remove();
//		queue.remove();
//		queue.printQueue();
//		
//		System.out.println(queue.peek());
//		queue.printQueue();
//		

	}

}
