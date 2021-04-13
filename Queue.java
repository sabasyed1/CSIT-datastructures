// ***************************************************************
// Saba Syed   
// CSIT212-01: Data Structures and Algorithms Section 1
// Professor Boxiang Dong
// March 5, 2021
// Task  2  (30  pts).   Implement  the enqueue(int x), 
// dequeue()function  forQueue in Queue.java as discussed 
// in Lecture 5.
// ***************************************************************

public class Queue {
	
	public int size;
	public int[] array;
	public int head;
	public int tail;
	
	public Queue () {
		size = 0;
		array = null;
		head = 0;
		tail = 0;
	}
	
	public Queue (int _size) {
		size = _size;
		array = new int[size];
		head = 0;
		tail = 0;
	}
	
	// Answer Task 2
   public boolean IsEmpty() {

   return (head == 0 && tail == 0);

   }
   public void enqueue (int x) {
		int no;
      if (tail == array.length && head == 0)

           System.out.println("queue is full");

       else {

           array[tail] = x;

           tail++;

       }
	}
	
	public int dequeue () {
		 int num = -1;

       if (IsEmpty())

           System.out.println("queue is empty");

       else {

          

           num = array[head];

           head++;

      

       }

       return num;
	}
	
	public String toString () {
		String str;
		
		str = size + ", " + head + ", " + tail + ", [";
		for (int i = head; i%size < tail; i++) 
			str += array[i] + ",";
		
		str += "]";
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q;
		
		q = new Queue(10);
		for (int i = 0; i < 5; i++)
			q.enqueue(i);
		System.out.println(q.toString());
		for (int i = 0; i < 2; i++) 
			q.dequeue();
		System.out.println(q.toString());
	}

}
