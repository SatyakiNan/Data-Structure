package data;

public class Main4 {

	Employee JaneJones = new Employee("Jane", "Jones", 123);
	Employee SatyakiNan =new Employee("Satyaki", "Nan", 4567);
	Employee AbhiSingala = new Employee("Abhi", "Singala", 22);
	Employee HiteshItilaya = new Employee("Hitesh", "Itilaya", 3245);
	Employee GouthamReddy = new Employee("Goutham", "Reddy", 78);
	
	LinkedStack stack = new LinkedStack();
	stack.push(JaneJones);
	stack.push(SatyakiNan);
	stack.push(AbhiSingala);
	stack.push(HiteshItilaya);
	stack.push(GouthamReddy);
	
	stack.printStack();
	
}
