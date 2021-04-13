// ***************************************************************
// Saba Syed   
// CSIT212-01: Data Structures and Algorithms Section 1
// Professor Boxiang Dong
// March 5, 2021
// Task 1 (30 pts).  Implement the empty(), push(int x), and 
// pop()function for Stack in Stack.java as discussed in Lecture 5.
// ***************************************************************

public class Stack {
	public int size;
	public int top;
	public int[] array;
	
	public Stack () {
		size = 0;
		top = -1;
		array = null;
	}
	
	public Stack (int _size) {
		size = _size;
		top = -1;
		array = new int[size];
	}
	
   // Answer Task 1
	public boolean empty () {
		 boolean flag = false;
       if (top == -1)
  {
       flag = true;
  }
     return flag;
	}
	
	public void push (int x) {
		 if (top >= size)
       {
         System.err.println("Stack is full!! Overflow.");
       }
       else 
       {
         array [++top] = x;
       }

	}
	
	public int pop () {
		int value = -1;
      if (array.length > 0)
      {
         value = array [top--]; 
      }
      return value; 
	}
	

	public String toString () {
		String str;
		
		str = size + ", [";
		for (int i = 0; i <= top; i++)
			str += array[i] + ", ";
		
		str += "]";
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s;
		
		s = new Stack(10);
		for (int i = 0; i < 5; i++)
			s.push(i);
		System.out.println(s.toString());
		
		for (int i = 0; i < 2; i++)
			s.pop();
		System.out.println(s.toString());
	}

}
