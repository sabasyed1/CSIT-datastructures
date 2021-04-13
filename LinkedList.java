// ***************************************************************
// Saba Syed   
// CSIT212-01: Data Structures and Algorithms Section 1
// Professor Boxiang Dong
// March 5, 2021
// Task 3 (40 pts).  Implement the search(int k), insert(int x), 
// delete()func-tion in LinkedList.java as discussed in Lecture 6.
// ***************************************************************

public class LinkedList
{
     public ListNode head;
     public LinkedList()
     {
          head = null;
     }

     // Answer Task 3
     public ListNode search(int k)
     {
          ListNode x = new ListNode();
          x = head;
          while (x != null && x.key != k)
          {
              x = x.next;
          }
          return x;
     }

     public void insert(int x)
     {
          ListNode newNode = new ListNode(x);
          newNode.next = head;
          head = newNode;
     }

     public void delete(ListNode x)
     {
          ListNode current = head;
          ListNode prev = head;
          ListNode nextNode = head.next;
          while (current != null && current.key != x.key)
          {
              prev = current;
              current = nextNode;
              nextNode = nextNode.next;
          }

          current = null;
          prev.next = nextNode;

     }

      public String toString()
     {
          String str;
          ListNode n;
          str = "[";
          n = this.head;
          while (n != null)
          {
              str += n.key + ",";
              n = n.next;
          }
          str += "]";
          return str;
     }

     /**
     * @param args
     */
     public static void main(String[] args)
     {
          // TODO Auto-generated method stub
          LinkedList l;
          l = new LinkedList();
          for (int i = 0; i < 5; i++)
              l.insert(i);
          System.out.println(l.toString());
          for (int i = 0; i < 2; i++)
              l.delete(l.head.next);
          System.out.println(l.toString());
     }
}