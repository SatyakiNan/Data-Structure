package data;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
		
//		
		intTree.traverseInOrder();
		System.out.println();
//		
		
//		System.out.println(intTree.get(20));
//		System.out.println(intTree.get(27));
//		System.out.println(intTree.get(8889));
		
//		System.out.println(intTree.min());
//		System.out.println(intTree.max());
		
		intTree.traversePreOrder();
		System.out.println();

		
		
	}

}