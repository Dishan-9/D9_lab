package librarysdemo;

import java.util.Scanner;

public class LibraryStackDemo {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Stack st = null;
		 System.out.println("Choose how to initialize stack:");
		 System.out.println("1. Empty stack with size");
		 System.out.println("2. Stack initialized with array");
		 System.out.print("Enter choice (1 or 2): ");
		 int choice = sc.nextInt();
		 if (choice == 1) 
		 {
			 	System.out.print("Enter size of stack: ");
			 		int size = sc.nextInt();
			 		st = new Stack(size);
		 } 
		 else if (choice == 2){
			 System.out.print("Enter number of elements: ");
			 int n = sc.nextInt();
			 if (n < 0) n = 0;
			 int arr[] = new int[n];
			 if (n > 0) {
				 System.out.println("Enter elements (bottom -> top order): ");
				 for (int i = 0; i < n; i++) {
					 arr[i] = sc.nextInt();
				 }
			 }
			 st = new Stack(arr);
		 }
		 else {
			 System.out.println("Invalid choice. Creating an empty stack of size 10 by default.");
			 st = new Stack(10);
		 }
		 int option;
		 do {
			 System.out.println("\n--- Stack Menu ---");
			 System.out.println("1. Push one element");
			 System.out.println("2. Push two elements");
			 System.out.println("3. Pop one element");
			 System.out.println("4. Pop multiple elements");
			 System.out.println("5. Display full stack");
			 System.out.println("6. Display top n elements");
			 System.out.println("7. Exit");
			 System.out.print("Enter your choice: ");
			 option = sc.nextInt();
			 switch(option) {
			 	case 1:System.out.print("Enter element: ");
			 		   int val = sc.nextInt();
			 		   st.push(val);
			 		   break;
			 	case 2:System.out.print("Enter two elements (separated by space): ");
			 		   int v1 = sc.nextInt();
			 		   int v2 = sc.nextInt();
			 		   st.push(v1, v2);
			 		   break;
			 	case 3:st.pop();
			 	       break;
			 	case 4:System.out.print("Enter number of elements to pop: ");
			 		   int numToPop = sc.nextInt();
			 		   st.pop(numToPop);
			 		   break;
			 	case 5:st.display();
			 		   break;
			 	case 6: System.out.print("Enter number of top elements: ");
			 		   int topN = sc.nextInt();
			 		   st.display(topN);
			 		   break;
			 	case 7:System.out.println("Exiting... Goodbye!");
			 		   break;
			 	default:System.out.println("Invalid choice! Try again.");
			 }
		 }
		 while(option != 7);
		 sc.close();
	 }
}