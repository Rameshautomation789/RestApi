package ListConcept;

public class MylinkedList {
	
	Node head;
	 
	 class Node{
		 int data;
		 Node next;
		 
		 Node(int data){
			 this.data=data;
			 next = null;
		 }
	 }
	
	 
	 public void printMylinkedList(){
		 Node n=head;
		 while(n!=null){
			 System.out.println(n.data);
			 n=n.next;
		 }
	 }

	public static void main(String[] args) {
		
		MylinkedList li=new MylinkedList();
		
		Node first=li.new Node(10);
		li.head=first;
		
		Node second=li.new Node(20);
		first.next=second;
		
		
		Node third=li.new Node(30);
		second.next=third;
		
		
		
		// Printing the linked list values
		li.printMylinkedList();
		

	}

}
