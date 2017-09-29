/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node sortedInsert(Node head,int data) {
       
    
		Node n = null;
		if(head == null) {
			head = n;
			return head;
		}
		Node temp = head;
		while(temp.next!=null) {
			if(temp.data < data && temp.next.data > data) {
				n = new Node();
                n.data = data;
				n.next = temp.next;
				temp.next = n;
				n.prev = temp;
			}
			temp = temp.next;
		}
		if(n==null) {
			n = new Node();
            n.data = data;
			temp.next=n;
			n.prev = temp;
		}
		return head;
	
}
