package arrayList;
import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students= new ArrayList<String>();
		 
		// ArrayList<int> marks=new ArrayList<int>();
		
		//1          //to add elements inside the array we use add method
		
		students.add("Aishwarya");
		students.add("Ayodhya");
		students.add("Kranti");
		students.add("payal");
		
		//2                // to access the elements from the arrayList, we use get() method
		System.out.println("1st element at 0 index: "+ students.get(0));
		System.out.println("2st element at 1st index: "+ students.get(1));
		System.out.println("3st element at 2nd index: "+ students.get(2));
		System.out.println("4st element at 3rd index: "+ students.get(3));
		
		// add at last
		students.add("Sangita");
		
		 System.out.println("5st element at 4th index: "+ students.get(4));
		 
		 //3                     // Replace element in arrayList
		  students.set(0, "Tanvesh");
			System.out.println("Now, ....1st element: "+ students.get(0));
			
			//4               Insert element at specific position
			students.add(1, "Raj");
			System.out.println("1st element at 1st index: "+ students.get(1));
			
			//5        to remove any elements from arraylist, we use remove(index)
			students.remove(3);
			System.out.println(" element at 3rd postion: "+ students.get(3));
			
			//6   to delete or clear,we use clear method
			students.clear();
			System.out.println(" element at 1st postion: "+ students.get(0));

	}

}
