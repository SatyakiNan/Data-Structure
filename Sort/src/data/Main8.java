package data;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee JaneJones = new Employee("Jane", "Jones", 123);
		Employee SatyakiNan =new Employee("Satyaki", "Nan", 4567);
		Employee AbhiSingala = new Employee("Abhi", "Singala", 22);
		Employee HiteshItilaya = new Employee("Hitesh", "Itilaya", 3245);
		Employee BillEnd = new Employee("Bill", "End", 46);
		
		
		SimpleHashtable ht = new SimpleHashtable();
		ht.put("Jones",JaneJones);
		ht.put("Nan", SatyakiNan);
		ht.put("Singala", AbhiSingala);
		ht.put("Itilaya", HiteshItilaya);
		ht.put("End", BillEnd);
		
		ht.printHashtable();
		
		System.out.println("Retrieve key Singala :" + ht.get("Singala"));
		System.out.println("Retrieve key Itilaya :" + ht.get("Itilaya"));
	}

}
