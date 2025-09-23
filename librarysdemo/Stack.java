package librarysdemo;
class Stack {
	private int arr[];
	private int top;
	private int capacity;
	Stack(int size) {
		if (size <= 0) {
			System.out.println("Invalid size; creating stack of size 10 by default.");
			size = 10;
		}
		this.capacity = size;
		this.arr = new int[capacity];
		this.top = -1; // empty
	}
	Stack(int[] inputArr) {
		if (inputArr == null) {
			this.capacity = 10;
			this.arr = new int[capacity];
			this.top = -1;
			return;
		}
		this.capacity = inputArr.length;
		this.arr = new int[capacity];
		for (int i = 0; i < inputArr.length; i++) {
			arr[i] = inputArr[i];
		}
		this.top = inputArr.length - 1;
	}
	void push(int x) {
		if (top == capacity - 1) {
			System.out.println("Stack overflow! Cannot push " + x + ".");
			return;
		}
		arr[++top] = x;
		System.out.println("Pushed " + x + " to stack.");
	}
	void push(int x, int y) {
		int free = capacity - (top + 1);
		if (free <= 0) {
			System.out.println("Stack overflow! Cannot push " + x + " and " + y + ".");
			return;
		}
		else if (free == 1) {
			push(x);
			System.out.println("Only one element could be pushed; " + y + " not pushed due tolimited space.");
 }
		else {
			push(x);
			push(y);
		}
	}
	int pop() {
		if (top == -1) {
			System.out.println("Stack underflow! Nothing to pop.");
			return Integer.MIN_VALUE;
		}
		int val = arr[top--];
		System.out.println("Popped " + val + " from stack.");
		return val;
	}
	void pop(int n) {
		if (n <= 0) {
	 System.out.println("Enter a positive number of elements to pop.");
	 return;
		}
		if (top == -	1) {
			System.out.println("Stack underflow! No elements to pop.");
				return;
		}
		System.out.println("Popping up to " + n + " element(s):");
		for (int i = 0; i < n; i++) {
			if (top == -1) {
				System.out.println("No more elements to pop.");
				break;
			}
			int val = arr[top--];
			System.out.println(" Popped: " + val);
		}
	}
	void display() {
		if (top == -1) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.println("Stack (top -> bottom):");
		for (int i = top; i >= 0; i--) {
			System.out.println(" " + arr[i]);
		}
	}
	void display(int n) {
		if (n <= 0) {
			System.out.println("Enter a positive number of elements to display.");
 return;
		}
		if (top == -1) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.println("Top " + n + " element(s) (top -> ...):");
		int count = 0;
		for (int i = top; i >= 0 && count < n; i--, count++) {
			System.out.println(" " + arr[i]);
		}
		if (count < n) {
			System.out.println(" (Only " + count + " element(s) present in stack.)");
		}
	}
} 